package Main;

import Controlador.VentanaLoginController;
import Vista.VentanaLogin;

/**
 *
 * @author Xavier Yanza
 */
public class Main {
    
    public static void main(String[]args){
        
        VentanaLogin login = new VentanaLogin();
        VentanaLoginController controladorlogin = new VentanaLoginController(login);
        
    }
}
