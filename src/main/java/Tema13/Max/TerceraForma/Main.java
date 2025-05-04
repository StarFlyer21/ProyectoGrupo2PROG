package Tema13.Max.TerceraForma;

import Tema13.Max.Cliente;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Carlos", 30));
        clientes.add(new Cliente("Ana", 25));
        clientes.add(new Cliente("Bea", 28));

        // Versión con lambda
        Collections.sort(clientes, (c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));

        System.out.println("Ordenados por nombre:");
        clientes.forEach(System.out::println);
    }
}

