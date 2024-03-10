package Extra.Mayusculas_y_minusculas_variacion;

import java.io.*;
import java.util.*;

public class Test {
    
    /*
     * Pedir ruta de fichero y un texto que se quiera escribir, irá variando de mayúsculas a minúsculas.
     */
    public static void main(String[] args) {
        
        // Declaración de variables.
        String ruta;
        String texto;

        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);

        // Pedir la ruta y luego escanearla.
        System.out.println("Introduce la ruta del fichero: ");
        ruta = sc.next();

        // Pedir el texto y luego escanearlo.
        System.out.println("Ahora, introduce el texto que quieres enviar: ");
        texto = sc.next();

        escribirFichero(ruta, texto); // Llamar al método 'escribirFichero()'.
 
        mostrarFicheroMay(ruta); // Llamar al método 'mostrarFicheroMay()'.

        sc.close(); // Cerrar escáner.
    }
 
    // Método para escribir en el fichero.
    public static void escribirFichero(String fichero, String texto) {

        try(FileWriter fw = new FileWriter(fichero)){ 
 
            // Escribimos el texto en el fichero.
            fw.write(texto);
 
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
 
    // Método para mostrar el texto en mayúscula.
    public static void mostrarFicheroMay(String fichero) {

        try(FileReader fr = new FileReader(fichero)) {
 
            int valor = fr.read();
 
            while (valor !=- 1) {
 
                // Sólo cambiará el caracter si es una minúscula o una mayúscula.
                char caracter = (char)valor;
                if(caracter >= 97 && caracter <= 122){
                    caracter -= 32;
                }else if(caracter >= 65 && caracter <= 90){
                    caracter += 32;
                }
                System.out.print(caracter);
                valor = fr.read();
            }
 
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
 
}
