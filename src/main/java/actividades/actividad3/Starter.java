package actividades.actividad3;

import actividades.actividad3.ui.CLI;

public class Starter {
    public static void main(String[] args){
        CLI cli = new CLI();  /*El "static"  refiere a que las variables mantienen sus valores en toda la clase, y en todo lugar que se invoque la variable.*/
        cli.runApp();
    }

}
