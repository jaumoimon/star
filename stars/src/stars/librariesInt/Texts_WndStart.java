/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.librariesInt;

import stars.Principal;

/**
 *
 * @author Gestor
 */
public class Texts_WndStart {
    
    public static String writeInci (){
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Inci";
                break;
            case 1:
                text = "Inicio";
                break;
            default:
                text ="Inici/Home";
                break;
        }   
        return text;
    }
    
    public static String writeHabitacions (){
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Habitacions";
                break;
            case 1:
                text = "Habitaciones";
                break;
            default:
                text ="Habitacions/Rooms";
                break;
        }   
        return text;
    }
    
    public static String writeReserves (){
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Reserves";
                break;
            case 1:
                text = "Reservas";
                break;
            default:
                text ="Reserves/";
                break;
        }   
        return text;
    }
    
        public static String writePerfil (){
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Perfil";
                break;
            case 1:
                text = "Perfil";
                break;
            default:
                text ="Perfil/";
                break;
        }   
        return text;
    }
    
    public static String writeUsuaris (){
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Usuaris";
                break;
            case 1:
                text = "Usuarios";
                break;
            default:
                text ="Usuaris/Users";
                break;
        }   
        return text;
    }
        
    public static String writeTitol () {
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="INICIAR SESSIÓ";
                break;
            case 1:
                text = "INICIAR SESIÓN";
                break;
            default:
                text ="Iniciar sessió/LogIn";
                break;
        }   
        return text;
    }    
    
    public static String writeIntroUser () {
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Usuari";
                break;
            case 1:
                text = "Usuario";
                break;
            default:
                text ="Usuari/User";
                break;
        }   
        return text;
    }  
    
    public static String writePass () {
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Contrasenya";
                break;
            case 1:
                text = "Contraseña";
                break;
            default:
                text ="Contrasenya/Password";
                break;
        }   
        return text;
    }  
    
    public static String writeAccept () {
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Entrar";
                break;
            case 1:
                text = "Entrar";
                break;
            default:
                text ="Entrar/SignIn";
                break;
        }   
        return text;
    }  
    
    public static String writeCancel () {
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Cancel·lar";
                break;
            case 1:
                text = "Cancelar";
                break;
            default:
                text ="Cancel·lar/Cancel";
                break;
        }   
        return text;
    }  
    
    public static String writeSignUp () {
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="Registra't";
                break;
            case 1:
                text = "Regístrate";
                break;
            default:
                text ="Registra't/SignUp";
                break;
        }   
        return text;
    }
    
    public static String writeForget () {
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text ="No recordes les claus d'accés?";
                break;
            case 1:
                text = "¿Has oblidado tú contraseña?";
                break;
            default:
                text ="Recuperar claus/Recover";
                break;
        }   
        return text;
    }
    
    
}

