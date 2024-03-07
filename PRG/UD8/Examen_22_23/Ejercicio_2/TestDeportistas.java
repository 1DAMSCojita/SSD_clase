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
}
