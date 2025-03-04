package actividades.actividad3.ui;

import actividades.actividad3.process.StockManager;
import actividades.actividad3.productos.Productos;
import actividades.actividad3.process.Calculadora;

import java.util.Scanner;
import java.util.List;

public class CLI {
    private Scanner scanner;
    private StockManager stockManager;

    public CLI(){
        scanner = new Scanner(System.in);
        stockManager = new StockManager();
    }

    public void runApp(){
        while(true){
            showMenu();
            String opcion = scanner.nextLine();
            switch(opcion) {
                case "1":
                    listaProductos();
                    break;
                case "2":
                    addProduct();
                    break;
                case "3":
                    compararProductos();
                    break;
                case "4":
                    calcularPrecio();
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida, intenta de nuevo.");
                    break;
            }
        }
    }

    private void listaProductos(){
        List<Productos> stock = stockManager.getStock();
        if(stock.isEmpty()){
            System.out.println("No hay productos");
        }else{
            for(Productos productos : stock){
                System.out.println("Nombre: " + productos.getNombre() + ", Descripción: " + productos.getDescripcion() + ", Código: " + productos.getCodigo() + ", Tipo: " + productos.getTipo() + ", Precio: " + productos.getCosto() + ", Impuesto: " + productos.getImpuesto());
            }
        }
    }

    private void showMenu(){
        System.out.println("\n**********************************");
        System.out.println("| Menú                           |");
        System.out.println("| 1. Mostrar productos.          |");
        System.out.println("| 2. Creación de producto.       |");
        System.out.println("| 3. Comparar precios.           |");
        System.out.println("| 4. Calcular precios.           |");
        System.out.println("| 5. Salir.                      |");
        System.out.println("**********************************");
    }


    private void addProduct(){
        try{
            System.out.println("Nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.println("Descirpción del producto: ");
            String descripcion = scanner.nextLine();
            System.out.println("Codigo (10 digitos): ");
            String codigo = scanner.nextLine();
            System.out.println("Tipo de producto: ");
            String tipo = scanner.nextLine();
            System.out.println("Costo: ");
            Double costo = scanner.nextDouble();

            stockManager.addProducto(nombre, descripcion, codigo, tipo, costo, costo);
            System.out.println("Producto agregado exitosamente.");
        }catch(Exception e){
            System.out.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    private void compararProductos(){
        try{
            System.out.println("Ingresa el nombre del primer producto:");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingresa el nombre del segundo producto:");
            String nombre2 = scanner.nextLine();

            Productos producto1 = stockManager.muestraProductos(nombre1);
            Productos producto2 = stockManager.muestraProductos(nombre2);

            if(producto1 == null || producto2 == null){
                System.out.println("Uno o ambos productos no fueron encontrados, verifique su escritura.");
                return;
            }

            String compararResultados = Calculadora.compararProductos(producto1, producto2);
            System.out.println(compararResultados);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void calcularPrecio(){
        try{
            System.out.println("Ingresa el precio del producto:");
            double precio = Double.parseDouble(scanner.nextLine());
            System.out.println("Ingresa el porcentaje de utilidad deseado:");
            double profitMargin = Double.parseDouble(scanner.nextLine());

            double finalprecio = Calculadora.calcularPrecio(precio, profitMargin, 16);
            System.out.println("El precio final recomendado es: " + finalprecio);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
