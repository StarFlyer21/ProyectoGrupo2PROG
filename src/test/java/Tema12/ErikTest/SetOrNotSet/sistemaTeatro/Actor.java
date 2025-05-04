package Tema12.ErikTest.SetOrNotSet.sistemaTeatro;

import java.util.List;
import java.util.TreeSet;

public class Actor implements Comparable<Actor>{
    public Integer codigoActor;
    private final TreeSet<String> nombreActor;
    private final Integer nivelDrama;
    private final Integer experiencia;

    public Actor(Integer codigoActor, TreeSet<String> nombreActor, int nivelDrama, int experiencia) {
        this.codigoActor=codigoActor;
        this.nombreActor=nombreActor;
        this.nivelDrama=nivelDrama;
        this.experiencia=experiencia;
    }

    public static TreeSet<String> generarNombresAleatorios(){
        List<String> nombresDisponibles= List.of("Carlos","Carla","Cody","Serena","Kami","Stoneyra","Erik");
        TreeSet<String> nombre=new TreeSet<>();
        int aleatorio = (int) (Math.random()*(1-nombresDisponibles.size()+1)+nombresDisponibles.size());
        for (int i=0;i<aleatorio;i++){
            nombre.add(nombresDisponibles.get((aleatorio)));
        }
        return nombre;
    }

    @Override
    public int compareTo(Actor o) {
        return Integer.compare(this.experiencia, o.experiencia);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true; //Mimo objeto en memoria
        if (o == null || getClass() != o.getClass()) return false;

        Actor otro = (Actor) o;
        return experiencia.equals(otro.experiencia); //comparamos por codigo porque el nombre se puede repetir
    }
    @Override
    public int hashCode(){
        return codigoActor.hashCode();
    }
    @Override
    public String toString() {
        return "Actor{" + "código=" + codigoActor + "\n"+
                " nombre=" + nombreActor + "\n"+
                " drama=" + nivelDrama + "\n"+
                " experiencia=" + experiencia +"\n"+
                '}';
    }
}
