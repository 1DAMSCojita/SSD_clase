package Intro.lectura;

// InputStreamReader

// BufferedReader

import java.io.*;

public class Test {
    public static void main(String[] args) {
        
        String texto = "";
        // Reader

        BufferedReader bf = null;
        // FileReader
        FileReader fr = null;
        try {
            fr = new FileReader("src\\intro\\lectura\\prova.txt");
            bf = new BufferedReader(fr);
            String linea = bf.readLine();

            while (linea != null) {
                texto += linea + "\n";
                linea = bf.readLine();
            }

            // read()
            // close()

        } catch (FileNotFoundException e) {
            System.out.println("No se ha especificado la ruta del archivo o error inesperado." + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error genérico." + e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    bf.close();                
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(texto);
    }
}
