package Examen_22_23.Ejercicio_3;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(new File("src\\Examen_22_23\\Ejercicio_2\\deportistas.txt"))) {

            PrintWriter edadesWriter = new PrintWriter("src\\Examen_22_23\\Ejercicio_3\\edades.txt");
            PrintWriter pesosWriter = new PrintWriter("src\\Examen_22_23\\Ejercicio_3\\pesos.txt");
            PrintWriter estaturasWriter = new PrintWriter("src\\Examen_22_23\\Ejercicio_3\\estaturas.txt");

            sc.nextLine();

            int edad = 0;

            while (sc.hasNext()) {
                String nombre = "";
                while (!sc.hasNextInt()) {
                    nombre = sc.next();
                    break;
                }
                nombre = nombre.trim();
                while (sc.hasNextInt()) {
                    edad = sc.nextInt();
                    break;
                }
                
                edadesWriter.println(nombre + " " + edad);

            }
            edadesWriter.close();
            pesosWriter.close();
            estaturasWriter.close();
            
        } catch (IOException e) {
            System.out.println("Error genérico: " + e.getMessage());
        }

    }
}
