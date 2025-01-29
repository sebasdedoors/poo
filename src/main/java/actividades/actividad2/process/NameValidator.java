package actividades.actividad2.process;

import static actividades.actividad2.data.Data.nombres;

public class NameValidator { /*Toma los nombres del paquete "Data" y verifica si el nombre que el usuario ingreso ya esta registrado. */
    public static boolean validateName(String name){
        boolean valid = false;
        int index = 0;
            while(!valid && index<nombres.length){
                if(nombres[index].equalsIgnoreCase(name)){
                    valid = true;
                }
                index++;
            }
            return valid;
    }

}
