package actividades.actividad1.models;

public class Car {
    private String modelo;
    private String marca;
    private String color;
    private int numeroPuertas;


    public void setNumeroPuertas(int numeroPuertas) {
        if(numeroPuertas < 2 || numeroPuertas > 5){
            throw new IllegalArgumentException("El número de puertas debe estar entre 2 y 5");
        }
        this.numeroPuertas = numeroPuertas;
}
}
