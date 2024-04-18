package Extra.PlantillaBruno;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Map<List<Persona>, Integer> mapaprueba = new HashMap<>();

        personas.addAll(Funciones.leerArchivoTexto("prueba.txt"));

        mapaprueba.put(personas, 10);
        // Imprimir las personas
        Iterator<Persona> iter = personas.iterator();
        while (iter.hasNext()) {
            Persona perso = iter.next();
            System.out.println("Nombre: " + perso.nombre + " edad: " + perso.edad);
        }
        for (Map.Entry<List<Persona>, Integer> entry : mapaprueba.entrySet()) {
            List<Persona> lista = entry.getKey();
            for (Persona persona : lista) {
                System.out.println(persona);
            }
            System.out.println("Numero que representa el value: " + entry.getValue());
        }

    }

}
