package intro.ejercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Nose {

    String texto = "";

    FileReader fr = null;
    BufferedReader bf = null;
    public void lecturaFileReader() {
        try {
            fr = new FileReader("src\\intro\\ejercicio\\fichero.txt");

        } catch (FileNotFoundException fe) {
            System.out.println("Ruta no especificada o error inesperado." + fe.getMessage());
        } catch (Exception e) {
            System.out.println("Error." + e.getMessage());
        }
        System.out.println(texto);
    }

    public void lecturaBuffReader() {
        try {
            fr = new FileReader("src\\intro\\ejercicio\\fichero.txt");
            bf = new BufferedReader(fr);
            String linea = "";
            while (linea != null) {
                texto += linea;
            }
        } catch (FileNotFoundException fe) {
            System.out.println("Ruta no especificada o error inesperado." + fe.getMessage());
        } catch (Exception e) {
            System.out.println("Error." + e.getMessage());
        }
        System.out.println(texto);
    }
}
