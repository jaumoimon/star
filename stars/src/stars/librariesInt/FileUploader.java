/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stars.classes;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import stars.Principal;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.view.FrmPerfil;
import stars.modules.manageStart.view.WndStart;

/**
 *
 * @author pollotorrao
 */
/*public class FileUploader extends javax.swing.JFrame {
    
    public static String PATH_auto;
    public static String ruta_avatar="";
    
    public static void pintar_guardar_imag(){
        String PATH="";
        BufferedImage imagen;
        String extension="jpg";
        JFileChooser fileChooser = new JFileChooser();
        
	int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            PATH = fileChooser.getSelectedFile().getPath();
            try {
                //Pintamos la imagen en la ventana Informacion
                //Modificando la imagen
                ImageIcon icon = new ImageIcon(PATH);
                //Se extrae la imagen del icono
                Image img = icon.getImage();
                //Se modifica su tamaño
                Image newimg = img.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
                //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
                ImageIcon newIcon = new ImageIcon(newimg);
                         
                FrmPerfil.lblAvatar.setBackground(Color.red);
                FrmPerfil.lblAvatar.setIcon(newIcon);
                //Pintamos la imagen en la ventana Inicio
                ImageIcon icon2 = new ImageIcon(PATH);
                //Se extrae la imagen del icono
                Image img2 = icon2.getImage();
                //Se modifica su tamaño
                Image newimg2 = img2.getScaledInstance(35,35,java.awt.Image.SCALE_SMOOTH);
                //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
                ImageIcon newIcon2 = new ImageIcon(newimg2);
                
                WndStart.lblAvatar.setBackground(Color.red);
                WndStart.lblAvatar.setIcon(newIcon2);

                //guardamos la imagen
                imagen=ImageIO.read(fileChooser.getSelectedFile().toURL());
                extension=fileChooser.getSelectedFile().toURL().toString().substring(
                        fileChooser.getSelectedFile().toURL().toString().length()-3);
                String cad=getCadenaAleatoria(5);
                
                PATH_auto = new java.io.File("")+ "src/tpvpizzeria/Images/ImgAvatar/"+cad+"."+extension;
                //Guardamos la ruta de la imagen en la base de datos
                
                ClientesBLL.CambiaAvatar(PATH_auto);
                
                File f = new File(PATH_auto);
                ImageIO.write(imagen, extension, f);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error upload imagen","Error", JOptionPane.ERROR_MESSAGE);
            }
        }  
    }
    public static String getCadenaAleatoria(int longitud){
		String cadenaAleatoria = "";
		long milis = new java.util.GregorianCalendar().getTimeInMillis();
		Random r = new Random(milis);
		int i = 0;
		while ( i < longitud){
			char c = (char)r.nextInt(255);
			if ( (c >= '0' && c <='9') || (c >='A' && c <='Z') ){
				cadenaAleatoria += c;
				i ++;
			}
		}
		return cadenaAleatoria;
    }

    public static void leer_imagClientes(int i){
            try {
            //Obtenemos el cliente logeado extrayendo el DNI que el usuario tramita al inicio
            MyUser cli = Principal.usuari;
            
            if(i==0){
                //pintamos la imagen en el Jlabel
                ImageIcon icon = new ImageIcon(cli.getAvatar());
                //Se extrae la imagen del icono
                Image img = icon.getImage();
                //Se modifica su tamaño
                Image newimg = img.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
                //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
                ImageIcon newIcon = new ImageIcon(newimg);
                FrmPerfil.lblAvatar.setBackground(Color.red);
                FrmPerfil.lblAvatar.setIcon(newIcon);
                }
                
            if (i==1){
                ImageIcon icon2 = new ImageIcon(cli.getAvatar());
                //Se extrae la imagen del icono
                Image img2 = icon2.getImage();
                //Se modifica su tamaño
                Image newimg2 = img2.getScaledInstance(35,35,java.awt.Image.SCALE_SMOOTH);
                //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
                ImageIcon newIcon2 = new ImageIcon(newimg2);
               
                WndStart.lblAvatar.setBackground(Color.red);
                WndStart.lblAvatar.setIcon(newIcon2);
               }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error upload imagen","Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    
    
}
*/