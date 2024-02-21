package intro.binarios;

import java.io.FileInputStream;
import java.io.*;
import java.io.ObjectInputStream;

public class TestLectura {
    public static void main(String[] args) {
        
        try (ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("datos.dat"))) {

            int[] t = new int[10];

            for (int i = 0; i < t.length; i++) {
                t[i] = flujoEntrada.readInt();
            }

        } catch (IOException e) {
            System.out.println("Error de lectura.\n" + e);
        }

    }
}
