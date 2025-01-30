package actividades.actividad3.process;

import actividades.actividad3.productos.Productos;

import java.util.ArrayList;

import java.util.List;

public class StockManager {
    private ArrayList<Productos> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }

    public void addProducto(String descripcion, String codigo, String tipo, Double  costo, Double impuesto){
        Productos producto = new Productos(descripcion, codigo, tipo, costo, impuesto);
        stock.add(producto);
    }

    public List<Productos> getStock(){
        return stock;
    }

    public String muestraProducto(){
        StringBuilder sb = new StringBuilder();
        for(Productos producto : stock){
            sb.append(producto.toString()).append("\n");
        }
        return sb.toString();
    }


}
