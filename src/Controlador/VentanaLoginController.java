package Controlador;

import Modelo.Login;
import Vista.VentanaLogin;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLoginController implements ActionListener {

    private VentanaLogin login;

    public VentanaLoginController(VentanaLogin login) {
        this.login = login;
        this.login.setVisible(true);
        this.login.setResizable(true);
        this.login.setLocationRelativeTo(null);
        this.login.getBtn_ingresar().addActionListener(this);
    }

    public VentanaLogin getLogin() {
        return login;
    }

    public void setLogin(VentanaLogin login) {
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.login.getBtn_ingresar()) {
            Login clogin = new Login();
            if (clogin.ingresar(login, clogin) == true) {
                VentanaMenu menu = new VentanaMenu();
                VentanaMenuController controladormenu = new VentanaMenuController(menu);
                this.login.dispose();
            }

        }

    }

}
