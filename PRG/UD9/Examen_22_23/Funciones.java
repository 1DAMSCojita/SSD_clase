package Examen_22_23;

// Importación de librerías.
import java.io.*;
import java.util.*;

public class Funciones {

    // Creamos un método estático para leer ficheros.
    // El archivo de 'velocidades.txt' ya tiene que estar creado previamente con los valores
    // '0.7'
    // '0.8'
    // '0.9'
    public static double leerFicheroVelocidad(String fichero) {
        double velocidad = 0.0; // Definimos una variable para la velocidad.
        // Creamos una estructura 'try-catch'.
        // Intentará leer el fichero, en caso de que no lo consiga agarrará la excepción.
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea; // Definimos la variable para la linea.
            List<Double> velocidades = new ArrayList<>(); // Creamos un ArrayList de velocidades.
            // Creamos un bucle 'while'.
            // Mientras haya línea que leer, se dividirá en líneas que se irán pasando una por una
            // al array de velocidades y las añadirá.
            while ((linea = br.readLine()) != null) {
                velocidades.add(Double.parseDouble(linea)); // Convertimos las lineas en double para poder ir añadiéndolas.
            }
            Random x = new Random(); // Generamos una opción aleatoria.
            velocidad = velocidades.get(x.nextInt(velocidades.size())); // Seleccionamos una velocidad aleatoria del ArrayList.
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        return velocidad; // Devolvemos la velocidad.
    }

    // Creamos un método estático para escribir en ficheros.
    public static void escribirEnFicheros(List<Gemelo> gemelos, String fichero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            for (Gemelo gemelo : gemelos) {
                bw.write(gemelo.nombre + "," + gemelo.edad + "," + gemelo.viaja); // Escribimos el nombre, la edad y si viaja o no.
                bw.newLine(); // Escribimos una nueva línea después de cada gemelo.
            }
        } catch (IOException e) {
            // En caso de que ocurra un error al escribir en el archivo, se imprime un mensaje de error.
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    
    // Creamos un método para calcular la edad final.
    public static int calcularEdadFinal(Gemelo gemelo, int tiempoViaje, double velocidad) {
        double tiempoGemeloTierra = tiempoViaje / (1 - velocidad);
        return gemelo.edad + (int)tiempoGemeloTierra;
    }

}
