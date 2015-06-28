/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.model.bll;

import java.sql.Connection;
import javax.swing.JOptionPane;
import stars.classes.ConexioBD;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.model.dao.DAOUsersDB;

/**
 *
 * @author Gestor
 */
public class BLLStartBBDD {
    
    public int nouUserBLL(MyUser _usuari) {
        int resultat=0;
        Connection _con = null;
        MyUser _nouUsuari = null;
        ConexioBD _conexion_DB = new ConexioBD();
		
        _con = _conexion_DB.AbrirConexion();
        DAOUsersDB _usuarisDAO = new DAOUsersDB();
        
        resultat = _usuarisDAO.nouUsuariDAO(_con, _usuari);
        
        _conexion_DB.CerrarConexion(_con);
        return resultat;
    }
    // * obtener un arraylist con todos los clientes disponibles

    public void listAllClientesBLL() {
        Connection _con = null;
        ConexioBD _conexion_DB = new ConexioBD();
		
        _con = _conexion_DB.AbrirConexion();
        DAOUsersDB _clienteDAO = new DAOUsersDB();
        try {
            _clienteDAO.listAllClientesDAO(_con);//Recuperamos los usuarios       
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error Logger2!");
        }
        _conexion_DB.CerrarConexion(_con);
    }

    
     // modificar un cliente existente en la BD
  
    public void modificarClienteBLL(MyUser usu) {
        int resultat=0;
        Connection _con;
        MyUser _usuariModificat = null;
        ConexioBD _conexion_DB = new ConexioBD();
		
        _con = _conexion_DB.AbrirConexion();
        DAOUsersDB _clientesDAO = new DAOUsersDB();
        
        _usuariModificat = _clientesDAO.modificarClienteDAO(_con, usu);
        _conexion_DB.CerrarConexion(_con);
    }

   
     // eliminar un cliente de la BD

    public void borrarUsuarioBLL(MyUser usu) {
        Connection _con;
        MyUser _usuariEliminat = null;
        ConexioBD _conexion_DB = new ConexioBD();

        _con = _conexion_DB.AbrirConexion();
        DAOUsersDB _clienteDAO = new DAOUsersDB();
        _usuariEliminat = _clienteDAO.borrarClientesDAO(_con, usu);
        _conexion_DB.CerrarConexion(_con);
    }

    
     //* buscar en la BD un cliente por su DNI

    public MyUser buscarPorDniBLL(MyUser usu) {
        Connection _con = null;
        MyUser _clienteObtenido = null;
        ConexioBD _conexion_DB = new ConexioBD();
		
        _con = _conexion_DB.AbrirConexion();
        DAOUsersDB _clienteDAO = new DAOUsersDB();
        _clienteObtenido = _clienteDAO.buscarPorDniDAO(_con, usu);
        _conexion_DB.CerrarConexion(_con);
        return _clienteObtenido;
    }    
    
}
