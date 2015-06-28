/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.model.dao;

import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.model.classes.ReposUsers;
import stars.modules.manageStart.view.FrmSignUp;

/**
 *
 * @author Gestor
 */
public class DAOUsers {
    
    public static String obtindreDni (){
        return FrmSignUp.frmTxtDni.getText();
    }
    
    public static String obtindreNom (){
        return FrmSignUp.txtNom.getText();
    }
    
    public static String obtindreCognom (){
        return FrmSignUp.txtCognom.getText();
    }
    
    public static String obtindreDireccio () {
        return FrmSignUp.txtDir.getText();
    }
    
    public static String obtindreCP (){
        return FrmSignUp.lblCp.getText();
    }
    
    public static String obtindrePoblacio (){
        return FrmSignUp.lblPoblacio.getText();
    }
    
    public static String obtindreProvincia (){
        return FrmSignUp.lblProvincia.getText();
    }
    
  /*  public static String obtindreDataNaix(){
        return FrmSignUp.getText();
    }
    */
    public static String obtindreMail (){
        return FrmSignUp.FrmTxtMail.getText();
    }
    
    public static String obtindrePass (){
        return FrmSignUp.pasClau.toString();
    }
    
    public static String obrindreAvatar (){
        return FrmSignUp.lblAvatar.getText();
    }
    
    
    
   /* 
    public void crearUser(){
        String usuari = obtindreDni();
        String clau = obtindrePass();
        String tipus = "user";
        String avatar = "";
                      
        
        ReposUsers.usuari = new MyUser(usuari, clau, tipus, avatar);
        
        ReposUsers.arrUsuaris.add(ReposUsers.usuari);
        
        
        
    }
    */
    
}
