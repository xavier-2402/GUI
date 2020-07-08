package Modelo;

import Vista.VentanaCrearCliente;
import Vista.VentanaListarCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String ciudad;
    private static ArrayList<Cliente> listaclientes = new ArrayList();

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String correo, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public static ArrayList<Cliente> getListaclientes() {
        return listaclientes;
    }

    public static void setListaclientes(ArrayList<Cliente> listaclientes) {
        Cliente.listaclientes = listaclientes;
    }

    public String toString() {
        return cedula + nombre + apellido + correo + ciudad;
    }

    public void CargarDatos(VentanaCrearCliente ventanacrear, Cliente cliente) {
        try {
            cliente.setCedula(ventanacrear.getTxt_cedula().getText());
            cliente.setNombre(ventanacrear.getTxt_nombre().getText());
            cliente.setApellido(ventanacrear.getTxt_apellido().getText());
            cliente.setCorreo(ventanacrear.getTxt_correo().getText());
            cliente.setCiudad(ventanacrear.getCb_ciudades().getSelectedItem().toString());
            listaclientes.add(cliente);
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS");
            ventanacrear.getTxt_cedula().setText("");
            ventanacrear.getTxt_nombre().setText("");
            ventanacrear.getTxt_apellido().setText("");
            ventanacrear.getTxt_correo().setText("");

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Existe un dato vacio");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }

    }

    public void ListarDatos(VentanaListarCliente ventanalistar, Cliente cliente) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] cabecera = new String[]{"Cedula", "Nombre", "Apellido", "Correo", "Ciudad"};
            modelo.setColumnIdentifiers(cabecera);
            Object fila[] = new Object[modelo.getColumnCount()];
            for (int i = 0; i < listaclientes.size(); i++) {
                fila[0] = listaclientes.get(i).getCedula();
                fila[1] = listaclientes.get(i).getNombre();
                fila[2] = listaclientes.get(i).getApellido();
                fila[3] = listaclientes.get(i).getCorreo();
                fila[4] = listaclientes.get(i).getCiudad();
                modelo.addRow(fila);

            }
            ventanalistar.getTb_lista().setModel(modelo);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Existe un dato vacio");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }

    }
}
