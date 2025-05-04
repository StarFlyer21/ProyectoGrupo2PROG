package Tema12.Hector.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {

    public static void main(String[] args) {
        // Crear una LinkedList de enteros
        List<Integer> Numeros = new LinkedList<>();

        // Agregar elementos
        Numeros.add(10);
        Numeros.add(20);
        Numeros.add(30);

        // Añadir un elemento al inicio
        ((LinkedList<Integer>) Numeros).addFirst(5);

        // Recorrer la lista e imprimir los elementos
        for (Integer numero : Numeros) {
            System.out.println(numero);
        }

        // Eliminar un elemento del inicio
        ((LinkedList<Integer>) Numeros).removeFirst();
        System.out.println("Después de eliminar el primer elemento: " + Numeros);
    }
}
