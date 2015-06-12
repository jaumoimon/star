/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.model.dao;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import stars.librariesInt.Check;
import stars.librariesInt.Validate;
import stars.modules.manageStart.view.WndStart;

/**
 *
 * @author Gestor
 */
public class DAOLogin {
    
    public static void insertUser () {
        
        if (WndStart.forTxtUser.getText().isEmpty()){
            WndStart.forTxtUser.setForeground(Color.red);
            WndStart.forTxtUser.setText("Introduir usuari");
            WndStart.forTxtUser.requestFocus();
            return;
        } else if ( Validate.validate_nom(WndStart.forTxtUser.getText()) ==false ){
            WndStart.forTxtUser.setForeground(Color.red);
            WndStart.forTxtUser.setText("Introduir usuari valid");
            WndStart.forTxtUser.requestFocus();
        } else {
            WndStart.forTxtPass.requestFocus();
        }
    }
    
        public static void insertPass () {
        
        if (WndStart.forTxtPass.getText().isEmpty()){
            WndStart.forTxtPass.setForeground(Color.red);
            WndStart.forTxtPass.setText("Introduir clau");
            WndStart.forTxtPass.requestFocus();
            return;
        } else if ( Validate.validate_nom(WndStart.forTxtPass.getText()) ==false ){
            WndStart.forTxtPass.setForeground(Color.red);
            WndStart.forTxtPass.setText("Introduir clau vàlida");
            WndStart.forTxtPass.requestFocus();
        } else {
            WndStart.btnAccept.requestFocus();
        }
    }
       
    public boolean checkUser (Connection con, String dni, String password) {


        boolean resultado = false;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String passPhrase   = "Xenobosfeelthesame";

        //Encriptar encriptador = new Encriptar(passPhrase);
        
        

        try {
            stmt = con.prepareStatement("SELECT * FROM stars.users WHERE dni=? AND password=?");

            stmt.setString(1, dni);
            //stmt.setString(2, encriptador.encrypt(password));
            stmt.setString(2, password);
            rs = stmt.executeQuery();

            while (rs.next()) {

                dni = rs.getString("dni");
                password = rs.getString("password");

                resultado = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Logger");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error Logger");
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error Logger");
                }
            }
        }
        return resultado;
    }
    
    
}
