package Tema12.Erik.SetOrNotSet.recursosTeatro;

import Tema12.Erik.SetOrNotSet.sistemaTeatro.actor;

import java.util.*;

public class actores {
    public static void main(String[] args) {

        // Para ver mejor la funcionalidad de actor, vamos a crear una lista de actores
        // Como es un set en el que hemos implementado comparator y que se ordenen por código, pues iran de 0 a 9

        System.out.println("\n=== Ejemplo 1: Diferencias entre Set, HashSet, LinkedHashSet, TreeSet ===");
        actor a1 = new actor(1,"Zen",5,10);
        actor a2 = new actor(2,"Sam",3,1);
        actor a3 = new actor(2,"Pedro",3,1);
        actor a4 = new actor(3,"Sam",8,7);


        Set<actor> hashSet = new HashSet<>();
        Set<actor> linkedHashSet= new LinkedHashSet<>();
        SortedSet<actor> treeSet = new TreeSet<>();

        hashSet.add(a1); hashSet.add(a2); hashSet.add(a3); hashSet.add(a4);
        linkedHashSet.add(a1); linkedHashSet.add(a2); linkedHashSet.add(a3); linkedHashSet.add(a4);
        treeSet.add(a1); treeSet.add(a2); treeSet.add(a3); treeSet.add(a4);

        System.out.println("\nHashSet después de intentar meter duplicado:");
        for (actor a:hashSet) {
            System.out.println(a);
        }
        System.out.println("\nLinkedHashSet después de intentar meter duplicado:");
        for (actor a:linkedHashSet) {
            System.out.println(a);
        }
        System.out.println("\nTreeSet después de intentar meter duplicado:");
        for (actor a:treeSet) {
            System.out.println(a);
        }

        System.out.println("\n=== Ejemplo 2: LinkedHashSet y sus métodos de agregacion ===");
        linkedHashSet.add(new actor(50,"Luciano",5,20));
        linkedHashSet.add(new actor(0,"Enrique",5,20));

        System.out.println("\nHashSet después de intentar meter duplicado:");
        for (actor a:linkedHashSet) {
            System.out.println(a);
        }

        System.out.println("\n=== Ejemplo 3: HashSet y su desorden ===");
        hashSet.add(new actor(50,"Luciano",5,20));
        hashSet.add(new actor(24,"Enrique",4,10));
        System.out.println("\nHashSet después de intentar meter duplicado:");
        for (actor a:hashSet) {
            System.out.println(a);
        }

        /**
         * Así sería con expresiones lambda:
         System.out.println("\nHashSet (no orden, no duplicados):");
         hashSet.forEach(System.out::println);

         System.out.println("\nLinkedHashSet (orden de inserción, no duplicados):");
         linkedHashSet.forEach(System.out::println);

         System.out.println("\nTreeSet (ordenado por códigoActor):");
         treeSet.forEach(System.out::println);

         System.out.println("\n=== Ejemplo 2: Duplicados ===");
         actor duplicado = new actor(2, "Sam", 3, 1); // Mismo código que a2

         hashSet.add(duplicado);
         linkedHashSet.add(duplicado);
         treeSet.add(duplicado);**/


        /**
        System.out.println("TREE SET: ");
        for (actor a:lista) {
            System.out.println(a);
        }

        System.out.println("HashSet:");
        for (actor a:lista1) {
            System.out.println(a);
        }

        System.out.println("Linked HashSet: ");
        for (actor a:lista2) {
            System.out.println(a);
        }**/
    }
    private static int random(){
        int n=1;
        int m=10;
        return (int) (Math.floor(Math.random()*(n-m+1)+m));
    }
    private static int random2(){
        int n=1;
        int m=5;
        return (int) (Math.floor(Math.random()*(n-m+1)+m));
    }
}