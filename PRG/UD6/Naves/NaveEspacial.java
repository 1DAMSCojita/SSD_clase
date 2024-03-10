package Naves;

public abstract class NaveEspacial {
    
    // Declaración de variables.
    String nombre;
    int capacidadTripulantes;

    // Declaración de constructor.
    NaveEspacial(String nombre, int capacidadTripulantes) {
        this.nombre = nombre;
        this.capacidadTripulantes = capacidadTripulantes;
    }

    // Creamos una método no implementable pero que las clases hijas deberán de usar obligatoriamente.
    abstract void despegue();

    // Creamos un método llamado 'aterrizar' que imprimirá un mensaje por consola indicando que la nave ha aterrizado.
    public void aterrizar() {
        System.out.println("La nave ha aterrizado.");
    }

    // Sobreescribimos el método 'toString()' para mostrar información sobre la nave.
    @Override
    public String toString() {
        return String.format("El nombre de la nave es " + nombre + " y" + " tiene " + capacidadTripulantes + " tripulantes.");
    }

    // Sobreescribimos el método 'equals (Object o)' para comparar naves por el nombre y la capacidad de tripulantes.
    public boolean equals(Object o) {
        NaveEspacial ne = (NaveEspacial)o;

        return this.nombre.equals(ne.nombre) && this.capacidadTripulantes == ((NaveEspacial)o).capacidadTripulantes; // Comprobamos si el nombre y la capacidad de tripulantes son iguales a los de los objetos 'ne' y 'o', respectivamente.
    }
}