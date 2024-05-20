package funcionesAuxiliares;

import java.io.*;

public class GestionFicheros {
    @SuppressWarnings("unchecked")
    public static <T> T leerFicheroBinario(String fichero) {
        T cadenas = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            cadenas = (T) ois.readObject();
        } catch (EOFException e) {
            // Se acaba el fichero.
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error en el acceso del fichero.");
        }
        return cadenas;
    }
    
    public static <T> void escribeFicheroBinario(T cadenas, String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(cadenas);
        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado.");
        }
    }

}