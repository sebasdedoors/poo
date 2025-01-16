package actividades.actividad1.models;

public class Car {
    private String modelo;
    private String marca;
    private String color;
    private int numeroPuertas;


    public String toString(){
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                '}';
            }
    
    public Car(String modelo, String marca, String color, int numeroPuertas){
        this.modelo = modelo;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
    }

    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    


    public void setNumeroPuertas(int numeroPuertas) {
        if(numeroPuertas < 2 || numeroPuertas > 5){
            throw new IllegalArgumentException("El número de puertas debe estar entre 2 y 5");
        }
        this.numeroPuertas = numeroPuertas;
    }

    public String getModelo(){return modelo;}
    public void setModelo(String modelo){this.modelo = modelo;}

    public String getMarca(){return marca;}
    public void setMarca(String marca){this.marca = marca;}

    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    


    

}
