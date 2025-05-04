package Tema13.Gonzalo;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class EjemploF1 {
    public static void main(String[] args) throws IOException {
        // 1. Desde una colección
        List<String> pilotos = Arrays.asList("Alonso", "Verstappen", "Hamilton", "Leclerc", "Albon", "Sainz", "Russell", "Alonso");
        Stream<String> streamDesdeColeccion = pilotos.stream();

        // 2. Desde un array
        String[] array = {"Gasly", "Ocon", "Magnussen"};
        Stream<String> streamDesdeArray = Arrays.stream(array);

        // 3. Desde valores directos
        Stream<String> streamDirecto = Stream.of("uno", "dos", "tres");

        // 4. Streams vacíos o generados
        Stream<String> streamVacio = Stream.empty();
        Stream<Integer> streamGenerado = Stream.iterate(0, n -> n + 1).limit(5);

        // Tubería
        System.out.println("Pilotos que empiezan con 'A':");
        pilotos.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // collect()
        List<String> listaMayusculas = pilotos.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Todos en mayúsculas: " + listaMayusculas);

        // reduce()
        String concatenados = pilotos.stream()
                .reduce("", (a, b) -> a + b + " ");
        System.out.println("Concatenados: " + concatenados.trim());
    }
}
