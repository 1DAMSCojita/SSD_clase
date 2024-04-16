package Comparator;

// Importación de librerías.
import java.util.*;

public class TestCoche {
    public static void main(String[] args) {

        // Declaración de variables.
        int opcion;

        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);
        
        // Creamos una instancia de la clase 'FabricaDeCoches'.
        FabricaDeCoches fdc = new FabricaDeCoches();

        // Añadimos coches a la colección usando los métodos.
        fdc.añadirCoche(new Coche("Toyota", "Corolla", 2022, 20.000));
        fdc.añadirCoche(new Coche("BMW", "Serie 3", 2023, 40.000));
        fdc.añadirCoche(new Coche("Ford", "Mustang", 2021, 35.000));
        fdc.añadirCoche(new Coche("Tesla", "Modelo S", 2024, 80.000));

        // Presentamos el programa.
        // Creamos una estructura 'try-catch'.
        // Intentará ejecutar el bloque del menú y en caso de que haya una opción inválida agarrará la excepción.
        try {
            System.out.println("Bienvenido al programa.");
            do {
                System.out.println("Elije una ordenación específica para los coches (escribe '0' para detener el programa):");
                System.out.println("1. Ordenar por marca.");
                System.out.println("2. Ordenar por modelo.");
                System.out.println("3. Ordenar por año de creación.");
                System.out.println("4. Ordenar por precio.");
                opcion = sc.nextInt();
                // Creamos una estructura 'switch'.
                // Irá manejando las opciones de ordenación.
                switch (opcion) {
                    case 1:
                        System.out.println("------------------------- ORDENACIÓN POR MARCA -------------------------");
                        Collections.sort(fdc.getCoches(), new Coche.ComparaMarca()); // Ordenamos la colección con el método 'sort()'. Llamamos al getter del ArrayList de coches y implementamos el comparador específico.
                        for (Coche coche : fdc.getCoches()) {
                            System.out.println(coche.toString());
                        }
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("\n------------------------- ORDENACIÓN POR MODELO -------------------------");
                        Collections.sort(fdc.getCoches(), new Coche.ComparaModelo()); // Ordenamos la colección con el método 'sort()'. Llamamos al getter del ArrayList de coches y implementamos el comparador específico.
                        for (Coche coche : fdc.getCoches()) {
                            System.out.println(coche.toString());
                        }
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("\n------------------------- ORDENACIÓN POR AÑO DE CREACIÓN -------------------------");
                        Collections.sort(fdc.getCoches(), new Coche.ComparaAño()); // Ordenamos la colección con el método 'sort()'. Llamamos al getter del ArrayList de coches y implementamos el comparador específico.
                        for (Coche coche : fdc.getCoches()) {
                            System.out.println(coche.toString());
                        }
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("\n------------------------- ORDENACIÓN POR PRECIO -------------------------");
                        Collections.sort(fdc.getCoches(), new Coche.ComparaPrecio()); // Ordenamos la colección con el método 'sort()'. Llamamos al getter del ArrayList de coches y implementamos el comparador específico.
                        for (Coche coche : fdc.getCoches()) {
                            System.out.println(coche.toString());
                        }
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println();
                    default:
                        break;
                }
            } while (opcion != 0);   
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        } finally {
            sc.close(); // Cerramos escáner.
        }
    }
}
