package stars.classes.pager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JRadioButton;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import stars.Principal;
import stars.modules.manageStart.model.classes.MSTableModelUsers;
import stars.modules.manageStart.view.FrmUsersAdmin;


public class Pager {
    public static final LinkViewRadioButtonUI ui = new LinkViewRadioButtonUI();
    public static int LR_PAGE_SIZE = 5;
    public static Box box = Box.createHorizontalBox();

    public static int currentPageIndex = 1;
    public static int itemsPerPage = 5;
    public static int maxPageIndex;

    public static void inicializa() {
        int rowCount = 0;
        switch (Principal.singletonFinestra){
            case "usuaris":
                rowCount = ((MSTableModelUsers)FrmUsersAdmin.TABLA.getModel()).getRowCount();
                break;
            case "habitacions":
                
                break;
        }
            
        int v = rowCount%itemsPerPage==0 ? 0 : 1;
        maxPageIndex = rowCount/itemsPerPage + v;
        
        box.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));   
        switch (Principal.singletonFinestra){
            case "usuaris":
                FrmUsersAdmin.jPanel4.setLayout(new BorderLayout());
                FrmUsersAdmin.jPanel4.add(Pager.box);
                break;
            case "habitacions":
                
                break;
        }        

    }
    public static void initLinkBox() {
        switch (Principal.singletonFinestra){
            case "usuaris":
                FrmUsersAdmin.sorter.setRowFilter(new RowFilter<TableModel, Integer>() {
                        @Override public boolean include(RowFilter.Entry<? extends TableModel, ? extends Integer> entry) {
                            int ti = currentPageIndex - 1;
                            int ei = entry.getIdentifier();
                            return ti*itemsPerPage<=ei && ei<ti*itemsPerPage+itemsPerPage;
                        }
                    });
                break;
            case "habitacions":
                
                break;
  
        }
 
        int startPageIndex = currentPageIndex-LR_PAGE_SIZE;
        int endPageIndex = 0;
        if(startPageIndex <=0){ startPageIndex = 1;}
        
        int rowCount = 0;
        
        switch (Principal.singletonFinestra){
            case "usuaris":
                rowCount = ( (MSTableModelUsers) FrmUsersAdmin.TABLA.getModel()).getRowCount();
                break;
            case "habitacions":
                
                break;
        }          
        
        

        int v = rowCount%itemsPerPage==0 ? 0 : 1;
        maxPageIndex = rowCount/itemsPerPage + v;
        endPageIndex = currentPageIndex+LR_PAGE_SIZE-1;
        if(endPageIndex>maxPageIndex) {
            endPageIndex = maxPageIndex;
        }

        box.removeAll();
      
        if(  (rowCount<=itemsPerPage) && (rowCount>0)  ){ //caben todos los datos en la misma página
            switch (Principal.singletonFinestra){
                case "usuaris":
                    FrmUsersAdmin.primero.setEnabled(false);
                    FrmUsersAdmin.ANTERIOR.setEnabled(false);
                    FrmUsersAdmin.SIGUIENTE.setEnabled(false);
                    FrmUsersAdmin.ultimo.setEnabled(false);
                    FrmUsersAdmin.CAJA.setText("");
                    
                    //actualizar enlaces: sólo 1 enlace
                    ButtonGroup bg = new ButtonGroup();
                    box.add(Box.createHorizontalGlue());
                    JRadioButton c = makeRadioButton(1);
                    box.add(c);
                    bg.add(c);
                    box.add(Box.createHorizontalGlue());
                    box.revalidate();
                    box.repaint();
                    
                    break;
                case "habitacions":
                    
                    break;
     
                    
            }

            
        }else if(rowCount==0) { //no hay rdos
            switch (Principal.singletonFinestra){
                case "usuaris":
            
            
            //actualizar botones y caja: desactivarlos
                FrmUsersAdmin.primero.setEnabled(false);
                FrmUsersAdmin.ANTERIOR.setEnabled(false);
                FrmUsersAdmin.SIGUIENTE.setEnabled(false);
                FrmUsersAdmin.ultimo.setEnabled(false);
                FrmUsersAdmin.CAJA.setText("");
            
            //actualizar enlaces: no hay enlaces
            ButtonGroup bg = new ButtonGroup();
            box.add(Box.createHorizontalGlue());
            JRadioButton c = makeRadioButton(0);
            box.add(c);
            bg.add(c);
            box.add(Box.createHorizontalGlue());
            box.revalidate();
            box.repaint();
                    
                    break;
            }
            
        }else if(rowCount>itemsPerPage) {
            
            switch (Principal.singletonFinestra){
                case "usuaris":
            FrmUsersAdmin.primero.setEnabled(currentPageIndex>1);
                    FrmUsersAdmin.ANTERIOR.setEnabled(currentPageIndex>1);
                    FrmUsersAdmin.SIGUIENTE.setEnabled(currentPageIndex<maxPageIndex);
                    FrmUsersAdmin.ultimo.setEnabled(currentPageIndex<maxPageIndex);
                    FrmUsersAdmin.CAJA.setText(Integer.toString(currentPageIndex) + String.format(" / %d", maxPageIndex));
                    
            
           

            ButtonGroup bg = new ButtonGroup();
            box.add(Box.createHorizontalGlue());
            for(int i=startPageIndex;i<=endPageIndex;i++) {
                JRadioButton c = makeRadioButton(i);
                box.add(c);
                bg.add(c);
            }
            box.add(Box.createHorizontalGlue());
            box.revalidate();
            box.repaint();
                    
                    break;
                    
            }
        }
    }
    public static JRadioButton makeRadioButton(final int target) {
        JRadioButton radio = new JRadioButton(String.valueOf(target)) {
            @Override protected void fireStateChanged() {
                ButtonModel model1 = getModel();
                if(!model1.isEnabled()) {
                    setForeground(Color.GRAY);
                }else if(model1.isPressed() && model1.isArmed()) {
                    setForeground(Color.GREEN);
                }else if(model1.isSelected()) {
                    setForeground(Color.RED);
                }
                super.fireStateChanged();
            }
        };
        radio.setForeground(Color.BLUE);
        radio.setUI(ui);
        if(target==currentPageIndex) {
            radio.setSelected(true);
        }
        radio.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                currentPageIndex=target;
                initLinkBox();
            }
        });
        return radio;
    }
}
