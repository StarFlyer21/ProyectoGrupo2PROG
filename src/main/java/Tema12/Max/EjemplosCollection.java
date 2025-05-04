package Tema12.Max;

import java.util.*;

public class EjemplosCollection {

    public static void main(String[] args) {

        // Ejemplo 1: Uso general de Collection
        Collection<String> nombres = new ArrayList<>();
        nombres.add("Max");
        nombres.add("Rocío");

        System.out.println("Nombres: " + nombres);

        // Ejemplo 2: Uso básico de List
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        System.out.println("Elemento en la posición 1: " + numeros.get(1));

        // Ejemplo 3: Métodos básicos - Inserción, eliminación y comprobación
        Collection<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.remove("Manzana");
        boolean tieneNaranja = frutas.contains("Naranja");
        System.out.println("¿Tiene naranja? " + tieneNaranja);

        // Ejemplo 4: Otros métodos
        Collection<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");

        System.out.println("Colores (toString): " + colores.toString());

        Iterator<String> it = colores.iterator();
        while (it.hasNext()) {  //comprueba si hay siguiente
            String color = it.next();   //devuelve el siguiente
            if (color.equals("Rojo")) {
                it.remove(); // Elimina "Rojo"
            }
        }

        System.out.println("Colores después del remove con iterador: " + colores);
    }
}
