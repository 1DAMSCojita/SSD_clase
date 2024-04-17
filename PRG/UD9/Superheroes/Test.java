package Activitat_9_11;

// Importación de librerías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Declaración de ArrayLists.
        List<Personaje> personajes = new ArrayList<>();

        // Añadimos personajes al ArrayList.
        personajes.add(new Personaje("Peter Parker", "Spiderman"));
        personajes.add(new Personaje("Logan", "Wolverine"));
        personajes.add(new Personaje("Bruce Banner", "Hulk"));

        // Declaración de mapa.
        Map<Personaje, List<Superpoder>> mapasuperpoderes = new HashMap<>();

        // Añadimos superpoderes al mapa. En la parte de 'Personajes' agarramos al personaje de la posición y luego convertimos el ArrayList en el conjunto de List para añadir el superpoder.
        mapasuperpoderes.put(personajes.get(0), Arrays.asList(new Superpoder("Sentido arácnido", 7)));
        mapasuperpoderes.put(personajes.get(1), Arrays.asList(new Superpoder("Regeneración", 8)));
        mapasuperpoderes.put(personajes.get(2), Arrays.asList(new Superpoder("Resistencia psíquica", 6)));
        
        // Llamamos a los métodos pertinentes.
        testIteratorPersonajes(personajes);
        mostrarSuperpoderes(mapasuperpoderes);
        ordenarAlias(personajes);
        GestionFicheros(personajes);

    }

    // Creamos un método que usará un iterator para mostrar los personajes.
    public static void testIteratorPersonajes(List<Personaje> personajes) {
        System.out.println("-------------- PERSONAJES --------------");
        Collections.sort(personajes); // Ordenamos los personajes, accederá al 'Comparable' de 'Personaje' y comparará alfabéticamente.
        Iterator<Personaje> it = personajes.iterator(); // Creamos el iterator de 'personaje'.
        // Creamos un bucle 'while'.
        // En resumen lo que hará será iterar sobre la colección de personajes.
        while (it.hasNext()) {
            System.out.println(it.next()); // Obtenemos los personajes.
        }
        System.out.println("----------------------------------------");
    }

    // Creamos un método que mostrará los superpoderes asociados a los perosnajes.
    public static void mostrarSuperpoderes(Map<Personaje, List<Superpoder>> mapasuperpoderes) {
        System.out.println("\n----------------------------------- SUPERPODERES -----------------------------------");
        // Creamos un bucle 'for-each'.
        // Recorrerá cada elemento del Mapa de personajes y lo mostrará.
        for (Map.Entry<Personaje, List<Superpoder>> elemento : mapasuperpoderes.entrySet()) {
            System.out.println(elemento);
        }
        System.out.println("------------------------------------------------------------------------------------");
    }

    // Creamos un método que ordenará los personajes por alias.
    public static void ordenarAlias(List<Personaje> personajes) {
        System.out.println("\n---------- ORDENACIÓN DE PERSONAJES POR ALIAS ----------");
        Collections.sort(personajes, new ComparaAlias()); // Implementamos el comparador creado por la clase 'Comparator' para ordenar los alias.
        // Creamos un bucle 'for-each'.
        // Mostrará cada personaje.
        for (Personaje personaje : personajes) {
            System.out.println(personaje.toString());
        }
        System.out.println("--------------------------------------------------------");
    }

    // Creamos un método que gestionará los ficheros en el Test.
    public static void GestionFicheros(List<Personaje> personajes) {
        Funciones.escribirPersonajes(personajes, "personajes.txt"); // Llamamos al método de 'escribirPersonajes' de la clase 'Funciones' para escribir los personajes en el fichero.
        // Creamos una estructura 'try-catch'.
        // Intentará llamar al método de 'leerPersonajes' de la clase 'Funciones', en caso de que no lo consiga, capturará la excepción.
        try {
            Funciones.leerPersonajes("personajes.txt"); // Leemos los persoajes.
        } catch (Exception e) {
            System.out.println("Error al intentar leer el fichero: " + e.getMessage());
        }
    }


}
