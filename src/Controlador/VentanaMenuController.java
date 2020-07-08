package Controlador;

import Vista.VentanaCrearCliente;
import Vista.VentanaListarCliente;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenuController implements ActionListener {
    private VentanaMenu menu;

    public VentanaMenuController(VentanaMenu menu) {
        this.menu = menu;
        this.menu.setVisible(true);
        this.menu.setResizable(true);
        this.menu.setLocationRelativeTo(null);
        this.menu.getBtn_crear().addActionListener(this);
        this.menu.getBtn_listar().addActionListener(this);
    }

    public VentanaMenu getMenu() {
        return menu;
    }

    public void setMenu(VentanaMenu menu) {
        this.menu = menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.menu.getBtn_crear()){
            VentanaCrearCliente crear = new VentanaCrearCliente();
            VentanaCrearClienteController controadorcrear = new VentanaCrearClienteController(crear);
            this.menu.dispose();
            
        }
        if(e.getSource()==this.menu.getBtn_listar()){
             VentanaListarCliente listar = new VentanaListarCliente();
             VentanaListarClienteController controladorlistar = new VentanaListarClienteController(listar);
             this.menu.dispose();
            
            
        }
      }
    
    
    
}
