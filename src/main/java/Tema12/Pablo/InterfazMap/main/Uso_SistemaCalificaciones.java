package Tema12.Pablo.InterfazMap.main;

import Tema12.Pablo.InterfazMap.SistemaCalificaciones;

public class Uso_SistemaCalificaciones {
        public static void main(String[] args) {
            // 1. Crear un sistema de calificaciones con HashMap (por defecto)
            SistemaCalificaciones sistema = new SistemaCalificaciones("hashmap");

            // 2. Agregar calificaciones
            sistema.agregarCalificacion("Ana", 8.5);
            sistema.agregarCalificacion("Luis", 7.2);
            sistema.agregarCalificacion("Marta", 9.0);
            sistema.agregarCalificacion("Carlos", 6.8);

            // 3. Mostrar todas las calificaciones
            sistema.mostrarCalificaciones();

            // 4. Obtener calificación de un estudiante
            System.out.println("\nCalificación de Marta: " + sistema.obtenerCalificacion("Marta"));

            // 5. Verificar si un estudiante está en el sistema
            System.out.println("¿Está Luis? " + sistema.contieneEstudiante("Luis"));
            System.out.println("¿Está Pedro? " + sistema.contieneEstudiante("Pedro"));

            // 6. Verificar si existe una calificación específica
            System.out.println("¿Algún estudiante tiene un 7.2? " + sistema.contieneCalificacion(7.2));
            System.out.println("¿Algún estudiante tiene un 10.0? " + sistema.contieneCalificacion(10.0));

            // 7. Mostrar solo nombres de estudiantes
            System.out.println("\nLista de estudiantes:");
            sistema.mostrarEstudiantes();

            // 8. Mostrar solo las calificaciones
            System.out.println("\nLista de calificaciones:");
            sistema.mostrarSoloCalificaciones();

            // 9. Eliminar un estudiante
            System.out.println("\nEliminando a Luis...");
            sistema.eliminarEstudiante("Luis");

            // 10. Mostrar calificaciones después de eliminar
            System.out.println("\nCalificaciones después de eliminar a Luis:");
            sistema.mostrarCalificaciones();
        }
}



