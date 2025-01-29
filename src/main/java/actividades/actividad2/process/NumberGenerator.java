package actividades.actividad2.process;

import java.util.ArrayList;

public class NumberGenerator { /*Genera los números pares del 1 al 100 y los guarda en una lista para después mostrarla. */
    public static void generadorNumeros(String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int numero = 0; numero <= 100; numero += 2){
            lista.add(numero);
        }
        System.out.print(lista);
    }
}


