package actividades.actividad3.process;

import actividades.actividad3.productos.Productos;

public class Calculadora {
    /*Este metodo se encarga de calcular el precio recomendado sumando el porcentaje de utilidad que el usuario haya indicado. */
    public static double calcularPrecio(double price, double profitMargin, double taxRate){
        if(price < 0 || profitMargin < 0 || taxRate < 0){
            throw new IllegalArgumentException("Ingrese número spositivos por favor.");
        }
        double priceWithProfit = price + (price * (profitMargin / 100));
        double tax = priceWithProfit * (taxRate / 100);
        double finalPrice = priceWithProfit + tax;
        return finalPrice;
    }

    public static double calcularPrecioTotal(Productos productos){
        if(productos == null){
            throw new IllegalArgumentException("Debe de llenar el espacio.");
        }else{
            return productos.getCosto() + productos.getImpuesto();
        }
    }
    /*Este metodo se encarga de comparar dos productos y le muestra al usuario el más costoso. */
    public static String compararProductos(Productos producto1, Productos producto2){
        if(producto1 == null || producto2 == null){
            throw new IllegalArgumentException("Ambos productos deben de existir o estar registrados.");
        }else{
            double precio1 = calcularPrecioTotal(producto1);
            double precio2 = calcularPrecioTotal(producto2);
            if(precio1 > precio2){
                return "El prdoucto " + producto1 + " es más caro."; 
            }else if(precio1 < precio2){
                return "El producto " + producto2 + " es más caro.";
            }else{
                return "El precio de ambos es igual.";
            }
        }
    }
}
