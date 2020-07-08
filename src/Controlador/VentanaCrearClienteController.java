package Controlador;

import Modelo.Ciudad;
import Modelo.Cliente;
import Vista.VentanaCrearCliente;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCrearClienteController implements ActionListener {

    private VentanaCrearCliente crearcliente;

    public VentanaCrearClienteController(VentanaCrearCliente crearcliente) {
        this.crearcliente = crearcliente;
        this.crearcliente.setVisible(true);
        this.crearcliente.setResizable(true);
        this.crearcliente.setLocationRelativeTo(null);
        this.crearcliente.getBtn_menu().addActionListener(this);
        this.crearcliente.getBtn_guardar().addActionListener(this);
        Ciudad ciudad = new Ciudad();
        ciudad.CargarCiudades();
      for(Ciudad ciudades :ciudad.listaciudades){
          this.crearcliente.getCb_ciudades().addItem(ciudades.getNombre_ciudad());
          
      }
      
    }

    public VentanaCrearCliente getCrearcliente() {
        return crearcliente;
    }

    public void setCrearcliente(VentanaCrearCliente crearcliente) {
        this.crearcliente = crearcliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.crearcliente.getBtn_menu()) {
            VentanaMenu menu = new VentanaMenu();
            VentanaMenuController controladormenu = new VentanaMenuController(menu);
            this.crearcliente.dispose();
        }
        if(e.getSource()==this.crearcliente.getBtn_guardar()){
            Cliente cliente = new Cliente();
            cliente.CargarDatos(crearcliente, cliente);
        }

    }

}
