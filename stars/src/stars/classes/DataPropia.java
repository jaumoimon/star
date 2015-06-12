package stars.classes;

import stars.Principal;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("Data")
public class DataPropia implements Serializable {

	@XStreamAlias("data")
	private String data = "";
	@XStreamAlias("dia")
	private int dia = 0;
	@XStreamAlias("mes")
	private int mes = 0;
	@XStreamAlias("any")
	private int any = 0;

	// Constructor que depen del main.conf
	public DataPropia(String introData) {
		String[] SplitArray = null;
		String dataFormada = "";

		if (Principal.conf == null) {
			SplitArray = introData.split("/");

			this.dia = Integer.parseInt(SplitArray[0]);
			this.mes = Integer.parseInt(SplitArray[1]);
			this.any = Integer.parseInt(SplitArray[2]);
		} else {
			if (Principal.conf.getFormatData() == "dd/mm/aaaa") {
				SplitArray = introData.split("/");

				this.dia = Integer.parseInt(SplitArray[0]);
				this.mes = Integer.parseInt(SplitArray[1]);
				this.any = Integer.parseInt(SplitArray[2]);

			} else if (Principal.conf.getFormatData() == "mm/dd/aaaa") {
				SplitArray = introData.split("");

				this.dia = Integer.parseInt(SplitArray[1]);
				this.mes = Integer.parseInt(SplitArray[0]);
				this.any = Integer.parseInt(SplitArray[2]);

			} else if (Principal.conf.getFormatData() == "aaaa/mm/dd") {
				SplitArray = introData.split("");

				this.dia = Integer.parseInt(SplitArray[2]);
				this.mes = Integer.parseInt(SplitArray[1]);
				this.any = Integer.parseInt(SplitArray[0]);

			} else if (Principal.conf.getFormatData() == "aaaa-mm-dd") { // Format 
																			// establert
																			// ISO
																			// 8601
				SplitArray = introData.split("");

				this.dia = Integer.parseInt(SplitArray[2]);
				this.mes = Integer.parseInt(SplitArray[1]);
				this.any = Integer.parseInt(SplitArray[0]);
			}
		}

		dataFormada = dia + "/" + mes + "/" + any;
		this.data = dataFormada;
	}

	public DataPropia(String introData, int segonConstructor) {
		String[] SplitArray = null;
		String dataFormada = "";

		SplitArray = introData.split("/");

		this.dia = Integer.parseInt(SplitArray[0]);
		this.mes = Integer.parseInt(SplitArray[1]);
		this.any = Integer.parseInt(SplitArray[2]);

		dataFormada = dia + "/" + mes + "/" + any;
		this.data = dataFormada;
	}

	public DataPropia(Calendar introData) {
		this.dia = introData.get(Calendar.DATE);
		this.mes = introData.get(Calendar.MONTH) + 1;
		this.any = introData.get(Calendar.YEAR);

	}

	public DataPropia(GregorianCalendar introData) {
		this.dia = introData.get(Calendar.DATE);
		this.mes = introData.get(Calendar.MONTH) + 1;
		this.any = introData.get(Calendar.YEAR);
	}
        
        public DataPropia() {
		
	}
        

	// Getters & setters
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public String toStringDefecte() {
		return this.getData();
	}

	public String toStringConf() {
		String formatData = "";
		String dataString = "";

		if (Principal.conf == null) {

		} else {

			formatData = Principal.conf.getFormatData();

			switch (formatData) {
			case "dd/mm/aaaa":
				dataString = this.getDia() + "/" + this.getMes() + "/" + this.getAny();
				break;
			case "mm/dd/aaaa":
				dataString = this.getMes() + "/" + this.getDia() + "/" + this.getAny();
				break;
			case "aaaa/mm/dd":
				dataString = this.getAny() + "/" + this.getMes() + "/" + this.getDia();
				break;
			case "aaaa-mm-dd":
				dataString = this.getAny() + "-" + this.getMes() + "-" + this.getDia();
				break;
			}
		}

		return dataString;
	}

	public Calendar stringtoCalendar() {

		Calendar data = Calendar.getInstance();
		Date data2 = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data2 = (Date) sdf.parse(this.data);
			data.setTime(data2);

		} catch (Exception e) {
			return data;

		}

		return data;
	}

	public String calendarToString(Calendar data) {

		int dia, mes, anyo;
		String dataS = null, dataS2 = "XX/XX/XX";

		try {
			dia = data.get(Calendar.DATE);
			mes = ((data.get(Calendar.MONTH)) + 1);
			anyo = data.get(Calendar.YEAR);
			dataS = dia + "/" + mes + "/" + anyo;
		} catch (Exception e) {
			return dataS2;
		}

		return dataS;

	}

	public boolean checkDay() {
		GregorianCalendar calendar = new GregorianCalendar();
		int dias[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (calendar.isLeapYear(this.any)) {
			dias[2] = 29;
		}

		if ((this.dia >= 1) && (this.dia <= dias[this.mes])) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkMonth() {
		if ((this.mes >= 1) && (this.mes <= 12)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkYear() {
		if ((this.any >= 1900) && (this.any <= 2100)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkMyDate() {

		boolean correcte = true;
		if (!this.checkDay()) {
			correcte = false;
		}
		if (!this.checkMonth()) {
			correcte = false;
		}
		if (!this.checkYear()) {
			correcte = false;
		}

		return correcte;
	}

	// Resta la data que agafe - la data del sistema anar amb compte ix negatiu
	public int restarMyDatetoSystemDate() {

		int any1 = 0, any2 = 0;
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = this.stringtoCalendar();

		any1 = data1.get(Calendar.YEAR);
		any2 = data2.get(Calendar.YEAR);

		return (any1 - any2);
	}

	// Resta la data del sistema menys la data us pral calcular edats.
	public int restarSystemDatetoMyDate() {

		int any1;
		int any2;
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = this.stringtoCalendar();

		any1 = data1.get(Calendar.YEAR);
		any2 = data2.get(Calendar.YEAR);

		return (any1 - any2);
	}

	// restar / data sistema menys l'arreplegada
	public int comparaDataSystem() {
		int comparar = 0;
		Calendar fecha1 = this.stringtoCalendar();
		Calendar fecha2 = Calendar.getInstance();

		if (fecha1.before(fecha2))
			comparar = 0;
		else if (fecha1.equals(fecha2))
			comparar = 1;
		else if (fecha1.after(fecha2))
			comparar = 2;
		return comparar;

	}

	// restar / this.data menys l'arreplegada
	public int comparaDates(DataPropia data2) {
		int comparar = 0;
		Calendar data1 = this.stringtoCalendar();
		Calendar dataCalen2;

		dataCalen2 = data2.stringtoCalendar();

		if (data1.before(dataCalen2))
			comparar = 0;
		else if (data1.equals(dataCalen2))
			comparar = 1;
		else if (data1.after(dataCalen2))
			comparar = 2;
		return comparar;
	}

	// metodo per a restar els anys de dos feches. This.fecha menos fecha
	// arreplegada
	public int restar2Fechas(DataPropia fecha2) {

		int any1;
		int any2;
		Calendar data1 = this.stringtoCalendar();
		Calendar fecha2Calen = fecha2.stringtoCalendar();

		any1 = data1.get(Calendar.YEAR);
		any2 = fecha2Calen.get(Calendar.YEAR);

		return (any2 - any1);
	}

	// data del sistema
	public Calendar systemDate() {
		Calendar data = Calendar.getInstance();
		return data;
	}

}
