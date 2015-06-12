/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Gestor
 */
public class ConexioBD {
    
    public Connection AbrirConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String urlOdbc = "jdbc:mysql://localhost:3306/stars";
            con = DriverManager.getConnection(urlOdbc, "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha sido imposible establecer la conexion!");
        }
        return con;

    }
    /**
     * cerramos la conexion en la bd
     * @param con
     */
    public void CerrarConexion(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha sido imposible cerrar la conexion!");
        }
    }
}
