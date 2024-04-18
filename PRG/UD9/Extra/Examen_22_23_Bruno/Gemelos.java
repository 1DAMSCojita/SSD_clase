package Extra.Examen_22_23_Bruno;

public class Gemelos extends Persona implements Comparable<Gemelos> { // Implementamos comparable
    boolean viaje; // Creamos 

    public Gemelos(String nombre, int edad, boolean viaje){ // Creamos el constructor
        this.nom = nombre;
        this.edad = edad;
        this.viaje = viaje;
    }

    @Override
    public String toString(){ // Hacemos override a toString para mostrar el nombre
        return  nom;
    }

    @Override
    public int compareTo(Gemelos o) { // Hacemos override al compareTo para ordenar por nombre
        return this.nom.compareToIgnoreCase(o.nom);
    }
}
