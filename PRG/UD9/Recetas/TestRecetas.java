package Recetas;

// Importación de librerías.
import java.util.*;

public class TestRecetas {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int opcion;

        @SuppressWarnings("resource")
        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);

        // Presentación del programa junto al menú.
        System.out.println("\n---------- SISTEMA DE GESTIÓN DE RECETAS CULINARIAS ----------");
        try {
            do {
                System.out.println("Elija una opción:");
                System.out.println("1. Crear Ingrediente.");
                System.out.println("2. Gestionar los Ingredientes.");
                System.out.println("3. Crear Receta.");
                System.out.println("4. Listados.");
                System.out.println("5. Salir.");
                System.out.println("--------------------------------------------------------------");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                    System.out.println("---------- HA ENTRADO EN LA OPCIÓN DE LISTADOS ----------");
                    do {
                        System.out.println("Elija una opción:");
                        System.out.println("1. Listado de Ingredientes (alfabético).");
                        System.out.println("2. Listado de Ingredientes (por precio por persona).");
                        System.out.println("3. Listado de Recetas (alfabético).");
                        System.out.println("4. Listado de Recetas (por número de comensales).");
                        System.out.println("5. Listado de Recetas (por precio).");
                        System.out.println("6. Listado de Recetas (por número de ingredientes).");
                        System.out.println("7. Salir.");
                        System.out.println("--------------------------------------------------------------");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            default:
                                break;
                        }
                    } while (opcion != 7);
                    default:
                        break;
                }
            } while (opcion != 4 && opcion != 3);
        } catch (Exception e) {
            System.out.println("Error. Introduzca una opción válida y vuelva a intentarlo: " + e.getMessage());
        }
    }

    public static void crearIngrediente(List<Ingrediente> ingredientes) {

        // 

        System.out.println("---------- HA ENTRADO EN LA OPCIÓN DE CREACIÓN DE UN INGREDIENTE ----------");
        

    }

}
