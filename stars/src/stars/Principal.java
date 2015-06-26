package stars;

import java.util.ArrayList;
import stars.classes.Configuration;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.controller.ControllerStart;
import stars.modules.manageStart.model.classes.ReposUsers;
import stars.modules.manageStart.view.WndStart;
//import stars.modules.manageStart.classes.User;

public class Principal {
	public static Configuration conf = null;
        public static String singletonFinestra = "";
        public static boolean institut = false  ;
	
	public static void main(String[] args) {
            
            ReposUsers.arrayUsuaris = new ArrayList<MyUser>();
		
		conf = new Configuration();
                //ClientesBLLBD b = new ClientesBLLBD();
                //b.listAllClientesBLL();
                
                                
                
                //previsió
                new ControllerStart(new WndStart(), 0).iniciar(0);

	}

}
