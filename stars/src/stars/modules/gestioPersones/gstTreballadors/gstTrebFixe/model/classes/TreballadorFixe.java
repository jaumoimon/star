package stars.modules.gestioPersones.gstTreballadors.gstTrebFixe.model.classes;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import stars.classes.DataPropia;
import stars.modules.gestioPersones.gstTreballadors.classes.Treballador;

@XStreamAlias ("TreballadorFixe")
public class TreballadorFixe extends Treballador implements Serializable {
	@XStreamAlias ("antiguetat")
	private int antiguetat =0;
	@XStreamAlias ("dataCont")
	private DataPropia dataCont = null;
	
	public TreballadorFixe(StringBuffer dni, StringBuffer nom, /*StringBuffer cognoms,*/ DataPropia dataNaix,
			/*StringBuffer nacionalitat, int edat, StringBuffer domicili, int codPos, StringBuffer municipi,
			StringBuffer provincia,*/ StringBuffer departament,/* float sou, int antiguetat,*/ DataPropia dataCont) {
		super(dni, nom, dataNaix, departament);
		this.dataCont = dataCont;
		this.setAntiguetat(this.calcularAntiguetat(dataCont));
		this.setSou(this.calcularSou());
	}
	
	public TreballadorFixe (StringBuffer dni) {
		super (dni);
	}
	
	public TreballadorFixe () {

	}	

	public int getAntiguetat() {
		return antiguetat;
	}

	public void setAntiguetat(int antiguetat) {
		this.antiguetat = antiguetat;
	}

	public DataPropia getDataCont() {
		return dataCont;
	}

	public void setDataCont(DataPropia dataCont) {
		this.dataCont = dataCont;
	}
	
	public int calcularAntiguetat(DataPropia dataCont) {
		return dataCont.restarSystemDatetoMyDate();
	}

	public void canviarAntiguetat(DataPropia dataCont) {
		this.setAntiguetat(this.calcularAntiguetat(dataCont));
	}

	public float calcularSou() {
		if (this.getAntiguetat() <= 3) {
			this.setSou(800.0f);
		} else if ((this.getAntiguetat() > 3) && (this.getAntiguetat() <= 6)) {
			this.setSou(1000.0f);
		} else if (this.getAntiguetat() > 6) {
			this.setSou(1200.0f);
		}
		return this.getSou();
	}

	public void canviarSou() {
		this.setSou(this.calcularSou());
	}
	
	public String toString() {
        StringBuffer targeta = new StringBuffer();
        targeta.append("Nom: " + super.getNom() + ".");
        targeta.append("DNI: " + super.getDni() + ".");
        targeta.append("Data naixement: " + super.getDataNaix() + ".");
        targeta.append("Edat " + super.getEdat() + " . ");
        targeta.append("Data contracte: " + this.getDataCont() + ".");
        targeta.append("Antiguetat: " + this.getAntiguetat() + " anys" + " || ");
        return targeta.toString();
    }
	

}
