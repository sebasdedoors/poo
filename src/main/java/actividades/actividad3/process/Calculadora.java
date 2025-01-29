package actividades.actividad3.process;

import actividades.actividad3.productos.Productos;

import actividades.actividad3.process.StockManager;
public class Calculadora {
    public double Calculadora(double utilidad){
        double precioAntesImpuesto = costo + (costo * utilidad / 100);
        return precioAntesImpuesto + (precioAntesImpuesto* impuesto)
    }
}
