package stars.tools;

import javax.swing.JOptionPane;

public class Menus {

	public static int botonsSiNo (String missatge, String[] opcions) {
		int seleccio = 0;
		seleccio = JOptionPane.showOptionDialog(null, missatge, "Select", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcions, opcions[0]);
		return seleccio;

	}

	public static String combobox(String missatge, String[] opcions, String noEixir) {
		String cadena = "";
		boolean correcte = false;

		Object seleccio = JOptionPane.showInputDialog(null, missatge, "Select", JOptionPane.QUESTION_MESSAGE, null, opcions, opcions[0]);
		do {
			if (seleccio == null) { // null.toString() es igual que fer una
									// divisio per 0
				cadena = null;
				JOptionPane.showMessageDialog(null, noEixir, "Info", JOptionPane.INFORMATION_MESSAGE);
				correcte = false;
			} else {
				cadena = seleccio.toString();
				correcte = true;
			}
		} while (correcte == false);
		return cadena;
	}

	public static int botons(String missatge, String [] opcions) {
		int seleccio = 0;
		seleccio = JOptionPane.showOptionDialog(null, missatge, LangMenus.titol('E'), 0, JOptionPane.QUESTION_MESSAGE, null,
				opcions, opcions[0]);
		return seleccio;
	}

	public static int idioma() {
		int idioma =0;
		String[] idiomes = { "VALENCI�", "CASTELLANO"};

		idioma = JOptionPane.showOptionDialog(null,
				"Sel�leccione el seu idioma\nSeleccione su idioma.\nSelect your language."," ", 0, JOptionPane.QUESTION_MESSAGE, null, idiomes, idiomes[0]);
		return idioma;
	}

	public static int eixir (String [] opcions) {
		int eixir = 0;
		eixir = JOptionPane.showOptionDialog(null,LangMenus.missatge('E'), LangMenus.titol('E'), 0, JOptionPane.QUESTION_MESSAGE, null,
				opcions, opcions[0]);
		return eixir;
	}
	
	public static int secundari (){
		int seleccio = 0;
		String [] opcions = LangMenus.secundari();
		seleccio = JOptionPane.showOptionDialog(null,LangMenus.missatge('A'), LangMenus.titol('E'), 0, JOptionPane.QUESTION_MESSAGE, null,
				opcions, opcions[0]);
		return seleccio;
	}
	
	public static int secundariVectors (){
		int seleccio = 0;
		
		String [] opcions = LangMenus.secundari();
		seleccio = JOptionPane.showOptionDialog(null,LangMenus.missatge('A'), LangMenus.titol('E'), 0, JOptionPane.QUESTION_MESSAGE, null,
				opcions, opcions[0]);
		return seleccio;
	}
		
	public static int btnConfiguracio() {
		int seleccio = 0;
		String [] opcions = {"moneda","decimals","formatData", "idioma","apariencia","format del fitxer","imprimir", "tornar a menú principal",};
		seleccio = JOptionPane.showOptionDialog(null, "Tria l'element ha canviar la configuració", "Configuracio", 0, JOptionPane.QUESTION_MESSAGE, null,
				opcions, opcions[0]);
		return seleccio;
	}
	
	public static String cmbMoneda (){
		String cadena = "";
		boolean correcte = false;
		String [] opcions = {"EUR", "USD", "GBP", "CHF"};
		Object seleccio = JOptionPane.showInputDialog(null, "Tria la moneda", "Moneda", JOptionPane.QUESTION_MESSAGE, null, opcions, opcions[0]);
		do {
			if (seleccio == null) { 
				cadena = null;
				JOptionPane.showMessageDialog(null, "No pots Eixir ara", "Info", JOptionPane.INFORMATION_MESSAGE);
				correcte = false;
			} else {
				cadena = seleccio.toString();
				correcte = true;
			}
		} while (correcte == false);
		return cadena;
	}
	
	public static int cmbDecimals (){
		int decimals = 0;
		String cadena = "";
		boolean correcte = false;
		String [] opcions = {"0", "1", "2", "3"};
		Object seleccio = JOptionPane.showInputDialog(null, "Tria el format de la data", "Decimals", JOptionPane.QUESTION_MESSAGE, null, opcions, opcions[0]);
		do {
			if (seleccio == null) { 
				cadena = null;
				JOptionPane.showMessageDialog(null, "No pots Eixir ara", "Info", JOptionPane.INFORMATION_MESSAGE);
				correcte = false;
			} else {
				cadena = seleccio.toString();
				decimals = Integer.parseInt(cadena);
				correcte = true;
			}
		} while (correcte == false);
		return decimals;
	}
		
	public static String cmbFormatData (){
		String cadena = "";
		boolean correcte = false;
		String [] opcions = {"dd/mm/aaaa", "mm/dd/aaaa", "aaaa/mm/dd", "aaaa-mm-dd"};
		Object seleccio = JOptionPane.showInputDialog(null, "Tria el format de la data", "Format Data", JOptionPane.QUESTION_MESSAGE, null, opcions, opcions[0]);
		do {
			if (seleccio == null) {
				cadena = null;
				JOptionPane.showMessageDialog(null, "No pots Eixir ara", "Info", JOptionPane.INFORMATION_MESSAGE);
				correcte = false;
			} else {
				cadena = seleccio.toString();
				correcte = true;
			}
		} while (correcte == false);
		return cadena;
	}
	
	public static int btnsMenuPrincipal () {
		int seleccio = 0;
		String [] opcions = {"Fixos", "Temporals", "Hores", "Configuracio","Eixir"};
		
		seleccio = JOptionPane.showOptionDialog(null, "", LangMenus.titol('E'), 0, JOptionPane.QUESTION_MESSAGE, null,
				opcions, opcions[0]);
		return seleccio;
	}
        
        public static void informacio(String missatge, String titol) {
        JOptionPane.showMessageDialog(null, missatge, titol, // t�tol
                JOptionPane.INFORMATION_MESSAGE);
    }

}
