package stars.librariesInt;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.model.classes.ReposUsers;

public class json {
		
		
    public static void generaJsonTrebFixe() {//Guarda Json de empleado fijo
    	String PATH = null;
	      try {
	          XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	          xstreamjson.setMode(XStream.NO_REFERENCES);
	          xstreamjson.alias("TreballadorFixe", MyUser.class);
	          
	          JFileChooser fileChooser = new JFileChooser();
	          int seleccion = fileChooser.showSaveDialog(null);
	          if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                PATH=PATH+ ".json";
	              
	                Gson gson1=new Gson();
	                String json=gson1.toJson(ReposUsers.arrayUsuaris);
		            FileWriter fileXml=new FileWriter(PATH);
	                fileXml.write(json.toString());
	                fileXml.close();
   
	                JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON", JOptionPane.INFORMATION_MESSAGE);
	          }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	
    }
    
    /*
    public static void generaJsonWT() {//Guarda Json de empleado fijo
    	String PATH = null;
	      try {
	          XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	          xstreamjson.setMode(XStream.NO_REFERENCES);
	          xstreamjson.alias("Empleadofijo", WorkerT.class);
	          
	          JFileChooser fileChooser = new JFileChooser();
	          int seleccion = fileChooser.showSaveDialog(null);
	          if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                PATH=PATH+ ".json";
	              
	                Gson gson1=new Gson();
	                String json=gson1.toJson(ArrayListWT.wT);
		            FileWriter fileXml=new FileWriter(PATH);
	                fileXml.write(json.toString());
	                fileXml.close();
   
	                JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON", JOptionPane.INFORMATION_MESSAGE);
	          }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	
    }
    
    public static void generaJsonWH() {//Guarda Json de empleado fijo
    	String PATH = null;
	      try {
	          XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	          xstreamjson.setMode(XStream.NO_REFERENCES);
	          xstreamjson.alias("Empleadofijo", WorkerH.class);
	          
	          JFileChooser fileChooser = new JFileChooser();
	          int seleccion = fileChooser.showSaveDialog(null);
	          if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                PATH=PATH+ ".json";
	              
	                Gson gson1=new Gson();
	                String json=gson1.toJson(ArrayListWH.wH);
		            FileWriter fileXml=new FileWriter(PATH);
	                fileXml.write(json.toString());
	                fileXml.close();
   
	                JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON", JOptionPane.INFORMATION_MESSAGE);
	          }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	
    }
    */    
    public static void generaJsonOcultTrebFixe() {//Guarda Json de empleadosfijos de forma silenciosa
    	String PATH = null;
	      try {
	          XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	          xstreamjson.setMode(XStream.NO_REFERENCES);
	          xstreamjson.alias("TreballadorFixe", MyUser.class);


	                PATH = new java.io.File(".").getCanonicalPath()+"/src/hotel/moduls/gestioPersones/gstTreballadors/gstTrebFixe/model/fitxers/trebFixes.json";
	           
	              
	                Gson gson = new Gson();
		            String json1 = gson.toJson(ReposUsers.arrayUsuaris);
		            FileWriter fileXml = new FileWriter(PATH);
	                fileXml.write(json1.toString());
	                fileXml.close();
   
	          
        } catch (Exception e) {
        }
    	
    }
    
