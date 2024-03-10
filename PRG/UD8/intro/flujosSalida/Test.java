package Intro.flujosSalida;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        // OutputStreamWriter
        // FileWriter

        // FileWritter (String nombreArchivo)
        // FileWritter (String nombreArchivo, boolean append)

        // BufferedWriter
        // Métodos:
        /*
         * - void write(int caracter)
         * - void write (String cadena)
         * - void newLine()
         * - void flush()
         * - void close()
        */

        // IOException

        BufferedWriter bw = null;

        try {

            bw = new BufferedWriter(new FileWriter("src\\intro\\libros\\nose.txt"));

            //String cadena = "Ayuda me quiero morir"; // Primera línea.
            /* 
            for (int i = 0; i < cadena.length(); i++) {
                // Escribimos carácter a carácter.
                bw.write(cadena.charAt(i));
            }
            bw.flush();
            */
            /*
            cadena = "Cuatro euros por un paquete"; // Segunda línea.
            bw.newLine();
            
            // Escribimos con una única instrucción.
            bw.write(cadena);
            sc.close();
            */

            Scanner sc = new Scanner(System.in);

            String cadena;

            do {
                System.out.println("Escribe lo que quieras (si quieres terminar, pon 'fin') ");
                cadena = sc.nextLine();

                if (!cadena.equalsIgnoreCase("fin")) {
                    bw.write(cadena);
                    bw.newLine();
                    bw.flush();
                }
            } while (!cadena.equalsIgnoreCase("fin"));
            sc.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    // Vacíamos el buffer y se escriba el fichero.
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

    }
}
