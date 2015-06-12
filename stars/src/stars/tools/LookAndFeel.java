package stars.tools;

import stars.Principal;
import javax.swing.UIManager;

public class LookAndFeel {

	public static void LookFeel(){
		
		if (Principal.conf.getLookAndFeel() == 'A'){
			try{
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				
			}catch(Exception e){
				System.out.println("No se pudo establecer el Look&Feel");
		}
	}
		else if(Principal.conf.getLookAndFeel() == 'B'){
			try{
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){
			System.out.println("No se pudo establecer el Look&Feel");
		}
	}
		else if(Principal.conf.getLookAndFeel() == 'C'){
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				}catch(Exception e){
			System.out.println("No se pudo establecer el Look&Feel");
		}
	}

	}


}
