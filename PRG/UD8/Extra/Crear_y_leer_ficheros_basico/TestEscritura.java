package Extra.Crear_y_leer_ficheros_basico;

import java.util.*;
import java.io.*;

public class TestEscritura {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int opcion;

        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);

        // Presentación del programa junto al menú.
        System.out.println("_________________________________________________________________________\n");
        System.out.println("Bienvenido al programa. Aquí podrás gestionar la creación de ficheros.");
        System.out.println("Elige una opción: \n");
        System.out.println("1. Crear un fichero usando FileWriter.");
        System.out.println("2. Crear un fichero usando BufferedWriter.");
        System.out.println("3. Crear un fichero usando PrintWriter.");
        System.out.println("_________________________________________________________________________\n");
        opcion = sc.nextInt();

        // Menú opciones con 'switch'.
        switch (opcion) {
            case 1:
                escribirFileWriter(null);
                break;
            case 2:
                escribirBufferedWriter(null);
                break;
            case 3:
                escribirPrintWriter(null);
                break;
            default:
                break;
        }

        sc.close();
    }

    // Método para escribir con FileWriter.
    public static boolean escribirFileWriter(String cadena) {

        try (FileWriter fw = new FileWriter("src\\Extra\\Crear_y_leer_ficheros_basico\\archivo.txt");
            Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Escribe lo que quieras: ");
            cadena = sc.next();

            fw.write(cadena);
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return true;
    }

    // Método para escribir con BufferedWriter.
    public static boolean escribirBufferedWriter(String cadena) {

        try (BufferedWriter br = new BufferedWriter(new FileWriter("src\\Extra\\Crear_y_leer_ficheros_basico\\archivo.txt"));
            Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Escribe lo que quieras: ");
            cadena = sc.next();

            br.write(cadena);
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return true;

    }

    // Método para escribir con PrintWriter.
    public static boolean escribirPrintWriter(String cadena) {

        try (PrintWriter pw = new PrintWriter("src\\Extra\\Crear_y_leer_ficheros_basico\\archivo.txt");
            Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Escribe lo que quieras: ");
            cadena = sc.next();

            pw.write(cadena);
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return true;
    }
}
