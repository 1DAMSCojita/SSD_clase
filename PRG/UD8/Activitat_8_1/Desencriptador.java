package Activitat_8_1;

import java.io.*;

public class Desencriptador {
    public static void main(String[] args) {

        // Declaración de BufferedReader.
        BufferedReader br = null;

        // Creamos una estructura 'try-catch'.
        // Verificará si puede realizar el bloque abajo creado y si encuentra error verifica si es porque el archivo no se ha encontrado
        // o porque haya un error genérico.
        try {
            // Declaramos que el BufferedReader seguirá la ruta del archivo a nuestro codec (para simplificar la explicación).
            br = new BufferedReader(new FileReader("src\\Activitat_8_1\\codec.txt"));
            String alfabeto = br.readLine(); // Declaramos una nueva variable leeyendo la primera línea que es el alfabeto ordinario.
            String aCodificado = br.readLine(); // Declaramos una nueva variable leeyendo la segunda línea que es el alfabeto codificado. 
            br.close();

            // Declaramos que el BufferedReader seguirá la ruta del archivo a nuestro mensaje secreto (para simplificar la explicación).
            br = new BufferedReader(new FileReader("src\\Activitat_8_1\\secreto.txt"));

            int x; // Declaramos la variable 'x'.
            while ((x = br.read()) != -1) {
                char caracter = (char) x; // Convertimos el valor leído a un carácter.
                // Buscamos la posición del carácter en el alfabeto codificado usando el método 'indexOf'.
                int i = aCodificado.indexOf(caracter);
                if (i != -1) {
                    // Si encontramos el carácter en el alfabeto codificado, obtenemos su equivalente original.
                    char caracterOriginal = alfabeto.charAt(i);
                    // Mostramos el carácter original por consola.
                    System.out.print(caracterOriginal);
                } else {
                    // Si el carácter no está en el alfabeto codificado, lo mostramos tal como está en la consola.
                    System.out.print(caracter);
                }
            }
            System.out.println(); // Imprimimos una nueva línea al final para una mejor presentación.
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura: " + e.getMessage());
        } finally {
            // Creamos una estructura de control 'if'.
            // Por si acaso cerraremos aquí el BufferedReader.
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el fichero: " + e.getMessage());
                }
            }
        }
    }
}
