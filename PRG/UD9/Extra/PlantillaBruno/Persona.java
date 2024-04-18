package Extra.PlantillaBruno;

import java.io.Serializable;

class Persona implements Serializable {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    @Override
    public String toString(){
        return "Nombre: " + nombre + " edad: " + edad;
    }
}
