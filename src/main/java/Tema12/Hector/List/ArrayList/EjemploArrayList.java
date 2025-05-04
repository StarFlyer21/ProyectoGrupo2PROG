package Tema12.Hector.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear una lista de Strings
        List<String> Personitas = new ArrayList<>();

        // Agregar elementos a la lista
        Personitas.add("Paco");
        Personitas.add("Julio");
        Personitas.add("Tomas");

        // Acceder a un elemento por su índice
        System.out.println("El nombre en el índice 1 es: " + Personitas.get(1));

        // Recorrer la lista e imprimir los elementos
        for (String nombre : Personitas) {
            System.out.println(nombre);
        }

        // Eliminar un elemento
        Personitas.remove(0); // Elimina "Paco"
        System.out.println("Después de eliminar, la lista es: " + Personitas);
    }
}

