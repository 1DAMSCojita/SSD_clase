package intro.binarios;

import java.io.*;

public class GestionFicherosBinarios {

    public static void escribeFicheroStringToObject(String cadena, String fichero) {

        try(ObjectOutputStream oosAmogoos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oosAmogoos.writeObject(cadena);
        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    public static String leerFicheroObjectToString(String fichero) {

        String cadena = "";
        
        try(ObjectInputStream oisAmoogis = new ObjectInputStream(new FileInputStream(fichero))) {
            cadena = (String)oisAmoogis.readObject();
        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return cadena;
    }

}
