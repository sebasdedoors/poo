package actividades.actividad3.ui;

import actividades.actividad3.process.StockManager;

import java.util.Scanner;

public class CLI {
    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        showMenu();
        int opcion = scanner.nextInt(); scanner.nextLine();
        while(opcion != 3){
            switch(opcion){
                case 1:
                    stockManager.muestraProducto();
                    System.out.println("Aqui estan los productos creados: ");
                    System.out.println(stockManager.muestraProducto());
                    break;
                case 2:
                    System.out.println("Introduce la descripción del producto:");
                    String descripcion = scanner.nextLine();
                    System.out.println("Introduce el codigo del producto:");
                    String codigo = scanner.nextLine();
                    System.out.println("Introduce el tipo de producto:");
                    String tipo = scanner.nextLine();
                    System.out.println("Introduce el costo del producto:");
                    Double costo = scanner.nextDouble();
                    System.out.println("El  impuesto sera del 16.2% por defecto.");
                    Double impuesto = 16.2;
                    stockManager.addProducto(descripcion, codigo, tipo, costo, impuesto); 
                    break;
                case 3:
                    /**Opción 3 */
                    break;
                default:
                    System.out.println("La opción seleccionada no esta disponible.");
                
            }
            showMenu();
            opcion = scanner.nextInt();
        }
    }

    public static void showMenu(){
        System.out.println("""
                Holaaaaaaaa, aqui va el menu. 1. Mostrar (;V), 2. Crear (;v), 3. Calcular impuesto, 4. Comparar, 5. Salir :)
                """);
    }

   

}
