package Extra.Crear_y_leer_ficheros_basico;

import java.util.*;
import java.io.*;

public class TestLectura {
    public static void main(String[] args) {
        
        int opcion;

        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);

        // Presentación del programa junto al menú.
        System.out.println("_________________________________________________________________________\n");
        System.out.println("Bienvenido al programa. Aquí podrás gestionar la lectura de ficheros.");
        System.out.println("Elige como quieres leer el fichero: \n");
        System.out.println("1. Leer un fichero usando FileReader.");
        System.out.println("2. Leer un fichero usando BufferedReader.");
        System.out.println("_________________________________________________________________________\n");
        opcion = sc.nextInt();

        // Menú opciones con 'switch'.
        switch (opcion) {
            case 1:
                leerConFileReader(opcion);
                break;
            case 2:
                leerConBufferedReader(opcion);
                break;
            default:
                break;
        }

        sc.close();
    }

    public static boolean leerConFileReader(int c) {

        String contenido = "";

        try (FileReader fr = new FileReader("src\\Extra\\Crear_y_leer_ficheros_basico\\archivo.txt")) {

            c = fr.read();
            while (c != -1) {
                contenido += (char)c;
                c = fr.read();
            }

            System.out.println(contenido);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return true;
    }

    public static boolean leerConBufferedReader(int c) {

        String contenido = "";

        try (BufferedReader br = new BufferedReader(new FileReader("src\\Extra\\Crear_y_leer_ficheros_basico\\archivo.txt"))) {

            c = br.read();
            while (c != -1) {
                contenido += (char)c;
                c = br.read();
            }

            System.out.println(contenido);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        return true;
    }
}
