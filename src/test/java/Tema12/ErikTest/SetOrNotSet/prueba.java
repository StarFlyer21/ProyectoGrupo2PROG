package Tema12.ErikTest.SetOrNotSet;

import Tema12.ErikTest.SetOrNotSet.sistemaTeatro.Actor;

import java.util.SortedSet;
import java.util.TreeSet;

public class prueba {
    public static void main(String[] args) {
        SortedSet<Actor> actores = new TreeSet<>();
            Actor a = new Actor(1, Actor.generarNombresAleatorios(),random(),random());
            actores.add(a);
            a = new Actor(2, Actor.generarNombresAleatorios(),random(),random());
            actores.add(a);
            a = new Actor(3, Actor.generarNombresAleatorios(),random(),random());
            actores.add(a);

        System.out.println(actores);
    }
    private static int random(){
        int n=1;
        int m=10;
        return (int) (Math.floor(Math.random()*(n-m+1)+m));
    }
}
