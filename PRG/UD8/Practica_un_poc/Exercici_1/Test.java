package Practica_un_poc.Exercici_1;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        // Declaración de variables.
        String texto = "";
        String fichero;

        // Declaración de BufferedReader. El FileReader se declarará y se usará después.
        BufferedReader br = null;

        // Declaración de escáner.
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Escribe el nombre de un fichero: ");
            fichero = sc.nextLine();
            
            File f = new File(fichero);
            if (f.exists()) {
                FileReader fr = new FileReader("src\\intro\\libros" + f);
                br = new BufferedReader(fr);
                String linea = br.readLine();

                while (linea != null) {
                    texto += linea + "\n";
                    linea = br.readLine();
                }
                System.out.println(texto);
            } else if (!f.exists() || fichero == null){
                System.out.println("O no has puesto nada o no existe el archivo que has especificado. Se usará 'prova.txt' por defecto.");
                fichero = "src\\intro\\lectura\\prova.txt";           
                FileReader fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                String linea = br.readLine();

                while (linea != null) {
                    texto += linea + "\n";
                    linea = br.readLine();
                }
                System.out.println(texto);
            } 
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se ha encontrado el fichero: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
