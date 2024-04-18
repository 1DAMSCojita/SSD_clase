package Extra.Examen_22_23_Bruno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Funciones {
    public static List<Double> leerArchivo(String archivo){ // Creamos el metodo leerArchivo
        List<Double> doulist = new ArrayList<>(); // Creamos un arrayList de tipo double
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){ // Leemos el archivo
            String linea; // Creamos linea
            while ((linea = br.readLine())!= null) { // Le añadimos la informacion del archivo por lineas
                double doub = Double.parseDouble(linea); // Transformamos el String a double
                doulist.add(doub); // Añadimos al arrayList

            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return doulist; // Devolvemos doulist
    }
    public static void escribirArchivo(String archivo, List<Double> listaDoubles){ // Creamos el metodo escribirArchivo
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))){ // Buscamos el archivo o lo creamos
            for (Double gemelos : listaDoubles) { // Hacemos un foreach del contenido del archivo
                String gemeloTexto = Double.toString(gemelos); // Pasamos el contenido a string
                bw.write(gemeloTexto); // Escribimos el texto
                bw.newLine();  // Esto añade una nueva línea después de cada persona
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int calcularEdad(int duracion, double velocidad){ // Creamos el metodo calcularEdad
        return (int) (duracion / Math.sqrt(1- velocidad)); // Devolvemos el resultado en int de dividir duracion con el resultado de la raiz de 1 -velocidad
    }
}
