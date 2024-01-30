package Activitat_7_2_y_3;

// Importación de librerías.
import java.util.Comparator;

public class Futbolista implements Comparable<Futbolista> { // Implementamos un comparador por defecto de Java gracias a la librería.
    
    // Declaración de variables.
    String dni;
    String nombre;
    int edad;
    int numero_de_goles;

    // Declaración de constructor.
    Futbolista(String dni, String nombre, int edad, int numero_de_goles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numero_de_goles = numero_de_goles;
    }

    // Sobreescribimos el método 'toString()' para mostrar información del futbolista.
    @Override
    public String toString() {
        return "-Futbolista " + dni + ": Se llama " + nombre + ", tiene " + edad + " años.";
    }

    // Sobreescribimos el método 'equals(Object o)' para comparar dos objetos. Convertiremos el objeto 'o' en un objeto de tipo Futbolista y luego
    // compararemos los atributos 'dni' de los dos Futbolistas para determinar si son iguales.
    @Override
    public boolean equals(Object o) {
        Futbolista f = (Futbolista) o;

        return dni.equals(f.dni);
    }

    // Creamos un método 'compareTo' para establecer un orden entre objetos (comparándolos de nuevo) de la clase.
    public int compareTo(Futbolista f) {
        return dni.compareTo(f.dni);
    }

    // Creamos un comparador estático (para que pueda ser accesible sin la necesidad de instanciar un objeto) para comparar futbolistas por nombre. 
    public static Comparator<Futbolista> nombreComparator = new Comparator<Futbolista>() {

        // Sobreescribimos el método 'compare' y comparamos dos futbolistas por el nombre. Posteriormente lo devolvemos.
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            return f1.nombre.compareTo(f2.nombre);
        }

    };
    
    // Creamos un comparador estático (para que pueda ser accesible sin la necesidad de instanciar un objeto) para comparar futbolistas por edad.
    public static Comparator<Futbolista> edadComparator = new Comparator<Futbolista>() {

        // Sobreescribimos el método 'compare' de la clase 'Integer', el cuál lo usamos para comparar valores enteros. A diferencia del anterior comparador que 
        // nombre era un String y no requería usar un integer para la comparación.
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            // A raíz del ejercicio añadimos un bucle 'if'.
            // Si los dos objetos tienen la misma edad, comparamos por nombre entre ambos objetos y devolvemos la comparación.
            if (f1.edad == f2.edad) {
                return f1.nombre.compareTo(f2.nombre);
            } else {
                return Integer.compare(f1.edad, f2.edad);
            }
        }

    };

}
