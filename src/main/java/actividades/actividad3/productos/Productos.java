package actividades.actividad3.productos;

import java.util.Scanner;

public class Productos {
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;

    public String toString(){
        return "Producto{" + 
        "Descripción: " + descripcion + 
        "Codigo: " + codigo + 
        "Tipo: " + tipo + 
        "Costo: " + costo +
        "Impuesto: " + impuesto + "}";
    }

    public Productos(String descripcion, String codigo, String tipo, Double costo, Double impuesto){
        this.descripcion = getDescripcion();
        this.codigo = codigo;
        this.tipo = tipo;
        this.costo = costo;
        this.impuesto = impuesto;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(){

    }


}

