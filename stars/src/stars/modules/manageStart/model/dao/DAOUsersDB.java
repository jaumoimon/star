/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import stars.modules.manageStart.classes.MyUser;

/**
 *
 * @author Gestor
 */
public class DAOUsersDB {
    
    //Donem d'alta un clie 
    
    public int nouUsuariDAO (Connection con, MyUser usr) {
        PreparedStatement stmt = null;
        int resultado=0;
        try {
            stmt = con.prepareStatement("INSERT INTO stars.users"
                    + "(dni, password, conectat, activitat, tipus, avatar"
                    + ", Email, Telefono, Avatar, Provincia, Ciudad"
                    + ", CP, Estado, Saldo) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, usr.get;
            stmt.setString(2, cli.getNombre());
            stmt.setString(3, cli.getApellidos());
            stmt.setString(4, cli.getFechaNac());
            stmt.setString(5, cli.getLogin());
            stmt.setString(6, cli.getPassword());
            stmt.setString(7, cli.getEmail());
            stmt.setString(8, cli.getTelefono());
            stmt.setString(9, cli.getAvatar());
            stmt.setString(10, cli.getProvincia());
            stmt.setString(11, cli.getCiudad());
            stmt.setString(12, cli.getCP());
            stmt.setInt(13, cli.GetEstado());
            stmt.setFloat(14, cli.getSaldo());


            resultado=stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El usuario ha sido dado de alta correctamente!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al insertar un nuevo usuario!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error Logger!");
                }
            }
        }
        return resultado;
    }

    //Listamos todos los clientes y los metemos en su array
    
   public void listAllClientesDAO(Connection con) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        ArrayListClientes.cli.clear();
        try {
            stmt = con.prepareStatement("SELECT * FROM tpvpizzeria.clientes");
            rs = stmt.executeQuery();
            Clientes _cliente = null;
            while (rs.next()) {
                
                _cliente = new Clientes();
                _cliente.setDNI(rs.getString("DNI"));
                _cliente.setNombre(rs.getString("Nombre"));
                _cliente.setApellidos(rs.getString("Apellidos"));
                _cliente.setFechaNac(rs.getString("FechaNac"));
                _cliente.setLogin(rs.getString("Login"));
                _cliente.setPassword(rs.getString("Password"));
                _cliente.setEmail(rs.getString("Email"));
                _cliente.setTelefono(rs.getString("Telefono"));
                _cliente.setAvatar(rs.getString("Avatar"));
                _cliente.setProvincia(rs.getString("Provincia"));
                _cliente.setCiudad(rs.getString("Ciudad"));
                _cliente.setCP(rs.getString("CP"));
                _cliente.setEstado(rs.getInt("Estado"));
                _cliente.setSaldo(rs.getInt("Saldo"));
                ArrayListClientes.cli.add(_cliente);
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al obtener los usuarios!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error Logger!");
                }
            }
        }

    }

   //Modificamos un cliente
   
    public Clientes modificarClienteDAO(Connection con, Clientes cli) {
        int resultado=0;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tpvpizzeria.clientes SET DNI=?, Nombre=?, "
                    + "Apellidos=?, FechaNac=?, Login=?, Password=?,"
                    + "Email=?, Telefono=?, Avatar=?, Provincia=?, "
                    + "Ciudad=?, CP=?, Estado=?, Saldo=? WHERE DNI=?");
            
            stmt.setString(1, cli.getDNI());
            stmt.setString(2, cli.getNombre());
            stmt.setString(3, cli.getApellidos());
            stmt.setString(4, cli.getFechaNac());
            stmt.setString(5, cli.getLogin());
            stmt.setString(6, cli.getPassword());
            stmt.setString(7, cli.getEmail());
            stmt.setString(8, cli.getTelefono());
            stmt.setString(9, cli.getAvatar());
            stmt.setString(10, cli.getProvincia());
            stmt.setString(11, cli.getCiudad());
            stmt.setString(12, cli.getCP());
            stmt.setInt(13, cli.GetEstado());
            stmt.setFloat(14, cli.getSaldo());

            stmt.setString(15, cli.getDNI());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "El usuario ha sido modificado correctamente!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al actualizar el usuario!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error Logger!");
                }
            }
        }
        return cli;
    }
   
    //Borramos un cliente
    
    public Clientes borrarClientesDAO(Connection con, Clientes cli) {
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tpvpizzeria.clientes WHERE DNI=?");
            stmt.setString(1, cli.getDNI());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error al eliminar el usuario!");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error en el Logger!");
                }
            }
        }
        return cli;
    }

    //Buscamos por dni un cliente
    
    public Clientes buscarPorDniDAO(Connection con, Clientes cli) {
        Clientes _cliente = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM tpvpizzeria.clientes WHERE DNI=?");
            stmt.setString(1, cli.getDNI());
            rs = stmt.executeQuery();
            while (rs.next()) {
                _cliente = new Clientes(null, null, null, null, null, null, null, null, null, null, null, 0, 0);
                obtenClienteFila(rs, _cliente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al buscar el usuario por DNI");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error en el Logger");
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error en el Logger");
                }
            }
        }
        return _cliente;
    }

    
    
    private void obtenClienteFila(ResultSet rs, Clientes cli) {
        try {
            
            cli.setDNI(rs.getString("DNI"));
            cli.setNombre(rs.getString("Nombre"));
            cli.setApellidos(rs.getString("Apellidos"));
            cli.setFechaNac(rs.getString("FechaNac"));
            cli.setLogin(rs.getString("Login"));
            cli.setPassword(rs.getString("Password"));
            cli.setEmail(rs.getString("Email"));
            cli.setTelefono(rs.getString("Telefono"));
            cli.setAvatar(rs.getString("Avatar"));
            cli.setProvincia(rs.getString("Provincia"));
            cli.setCiudad(rs.getString("Ciudad"));
            cli.setCP(rs.getString("CP"));
            cli.setEstado(rs.getInt("Estado"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el Logger");
        }
    }

        
    
    
    
}
