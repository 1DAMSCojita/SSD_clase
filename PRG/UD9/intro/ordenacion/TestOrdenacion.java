package intro.ordenacion;

import java.util.*;

public class TestOrdenacion {
    public static void main(String[] args) {
    
        Set<Humano> p = new TreeSet<>();
        
        p.add(new Humano("El", "Nalgas", 29));


    }

}

class Humano implements Comparable<Humano> {
    
    private String nombre;
    public String apellido;
    private int edad;

    public Humano(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public int compareTo(Humano o) {
        // return this.nombre.compareTo(o.nombre);
        return this.edad - o.edad * -1;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "| " + "Apellidos:" + apellido + "| " + "Edad: " + edad;
    }
}
