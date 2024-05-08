package Examen_23_24;

import java.io.*;
import java.util.*;

public class TratamientoFicheros {

    public static Map<Integer, Jugador> leePlantilla() {

        Map<Integer, Jugador> plantilla = new HashMap<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\Examen_23_24\\plantilla.dat"))) {
            while (true) {
                Integer dorsal = ois.readInt();
                Jugador jugador = (Jugador) ois.readObject();

                plantilla.put(dorsal, jugador);
            }
        } catch (EOFException e) {
            // Ha llegado al final del fichero.
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No hay ninguna plantilla creada todavía.");
        }

        return plantilla;
    }

    public static void guardaPlantilla(Map<Integer, Jugador> plantilla) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\Examen_23_24\\plantilla.dat"))) {
            for (Map.Entry<Integer, Jugador> p : plantilla.entrySet()) {
                oos.writeInt(p.getKey());
                oos.writeObject(p.getValue());
            }
        } catch (IOException e) {
            System.out.println("No se ha podido guardar el fichero. \n");
        }
    }

}
