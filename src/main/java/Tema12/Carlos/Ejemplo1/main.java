package Tema12.Carlos.Ejemplo1;

public class main {
    public static void main(String[] args) {
        Objeto<String, Integer> persona = new Objeto<>("Tomás", 46);
        persona.mostrar();

        Objeto<Double, Boolean> datos = new Objeto<>(745.4, true);
        datos.mostrar();
    }
}
