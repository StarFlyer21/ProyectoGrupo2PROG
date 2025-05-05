package Tema13.Gonzalo;

import java.io.IOException;
import java.util.*;
import java.util.stream.*;

public class EjemploF1 {
    public static void main(String[] args) {
        // 1. Desde una colección
        List<String> pilotos = Arrays.asList("Alonso", "Verstappen", "Hamilton", "Leclerc", "Albon", "Sainz", "Russell", "Alonso");
        Stream<String> streamDesdeColeccion = pilotos.stream();

        // 2. Desde un array
        String[] array = {"Gasly", "Ocon", "Bearman"};

        // 3. Desde valores directos
        Stream<String> streamDirecto = Stream.of("pole", "podio", "puntos");

        // 4. Streams vacíos o generados
        // (se generarán al momento de usarlos para evitar reutilización)

        // Tubería
        System.out.println("Pilotos que empiezan con 'A':");
        pilotos.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // 1. collection
        List<String> listaMayusculas = pilotos.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Todos en mayúsculas: " + listaMayusculas);

        String concatenados = pilotos.stream()
                .reduce("", (a, b) -> a + b + " ");
        System.out.println("Concatenados: " + concatenados.trim());

        // 2. array
        List<String> listaArray = Arrays.stream(array)
                .collect(Collectors.toList());
        System.out.println("Array como lista: " + listaArray);

        String concatenadosArray = Arrays.stream(array)
                .reduce("", (a, b) -> a + b + " ");
        System.out.println("Array concatenado: " + concatenadosArray.trim());

        // 3. directos
        List<String> listaDirecto = Stream.of("pole", "podio", "puntos")
                .collect(Collectors.toList());
        System.out.println("Directo como lista: " + listaDirecto);

        String concatenadosDirecto = Stream.of("pole", "podio", "puntos")
                .reduce("", (a, b) -> a + b + " ");
        System.out.println("Directo concatenado: " + concatenadosDirecto.trim());

        // 4. vacío
        List<String> listaVacio = Stream.<String>empty().collect(Collectors.toList());
        System.out.println("Stream vacío como lista: " + listaVacio);

        String concatenadosVacio = Stream.<String>empty().reduce("", (a, b) -> a + b + " ");
        System.out.println("Stream vacío concatenado: " + concatenadosVacio.trim());

        // 4. generado
        List<Integer> listaGenerado = Stream.iterate(0, n -> n + 1).limit(5)
                .collect(Collectors.toList());
        System.out.println("Stream generado como lista: " + listaGenerado);

        String concatenadosGenerado = Stream.iterate(0, n -> n + 1).limit(5)
                .map(String::valueOf)
                .reduce("", (a, b) -> a + b + " ");
        System.out.println("Stream generado concatenado: " + concatenadosGenerado.trim());
    }
}