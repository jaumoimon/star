package stars.librariesInt;


import java.io.*;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.model.classes.ReposUsers;

public class txt {
    public static void generatxtTrebFixe() {
        String PATH = null;
        try {
            File f;
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                PATH=PATH+ ".txt";
                f = new File(PATH);
                
                FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(ReposUsers.arrUsuaris);
				o.close();
                JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
    public static void generatxtWT() {
        String PATH = null;
        try {
            File f;
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                PATH=PATH+ ".txt";
                f = new File(PATH);
                
                FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(ArrayListWT.wT);
				o.close();
                JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void generatxtWH() {
        String PATH = null;
        try {
            File f;
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                PATH=PATH+ ".txt";
                f = new File(PATH);
                
                FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(ArrayListWH.wH);
				o.close();
                JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    */
        
    public static void generaTxtOcultTrebFixe() {
        String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+"/src/hotel/moduls/gestioPersones/gstTreballadors/gstTrebFixe/model/fitxers/trebFixes.txt";

                f = new File(PATH);
                
                FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(ReposUsers.arrUsuaris);
				o.close();
            
        } catch (Exception e) {
        }
    }
    /*
    public static void generaTxtOcultWT() {
        String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerT/model/Folders/trebT.txt";

                f = new File(PATH);
                
                FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(ArrayListWT.wT);
				o.close();
            
        } catch (Exception e) {
        }
    }
    
    public static void generaTxtOcultWH() {
        String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerH/model/Folders/trebH.txt";

                f = new File(PATH);
                
                FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(ArrayListWH.wH);
				o.close();
            
        } catch (Exception e) {
        }
    }
    */
      
    public static ArrayList<MyUser> obrirTxtTrebFixe() {
    	String PATH = null;
        try {
            File f;
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			ReposUsers.arrUsuaris = (ArrayList<MyUser>)oi.readObject();
    			oi.close();
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	return ReposUsers.arrUsuaris;
    }
    /*
    public static ArrayList<WorkerT> obrirTxtWT() {
    	String PATH = null;
        try {
            File f;
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			ArrayListWT.wT = (ArrayList<WorkerT>)oi.readObject();
    			oi.close();
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	return ArrayListWT.wT;
    }
    
    public static ArrayList<WorkerH> obrirTxtWH() {
    	String PATH = null;
        try {
            File f;
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			ArrayListWH.wH = (ArrayList<WorkerH>)oi.readObject();
    			oi.close();
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	return ArrayListWH.wH;
    }
    */
    public static ArrayList<MyUser> obrirTxtOcultTrebFixe() {
    	String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+"/src/hotel/moduls/gestioPersones/gstTreballadors/gstTrebFixe/model/fitxers/trebFixes.txt";

                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			ReposUsers.arrUsuaris = (ArrayList<MyUser>)oi.readObject();
    			oi.close();
            
        } catch (Exception e) {
        	
        }
    	return ReposUsers.arrUsuaris;
    }
    /*
    public static ArrayList<WorkerT> obrirTxtOcultWT() {
    	String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerT/model/Folders/trebF.txt";

                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			ArrayListWT.wT = (ArrayList<WorkerT>)oi.readObject();
    			oi.close();
            
        } catch (Exception e) {
        	
        }
    	return ArrayListWT.wT;
    }
    
    public static ArrayList<WorkerH> obrirTxtOcultWH() {
    	String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerH/model/Folders/trebF.txt";

                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			ArrayListWH.wH = (ArrayList<WorkerH>)oi.readObject();
    			oi.close();
            
        } catch (Exception e) {
        	
        }
    	return ArrayListWH.wH;
    }
    */
    

}
