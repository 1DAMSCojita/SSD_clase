package Examen_22_23.Ejercicio_1;

import java.io.*;
import java.util.*;

public class TestFusion {
    /*
     * El programa funciona pero la ruta del archivo obviamente es incorrecta porque se hizo en una ruta específica previamente.
     */
    public static void main(String[] args) {
        
        // Definimos los nombres de los ficheros binarios.
        String fichero1 = "src\\Examen_22_23\\Ejercicio_1\\numeros.dat", fichero2 = "src\\Examen_22_23\\Ejercicio_1\\numeros2.dat";

        // Creamos dos arrays de Integer para poder generar las dos listas a fusionar.
        Integer[] l1 = {1, 2, 3, 4, 5};
        Integer[] l2 = {6, 7, 8, 9, 0};

        // Creamos los ficheros con las listas de números.
        if(escribirFichero(fichero1, l1) && escribirFichero(fichero2, l2)) {
            // Fusionamos los ficheros y mostramos el resultado.
            // System.out.println(Arrays.toString(fusionar(fichero1, fichero2)));
            escribirFichero("src\\Examen_22_23\\Ejercicio_1\\fusion.dat", fusionar(fichero1, fichero2));
            System.out.println(Arrays.toString(leerFichero("src\\Examen_22_23\\Ejercicio_1\\fusion.dat")));
        } else {
            System.out.println("No se ha fusionado correctamente los ficheros porque no hay.");
        }

    }

    // Método que recibe dos ficheros binarios que contienen dos listas de objetos Integer y devuelve un array ordenado con los elementos de los dos ficheros.
    static Integer[] fusionar(String fichero1, String fichero2) {
      
        Integer[] lista1 = null, lista2 = null;

        lista1 = leerFichero(fichero1);
        lista2 = leerFichero(fichero2);

        /*
         * Aquí se crea un nuevo arreglo lista1 con una longitud igual a la suma de las longitudes de lista1 y lista2. Los elementos de lista1 se copian al nuevo arreglo.
         */
        lista1 = Arrays.copyOf(lista1, lista1.length + lista2.length);

        /*
         * Se copian los elementos de lista2 al final de lista1. La copia comienza desde el índice 0 en lista2 y desde el índice lista1.length - lista2.length en lista1.
         */
        System.arraycopy(lista2, 0, lista1, lista1.length - lista2.length, lista2.length);

        Arrays.sort(lista1);

        return lista1;
    }
    
    // Escribimos dos ficheros binarios con listas de tipos Integer.
    static boolean escribirFichero(String fichero, Integer[] lista) {
        
        boolean resultado = false;

        // Creamos un flujo de salida y escribimos, como objeto, un array en el fichero.
        try(ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(fichero))) {
            // Escribimos los ficheros.
            oos1.writeObject(lista);
            // No importa cerrarlos porque hemos usado "resources".
            // Indicamos que todo ha ido bien.
            resultado = true; 
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }

        return resultado;
    }

    static Integer[] leerFichero(String fichero) {

        Integer[] lista = null;

        try (ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(fichero))) {
            lista = (Integer[])ois1.readObject(); // Convertimos el objeto en un 'Integer[]' para poder leerlo.
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error de tipo de clase:" + e);
        }
        
        return lista;
    }
}


    
