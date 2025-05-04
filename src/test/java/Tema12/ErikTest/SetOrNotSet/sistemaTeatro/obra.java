package Tema12.ErikTest.SetOrNotSet.sistemaTeatro;

import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class obra implements Comparable<obra> {

    // ====================
    // Atributos
    // ====================

    private final Integer codigoObra;
    private final TreeSet<String> nombreObra;
    private final TreeSet<String> generoObra;
    private final Integer rating;

    // ====================
    // Constructor
    // ====================

    public obra(Integer codigoObra, TreeSet<String> nombreObra, TreeSet<String> generoObra, Integer rating) {
        this.codigoObra = codigoObra;
        this.nombreObra = nombreObra;
        this.generoObra = generoObra;
        this.rating = rating;
    }

    // ====================
    // Métodos estáticos
    // ====================

    public static TreeSet<String> generarNombresAleatorios() {
        List<String> nombresDisponibles = List.of("Ser o no ser", "El secreto de Puente Viejo", "Saber y Ganar",
                "Kimetsu no Yaiba", "Shingeki no Kyojin", "House", "Scott Pilgrim");
        TreeSet<String> nombre = new TreeSet<>();
        int cantidad = (int) (Math.random() * nombresDisponibles.size()) + 1;
        for (int i = 0; i < cantidad; i++) {
            int indice = (int) (Math.random() * nombresDisponibles.size());
            nombre.add(nombresDisponibles.get(indice));
        }
        return nombre;
    }

    public static TreeSet<String> generarGenerosAleatorios() {
        List<String> generosDisponibles = List.of(
                "Comedia", "Drama", "Tragedia", "Tragicomedia", "Romance", "Suspense"
        );
        TreeSet<String> genero = new TreeSet<>();
        int cantidad = (int) (Math.random() * generosDisponibles.size()) + 1;
        for (int i = 0; i < cantidad; i++) {
            int indice = (int) (Math.random() * generosDisponibles.size());
            genero.add(generosDisponibles.get(indice));
        }
        return genero;
    }

    // ====================
    // Métodos sobrescritos
    // ====================

    @Override
    public int compareTo(obra o) {
        return this.codigoObra - o.codigoObra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        obra otra = (obra) o;
        return Objects.equals(codigoObra, otra.codigoObra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoObra);
    }

    @Override
    public String toString() {
        return "nombre=" + nombreObra + ", código=" + codigoObra + ", géneros=" + generoObra + ", rating=" + rating;
    }
}
