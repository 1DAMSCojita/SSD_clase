package Examen_23_24;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        Map<Integer, Jugador> plantilla = new HashMap<>();

        plantilla = TratamientoFicheros.leePlantilla();

        MetodosAuxiliares.menu(plantilla);

        TratamientoFicheros.guardaPlantilla(plantilla);

    }
}
