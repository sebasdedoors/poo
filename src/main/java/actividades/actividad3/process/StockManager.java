package actividades.actividad3.process;

import actividades.actividad3.productos.Productos;

import java.util.ArrayList;

import java.util.List;

public class StockManager {
    private List<Productos> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }
    /*Este metodo se encarga de asignar los datos en sus debidos lugares y guardar el producto creado por el usuario en una lista. */
    public void addProducto(String nombre,String descripcion, String codigo, String tipo, Double  costo, Double impuesto){
        Productos producto = new Productos(nombre,descripcion, codigo, tipo, costo, impuesto);
        stock.add(producto);
    }

    public List<Productos> getStock(){
        return stock;
    }
    
    public Productos muestraProductos(String nombre){
        for(Productos productos : stock){
            if(productos.getNombre().equalsIgnoreCase(nombre)){
                return productos;
            }
        }
        return null;
    }

}
