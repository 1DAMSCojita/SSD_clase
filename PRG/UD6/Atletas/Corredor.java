package Atletas;

// Añadimos 'extends Atleta' para heredar variables de la clase.
public class Corredor extends Atleta {
    
    // Declaración de variables.
    int velocidad;

    // Declaración de constructor.
    Corredor(String nombre, int edad,  int velocidad) {
        super(nombre, edad); // Usamos un 'super' para agarrar las variabes 'nombre' y 'edad' de la clase 'Atleta'.
        this.velocidad = velocidad;
    }

    // Sobreescribimos el método 'toString()' para representar textualmente al corredor.
    @Override
    public String toString() {
        return super.toString() + String.format(" Su velocidad es de " + velocidad + " m/s." ); // Devolvemos una cadena de texto con la información del corredor.
    }

    // Sobreescribimos el método 'equals (Object o)' para poder comparar la igualdad entre corredores.
    public boolean equals(Object o) {
        Corredor c = (Corredor)o; // Creamos una instancia.

        return this.nombre.equals(c.nombre) && this.edad == ((Corredor)o).edad && velocidad == c.velocidad; // Comprobamos si el nombre, la edad y la velocidad son iguales a los del objeto 'a' y 'o', respectivamente. Devolverá 'true' o 'false'.
    }

}
