package Examen_22_23;

public class Persona {

    // Declaración de atributos.
    String nombre;
    int edad;

    // Declaración de constructor.
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobreescribimos el método 'toString()' para mostrar información de la persona.
    @Override
    public String toString() {
        return nombre + " " + edad;
    }
}
