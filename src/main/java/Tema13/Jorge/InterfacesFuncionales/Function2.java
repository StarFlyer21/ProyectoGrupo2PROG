package Tema13.Jorge.InterfacesFuncionales;

import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {
        //Transformar una cadena en su longitud
        Function<String, Integer> longitudCadena = cadena -> cadena.length();

        System.out.print("Cadena: Jesús -> "); System.out.print(longitudCadena.apply("Jesús")); System.out.println(" (caracteres)");
        System.out.print("Cadena: Programación -> "); System.out.print(longitudCadena.apply("Programación")); System.out.println(" (caracteres)");


    }
}

