package stars.modules.gestioPersones.gstTreballadors.gstTrebFixe.model.classes;
import stars.classes.DataPropia;
import stars.modules.gestioPersones.gstTreballadors.gstTrebFixe.vista.interficieTRebFixe;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import stars.librariesInt.Functions;
import stars.classes.pager.Pager;

public class miniSimpleTableModelTrebFixe extends AbstractTableModel {
    public static ArrayList<TreballadorFixe> datos = new ArrayList<TreballadorFixe>();
    public static ArrayList<TreballadorFixe> datosaux = new ArrayList<TreballadorFixe>();
    String [] columnas = {"DNI", "Nom", "DataNaix", "Edat", "Contracte", "Sou"};

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
        TreballadorFixe fila = (TreballadorFixe) datos.get(row);

        switch (col) {
            case 0:
                dev = fila.getDni();
                break;

            case 1:
                dev = fila.getNom();
                break;

            case 2:
                dev = fila.getDataNaix();
                break;

            case 3:
                dev = fila.getEdat();
                break;
                
            case 4:
                dev = fila.getDataCont();
                break;
            
            case 5:
                dev = fila.getSou();
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
        TreballadorFixe fila = (TreballadorFixe) datos.get(row);

        switch (col) {
            case 0:
                fila.setDni(new StringBuffer (value.toString()));
                break;

            case 1:
                fila.setNom(new StringBuffer (value.toString()));
                break;

            case 2:
                fila.setDataNaix(new DataPropia(value.toString(), 2));
                break;
            
            case 3:
                fila.canviarEdat(fila.getDataNaix());
                break;
                
            case 4:
                fila.setDataCont(new DataPropia(value.toString(), 2));
                break;
            
            case 5:
                fila.calcularSou();
                break;
        }
        fireTableCellUpdated(row, col);
    }

    public void addRow(TreballadorFixe usu) {
        datos.add(usu);
        fireTableDataChanged();
    }

    public void cargar() {
        datos.clear();
        datosaux.clear();
        
        TreballadorFixe _socio= null;
        for(int i=1;i<=7;i++) {
            _socio = new TreballadorFixe(Functions.cadeDNI(), new StringBuffer (Functions.cadeAle01(7)), Functions.getFechaAleatoria(), new StringBuffer (Functions.cadeAle01(7)), Functions.getFechaAleatoria());
 
            addRow(_socio);
            datosaux.add(_socio);
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
        String dni=interficieTRebFixe.jTextField1.getText();
        for(int i=0;i<datosaux.size();i++) {
            if(datosaux.get(i).getDni().toString().contains(dni)){
                addRow(datosaux.get(i));
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, cont);
        Pager.initLinkBox();
    }

    public TreballadorFixe buscar(String u) {
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

    public int buscaUsuario(TreballadorFixe u) {
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
