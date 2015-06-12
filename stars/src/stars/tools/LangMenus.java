package stars.tools;

import stars.Principal;

public class LangMenus {
	
	public static String titol (char tipus){
		int idioma = Principal.conf.getIdioma();
		String cadena = "";
		String [] informacio = {"Informacio", "Informacion", "Information"};
		String [] insertar = {"Introduccio dades", "Introducir datos", "Insert"};
		String [] eixir = {"Eixir", "Salir", "Exit"};
		
		if (tipus == 'A') { //informacio
			switch (idioma){
			case 0:
				cadena = informacio [0];
				break;
			case 1:
				cadena = informacio [1];
				break;
			case 2:
				cadena = informacio [2];
				break;
			default:
				cadena = informacio [0];
				break;
			}
		} else if (tipus == 'B') { //av�s
			switch (idioma){
			case 0:
				cadena = insertar [0];
				break;
			case 1:
				cadena = insertar [1];
				break;
			case 2:
				cadena = insertar [2];
				break;
			default:
				cadena = insertar [0];
				break;
			}
		} else if (tipus == 'E') { //Eixir
			switch (idioma){
			case 0:
				cadena = eixir [0];
				break;
			case 1:
				cadena = eixir [1];
				break;
			case 2:
				cadena = eixir [2];
				break;
			default:
				cadena = eixir [0];
				break;
			}
		}else {
			cadena = "";
		}
		return cadena;
	}
	
	public static String missatge (char tipus){
		int idioma = Principal.conf.getIdioma();
		String cadena = "";
		String [] triar = {"Sellecciona opcio", "Seleccione opcion", "Select option"};
		String [] eixir = {"Vol eixir?", "¿Quiere salir?", "Do you want exit?"};
		
		if (tipus == 'A') { //informacio
			switch (idioma){
			case 0:
				cadena = triar [0];
				break;
			case 1:
				cadena = triar [1];
				break;
			case 2:
				cadena = triar [2];
				break;
			default:
				cadena = triar [0];
				break;
			}
		} else if (tipus == 'E') { //Eixir
			switch (idioma){
			case 0:
				cadena = eixir [0];
				break;
			case 1:
				cadena = eixir [1];
				break;
			case 2:
				cadena = eixir [2];
				break;
			default:
				cadena = eixir [0];
				break;
			}
		} else if (tipus == 'F') { //Eixir
			switch (idioma){
			case 0:
				cadena = eixir [0];
				break;
			case 1:
				cadena = eixir [1];
				break;
			case 2:
				cadena = eixir [2];
				break;
			default:
				cadena = eixir [0];
				break;
			}
		
		}else {
			cadena = "";
		}
		return cadena;
	}
	
	public static String [] secundari (){
		int idioma = Principal.conf.getIdioma();
		String [] opcions = new String [12];
		
		if (idioma == 0){
			opcions [0] = "Alta";
			opcions [1] = "Canviar dades";
			opcions [2] = "Imprimir";
			opcions [3] = "Buscar";
			opcions [4] = "Eliminar";
			opcions [5] = "Ordenar";
			opcions [6] = "MaxMin";
			opcions [7] = "Obrir";
			opcions [8] = "Guardar";
			opcions [9] = "Calcul mitja sou";
			opcions [10] = "Tornar a pral";
			opcions [11] = "EixirApp";
		}else if (idioma == 1){
			opcions [0] = "Alta";
			opcions [1] = "Cambiar datos";
			opcions [2] = "Imprimir";
			opcions [3] = "Buscar";
			opcions [4] = "Eliminar";
			opcions [5] = "Ordenar";
			opcions [6] = "MaxMin";
			opcions [7] = "Abrir";
			opcions [8] = "Guardar";
			opcions [9] = "Calculo sueldo medio";
			opcions [10] = "Volver a pral";
			opcions [11] = "SalirApp";
		}

				return opcions;
	}
	
	public static StringBuffer [] lookAnFeel (){
		int idioma = Principal.conf.getIdioma();
		StringBuffer [] text = null;
		
		if (idioma == 0) {
			
		}
		
		return text;
	}
	
	public static String [] menuMain (){
		int idioma = Principal.conf.getIdioma();
		String [] opcions = new String [8];
		
		if (idioma == 0){
			opcions [0] = "Crear";
			opcions [1] = "Canviar dades";
			opcions [2] = "Imprimir";
			opcions [3] = "Buscar";
			opcions [4] = "Eliminar";
			opcions [5] = "Ordenar";
			opcions [6] = "Tornar pral";
			opcions [7] = "Eixir app";
		}else if (idioma == 1){
			opcions [0] = "Crear";
			opcions [1] = "Cambiar datos";
			opcions [2] = "Imprimir";
			opcions [3] = "Buscar";
			opcions [4] = "Eliminar";
			opcions [5] = "Ordenar";
			opcions [6] = "Volver pral";
			opcions [7] = "Salir app";
		}else if (idioma == 2){
			opcions [0] = "New";
			opcions [1] = "Change";
			opcions [2] = "Print";
			opcions [3] = "Back main";
			opcions [4] = "Exit app";
		}
				return opcions;
	}

}
