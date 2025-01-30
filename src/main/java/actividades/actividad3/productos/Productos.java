package actividades.actividad3.productos;

import java.util.Scanner;

public class Productos {
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;
    Scanner scanner = new Scanner(System.in);

    public String toString(){
        return "Producto{" + 
        "Descripción: " + descripcion + 
        "Codigo: " + codigo + 
        "Tipo: " + tipo + 
        "Costo: " + costo +
        "Impuesto: " + impuesto + "}";
    }

    public Productos(String descripcion, String codigo, String tipo, Double costo, Double impuesto){
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.tipo = tipo;
        this.costo = costo;
        this.impuesto = impuesto;

    }

    public String getDescripcion(){return descripcion;}

    public void setDescripcion(String descripcion){this.descripcion = descripcion;}

    public String getCodigo(){return codigo;}

    public void setCodigo(String codigo){this.codigo = codigo;}

    public String getTipo(){return tipo;}

    public void setTipo(String tipo){this.tipo = tipo;}

    public Double getCosto(){return costo;}

    public void setCosto(Double costo){this.costo = costo;}

    public Double getImpuesto(){return impuesto;}

    public void setImpuesto(Double impuesto){this.impuesto = impuesto;}
}

