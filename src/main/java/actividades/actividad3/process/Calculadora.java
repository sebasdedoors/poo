package actividades.actividad3.process;

import actividades.actividad3.productos.Productos;

import actividades.actividad3.process.StockManager;

import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);

    public double calcularPrecio(Productos producto, double utilidad){
        System.out.println("Podrías escribir el porcentage de utilidad que deseas: ");
        utilidad = scanner.nextDouble();
        Double costo = producto.getCosto();
        double sin_imp = costo * utilidad / 100;
        System.out.println("El precios sin impusto es: " + sin_imp);
        double imp = producto.getImpuesto();
        double con_imp = utilidad + (utilidad * imp / 100);
        System.out.println("El costo con impuestos es: " + con_imp);
        return con_imp; 
    }
}
