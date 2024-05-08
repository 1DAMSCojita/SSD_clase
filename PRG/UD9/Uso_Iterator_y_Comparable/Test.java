package Uso_Iterator_y_Comparable;

// Importación de librerías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una instancia de la clase 'CarreraDeCoches'.
        CarreraDeCoches cdc = new CarreraDeCoches();

        // Añadimos coches a la colección usando los métodos.
        System.out.println("-------------------------------------------------------");
        cdc.añadirCoche(new Coche("Mercedes-Benz", 164));
        cdc.añadirCoche(new Coche("Lamborghini Aventador", 350));
        cdc.añadirCoche(new Coche("Audi A3", 232));

        compruebaIterator(cdc); // Llamamos al método de 'compruebaIterator()' y le pasamos por parámetro la carrera de coches.
        System.out.println("-------------------------------------------------------");
        System.out.println("Coche ganador: " + cdc.getGanador());
        
    }

    // Creamos un método para comprobar que se pueda recorrer la colección de coches con un iterator.
    // Ponemos la instancia de 'CarreraDeCoches' como parámetro.
    public static void compruebaIterator(CarreraDeCoches cdc) {
        Iterator<Coche> iterator = cdc.coches.iterator(); // Creamos un iterator llamando al parámetro y a la colección de coches.
        // Creamos un bucle 'while'.
        // En resumen lo que hará será iterar sobre la colección de coches.
        while (iterator.hasNext()) {
            Coche coche = iterator.next(); // Obtenemos los coches.
            System.out.println("-Nombre: " + coche.nombre + " | " + "Velocidad maxima: " + coche.velocidad_maxima);
        }
    }
}