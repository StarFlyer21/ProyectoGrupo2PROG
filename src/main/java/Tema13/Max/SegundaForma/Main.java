package Tema13.Max.SegundaForma;

import Tema13.Max.Cliente;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Carlos", 30));
        clientes.add(new Cliente("Ana", 25));
        clientes.add(new Cliente("Bea", 28));

        Collections.sort(clientes, new Comparator<Cliente>() {
            public int compare(Cliente c1, Cliente c2) {
                return c1.getNombre().compareTo(c2.getNombre());
            }
        });

        System.out.println("Ordenados por nombre:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}

