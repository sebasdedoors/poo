package actividades.actividad1.process;

import actividades.actividad1.models.Car;

import java.util.ArrayList;

import java.util.List;

public class StockManager {
    ArrayList<Car> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }
    /***
     * 
     * @param modelo Indica el año del carro
     * @param marca Indic el fabricante del carro
     * @param color Indica el color del carro
     * @param numeroPuertas Indica el número de puertas del carro
     */
    public void addCar(String modelo, String marca, String color, int numeroPuertas){
        Car car = new Car(modelo, marca, color, numeroPuertas);
        stock.add(car);

    }
    /***
     * 
     * @return Devuelve una lista con todo el catalogo en memoria.
     */
    public List<Car> getStock(){
        return stock;
    }

}
