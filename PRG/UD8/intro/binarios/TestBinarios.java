package intro.binarios;

import java.io.*;

public class TestBinarios {
    public static void main(String[] args) {
        
        // Clases básicas: bytes individuales
        // FileOutputStream
        // FileInputStream

        // Necesitamos trabajar con conjuntos de bytes
        // Procesos de: serialización y deserialización

        // Para ello utilizamos flujos "envoltorio":
        // ObjectOutputStream
        // ObjectInputStream
        // creados a partir de FileOutputStream y FileInputStream.

        // Métodos de ObjectOutputStream
        // void writeBoolean(boolean b): escribe un valor booleano en el flujo.
        // void writeChar(char c): escribe un valor char que ocupa los dos bytes menos significativos del valor entero que se le pase por parámetro.
        // void writeInt(int i): escribe un valor entero en el flujo.
        // void writeLong(long l): escribe un valor largo en el flujo.
        // void writeDouble(double d): escribe un valor double en el flujo.
        // void writeObject(Object o): escribe un objeto SERIALIZABLE.

        int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        ObjectOutputStream flujosSalida = null;

        try {
            
            flujosSalida = new ObjectOutputStream(new FileOutputStream("datos.dat"));

            for (int n : t) {
                flujosSalida.writeObject(n);
            }

        } catch (IOException e) {
            e.getMessage();
        } finally {
            if (flujosSalida != null) {
                try {
                    flujosSalida.close();
                } catch (IOException e) {
                    System.out.println("Error al intentar cerrar el flujo de salida.\n" + e.getMessage());
                }                
            }
        }
    }
}
