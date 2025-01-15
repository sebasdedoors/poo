package actividades.actividad1.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println("Bienvenido a la aplicación 1");
        System.out.println("1.Crear carro");
        System.out.println("2. Mostrar carros");
    }

public static void launch() {
    showMenu();
    Scanner scanner = new Scanner(System.in);
    int option = scanner.nextInt();
    while (option != 3){
        switch (option) {
            case 1:
                System.out.println("Crear carro");
                break;
            case 2:
                System.out.println("Mostrar carros");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        /**
         *  logica de creación de objeto carro
         */
        showMenu();
        option = scanner.nextInt(); 
    }
}
}