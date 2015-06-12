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
public class Texts_SignUp {
    
    public static String writeTitol (){
        String text = null;
        switch (Principal.conf.getIdioma()){
            case 0:
                text = "Nou Usuari";
                break;
            case 1:
                text = "Usuario nuevo";
                break;
            default:
                text = "Nou Usuari/";
                break;
            
        }
        
        return text;
    }
    
}
