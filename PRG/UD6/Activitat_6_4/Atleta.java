package Activitat_6_4;

public class Atleta {
    
    // Declaración de variables.
    String nombre;
    int edad;

    // Declaración de constructor.
    Atleta(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobreescribimos el método 'toString()' para representar textualmente al atleta.
    @Override
    public String toString() {
        return String.format("El nombre del atleta es " + nombre + " y" + " tiene " + edad + " años."); // Devolvemos una cadena de texto con la información del atleta.
    }

    // Sobreescribimos el método 'equals (Object o)' para poder comparar la igualdad entre atletas.
    public boolean equals(Object o) {
        Atleta a = (Atleta)o; // Creamos una instancia.

        return this.nombre.equals(a.nombre) && this.edad == ((Atleta)o).edad; // Comprobamos si el nombre y la edad son iguales a los del objeto 'a' y 'o', respectivamente. Devolverá 'true' o 'false'.

    }
}