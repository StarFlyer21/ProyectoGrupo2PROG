package Tema12.Carlos.Ejemplo1;

public class Objeto<T, U> {
    private T primero;
    private U segundo;

    public Objeto(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public U getSegundo() {
        return segundo;
    }

    public void mostrar() {
        System.out.println("Primero: " + primero + ", Segundo: " + segundo);
    }
}
