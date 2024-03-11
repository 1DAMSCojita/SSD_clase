package Practica_un_poc.Exercici_3;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
        // Declaración de variables.
        String contenido = "";
        String contenidodos = "";
        int c;
        int d;

        try (FileReader fr = new FileReader("F:\\CFGS_DAM\\PRG\\UD8\\Practica_un_poc\\Exercici_3\\llista1.txt");
            FileReader fr2 = new FileReader("F:\\CFGS_DAM\\PRG\\UD8\\Practica_un_poc\\Exercici_3\\llista2.txt")){
            
            // Leemos los ficheros.
            c = fr.read();
            d = fr2.read();

            // Creamos un bucle 'while' que irá leyendo el fichero línea por línea. Se convierte al final la variable leída en un char para que se pueda mostrar.
            // Ambos contenidos en el mismo bucle.
            while (c != -1 && d != -1) {
                contenido += (char)c;
                c = fr.read();
                contenidodos += (char)d;
                d = fr2.read();
            }
             
            try (FileWriter fw = new FileWriter("F:\\CFGS_DAM\\PRG\\UD8\\Practica_un_poc\\Exercici_3\\listaUnica.txt")) {
                
                String[] contenidos = {contenido, contenidodos}; // Creamos un array con ambos contenidos anteriores almacenados.
                Arrays.sort(contenidos); // Lo ordenamos.

                fw.write(Arrays.toString(contenidos)); // Escribimos el contenido en el fichero.

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
