package Practica_un_poc.Exercici_2;

import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        
        try (FileWriter fw = new FileWriter("F:\\CFGS_DAM\\PRG\\UD8\\Practica_un_poc\\Exercici_2\\dades.txt");
            Scanner sc = new Scanner(System.in)) {
           
            System.out.println("Escribe tu nombre: ");
            String nombre = sc.next();

            System.out.println("Ahora, escribe tu edad: ");
            int edad = sc.nextInt();

            fw.write(nombre + " " + edad);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
