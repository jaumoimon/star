/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.model.bll;

import java.sql.Connection;
import stars.classes.ConexioBD;
import stars.modules.manageStart.model.dao.DAOLogin;

/**
 *
 * @author Gestor
 */
public class BLLStart {
    
    public static void user (){
        DAOLogin.insertUser();
    }
    
    public static void pass (){
        DAOLogin.insertPass();
    }
    
    public boolean loginUsuarioBLL(String dni, String password) {

        Connection _con;
        boolean _resul;
        ConexioBD _conexion_DB = new ConexioBD();

        _con = _conexion_DB.AbrirConexion();

        DAOLogin _loginDAO = new DAOLogin();
        
        _resul = _loginDAO.checkUser(_con, dni, password);

        _conexion_DB.CerrarConexion(_con);

        return _resul;

    }    
    
    
}
