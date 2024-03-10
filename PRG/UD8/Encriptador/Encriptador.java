package Encriptador;

// Importación de librerías.
import java.io.*;

public class Encriptador {
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

            // Declaramos que el BufferedReader seguirá la ruta del archivo a nuestro mensaje (para simplificar la explicación).
            br = new BufferedReader(new FileReader("src\\Activitat_8_1\\mensaje.txt"));

            // Creamos un BufferedWriter que creará un archivo en la ruta que le especifiquemos.
            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Activitat_8_1\\secreto.txt"));

            int x; // Declaramos la variable 'x'.
            while ((x = br.read()) != -1) {
                // Leemos el siguiente carácter del archivo y verificamos si llegamos al final del archivo (-1).
                // Asignamos el valor leído a la variable 'x'.
                char caracter = (char) x; // Convertimos el valor leído a un carácter utilizando un casting explícito.
                // Buscamos la posición del carácter en el alfabeto original.
                // Si el carácter no está en el alfabeto original, 'indexOf' devolverá -1.
                int i = alfabeto.indexOf(caracter); 
                if (i != -1) {
                    // Si encontramos el carácter en el alfabeto original, obtenemos su equivalente codificado.
                    // Usamos la posición 'i' en el alfabeto original para obtener el carácter correspondiente en el alfabeto codificado.
                    char caracterCodificado = aCodificado.charAt(i);
                    // Escribimos el carácter codificado en el archivo de salida.
                    bw.write(caracterCodificado);
                } else {
                    // Si el carácter no está en el alfabeto original, lo escribimos sin codificar.
                    bw.write(caracter);
                }
            }
            bw.close(); // Cerramos el BufferedWriter.
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
