/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.model.classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.view.FrmUsersAdmin;
import stars.classes.pager.Pager;

/**
 *
 * @author Gestor
 */
public class MSTableModelUsers extends AbstractTableModel{

    public static ArrayList<MyUser> datos = new ArrayList<MyUser>();
    public static ArrayList<MyUser> datosaux = new ArrayList<MyUser>();
    String [] columnas = {"DNI", "password", "tipus", "activat", "avatar"};

    ////////////////////estos métodos son necesarios para que jtable funcione/////////////////////
    @Override
    public String getColumnName(int col) {
        return columnas[col].toString();
    }

    //Devuelve el numero de filas
    @Override
    public int getRowCount() {
        return datos.size();
    }

    //Devuelve el numero de columnas
    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    //Devuelve el valor del objeto en la fila y columna
    @Override
    public Object getValueAt(int row, int col) {

        Object dev = null;
        MyUser fila = (MyUser) datos.get(row);

        switch (col) {
            case 0:
                dev = fila.getDni();
                break;

            case 1:
                dev = fila.getPassword();
                break;

            case 2:
                dev = fila.getTipus();
                break;

            case 3:
                dev = fila.isActivat();
                break;
                
            case 4:
                dev = fila.getAvatar();
                break;

        }
        return dev;
    }

    //Determina si una fila y columna ha de ser editable
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    //Actualiza un objeto de una fila y columna
    @Override
    public void setValueAt(Object value, int row, int col) {
        MyUser fila = (MyUser) datos.get(row);

        switch (col) {
            case 0:
                fila.setDni(value.toString());
                break;

            case 1:
                fila.setPassword(value.toString());
                break;

            case 2:
                fila.setTipus(value.toString());
                break;
            
            case 3:
                fila.setActivat((boolean) value);
                break;
                
            case 4:
                fila.setAvatar(value.toString());
                break;

        }
        fireTableCellUpdated(row, col);
    }

    public void addRow(MyUser usu) {
        datos.add(usu);
        fireTableDataChanged();
    }

    public void cargar() {
        datos.clear();
        datosaux.clear();
        
        MyUser _user= null;
        for(int i=1;i<=7;i++) {
            _user = new MyUser(null, null, null, null, i, null, null, null, i, null, null, null, true, true, null);
            addRow(_user);
            datosaux.add(_user);
            try {
                Thread.sleep(1); //1 milliseconds
            } catch (Exception e) {
              System.out.println(e);
            }
        }
    }
    
    public void filtrar() {
        datos.clear();
        
        int cont=0;
        String dni=FrmUsersAdmin.jTextField1.getText();
        for(int i=0;i<datosaux.size();i++) {
            if(datosaux.get(i).getDni().contains(dni)){
                addRow(datosaux.get(i));
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, cont);
        Pager.initLinkBox();
    }

    public MyUser buscar(String u) {
        datos.clear();
        cargar();

        String res;
        for (int i = 0; i < datos.size(); i++) {
            res = datos.get(i).toString();
            if (res.contains(u)) {
                return datos.get(i);
            }
        }
        return null;
    }

    public int buscaUsuario(MyUser u) {
        datos.clear();
        cargar();

        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).equals(u)) {
                return i;
            }
        }
        return -1;
    }

    public void removeRow(int fila) {
        datos.remove(fila);
        fireTableDataChanged();
    }
    
    //para pintar ImageIcon
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    
}
