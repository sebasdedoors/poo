package actividades.actividad1.ui;

import actividades.actividad1.process.StockManager;

import java.util.Scanner;

public class CLI {
    
    /***
     * Inicia la aplicación
     */

public static void runApp() {
    Scanner scanner = new Scanner(System.in);
    StockManager stockManager = new StockManager();
    showMenu();
    int option = scanner.nextInt(); scanner.nextLine();

    /***
     * 1. Agregar carro al catalogo
     * Pedirá al usuario el número de puertas, el color, el modelo y la marca del carro
     * El modelo refiere al año del carro
     * La marca refiere al fabricante del carro
     */
    while (option!=3){
        switch(option){
            case 1:
            System.out.println("Introduce el número de puertas");
            int numeroPuertas = scanner.nextInt(); scanner.nextLine();
            System.out.println("Introduce el color");
            String color = scanner.nextLine();
            System.out.println("Introduce el modelo");
            String modelo = scanner.nextLine();
            System.out.println("Introduce la marca");
            String marca = scanner.nextLine();
            stockManager.addCar(modelo, marca, color, numeroPuertas);
                break;
            case 2:
                stockManager.getStock();
                System.out.print("El catalogo actual es: ");
                System.out.println(stockManager.getStock());
                break;
            default:
            System.out.println("Opción no valida");
        }
        showMenu();
        option = scanner.nextInt();
    }

}
/***
 * Muestra el menú de opciones
 */
public static void showMenu(){
    System.out.println("""

   Menu
    1. Agregar carro al catalogo
    2. Mostrar catologo
    3. Salir
    """);
}
}

