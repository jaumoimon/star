package stars.librariesInt;

import stars.classes.DataPropia;
import java.util.Random;
import javax.swing.JOptionPane;

public class Functions {

	//BLOC DE DEMANAR I VALIDAR

		public static int demanarInt_noEixir (String missatge, char languaje) {
			int numero = 0;
			String stnumero = "";
			boolean correcte = false;
			do {
				try {
					stnumero = JOptionPane.showInputDialog(null, missatge, "Intro", JOptionPane.QUESTION_MESSAGE);
					if (stnumero == null) { // l'usuari al fer click en cancelar o en tancar la finestra informa que no pot eixir
						JOptionPane.showMessageDialog(null, "En este moment no pots eixir. Sols pots eixir al menu.\n"
								+ "En este momento no puedes salir. Solo puedes salir des del menu.\n"
								+ "At this moment you cannot exit. You can exit in the menu." , "Info", JOptionPane.INFORMATION_MESSAGE);
					} else {
						numero = Integer.parseInt(stnumero);
						correcte = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit un int.\n"
							+ "No has introducido un int\n"
							+ "You don't insert an int." , "Error", JOptionPane.ERROR_MESSAGE);
					correcte = false;
				}
			} while (correcte == false);
			return numero;
		}
		
		public static int demanarIntNo0_noEixir (String missatge) {
			int numero = 0;
			String stnumero = "";
			boolean correcte = false;
			do {
				try {
					stnumero = JOptionPane.showInputDialog(null, missatge, "Intro", JOptionPane.QUESTION_MESSAGE);
					if (stnumero == null) { // l'usuari al fer click en cancelar o en tancar la finestra informa que no pot eixir
						JOptionPane.showMessageDialog(null, "En este moment no pots eixir. Sols pots eixir al menu.\n"
								+ "En este momento no puedes salir. Solo puedes salir des del menu.\n"
								+ "At this moment you cannot exit. You can exit in the menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
					} else {
						numero = Integer.parseInt(stnumero);
						if (numero == 0){
							JOptionPane.showMessageDialog(null, "El numero no pot ser 0.\n"
									+ "El numero no puede ser 0.\n"
									+ "The number cannot be 0.", "Info", JOptionPane.INFORMATION_MESSAGE);
							correcte = false;
						}else{
						correcte = true;
						}
						correcte = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,  "No has introduit un int.\n"
							+ "No has introducido un int\n"
							+ "You don't insert an int." , "Error", JOptionPane.ERROR_MESSAGE);
					correcte = false;
				}
			} while (correcte == false);
			return numero;
		}
		
		public static String demanarString_noEixir (String missatge) {
			String stcadena = "";
			boolean correcte = false;
			do {
				try {
					stcadena = JOptionPane.showInputDialog(null, missatge, "Intro", JOptionPane.QUESTION_MESSAGE);
					if (stcadena == null) { // l'usuari al fer click en cancelar o en tancar la finestra informa que no pot eixir
						JOptionPane.showMessageDialog(null, "En este moment no pots eixir. Sols pots eixir al menu.\n"
								+ "En este momento no puedes salir. Solo puedes salir des del menu.\n"
								+ "At this moment you cannot exit. You can exit in the menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
					} else {
						correcte = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,  "No has introduit una String.\n"
							+ "No has introducido una String\n"
							+ "You don't insert a String." , "Error", JOptionPane.ERROR_MESSAGE);
					correcte = false;
				}
			} while (correcte == false);
			return stcadena;
		}
		
		public static float demanarFloat_noEixir (String missatge) {
			float numero = 0.0f;
			String stnumero = "";
			boolean correcte = false;
			do {
				try {
					stnumero = JOptionPane.showInputDialog(null, missatge, "Intro", JOptionPane.QUESTION_MESSAGE);
					if (stnumero == null) { // l'usuari al fer click en cancelar o en tancar la finestra informa que no pot eixir
						JOptionPane.showMessageDialog(null, "En este moment no pots eixir. Sols pots eixir al men�.\n"
								+ "En este momento no puedes salir. Solo puedes salir des del menu.\n"
								+ "At this moment you cannot exit. You can exit in the menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
					} else {
						numero = Float.parseFloat(stnumero);
						correcte = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit un float.\n"
							+ "No has introducido un Float\n"
							+ "You don't insert a Float.", "Error", JOptionPane.ERROR_MESSAGE);
					correcte = false;
				}
			} while (correcte == false);
			return numero;
		}
		
		public static float demanarFloatNo0_noEixir (String missatge) {
			float numero = 0.0f;
			String stnumero = "";
			boolean correcte = false;
			do {
				try {
					stnumero = JOptionPane.showInputDialog(null, missatge, "Intro", JOptionPane.QUESTION_MESSAGE);
					if (stnumero == null) { // l'usuari al fer click en cancelar o en tancar la finestra informa que no pot eixir
						JOptionPane.showMessageDialog(null, "En este moment no pots eixir. Sols pots eixir al menu.\n"
								+ "En este momento no puedes salir. Solo puedes salir des del menu.\n"
								+ "At this moment you cannot exit. You can exit in the menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
					} else {
						numero = Float.parseFloat(stnumero);
						if (numero == 0.0f){
							JOptionPane.showMessageDialog(null, "El numero no pot ser 0.0 .\n"
									+ "El numero no puede ser 0.0 .\n"
									+ "The number cannot be 0.0 .", "Info", JOptionPane.INFORMATION_MESSAGE);
							correcte = false;
						}else{
						correcte = true;
						}
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit un float.\n"
							+ "No has introducido un Float\n"
							+ "You don't insert a Float.", "Error", JOptionPane.ERROR_MESSAGE);
					correcte = false;
				}
			} while (correcte == false);
			return numero;
		}	
		
		public static char demanarChar_noEixir (String missatge) {
			char lletra = 0;
			String stlletra = "";
			boolean correcte = false;
			do {
				try {
					stlletra = JOptionPane.showInputDialog(null, missatge, "Intro", JOptionPane.QUESTION_MESSAGE);
					if (stlletra == null) { // l'usuari al fer click en cancelar o en tancar la finestra informa que no pot eixir
						JOptionPane.showMessageDialog(null, "En este moment no pots eixir. Sols pots eixir al menu.\n"
								+ "En este momento no puedes salir. Solo puedes salir des del menu.\n"
								+ "At this moment you cannot exit. You can exit in the menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
					} else {
						lletra = stlletra.charAt(0);
						correcte = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introduit un char.\n"
							+ "No has introducido un char\n"
							+ "You don't insert a char.", "Error", JOptionPane.ERROR_MESSAGE);
					correcte = false;
				}
			} while (correcte == false);
			return lletra;
		}
		
		//BLOC DE MENUS I BOTONS

		public static int botons (String missatge, String [] opcions){
			int seleccio = 0;
			seleccio = JOptionPane.showOptionDialog(null, missatge, "Select", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcions, opcions[0]);
			return seleccio;
			
		}
		
		public static String combobox(String missatge, String[] opcions, String noEixir) {
			String cadena = "";
			boolean correcte = false;

			Object seleccio = JOptionPane.showInputDialog(null, missatge, "Select", JOptionPane.QUESTION_MESSAGE,
					null, // null per a icona per defecte
					opcions, opcions[0]);
			do {
				if (seleccio == null) { // null.toString() es igual que fer una divisio per 0
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
		
		public static int menubotons (String missatge, String[] opcions) {
			int seleccio = 0;
			seleccio = JOptionPane.showOptionDialog(null, missatge, "Select", 0, JOptionPane.QUESTION_MESSAGE, null,
					opcions, opcions[0]);
			return seleccio;
		}
		
		//BLOC D'OPERACIONS
		
		public static float calcularSuma (float numero1, float numero2){
			float ftresultat = 0.0f;
			ftresultat = numero1 + numero2;
			return ftresultat;
		}
		
		public static float calcularResta (float numero1, float numero2){
			float ftresultat = 0.0f;
			ftresultat = numero1 - numero2;
			return ftresultat;
		}
		
		public static float calcularMultiplicacio (float numero1, float numero2){
			float ftresultat = 0.0f;
			ftresultat = numero1 * numero2;
			return ftresultat;
		}
		
		public static float calcularDivisio (float numero1, float numero2no0){
			float ftresultat = 0.0f;
			ftresultat = numero1 / numero2no0;
			return ftresultat;
		}
			
		public static float operarSuma() {
			float ftnumero1 = 0.0f, ftnumero2 = 0.0f, ftresultat = 0.0f;
			ftnumero1 = Functions.demanarFloat_noEixir("Intro num 1");
			ftnumero2 = Functions.demanarFloat_noEixir("Intro num 2");
			ftresultat = ftnumero1 + ftnumero2;
			return ftresultat;
		}

		public static float operarResta() {
			float ftnumero1 = 0.0f, ftnumero2 = 0.0f, ftresultat = 0.0f;

			ftnumero1 = Functions.demanarFloat_noEixir("Intro num 1");
			ftnumero2 = Functions.demanarFloat_noEixir("Intro num 2");
			ftresultat = ftnumero1 - ftnumero2;

			return ftresultat;
		}

		public static float operarMultiplicar() {
			float ftnumero1 = 0.0f, ftnumero2 = 0.0f, ftresultat = 0.0f;

			ftnumero1 = Functions.demanarFloat_noEixir("Intro num 1");
			ftnumero2 = Functions.demanarFloat_noEixir("Intro num 2");
			ftresultat = ftnumero1 * ftnumero2;

			return ftresultat;
		}

		public static float operarDividir() {
			float ftnumero1 = 0.0f, ftnumero2 = 0.0f, ftresultat = 0.0f;

			ftnumero1 = Functions.demanarFloat_noEixir("Intro num 1");
			ftnumero2 = Functions.demanarFloatNo0_noEixir("Intro num 2. (!=0)");
			ftresultat = ftnumero1 / ftnumero2;

			return ftresultat;
		}
		
		public static float operarPotencia (){
			float ftnumero1 = 0.0f, ftnumero2 = 0.0f, ftresultat = 0.0f;
			double aux=0.0;
			
			ftnumero1 = Functions.demanarFloat_noEixir("Intro num 1");
			ftnumero2 = Functions.demanarFloat_noEixir("Intro num 2");
			if (ftnumero2 == 0){
				ftresultat = 1.0f;
			}else {
				
				aux = Math.pow(((double)ftnumero1), ((double)ftnumero2));
				ftresultat= ((float)aux);
			}

			return ftresultat;
		}
                
                public static StringBuffer cadeDNI (){
                    String cadenaAleatoria = "";
                                                    
                    long milis = new java.util.GregorianCalendar().getTimeInMillis();
                    Random r = new Random(milis);
                    
                                     
                    int i = 0;
                    while ( i < 7){
			char c = (char)r.nextInt(255);
			if ( (c >= '0' && c <='9')  ){
				cadenaAleatoria += c;
				i ++;
			}
                }
                    int num = intAleatori();
                    
                    cadenaAleatoria += num;
                    
                    return new StringBuffer(cadenaAleatoria);
                }
                
                
                
                public static String cadeAle01 (int longitud) {
                    String cadenaAleatoria = "";
                    long milis = new java.util.GregorianCalendar().getTimeInMillis();
                    Random r = new Random(milis);
                    int i = 0;
                    while ( i < longitud){
			char c = (char)r.nextInt(255);
			if ( (c >= 'A' && c <='Z') || (c >='a' && c <='z') ){
				cadenaAleatoria += c;
				i ++;
			}
                    }
		return cadenaAleatoria;
                }
                
                public static int intAleatori (){
		int intAleatori=0;
                    //String cadenaAleatoria = "";
		long milis = new java.util.GregorianCalendar().getTimeInMillis();
		Random r = new Random(milis);
		//int i = 0;
		
			char c = (char)r.nextInt(255);
			if ( (c >= '0' && c <='9')){
				intAleatori += c;
				//i ++;
			}
                                       
		return intAleatori;
                }
                
                public static DataPropia getFechaAleatoria() {
                //by Vicent Albert
                String cad;
                int d = 0, m = 0, y = 0, i = 0;
                Random r = new Random();
                while (i < 3) {
                    if (i == 0) {
                        d = r.nextInt(28);
                        if ((d > 0) && (d < 29)) {
                            i++;
                }
                }
                    if (i == 1) {
                m = r.nextInt(12);
                if ((m > 0) && (m < 13)) {
                    i++;
                }
            }
            if (i == 2) {
                y = r.nextInt(2015);
                if ((y > 1950) && (y < 2016)) {
                    i++;
                }
            }
        }
        cad = +d + "/" + m + "/" + y;
        DataPropia f = new DataPropia(cad, 2);
        return f;
    }
	
}
