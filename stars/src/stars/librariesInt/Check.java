/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.librariesInt;

import javax.swing.JOptionPane;
import stars.classes.DataPropia;

/**
 *
 * @author Gestor
 */
public class Check {
    
    public static String insertNom (){
		String introNom = "";
		boolean control = false;
		do {
			introNom = Functions.demanarString_noEixir("Introdueix el nom");
			control = Validate.validate_nom(introNom);
			if (control == false)
				JOptionPane.showMessageDialog(null, "No has introduit correctament", "Info",
						JOptionPane.INFORMATION_MESSAGE);
		} while (control == false);
		return introNom;
	}
		
	public static String insertCognoms (){
		String introCognom = "";
		boolean control = false;
		do {
			introCognom = Functions.demanarString_noEixir("Introdueix el nom");
			control = Validate.validate_nom(introCognom);
			if (control == false)
				JOptionPane.showMessageDialog(null, "No has introduit correctament", "Info",
						JOptionPane.INFORMATION_MESSAGE);
		} while (control == false);
		return introCognom;
	}
		
	public static String insertDNI (){
		int numero = 0, resto = 0;
		char letra = ' ', control = ' ';
		String dni = "", aux ="", caracteres="TRWAGMYFPDXBNJZSQVHLCKET";
		boolean validar= false;
		do{
			dni = Functions.demanarString_noEixir("Introduce el DNI\nNumeros seguido de letra, sin puntos ni guiones.");
			validar = Validate.validate_dni(dni);
			if (validar == false)
				                        JOptionPane.showMessageDialog(null, "No ha introducido el dni correctamente", "Info",
						JOptionPane.INFORMATION_MESSAGE);

			aux ="";
			for(int i=0; i<8; i++){
				aux += dni.charAt(i);
			}	
			letra = dni.charAt(8);			
			numero = Integer.parseInt(aux);
			resto= numero % 23;
			control = caracteres.charAt(resto);
			if(control == letra){
				validar = true;
			}else{
				JOptionPane.showMessageDialog(null, "No ha introducido el dni correctamente", "Info",
						JOptionPane.INFORMATION_MESSAGE);
				validar = false;
			}
		}while (validar == false);
		
		return dni;
	}

	public static String insertNIE (){
		int numero = 0, resto = 0;
		char letra = ' ', control = ' ', letraincio = ' ';
		String nie = "", aux ="", caracteres="TRWAGMYFPDXBNJZSQVHLCKET";
		boolean validar= false;
		do{
			nie = Functions.demanarString_noEixir("Introduce el DNI\nNumeros seguido de letra, sin puntos ni guiones.");
			validar = Validate.validate_nie(nie);
			if (validar == false)
				JOptionPane.showMessageDialog(null, "No ha introducido el dni correctamente", "Info",
						JOptionPane.INFORMATION_MESSAGE);

			letraincio = nie.charAt(0);
			if(letraincio == 'X')
				numero = numero + 0;
			else if (letraincio == 'Y')
				numero = numero + 1;			
			else if (letraincio == 'Z')
				numero = numero + 2;
			
			aux ="";
			for(int i=1; i<8; i++){
				aux += nie.charAt(i);
			}	
			letra = nie.charAt(8);			
			numero = Integer.parseInt(aux);
			resto= numero % 23;
			control = caracteres.charAt(resto);
			if(control == letra){
				validar = true;
			}else{
				JOptionPane.showMessageDialog(null, "No ha introducido el dni correctamente", "Info",
						JOptionPane.INFORMATION_MESSAGE);
				validar = false;
			}
		}while (validar == false);
		
		return nie;
	}

	
	public static String insertCP() {
		String codigo = "";
		boolean validar = false;
		do {
			codigo = Functions.demanarString_noEixir("Introduce el Codigo Postal");
			validar = Validate.validate_cp(codigo);
			if (validar == false)
				JOptionPane.showMessageDialog(null, "No ha introducido el CP correctamente", "Info",
						JOptionPane.INFORMATION_MESSAGE);
		} while (validar == false);
		return codigo;
	}
	
	// DATES
	
	public static String checkStringDate() {
		String date = "";
		boolean check = false;
		
		do {
			date = Functions.demanarString_noEixir("Introduce la fecha dd/mm/aaaa");
			check = Validate.validate_data(date);
			if (check == false)
				JOptionPane.showMessageDialog(null, "No ha introducido la fecha correctamente", "Info",
						JOptionPane.INFORMATION_MESSAGE);
		} while (check == false);
		
		return date;
	}
		
	public static DataPropia insertMyDate () {
		String introdate = "";
		boolean check1 = false, check2= false;
		
		DataPropia correctMyDate = null;
		
		do{
			do{
				introdate = Functions.demanarString_noEixir("Introduce la fecha dd/mm/aaaa");
				check2 = Validate.validate_data(introdate);
				if (check2 == false)
					JOptionPane.showMessageDialog(null, "No ha introducido la fecha correctamente", "Info",
							JOptionPane.INFORMATION_MESSAGE);
				
			} while (check2 == false);
			
			correctMyDate = new DataPropia(introdate);
			check1 = correctMyDate.checkMyDate();		
			if (check2 == false)
				JOptionPane.showMessageDialog(null, "No ha introducido la fecha correctamente", "Info",
						JOptionPane.INFORMATION_MESSAGE);
			
		} while (check1 == false);
		
		return correctMyDate;
	}

    
}
