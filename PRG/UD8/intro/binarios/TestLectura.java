package intro.binarios;

import java.io.*;
import java.util.Arrays;

public class TestLectura {
    public static void main(String[] args) {
        
        try (ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("datos.dat"))) {

            int[] t = new int[10];

             
            for (int i = 0; i < t.length; i++) {
                t[i] = (int) flujoEntrada.readObject();
            }
            
            System.out.println(Arrays.toString(t));

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error de lectura o conversión.\n" + e.getMessage());
        }

    }
}
