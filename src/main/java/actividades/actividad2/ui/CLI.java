package actividades.actividad2.ui;

import actividades.actividad2.process.NameValidator;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println("Menú");
        System.out.println("1. Validador de nombres.");
    }

    public static void runApp(){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();scanner.nextLine();
        while(opcion != 3){
            switch (opcion){
                case 1:
                    System.out.println("Introduce un nombre: ");
                    String name = scanner.nextLine();
                    if(NameValidator.validateName(name)){
                        System.out.println("El nombre existe en la BD");
                    }else {
                        System.out.println("El nombre no existe en la BD");
                    }
                    break;
                default:
            }
            showMenu();
            opcion = scanner.nextInt(); scanner.nextLine();
        }
    }
    
}
