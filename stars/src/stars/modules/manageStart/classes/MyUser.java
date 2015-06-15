/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.classes;

/**
 *
 * @author Gestor
 */
public class MyUser {
    
    private String usuari = null;
    private String password = null;
    private boolean conectat = false;
    private boolean activat = false;
    private String tipus = "";
    private String avatar = "";

    public MyUser(String usuari, String clau, boolean conectat, boolean activat, String tipus, String avatar) {
        this.usuari = usuari;
        this.password = clau;
        this.conectat = conectat;
        this.activat = activat;
        this.tipus = tipus;
        this.avatar = avatar;
    }
    
    public MyUser(String usuari, String clau, String tipus, String avatar) {
        this.usuari = usuari;
        this.password = clau;
        this.tipus = tipus;
        this.avatar = avatar;
    }
    
    public MyUser() {
    }
    
    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "MyUser{" + "usuari=" + usuari + ", clau=" + password + ", conectat=" + conectat + ", activat=" + activat + ", tipus=" + tipus + ", avatar=" + avatar + '}';
    }


    
    

   
       
}
