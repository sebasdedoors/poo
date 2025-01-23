package actividades.actividad2.ui;

import actividades.actividad2.process.NameValidator;

import actividades.actividad2.process.NumberGenerator;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println("\n**********************************");
        System.out.println("| Menú                           |");
        System.out.println("| 1. Validador de nombres.       |");
        System.out.println("| 2. Generador de números pares. |");
        System.out.println("| 3. Salir.                      |");
        System.out.println("**********************************");
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
                case 2:
                    System.out.println("Los números pares del 0 al 100 son:  ");
                    NumberGenerator.generadorNumeros(new String[0]);
                    break;

                default:
                    System.out.println("Opción no válida, intentalo de nuevo ;)");
                    
            }
            showMenu();
            opcion = scanner.nextInt(); scanner.nextLine();
        }
    }
    
}
