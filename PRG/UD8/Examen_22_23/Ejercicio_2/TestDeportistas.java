package Examen_22_23.Ejercicio_2;

import java.io.*;
import java.util.*;

public class TestDeportistas {
    public static void main(String[] args) {
        
        FileInputStream in = null;

        try {
            in = new FileInputStream("src\\Examen_22_23\\Ejercicio_2\\deportistas.txt");
            Scanner sc = new Scanner(in).useLocale(Locale.US);

            sc.nextLine();

            int edad;
            double peso, estatura;
            int contador = 0;
            double sumaEdades = 0.0;
            double sumaEstaturas = 0.0;
            double sumaPesos = 0.0;
            String archivoEdad = "src\\Examen_22_23\\Ejercicio_3\\edades.txt";
            String archivoPeso = "src\\Examen_22_23\\Ejercicio_3\\pesos.txt";
            String archivoEstaturas = "src\\Examen_22_23\\Ejercicio_3\\estaturas.txt";

            while (sc.hasNext()) {
                String nombre = "";
                while (!sc.hasNextInt()) {
                    nombre += sc.next() + " ";
                }
                nombre = nombre.trim();
                contador++;
                edad = sc.nextInt();
                sumaEdades += edad;
                peso = sc.nextDouble();
                sumaPesos += peso;
                estatura = sc.nextDouble();
                sumaEstaturas += estatura;
                escribirArchivoEdad(archivoEdad, nombre, edad);
                escribirArchivoResto(archivoPeso, nombre, peso);
                escribirArchivoResto(archivoEstaturas, nombre, estatura);

                System.out.println("Nombre: " + nombre + "\tEdad: " + edad + "\tPeso: " + peso + "\tEstatura: " + estatura);
            }
            System.out.println("Media edades: " + sumaEdades/contador);
            System.out.println("Media pesos: " + sumaPesos/contador);
            System.out.println("Media estaturas: " + sumaEstaturas/contador);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (@SuppressWarnings("hiding") IOException e) {
            System.out.println("Error genérico:" + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void leerArchivo(String rutaArchivo){
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(rutaArchivo));
            System.out.println(br);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void escribirArchivoEdad(String rutaArchivo, String nombre, int edad){
        try (BufferedWriter br = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            br.write(nombre + " " + edad + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void escribirArchivoResto(String rutaArchivo, String nombre, double otro){
        try (BufferedWriter br = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            br.write(nombre + " " + otro + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}