package Tema12.Erik.SetOrNotSet.sistemaTeatro;

public class actor implements Comparable<actor> {

    // ====================
    // Atributos
    // ====================

    private final Integer codigoActor;
    private final String nombreActor;
    private final Integer nivelDrama;
    private final Integer experiencia;

    // ====================
    // Constructor
    // ====================

    public actor(Integer codigoActor, String nombreActor, int nivelDrama, int experiencia) {
        this.codigoActor = codigoActor;
        this.nombreActor = nombreActor;
        this.nivelDrama = nivelDrama;
        this.experiencia = experiencia;
    }

    // ====================
    // Métodos estáticos
    // ====================

    // Metodo para generar nombres aleatorios:

    /**public static TreeSet<String> generarNombresAleatorios() {
        List<String> nombresDisponibles = List.of("Carlos", "Carla", "Cody", "Serena", "Kami", "Stoneyra", "Erik");
        TreeSet<String> nombres = new TreeSet<>();
        int cantidad = (int) (Math.random()*(1-nombresDisponibles.size()+1)+nombresDisponibles.size());
        for (int i=0;i<cantidad;i++) {
            int indice = (int) (Math.random()*nombresDisponibles.size());
            nombres.add(nombresDisponibles.get(indice));
        }
        return nombres;
    }**/

    // ====================
    // Métodos sobrescritos
    // ====================

    @Override
    public int compareTo(actor o) {
        // Solo sirve para treeSet
        // Orden natural: por código de actor
        return this.nombreActor.compareTo(o.nombreActor);

        // return this.codigoActor-o.codigoActor;

        //return o.codigoActor - this.codigoActor;

        // Alternativa para ordenar por experiencia:
        // return Integer.compare(this.experiencia, o.experiencia);

        // Si ordenamos por experiencia directamente, los actores con misma experiencia
        // serían considerados iguales en TreeSet, y desaparecerían.
    }

    // Para hashSet y LinkedHashSet:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Mismo objeto (misma referencia) devuelve true
        if (o == null || getClass() != o.getClass()) return false; // No es del mismo tipo (clase diferente) o no hay objeto, null
        actor otro = (actor) o;
        return codigoActor.equals(otro.codigoActor);// Comparación por código único
    }

    @Override
    public int hashCode() {
        // Clave única para la gestión de duplicados en estructuras hash
        return codigoActor.hashCode();
    }

    @Override
    public String toString() {
        return "Actor [código=" + codigoActor +
                ", nombre=" + nombreActor +
                ", drama=" + nivelDrama +
                ", experiencia=" + experiencia + ']';
    }
}
