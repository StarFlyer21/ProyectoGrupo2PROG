package Tema12.ErikTest.SetOrNotSet.sistemaTeatro;

import Tema12.ErikTest.SetOrNotSet.sistemaTeatro.Actor;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Teatro implements Comparable<Teatro> {

    // ====================
    // Atributos
    // ====================

    private final Integer codigoTeatro;
    private final TreeSet<String> nombre;
    private final Set<Actor> actores = new TreeSet<>();
    private final Set<obra> obras = new TreeSet<>();

    // ====================
    // Constructor
    // ====================

    public Teatro(Integer codigoTeatro, TreeSet<String> nombre) {
        this.codigoTeatro = codigoTeatro;
        this.nombre = nombre;
    }

    // ====================
    // Métodos públicos
    // ====================

    public void añadirActor(Actor a) {
        actores.add(a);
    }

    public void añadirObra(obra o) {
        obras.add(o);
    }

    // ====================
    // Métodos estáticos
    // ====================

    public static TreeSet<String> generarNombresAleatorios() {
        List<String> teatrosDisponibles = List.of(
                "Circo del Sol", "LHD", "Shakespeare's Globe Theatre"
        );
        TreeSet<String> teatro = new TreeSet<>();
        int cantidad = (int) (Math.random() * teatrosDisponibles.size()) + 1;
        for (int i = 0; i < cantidad; i++) {
            int indice = (int) (Math.random() * teatrosDisponibles.size());
            teatro.add(teatrosDisponibles.get(indice));
        }
        return teatro;
    }

    // ====================
    // Métodos sobrescritos
    // ====================

    @Override
    public int compareTo(Teatro o) {
        return this.codigoTeatro - o.codigoTeatro;
    }

    @Override
    public String toString() {
        return "Teatro [nombre=" + nombre + ", código=" + codigoTeatro + "]\n" +
                "Actores:\n" + actores +
                "\nObras:\n" + obras;
    }
}
