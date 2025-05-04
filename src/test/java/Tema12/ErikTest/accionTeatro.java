package Tema12.ErikTest;

 import Tema12.ErikTest.SetOrNotSet.sistemaTeatro.Teatro;
 import Tema12.ErikTest.SetOrNotSet.sistemaTeatro.Actor;
 import Tema12.ErikTest.SetOrNotSet.sistemaTeatro.obra;

 import java.util.SortedSet;
 import java.util.TreeSet;

 @SuppressWarnings("ALL")
 public class accionTeatro {
 public static void main(String[] args) {
 SortedSet<Teatro> teatroSet = new TreeSet<>();

 for (int i = 0; i < 3; i++) {
 Teatro t = new Teatro(i, Teatro.generarNombresAleatorios());
 Actor a = new Actor(i, Actor.generarNombresAleatorios(), random(1, 10), random(1, 10));
 obra o = new obra(i, obra.generarNombresAleatorios(), obra.generarGenerosAleatorios(), random(1, 10));
 t.añadirActor(a);
 t.añadirObra(o);
 teatroSet.add(t);
 }

 System.out.println(teatroSet);
 }

 private static int random(int min, int max) {
 return (int) (Math.random() * (max - min + 1)) + min;
 }
 }