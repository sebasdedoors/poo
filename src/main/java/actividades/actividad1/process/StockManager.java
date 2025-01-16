package actividades.actividad1.process;

import actividades.actividad1.models.Car;

import java.util.ArrayList;

public class StockManager {
    ArrayList<Car> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }
    public void addCar(String modelo, String marca, String color, int numeroPuertas){
        Car car = new Car(modelo, marca, color, numeroPuertas);
        stock.add(car);

    }
    public void printStock(){
        System.out.print("El catalogo actual es: ");
        System.out.println(stock);
    }

}
