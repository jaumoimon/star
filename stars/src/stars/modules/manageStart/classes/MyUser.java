/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import stars.classes.DataPropia;

/**
 *
 * @author Gestor
 */
@XStreamAlias ("MyUser")
public class MyUser implements Comparable<MyUser>, Serializable {
    @XStreamAlias ("dni")
    private String dni;
    @XStreamAlias ("nom")
    private String nom;
    @XStreamAlias ("cognoms")
    private String cognoms;
    @XStreamAlias ("direccio")
    private String direccio;
    @XStreamAlias ("cp")
    private int cp;
    @XStreamAlias ("poblacio")
    private String poblacio;
    @XStreamAlias ("provincia")
    private String provincia;
    @XStreamAlias ("dataNaix")
    private DataPropia dataNaix;
    @XStreamAlias ("edat")
    private int edat;
    @XStreamAlias ("mail")
    private String mail;
    @XStreamAlias ("password")
    private String password;
    @XStreamAlias ("avatar")
    private String avatar;
    @XStreamAlias ("conectat")
    private boolean conectat;
    @XStreamAlias ("activat")
    private boolean activat;
    @XStreamAlias ("tipus")
    private String tipus;

    public MyUser(String dni, String nom, String cognoms, String direccio, int cp, String poblacio, String provincia, DataPropia dataNaix, int edat, String mail, String password, String avatar, boolean conectat, boolean activat, String tipus) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.direccio = direccio;
        this.cp = cp;
        this.poblacio = poblacio;
        this.provincia = provincia;
        this.dataNaix = dataNaix;
        this.edat = edat;
        this.mail = mail;
        this.password = password;
        this.avatar = avatar;
        this.conectat = conectat;
        this.activat = activat;
        this.tipus = tipus;
    }
    
    public MyUser(){
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public DataPropia getDataNaix() {
        return dataNaix;
    }

    public void setDataNaix(DataPropia dataNaix) {
        this.dataNaix = dataNaix;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isConectat() {
        return conectat;
    }

    public void setConectat(boolean conectat) {
        this.conectat = conectat;
    }

    public boolean isActivat() {
        return activat;
    }

    public void setActivat(boolean activat) {
        this.activat = activat;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    //Métodes específics
    public int calcularEdat (DataPropia data){
        return data.restarSystemDatetoMyDate();
    }
    
    public void canviarEdat (DataPropia data){
        setEdat (calcularEdat(data));
    }
    
    //Comparable & equals
    public int compareTo(MyUser usuari){
        int resultat =-2; //a -2 per si hi ha error poder diferenciar-lo del -1 de menor
        if ( (this.getDni()).compareTo( (usuari.getDni())) >0 ){
            resultat =1;
        } else if ( (this.getDni()).compareTo( (usuari.getDni())) <0 ){
            resultat =1;
        } else if ( (this.getDni()).compareTo( (usuari.getDni())) ==0 ){
            resultat =1;
        }
        return resultat;
    }
  
    public boolean equals (Object obj){
        return this.getDni().equals(  ((MyUser)obj).getDni() );
    }
    
    
    @Override
    public String toString() {
        return "MyUser{" + "dni=" + dni + ", nom=" + nom + ", cognoms=" + cognoms + ", direccio=" + direccio + ", cp=" + cp + ", poblacio=" + poblacio + ", provincia=" + provincia + ", dataNaix=" + dataNaix + ", edat=" + edat + ", mail=" + mail + ", password=" + password + ", avatar=" + avatar + ", conectat=" + conectat + ", activat=" + activat + ", tipus=" + tipus + '}';
    }
   
}    