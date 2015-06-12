package stars.librariesInt;

public class Validate {
	
	private static final String model_nom = "^[a-zA-Z\\s]*$";
	private static final String model_nie = "^([X-Z]{1})(\\d{7})[A-Z]{1}$";
	private static final String model_dni = "^([0-9]{8})[A-Z]{1}$";
	private static final String model_cif = "([A-Z]{1})([-]?)([0-9]{8})";
	private static final String model_cp = "^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
	private static final String model_mail = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String model_telfEstatal = "^[0-9]{9}$";
	private static final String model_telfInternacional = "";
	private static final String model_password = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
	private static final String model_data="(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/]((175[7-9])|(17[6-9][0-9])|(1[8-9][0-9][0-9])|([2-9][0-9][0-9][0-9]))";
	
	public static boolean validate_nom(String nom) {
		return nom.matches(model_nom);
	}

	public static boolean validate_nie(String nie) {
		return nie.matches(model_nie);
	}

	public static boolean validate_dni(String dni) {
		return dni.matches(model_dni);
	}

	public static boolean validate_cif (String cif){
		return cif.matches(model_cif);
	}
	
	public static boolean validate_cp (String cp){
		return cp.matches(model_cp);
	}
	
	public static boolean validate_email (String mail){
		return mail.matches(model_mail);
	}
	
	public static boolean validate_telfEstatal (String telf){
		return telf.matches(model_telfEstatal);
	}
	
	public static boolean validate_telfInternacional (String telf){
		return telf.matches(model_telfInternacional);
	}

	public static boolean validate_password (String pass){
		return pass.matches(model_password);
	}
	
	public static boolean validate_data (String date){
		return date.matches(model_data);
	}

}
