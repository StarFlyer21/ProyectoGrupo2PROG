package Tema12.Pablo.InterfazMap;

import java.util.*;

/**
 * Clase que gestiona un sistema de calificaciones de estudiantes.
 * Utiliza un Map para almacenar pares (nombre del estudiante, calificación),
 * permitiendo realizar operaciones comunes como inserción, búsqueda, eliminación
 * y recorrido mediante las vistas keySet, values y entrySet.
 * Se puede elegir entre diferentes implementaciones de Map: HashMap, TreeMap o LinkedHashMap.
 *
 * @author Pablo
 * @version 1.0
 */
public class SistemaCalificaciones {

    private Map<String, Double> calificaciones;

    /**
     * Constructor que inicializa el mapa de calificaciones según el tipo especificado.
     *
     * @param tipo Tipo de implementación de Map: "hashmap", "treemap" o "linkedhashmap".
     *             Si no se reconoce el tipo, se usará HashMap por defecto.
     */
    public SistemaCalificaciones(String tipo) {
        switch (tipo.toLowerCase()) {
            case "treemap":
                calificaciones = new TreeMap<>();
                break;
            case "linkedhashmap":
                calificaciones = new LinkedHashMap<>();
                break;
            default:
                calificaciones = new HashMap<>();
        }
    }

    /**
     * Agrega o actualiza la calificación de un estudiante.
     *
     * @param estudiante Nombre del estudiante (clave).
     * @param calificacion Nota a asignar (valor).
     */
    public void agregarCalificacion(String estudiante, Double calificacion) {
        calificaciones.put(estudiante, calificacion);
    }

    /**
     * Obtiene la calificación de un estudiante.
     *
     * @param estudiante Nombre del estudiante.
     * @return Calificación asociada o null si no existe.
     */
    public Double obtenerCalificacion(String estudiante) {
        return calificaciones.get(estudiante);
    }

    /**
     * Elimina a un estudiante del mapa de calificaciones.
     *
     * @param estudiante Nombre del estudiante a eliminar.
     */
    public void eliminarEstudiante(String estudiante) {
        calificaciones.remove(estudiante);
    }

    /**
     * Verifica si un estudiante está presente en el mapa.
     *
     * @param estudiante Nombre del estudiante a verificar.
     * @return true si el estudiante existe, false si no.
     */
    public boolean contieneEstudiante(String estudiante) {
        return calificaciones.containsKey(estudiante);
    }

    /**
     * Verifica si una determinada calificación existe en el mapa.
     *
     * @param calificacion Nota a buscar.
     * @return true si alguna entrada tiene esa calificación, false en caso contrario.
     */
    public boolean contieneCalificacion(Double calificacion) {
        return calificaciones.containsValue(calificacion);
    }

    /**
     * Muestra todos los estudiantes junto con sus calificaciones usando entrySet.
     */
    public void mostrarCalificaciones() {
        System.out.println("== Calificaciones ==");
        for (Map.Entry<String, Double> entrada : calificaciones.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

    /**
     * Muestra solo los nombres de los estudiantes usando keySet.
     */
    public void mostrarEstudiantes() {
        System.out.println("== Estudiantes ==");
        for (String estudiante : calificaciones.keySet()) {
            System.out.println(estudiante);
        }
    }

    /**
     * Muestra únicamente las calificaciones usando values.
     */
    public void mostrarSoloCalificaciones() {
        System.out.println("== Solo calificaciones ==");
        for (Double nota : calificaciones.values()) {
            System.out.println(nota);
        }
    }
}
