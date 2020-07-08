package Modelo;

import Vista.VentanaLogin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Login {

    private String usuario;
    private String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Login() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return usuario + password;
    }

    public boolean ingresar(VentanaLogin ventanalogin, Login login) {

        String linea = "";
        String valores[];
        String datos = " ";
        File archivo = new File("C:\\Users\\usuario\\Documents\\ejemplologin.csv");
        FileReader fr;

        try {
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {

                if (!(linea = br.readLine()).equals(" ")) {

                    valores = linea.split(",");
                    login.setUsuario(valores[0].toString());
                    login.setPassword(valores[1].toString());
                    if (login.getUsuario().equals(ventanalogin.getTxt_usuario().getText())) {
                        if (login.getPassword().equals(ventanalogin.getPs_password().getText())) {
                            JOptionPane.showMessageDialog(null, " Datos correctos");
                            ventanalogin.getTxt_usuario().setText("");
                            ventanalogin.getPs_password().setText("");

                            return true;

                        } else {
                            JOptionPane.showMessageDialog(null, " Datos erroneos");
                            ventanalogin.getTxt_usuario().setText("");
                            ventanalogin.getPs_password().setText("");
                            return false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, " Datos erroneos");
                        ventanalogin.getTxt_usuario().setText("");
                        ventanalogin.getPs_password().setText("");
                        return false;

                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
