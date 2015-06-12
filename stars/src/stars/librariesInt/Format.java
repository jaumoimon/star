package stars.librariesInt;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Format {

	public static String format1d(double number) {
		DecimalFormat format1 = new DecimalFormat(".#");
		return format1.format(number);
	}

	public static String format2d(double number) {
		DecimalFormat format1 = new DecimalFormat(".##");
		return format1.format(number);
	}

	public static String format3d(double number) {
		DecimalFormat format1 = new DecimalFormat(".###");
		return format1.format(number);
	}

	public static String FormatDollar(double moneda) {
		NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.US);// Dolar
		return coin.format(moneda);
	}

	public static String FormatLibra(double moneda) {
		NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.UK);// Libras
		return coin.format(moneda);
	}

	public static String FormatEuro(double moneda) {
		NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.FRANCE);// Euro
		return coin.format(moneda);
	}

}
