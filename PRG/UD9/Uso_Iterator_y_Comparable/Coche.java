package Uso_Iterator_y_Comparable;

public class Coche implements Comparable<Coche> {

    // Declaración de atributos.
    String nombre;
    double velocidad_maxima;

    // Declaración de constructor.
    Coche(String nombre, double velocidad_maxima) {
        this.nombre = nombre;
        this.velocidad_maxima = velocidad_maxima;
    }

    // Implementamos el comparador que pide la interfaz 'Comparable' y comparamos velocidades.
    @Override
    public int compareTo(Coche o) {
        // Creamos una estructura de control 'if'.
        // Si la velocidad máxima del coche es menor que la del coche añadido, devolverá un valor
        // positivo indicando que el coche debe colocarse después.
        if (this.velocidad_maxima < o.velocidad_maxima) {
            return 1;
        // Si la velocidad máxima del coche es mayor que la del coche añadido, devolverá un valor
        // negativo indicando que  el coche debe colocarse antes.
        // Si son iguales, devolverá 0 indicando que los coches son iguales en términos de velocidad. 
        } else if (this.velocidad_maxima > o.velocidad_maxima) {
            return -1;
        } else {
            return 0;
        }
    }

}
