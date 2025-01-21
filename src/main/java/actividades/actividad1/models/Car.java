package actividades.actividad1.models;

/***
 * La clase contiene los atributos de un carro.
 * El número de puerteas debe estar entre 2 y 5 y se encuentra en tipo "int".
 */

public class Car {
    private String modelo;
    private String marca;
    private String color;
    private int numeroPuertas;

    /***
     * Se encarga de mostrar los atributos del carro. 
     */

    public String toString(){
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                '}';
            }
        
        /***
         * Constructor de la clase Car
         * @param modelo
         * @param marca
         * @param color
         * @param numeroPuertas
         */
    
    public Car(String modelo, String marca, String color, int numeroPuertas){
        this.modelo = modelo;
        this.marca = marca;
        this.numeroPuertas = getNumeroPuertas();
        this.color = color;
        this.setNumeroPuertas(numeroPuertas);
    }

    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    
    /***
     * 
     * @param numeroPuertas Aqui se valida que el número de puertas sea mayor a 2 y menor a 5.
     * @throws IllegalArgumentException Si el número de puertas no está entre 2 y 5, se lanza una excepción.
     */

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
