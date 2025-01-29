package actividades.actividad3.process;

import actividades.actividad3.productos.Productos;

import java.util.ArrayList;

import java.util.List;

public class StockManager {
    ArrayList<Productos> stock;

    public  void muestraProducto(){
        this.stock = new ArrayList<>();
    }

    public void addProducto(String descripcion, String codigo, String tipo, Double  costo, Double impuesto){
        Productos producto = new Productos(descripcion, codigo, tipo, costo, impuesto);
        stock.add(producto);
    }

    public List<Productos> getStock(){
        return stock;
    }


}
