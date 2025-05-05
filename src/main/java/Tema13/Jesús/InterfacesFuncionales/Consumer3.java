package Tema13.Jesús.InterfacesFuncionales;

import java.util.function.Consumer;

public class Consumer3 {
    public static void main(String[] args) {
        //Para imprimir mensajes personalizados
        Consumer<String> imprimirMensaje = mensaje -> System.out.println("Mensaje recibido: " + mensaje);

        imprimirMensaje.accept("Gracias por su atención");
        imprimirMensaje.accept("Doy paso a la explicación de mi compañero");

    }
}

