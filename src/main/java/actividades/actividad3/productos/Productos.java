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
        System.out.println("Por favor, escriba la descripción del producto:");
        descripcion = scanner.nextLine();
        this.descripcion = descripcion;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(){
        System.out.println("Por favor, escriba el codigo del producto:");
        codigo = scanner.nextLine();
        this.codigo = codigo;
        
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(){
        System.out.println("Por favor, escriba el tipo del producto:");
        tipo = scanner.nextLine();
        this.tipo = tipo;
    }


}

