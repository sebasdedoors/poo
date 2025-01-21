package actividades.actividad2;

import actividades.actividad2.ui.CLI;

public class Starter {
    public static void main(String[] args){
        //CLI.runApp();
        String a = "test";
        String b = "test";
        String b2 = new String("test"); /*El operador "new" se encarga de crear un nuevo objeto en la memoria */
        String c = "te";
        c += "st";
        String d = "TEST";
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("d " + d);

        System.out.println("a == b: " + (a == b)); /*"==" revisa que su valor este igual dentro de la memoria; "equals" compara el valor de la literal. */
        System.out.println("a == c: " + (a == c));
        System.out.println("a equals c: " + (a.equals(c)));
        System.out.println("a equals d: " + (a.equals(d)));
        System.out.println("a equalsIgnoreCase d: " + (a.equalsIgnoreCase(d)));
    }

}