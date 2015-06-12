package stars.classes;

import stars.Principal;


import java.util.ArrayList;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.model.classes.ReposUsers;

public class Configuration {

	private String moneda = "";
	private int decimals = 0;
	private String formatData = "";
	private int idioma = 0;
	private char lookAndFeel =' ';
	private int formatFitxer = 0;

	//Constructor
	public Configuration() {
		this.moneda = "EUR";
		this.decimals = 2;
		this.formatData = "dd/mm/aaaa";
		this.idioma = 0;
		this.lookAndFeel ='A';
		this.formatFitxer = 0;
		
		//ArrayList d'Usuaris
                ReposUsers.arrUsuaris = new ArrayList<MyUser>();
		/*
		ArrayListWT.wT = new ArrayList<WorkerT>();
		ArrayListWH.wH = new ArrayList<WorkerH>();
		*/
		//Dummies.carregar();
		//EFDAO.cargar_datos();
		//PSDAO.cargar_datos();
		////PPDAO.cargar_datos();
		//EFBLL.AbrirSilencioso();
		//PSBLL.AbrirSilencioso();
		////PPBLL.AbrirSilencioso();
	}

	//Getters & setters
	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public int getDecimals() {
		return decimals;
	}

	public void setDecimals(int decimals) {
		this.decimals = decimals;
	}

	public String getFormatData() {
		return formatData;
	}

	public void setFormatData(String formatData) {
		this.formatData = formatData;
	}

	public int getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}

	public char getLookAndFeel() {
		return lookAndFeel;
	}

	public void setLookAndFeel(char lookAndFeel) {
		this.lookAndFeel = lookAndFeel;
	}
	
	public int getFormatFitxer() {
		return formatFitxer;
	}

	public void setFormatFitxer(int formatFitxer) {
		this.formatFitxer = formatFitxer;
	}

	public String toString() {
		idioma = Principal.conf.getIdioma();
		
		return "Configuration [moneda=" + moneda + ", decimals=" + decimals + ", formatData=" + formatData
				+ ", idioma=" + idioma + ", lookAndFeel=" + lookAndFeel + "]";
	}	
	
	
	
	
	
}
