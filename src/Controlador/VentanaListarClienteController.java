package Controlador;

import Modelo.Cliente;
import Vista.VentanaListarCliente;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaListarClienteController implements ActionListener {

    private VentanaListarCliente listarcliente;

    public VentanaListarClienteController(VentanaListarCliente listarcliente) {
        this.listarcliente = listarcliente;
        this.listarcliente.setVisible(true);
        this.listarcliente.setResizable(true);
        this.listarcliente.setLocationRelativeTo(null);
        this.listarcliente.getBtn_menu().addActionListener(this);
        Cliente cliente = new Cliente();
        cliente.ListarDatos(listarcliente, cliente);
    }

    public VentanaListarCliente getListarcliente() {
        return listarcliente;
    }

    public void setListarcliente(VentanaListarCliente listarcliente) {
        this.listarcliente = listarcliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listarcliente.getBtn_menu()) {
            VentanaMenu menu = new VentanaMenu();
            VentanaMenuController controladormenu = new VentanaMenuController(menu);
            this.listarcliente.dispose();
        }
    }

}
