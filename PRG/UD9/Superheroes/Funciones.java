package Activitat_9_11;

// Importación de librerías.
import java.util.*;
import java.io.*;

public class Funciones {

    // Declaración de colecciones.
    List<Personaje> personajes = new ArrayList<>(); // Declaramos el ArrayList de personajes.

    // Creamos un método que leerá los nombres de los personajes de un fichero de texto.
    public static List<Personaje> leerPersonajes(String fichero) {
        List<Personaje> personajes = new ArrayList<>();
        // Creamos una estructura de control 'try-resources'
        // Intentará abrir un BufferedReader sobre el fichero, en caso de que no lo consiga
        // capturará la excepción y avisará.
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            // Creamos un bucle 'while'.
            // Mientras haya línea que leer, se dividirá en líneas que se irán pasando una por una
            // al array de partes y añadirá el objeto Personaje para devolverlo a la lista.
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); // Creamos un array de partes para dividir el fichero y dividimos la separación entre el nombre y el alias con una "," con el método split().
                // Creamos una estructura de control 'if'.
                // Si la línea tiene dos partes, eliminará los espacios y creará el objeto de Personajes paraa devolverlo.
                if (partes.length == 2) {
                    String nombre = partes[0].trim(); // Creamos una variable con el nombre y eliminamos el espacio. Lo asignamos a la primera posición de la parte.
                    String alias = partes[1].trim(); // Creamos una variable con el alias y eliminamos el espacio. Lo asignamos a la segunda posición de la parte.
                    Personaje personaje = new Personaje(nombre, alias); // Creamos un objeto Personaje con el nombre y alias.
                    personajes.add(personaje); // Añadimos el personaje a la lista.
                }
            }
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        return personajes; // Devolvemos la lista de personajes.
    }

    // Creamos un método que escribirá los personajes en un fichero.
    public static void escribirPersonajes(List<Personaje> personajes, String fichero) {
        // Creamos una estructura de control 'try-resources'
        // Intentará abrir un BufferedWriter sobre el fichero, en caso de que no lo consiga
        // capturará la excepción y avisará.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            // Creamos un bucle 'for-each'.
            // Escribirá el nombre y el alias en el fichero. Línea por línea.
            for (Personaje personaje : personajes) {
                bw.write(personaje.nombre + "," + personaje.alias + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

}
