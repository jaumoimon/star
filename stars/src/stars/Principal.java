package stars;

import stars.classes.Configuration;
import stars.modules.manageStart.classes.MyUser;
import stars.modules.manageStart.controller.ControllerStart;
import stars.modules.manageStart.view.WndStart;
//import stars.modules.manageStart.classes.User;

public class Principal {
	public static Configuration conf = null;
	public static Object obj = null;
        //public static User usuari = null;
        public static MyUser usuari = new MyUser();
	
	public static void main(String[] args) {
		
		conf = new Configuration();
                //ClientesBLLBD b = new ClientesBLLBD();
                //b.listAllClientesBLL();
                usuari = new MyUser("defecte", "defecte", true, true, "user", "src/stars/images/users/default-avatar");
                
                
                new ControllerStart(new WndStart(), 0).iniciar(0);

	}

}