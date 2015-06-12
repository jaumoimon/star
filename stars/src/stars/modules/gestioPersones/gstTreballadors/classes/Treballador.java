package stars.modules.gestioPersones.gstTreballadors.classes;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import stars.classes.DataPropia;
import stars.modules.gestioPersones.classes.Persona;

@XStreamAlias ("Treballador")
public abstract class Treballador extends Persona implements Serializable {
	@XStreamAlias ("departament")
	private StringBuffer departament = null;
	@XStreamAlias ("sou")
	private float sou = 0.0f;
	
	public Treballador(StringBuffer dni, StringBuffer nom, /*StringBuffer cognoms,*/ DataPropia dataNaix,
			/*StringBuffer nacionalitat,StringBuffer domicili, int codPos, StringBuffer municipi,
			StringBuffer provincia*/ StringBuffer departament) {
		super(dni, nom,dataNaix);
		this.departament = departament;
	}
	
	public Treballador (StringBuffer dni){
		super(dni);
	}
	
	public Treballador (){
		
	}

	public StringBuffer getDepartament() {
		return departament;
	}

	public void setDepartament(StringBuffer departament) {
		this.departament = departament;
	}

	public float getSou() {
		return sou;
	}

	public void setSou(float sou) {
		this.sou = sou;
	}
	
	public abstract float calcularSou ();
	
	public abstract String toString();
	
	

}
