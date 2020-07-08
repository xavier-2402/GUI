package Modelo;

import java.util.ArrayList;

public class Ciudad {

    private String nombre_ciudad;
    private int codigo;
    public static ArrayList<Ciudad> listaciudades = new ArrayList();

    public Ciudad(int codigo, String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
        this.codigo = codigo;
    }

    public Ciudad() {
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String toString(){
        return codigo+nombre_ciudad;
    }

  
    public void CargarCiudades() {
        Ciudad ciudad1 = new Ciudad(1, "Quito");
        Ciudad ciudad2 = new Ciudad(2, "Cuenca");
        Ciudad ciudad3 = new Ciudad(3, "Guayaquil");
        Ciudad ciudad4 = new Ciudad(4, "Ambato");
        listaciudades.add(ciudad1);
        listaciudades.add(ciudad2);
        listaciudades.add(ciudad3);
        listaciudades.add(ciudad4);

    }

}
