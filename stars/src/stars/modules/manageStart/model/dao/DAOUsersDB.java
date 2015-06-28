/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import stars.classes.DataPropia;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.model.classes.ReposUsers;

/**
 *
 * @author Gestor
 */
public class DAOUsersDB {
    
    //Donem d'alta un usuari
    
    public int nouUsuariDAO (Connection con, MyUser usr) {
        PreparedStatement stmt = null;
        int resultado=0;
        try {
            stmt = con.prepareStatement("INSERT INTO stars.users"
                    + "(dni, nom, cognoms, direccio, cp, poblacio"
                    + ", provincia, dataNaix, edat, mail, password"
                    + ", avatar, conectat, activat, tipus) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, usr.getDni());
            stmt.setString(2, usr.getNom());
            stmt.setString(3, usr.getCognoms());
            stmt.setString(4, usr.getDireccio());
            stmt.setInt(5, usr.getCp());
            stmt.setString(6, usr.getPoblacio());
            stmt.setString(7, usr.getProvincia());
            stmt.setString(8, usr.getDataNaix().toString());
            stmt.setInt(9, usr.getEdat());
            stmt.setString(10, usr.getMail());
            stmt.setString(11, usr.getPassword());
            stmt.setString(12, usr.getAvatar());
            stmt.setBoolean(13, usr.isConectat());
            stmt.setBoolean(14, usr.isActivat());
            stmt.setString(15, usr.getTipus());


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

    //Lllistar +  array els usuaris
    
   public void listAllClientesDAO(Connection con) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        ReposUsers.arrayUsuaris.clear();
        try {
            stmt = con.prepareStatement("SELECT * FROM tpvpizzeria.clientes");
            rs = stmt.executeQuery();
            MyUser _usuari = null;
            while (rs.next()) {
                
                _usuari = new MyUser();
                _usuari.setDni(rs.getString("dni"));
                _usuari.setNom(rs.getString("nom"));
                _usuari.setCognoms(rs.getString("cognom"));
                _usuari.setDireccio(rs.getString("direccio"));
                _usuari.setCp(rs.getInt("cp"));
                _usuari.setPoblacio(rs.getString("poblacio"));
                _usuari.setProvincia(rs.getString("provincia"));
                _usuari.setDataNaix( new DataPropia (rs.getString("dataNaix")) );
                _usuari.setEdat(rs.getInt("edat"));
                _usuari.setMail(rs.getString("mail"));
                _usuari.setPassword(rs.getString("password"));
                _usuari.setAvatar(rs.getString("avatar"));
                _usuari.setConectat(rs.getBoolean("conectat"));
                _usuari.setActivat(rs.getBoolean("activat"));
                _usuari.setTipus(rs.getString("tipus"));
                ReposUsers.arrayUsuaris.add(_usuari);

                
                
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

   //Modificar un usuari
   
    public MyUser modificarClienteDAO(Connection con, MyUser usr) {
        int resultado=0;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE stars.users SET dni=?, nom=?,"
                    + "cognoms=?, direccio=?, cp=?, poblacio=?"
                    + ", provincia=?, dataNaix=?, edat=?, mail=?, password=?"
                    + ", avatar=?, conectat=?, activat=?, tipus=? WHERE dni=? ");  
            
            
            stmt.setString(1, usr.getDni());
            stmt.setString(2, usr.getNom());
            stmt.setString(3, usr.getCognoms());
            stmt.setString(4, usr.getDireccio());
            stmt.setInt(5, usr.getCp());
            stmt.setString(6, usr.getPoblacio());
            stmt.setString(7, usr.getProvincia());
            stmt.setString(8, usr.getDataNaix().toString());
            stmt.setInt(9, usr.getEdat());
            stmt.setString(10, usr.getMail());
            stmt.setString(11, usr.getPassword());
            stmt.setString(12, usr.getAvatar());
            stmt.setBoolean(13, usr.isConectat());
            stmt.setBoolean(14, usr.isActivat());
            stmt.setString(15, usr.getTipus());
            
            stmt.setString(16, usr.getDni());
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
        return usr;
    }
   
    //Borrar un usuari
    
    public MyUser borrarClientesDAO(Connection con, MyUser usr) {
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM stars.users WHERE dni=?");
            stmt.setString(1, usr.getDni());
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
        return usr;
    }

    //Buscamos por dni un cliente
    
    public MyUser buscarPorDniDAO(Connection con, MyUser usr) {
        MyUser _usuari = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM stars.users WHERE DNI=?");
            stmt.setString(1, usr.getDni());
            rs = stmt.executeQuery();
            while (rs.next()) {
                _usuari = new MyUser(null, null, null, null, 0, null, null, null, 0, null, null, null, true, true, null);
                obtenClienteFila(rs, _usuari);
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
        return _usuari;
    }

    
    
    private void obtenClienteFila(ResultSet rs, MyUser usr) {
        try {
            

            usr.setDni(rs.getString("dni"));
            usr.setNom(rs.getString("nom"));
            usr.setCognoms(rs.getString("cognom"));
            usr.setDireccio(rs.getString("direccio"));
            usr.setCp(rs.getInt("cp"));
            usr.setPoblacio(rs.getString("poblacio"));
            usr.setProvincia(rs.getString("provincia"));
            usr.setDataNaix( new DataPropia (rs.getString("dataNaix")) );
            usr.setEdat(rs.getInt("edat"));
            usr.setMail(rs.getString("mail"));
            usr.setPassword(rs.getString("password"));
            usr.setAvatar(rs.getString("avatar"));
            usr.setConectat(rs.getBoolean("conectat"));
            usr.setActivat(rs.getBoolean("activat"));
            usr.setTipus(rs.getString("tipus"));

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el Logger");
        }
    }

        
    
    
    
}
