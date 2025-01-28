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
                    /**Opción 1 */
                    break;
                case 2:
                    /**Opción 2 */
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
                Holaaaaaaaa, aqui va el menu. :)
                """);
    }

   

}