    /*
    public static void generaJsonOcultWT() {//Guarda Json de empleadosfijos de forma silenciosa
    	String PATH = null;
	      try {
	          XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	          xstreamjson.setMode(XStream.NO_REFERENCES);
	          xstreamjson.alias("Empleadofijo", WorkerT.class);


	                PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerT/model/Folders/trebT.json";
	           
	              
	                Gson gson = new Gson();
		            String json1 = gson.toJson(ArrayListWT.wT);
		            FileWriter fileXml = new FileWriter(PATH);
	                fileXml.write(json1.toString());
	                fileXml.close();
   
	          
        } catch (Exception e) {
        }
    	
    }
    
    public static void generaJsonOcultWH() {//Guarda Json de empleadosfijos de forma silenciosa
    	String PATH = null;
	      try {
	          XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	          xstreamjson.setMode(XStream.NO_REFERENCES);
	          xstreamjson.alias("Empleadofijo", WorkerH.class);


	                PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerH/model/Folders/trebH.json";
	           
	              
	                Gson gson = new Gson();
		            String json1 = gson.toJson(ArrayListWH.wH);
		            FileWriter fileXml = new FileWriter(PATH);
	                fileXml.write(json1.toString());
	                fileXml.close();
   
	          
        } catch (Exception e) {
        }
    	
    }
    */    
    public static ArrayList<MyUser> obrirJsonTrebFixe(){//Abre Json de empleados fijos
    	String PATH = null;
    	MyUser e1=new MyUser();
    	
        try {
        	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
	          xstream.setMode(XStream.NO_REFERENCES);
			  xstream.alias("TreballadorFixe", MyUser.class);
			  
			  JFileChooser fileChooser = new JFileChooser();
	          int seleccion = fileChooser.showOpenDialog(null);
	          if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	               
	                ReposUsers.arrayUsuaris.clear();
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	JsonArray lista = raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, MyUser.class);
	            		ReposUsers.arrayUsuaris.add(e1);
	            	}
	          } 
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return ReposUsers.arrayUsuaris;
    }
    /*
    public static ArrayList<WorkerT> obrirJsonWT(){//Abre Json de empleados fijos
    	String PATH = null;
    	WorkerT e1=new WorkerT();
    	
        try {
        	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
	          xstream.setMode(XStream.NO_REFERENCES);
			  xstream.alias("Empleadofijo", WorkerT.class);
			  
			  JFileChooser fileChooser = new JFileChooser();
	          int seleccion = fileChooser.showOpenDialog(null);
	          if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	               
	                ArrayListWT.wT.clear();
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	JsonArray lista = raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, WorkerT.class);
	            		ArrayListWT.wT.add(e1);
	            	}
	          } 
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return ArrayListWT.wT;
    }
    
    public static ArrayList<WorkerH> obrirJsonWH(){//Abre Json de empleados fijos
    	String PATH = null;
    	WorkerH e1=new WorkerH();
    	
        try {
        	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
	          xstream.setMode(XStream.NO_REFERENCES);
			  xstream.alias("Empleadofijo", WorkerH.class);
			  
			  JFileChooser fileChooser = new JFileChooser();
	          int seleccion = fileChooser.showOpenDialog(null);
	          if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	               
	                ArrayListWH.wH.clear();
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	JsonArray lista = raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, WorkerH.class);
	            		ArrayListWH.wH.add(e1);
	            	}
	          } 
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return ArrayListWH.wH;
    }
    */
    public static ArrayList<MyUser> obrirJsonOcultTrebFixe(){//Abre json de empleados fijos de forma silenciosa
    	String PATH = null;
    	MyUser e1=new MyUser();
    	
        try {
            PATH = new java.io.File(".").getCanonicalPath()+"/src/hotel/moduls/gestioPersones/gstTreballadors/gstTrebFixe/model/fitxers/trebFixes.json";

            		ReposUsers.arrayUsuaris.clear();
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	JsonArray lista = raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, MyUser.class);
	            		ReposUsers.arrayUsuaris.add(e1);
	            	}
        } catch (Exception e) {

        }
        return ReposUsers.arrayUsuaris;
    }
    /*
    public static ArrayList<WorkerT> obrirJsonOcultWT(){//Abre json de empleados fijos de forma silenciosa
    	String PATH = null;
    	WorkerT e1=new WorkerT();
    	
        try {
            PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerT/model/Folders/trebT.json";

	                ArrayListWT.wT.clear();
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	JsonArray lista = raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, WorkerT.class);
	            		ArrayListWT.wT.add(e1);
	            	}
        } catch (Exception e) {

        }
        return ArrayListWT.wT;
    }
    
    public static ArrayList<WorkerH> obrirJsonOcultWH(){//Abre json de empleados fijos de forma silenciosa
    	String PATH = null;
    	WorkerH e1=new WorkerH();
    	
        try {
            PATH = new java.io.File(".").getCanonicalPath()+"/src/application/modules/manageWorkers/manageWorkerH/model/Folders/trebH.json";

	                ArrayListWH.wH.clear();
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	JsonArray lista = raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, WorkerH.class);
	            		ArrayListWH.wH.add(e1);
	            	}
        } catch (Exception e) {

        }
        return ArrayListWH.wH;
    }
    */
}
