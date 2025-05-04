package Tema13.Jorge.InterfacesFuncionales;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        //Filtramos si una nota está aprobada >=5 o suspensa <5
        Predicate<Integer> aprobado = nota -> nota >= 5;

        System.out.println("Nota: 9 -> " +aprobado.test(9)); // true
        System.out.println("Nota: 5 -> " +aprobado.test(5)); //true
        System.out.println("Nota: 2 -> " +aprobado.test(2)); // false

    }
}
