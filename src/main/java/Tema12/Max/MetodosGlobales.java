package Tema12.Max;

import Tema13.Max.Cliente;

import java.util.*;

public class MetodosGlobales {
    public static void main(String[] args) {
        // Colección original de clientes
        Collection<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Ana", 30));
        clientes.add(new Cliente("Luis", 25));
        clientes.add(new Cliente("Carlos", 40));

        // Segunda colección para pruebas
        Collection<Cliente> nuevosClientes = new ArrayList<>();
        nuevosClientes.add(new Cliente("Luis", 25));
        nuevosClientes.add(new Cliente("Laura", 35));

        System.out.println("Clientes iniciales: " + clientes);
        System.out.println("Nuevos clientes: " + nuevosClientes);

        // containsAll
        System.out.println("\n1. containsAll()");
        boolean contieneTodos = clientes.containsAll(nuevosClientes);
        System.out.println("¿Clientes contiene todos los nuevosClientes? " + contieneTodos); // false

        // addAll
        System.out.println("\n2. addAll()");
        boolean agregado = clientes.addAll(nuevosClientes);
        System.out.println("¿Se agregaron nuevosClientes a clientes? " + agregado); // true
        System.out.println("Clientes después de addAll: " + clientes);

        // removeAll
        System.out.println("\n3. removeAll()");
        boolean eliminados = clientes.removeAll(nuevosClientes);
        System.out.println("¿Se eliminaron nuevosClientes de clientes? " + eliminados); // true
        System.out.println("Clientes después de removeAll: " + clientes);

        // retainAll
        System.out.println("\n4. retainAll()");
        clientes.addAll(nuevosClientes); // agregamos otra vez para probar retainAll
        System.out.println("Clientes antes de retainAll: " + clientes);
        boolean retenidos = clientes.retainAll(nuevosClientes);
        System.out.println("¿Se retuvieron solo los clientes también en nuevosClientes? " + retenidos); // true
        System.out.println("Clientes después de retainAll: " + clientes);

        // toArray()
        System.out.println("\n5. toArray()");
        Object[] arrayObjetos = clientes.toArray();
        System.out.println("Array resultante: " + Arrays.toString(arrayObjetos));

        // toArray(T[] a)
        System.out.println("\n6. toArray(T[] a)");
        Cliente[] arrayClientes = clientes.toArray(new Cliente[0]);
        for (Cliente c : arrayClientes) {
            System.out.println("Cliente: " + c.getNombre() + ", Edad: " + c.getEdad());
        }
    }
}
