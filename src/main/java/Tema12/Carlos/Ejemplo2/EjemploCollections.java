package Tema12.Carlos.Ejemplo2;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class EjemploCollections {
        public static void main(String[] args) {
            List<String> nombres = new ArrayList<>();
            nombres.add("Paco");
            nombres.add("Tomas");
            nombres.add("Julio");
            nombres.add("Paco");
            nombres.add("Edu");
            //Imprime
            System.out.println("Lista original: " + nombres);
            //Ordena
            Collections.sort(nombres);
            System.out.println("Ordenada: " + nombres);
            //Invierte
            Collections.reverse(nombres);
            System.out.println("Invertida: " + nombres);
            //Busca
            Collections.sort(nombres);
            int posicion = Collections.binarySearch(nombres, "Tomas");
            System.out.println("Posición de Tomas: " + posicion);
            //Cuenta
            int repeticiones = Collections.frequency(nombres, "Paco");
            System.out.println("Repeticiones de 'Paco': " + repeticiones);
            //
            Collections.replaceAll(nombres, "Edu", "Diego");
            System.out.println("Lista con 'Edu' reemplazado por 'Diego': " + nombres);
        }
}
