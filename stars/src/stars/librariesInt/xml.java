package stars.librariesInt;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.model.classes.ReposUsers;
public class xml {
    private static final String ENCODING = "UTF-8";
    
    public static void generaXmlTrebFixe() {
        String PATH=null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, MyUser.class);

            String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
            xstream.toXML(ReposUsers.arrUsuaris, osw);
            StringBuffer xml = new StringBuffer();
            xml.append(header);
            xml.append(os.toString());
	    
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
            	File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                PATH = PATH+".xml";
                
                FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(xml.toString());
                fileXml.close();
                osw.close();
                os.close();
                JOptionPane.showMessageDialog(null, "Archivo XML guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);

            }
	    }catch (Exception e1){
	    	JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
	    } 
    }
    /*
    public static void generaXmlWT() {
        String PATH=null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, WorkerT.class);

            String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
            xstream.toXML(ArrayListWT.wT, osw);
            StringBuffer xml = new StringBuffer();
            xml.append(header);
            xml.append(os.toString());
	    
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
            	File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                PATH = PATH+".xml";
                
                FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(xml.toString());
                fileXml.close();
                osw.close();
                os.close();
                JOptionPane.showMessageDialog(null, "Archivo XML guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);

            }
	    }catch (Exception e1){
	    	JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
	    } 
    }
    
    public static void generaXmlWH() {
        String PATH=null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, WorkerH.class);

            String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
            xstream.toXML(ArrayListWH.wH, osw);
            StringBuffer xml = new StringBuffer();
            xml.append(header);
            xml.append(os.toString());
	    
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
            	File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                PATH = PATH+".xml";
                
                FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(xml.toString());
                fileXml.close();
                osw.close();
                os.close();
                JOptionPane.showMessageDialog(null, "Archivo XML guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);

            }
	    }catch (Exception e1){
	    	JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
	    } 
    }
    */
    public static void generaXmlOcultTrebFixe() {
        String PATH=null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, MyUser.class);

            String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
            xstream.toXML(ReposUsers.arrUsuaris, osw);
            StringBuffer xml = new StringBuffer();
            xml.append(header);
            xml.append(os.toString());
	    
            PATH = new java.io.File(".").getCanonicalPath()+"/src/hotel/moduls/gestioPersones/gstTreballadors/gstTrebFixe/model/fitxers/trebFixes.xml";

                
                FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(xml.toString());
                fileXml.close();
                osw.close();
                os.close();

            
	    }catch (Exception e1){
	    } 
    }
    /*
    public static void generaXmlOcultWT() {
        String PATH=null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, WorkerT.class);

            String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
            xstream.toXML(ArrayListWT.wT, osw);
            StringBuffer xml = new StringBuffer();
            xml.append(header);
            xml.append(os.toString());
	    
            PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerT/model/Folders/trebT.xml";

                
                FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(xml.toString());
                fileXml.close();
                osw.close();
                os.close();

            
	    }catch (Exception e1){
	    } 
    }
    
    public static void generaXmlOcultWH() {
        String PATH=null;
		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, WorkerH.class);

            String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
            xstream.toXML(ArrayListWH.wH, osw);
            StringBuffer xml = new StringBuffer();
            xml.append(header);
            xml.append(os.toString());
	    
            PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerH/model/Folders/trebH.xml";

                
                FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(xml.toString());
                fileXml.close();
                osw.close();
                os.close();

            
	    }catch (Exception e1){
	    } 
    }
    */
   public static ArrayList<MyUser> obrirXmmlTrebFixe() {
    	String PATH=null;
    	try {
            XStream xstream = new XStream();
            Annotations.configureAliases(xstream, MyUser.class);
 
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
            	File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                ReposUsers.arrUsuaris = (ArrayList <MyUser>)xstream.fromXML(new FileReader(PATH));
            }
            
        } catch (Exception e1) {
        	JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return ReposUsers.arrUsuaris;
    }
   /*
   public static ArrayList<WorkerT> obrirXmmlWT() {
   	String PATH=null;
   	try {
           XStream xstream = new XStream();
           Annotations.configureAliases(xstream, WorkerT.class);

           JFileChooser fileChooser = new JFileChooser();
           int seleccion = fileChooser.showOpenDialog(null);
           if (seleccion == JFileChooser.APPROVE_OPTION) {
           	File JFC = fileChooser.getSelectedFile();
               PATH = JFC.getAbsolutePath();
               ArrayListWT.wT = (ArrayList <WorkerT>)xstream.fromXML(new FileReader(PATH));
           }
           
       } catch (Exception e1) {
       	JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
       }
       return ArrayListWT.wT;
   }
   
   public static ArrayList<WorkerH> obrirXmmlWH() {
   	String PATH=null;
   	try {
           XStream xstream = new XStream();
           Annotations.configureAliases(xstream, WorkerH.class);

           JFileChooser fileChooser = new JFileChooser();
           int seleccion = fileChooser.showOpenDialog(null);
           if (seleccion == JFileChooser.APPROVE_OPTION) {
           	File JFC = fileChooser.getSelectedFile();
               PATH = JFC.getAbsolutePath();
               ArrayListWH.wH = (ArrayList <WorkerH>)xstream.fromXML(new FileReader(PATH));
           }
           
       } catch (Exception e1) {
       	JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
       }
       return ArrayListWH.wH;
   }
   */
   public static ArrayList<MyUser> obrirXmlOcultTrebFixe() {
    	String PATH=null;
    	try {
            XStream xstream = new XStream();
            Annotations.configureAliases(xstream, MyUser.class);
 
            PATH = new java.io.File(".").getCanonicalPath()+"/src/hotel/moduls/gestioPersones/gstTreballadors/gstTrebFixe/model/fitxers/trebFixes.xml";
            ReposUsers.arrUsuaris = (ArrayList <MyUser>)xstream.fromXML(new FileReader(PATH));
            
        } catch (Exception e1) {
        	
        }
        return ReposUsers.arrUsuaris;
    }
   /*
   public static ArrayList<WorkerT> obrirXmlOcultWT() {
   	String PATH=null;
   	try {
           XStream xstream = new XStream();
           Annotations.configureAliases(xstream, WorkerT.class);

           PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerF/model/Folders/trebT.xml";
           ArrayListWT.wT = (ArrayList <WorkerT>)xstream.fromXML(new FileReader(PATH));
           
       } catch (Exception e1) {
       	
       }
       return ArrayListWT.wT;
   }
   
   public static ArrayList<WorkerH> obrirXmlOcultWH() {
   	String PATH=null;
   	try {
           XStream xstream = new XStream();
           Annotations.configureAliases(xstream, WorkerH.class);

           PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerF/model/Folders/trebH.xml";
           ArrayListWH.wH = (ArrayList <WorkerH>)xstream.fromXML(new FileReader(PATH));
           
       } catch (Exception e1) {
       	
       }
       return ArrayListWH.wH;
   }
   */ 

    

}
