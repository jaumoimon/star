/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.model.bll;

import java.sql.Connection;
import stars.classes.ConexioBD;
import stars.modules.manageStart.classes.MyUser;

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
        ClientesDAOBD _clientesDAO = new ClientesDAOBD();
        
        resultado = _clientesDAO.nuevoClienteDAO(_con, _cliente);
        
        _conexion_DB.CerrarConexion(_con);
        return resultado;
    }
    // * obtener un arraylist con todos los clientes disponibles

    public void listAllClientesBLL() {
        Connection _con = null;
        ConexionBD _conexion_DB = new ConexionBD();
		
        _con = _conexion_DB.AbrirConexion();
        ClientesDAOBD _clienteDAO = new ClientesDAOBD();
        try {
            _clienteDAO.listAllClientesDAO(_con);//Recuperamos los usuarios       
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error Logger2!");
        }
        _conexion_DB.CerrarConexion(_con);
    }

    
     // modificar un cliente existente en la BD
  
    public void modificarClienteBLL(Clientes cli) {
        int resultado=0;
        Connection _con;
        Clientes _clienteModificado = null;
        ConexionBD _conexion_DB = new ConexionBD();
		
        _con = _conexion_DB.AbrirConexion();
        ClientesDAOBD _clientesDAO = new ClientesDAOBD();
        
        _clienteModificado = _clientesDAO.modificarClienteDAO(_con, cli);
        _conexion_DB.CerrarConexion(_con);
    }

   
     // eliminar un cliente de la BD

    public void borrarUsuarioBLL(Clientes cli) {
        Connection _con;
        Clientes _clienteborrado = null;
        ConexionBD _conexion_DB = new ConexionBD();

        _con = _conexion_DB.AbrirConexion();
        ClientesDAOBD _clienteDAO = new ClientesDAOBD();
        _clienteborrado = _clienteDAO.borrarClientesDAO(_con, cli);
        _conexion_DB.CerrarConexion(_con);
    }

    
     //* buscar en la BD un cliente por su DNI

    public Clientes buscarPorDniBLL(Clientes cli) {
        Connection _con = null;
        Clientes _clienteObtenido = null;
        ConexionBD _conexion_DB = new ConexionBD();
		
        _con = _conexion_DB.AbrirConexion();
        ClientesDAOBD _clienteDAO = new ClientesDAOBD();
        _clienteObtenido = _clienteDAO.buscarPorDniDAO(_con, cli);
        _conexion_DB.CerrarConexion(_con);
        return _clienteObtenido;
    }    
    
}
