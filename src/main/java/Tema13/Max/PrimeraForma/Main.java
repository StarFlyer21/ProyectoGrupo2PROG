package Tema13.Max.PrimeraForma;

import Tema13.Max.Cliente;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Carlos", 30));
        clientes.add(new Cliente("Ana", 25));
        clientes.add(new Cliente("Bea", 28));

        Collections.sort(clientes, new ComparaNombres());

        System.out.println("Ordenados por nombre:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}

