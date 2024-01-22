package Activitat_6_4;

public class Saltador extends Atleta {
    
    // Declaración de variables.
    double alturaSalto;

    // Declaración de constructor.
    Saltador(String nombre, int edad, double alturaSalto) {
        super(nombre, edad); // Usamos un 'super' para agarrar las variabes 'nombre' y 'edad' de la clase 'Atleta'.
        this.alturaSalto = alturaSalto;
    }

    // Sobreescribimos el método 'toString()' para representar textualmente al saltador.
    @Override
    public String toString() {
        return super.toString() + String.format(" Su altura de salto es de " + alturaSalto + " metros." ); // Devolvemos una cadena de texto con la información del saltador
    }

    // Sobreescribimos el método 'equals (Object o)' para poder comparar la igualdad entre saltadores.
    public boolean equals(Object o) {
        Saltador s = (Saltador)o; // Creamos una instancia.

        return this.nombre.equals(s.nombre) && this.edad == ((Saltador)o).edad && alturaSalto == s.alturaSalto; // Comprobamos si el nombre, la edad y la altura de salto son iguales a los del objeto 'a' y 'o', respectivamente. Devolverá 'true' o 'false'.
    }

}
