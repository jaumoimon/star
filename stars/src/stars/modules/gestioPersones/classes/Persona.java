package stars.modules.gestioPersones.classes;

import stars.classes.DataPropia;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias ("Persona")
public abstract class Persona implements Comparable<Persona>, Serializable {
	//Declaracio de variables
	@XStreamAlias ("dni")
	private StringBuffer dni = null;
	@XStreamAlias ("nom")
	private StringBuffer nom = null;
	/*@XStreamAlias ("cognoms")
	private StringBuffer cognoms = null;
        */
	@XStreamAlias ("dataNaix")
	private DataPropia dataNaix = null;
	/*
        @XStreamAlias ("nacionalitat")
	private StringBuffer nacionalitat = null;*/
	@XStreamAlias ("edat")
	private int edat = 0;
        /*
	@XStreamAlias ("domicili")
	private StringBuffer domicili = null;
	@XStreamAlias ("codPos")
	private int codPos = 0;
	@XStreamAlias ("municipi")
	private StringBuffer municipi = null;
	@XStreamAlias ("provincia")
	private StringBuffer provincia = null;
        */
	//Constructors
	public Persona(StringBuffer dni, StringBuffer nom, /*StringBuffer cognoms,*/ DataPropia dataNaix/*
			StringBuffer nacionalitat,*/){/* StringBuffer domicili, int codPos, StringBuffer municipi,
			StringBuffer provincia ) {*/
		super();
		this.dni = dni;
		this.nom = nom;
		/*this.cognoms = cognoms;*/
		this.dataNaix = dataNaix;
		/*this.nacionalitat = nacionalitat;*/
		this.setEdat(calcularEdat(this.dataNaix));
		/*this.domicili = domicili;
		this.codPos = codPos;
		this.municipi = municipi;
		this.provincia = provincia;*/
	}
	
	public Persona (StringBuffer dni){
		this.dni = dni;
	}
	
	public Persona (){
		
	}
	/// Getters & setters
	public StringBuffer getDni() {
		return dni;
	}

	public void setDni(StringBuffer dni) {
		this.dni = dni;
	}

	public StringBuffer getNom() {
		return nom;
	}

	public void setNom(StringBuffer nom) {
		this.nom = nom;
	}

	/*public StringBuffer getCognoms() {
		return cognoms;
	}

	public void setCognoms(StringBuffer cognoms) {
		this.cognoms = cognoms;
	}

	*/public DataPropia getDataNaix() {
		return dataNaix;
	}

	public void setDataNaix(DataPropia dataNaix) {
		this.dataNaix = dataNaix;
	}

	/*public StringBuffer getNacionalitat() {
		return nacionalitat;
	}

	public void setNacionalitat(StringBuffer nacionalitat) {
		this.nacionalitat = nacionalitat;
	}*/

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}/*

	public StringBuffer getDomicili() {
		return domicili;
	}

	public void setDomicili(StringBuffer domicili) {
		this.domicili = domicili;
	}

	public int getCodPos() {
		return codPos;
	}

	public void setCodPos(int codPos) {
		this.codPos = codPos;
	}

	public StringBuffer getMunicipi() {
		return municipi;
	}

	public void setMunicipi(StringBuffer municipi) {
		this.municipi = municipi;
	}

	public StringBuffer getProvincia() {
		return provincia;
	}

	public void setProvincia(StringBuffer provincia) {
		this.provincia = provincia;
	}*/

	//Metodes especifics
	public int calcularEdat (DataPropia data) {
		return data.restarSystemDatetoMyDate();
	}
	
	public void canviarEdat (DataPropia data){
		setEdat(calcularEdat(data));
	}
	
	//Comparable & equals
	public int compareTo (Persona pers) {
		int resultat = -2; //a -2 per si hi ha error poder diferenciar-lo del -1 de menor
		if ( (this.getDni().toString()).compareTo( (pers.getDni().toString())  ) > 0 ) {
			resultat = 1;
		}else if ( (this.getDni().toString()).compareTo( (pers.getDni().toString())  ) < 0 ) {
			resultat = -1;
		}else if ( (this.getDni().toString()).compareTo( (pers.getDni().toString())  ) == 0 ) {
			resultat = 0;
		}
		return resultat;
	 }
	
	public boolean equals (Object obj){
		return this.getDni().equals(   ((Persona)obj).getDni()  );
	}
	
	//toString
	public abstract String toString();
}
