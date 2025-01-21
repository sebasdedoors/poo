package actividades.actividad2.Challenges.retos;

import java.util.HashSet;
import java.util.Set;

public class RetoUno { 
    public static String reverseString(String input){ /*Es similar al metodo de burbuja en python, coloca la cadena en una lista y la reacomoda en reversa. */
        char[] chars = input.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--){
            reversed += chars[i];
        }
        return reversed;

    }
     public static DuplicateCharResult findFirstDuplicateChar(String input) {  /*Revela la posición de la letra repetida dentro de la cadena. */
        Set<Character> seenChars = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (seenChars.contains(c)) {
                return new DuplicateCharResult(c, i);
            }
            seenChars.add(c);
        }
        return null;
    }

    static class DuplicateCharResult{
        char character;
        int position;

        DuplicateCharResult(char character, int position){
            this.character = character;
            this.position = position;
        }
    }

    public static void main(String[] args){   /*Aqui se almacena e imprime la cadena al revez. */
        String original = "Hola Mundo";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        String testString = "abecedario";
        DuplicateCharResult firstDuplicateResult = findFirstDuplicateChar(testString);
        if (firstDuplicateResult != null){
            System.out.println("Primer caracter duplicado: " + "'" + firstDuplicateResult.character + "'" + " en la posición " + firstDuplicateResult.position);
        } else {
            System.out.println("No hay caracteres duplicados");
        }
    }    
}




