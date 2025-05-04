package Tema13.Max.PrimeraForma;

import Tema13.Max.Cliente;

import java.util.Comparator;

class ComparaNombres implements Comparator<Cliente> {
    public int compare(Cliente c1, Cliente c2) {
        return c1.getNombre().compareTo(c2.getNombre());
    }
}
