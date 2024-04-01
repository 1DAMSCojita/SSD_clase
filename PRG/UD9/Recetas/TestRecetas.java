package Recetas;

// Importación de librerías.
import java.util.*;

public class TestRecetas {

    private static Scanner sc = new Scanner (System.in); // Creamos un escáner privado y estático para poder usarlo en todos los métodos (incluido main).

    public static void main(String[] args) {
        
        // Declaración de variables.
        int opcion;

        // Creación de ArrayList.
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();

        // Presentación del programa junto al menú.
        System.out.println("\n---------- SISTEMA DE GESTIÓN DE RECETAS CULINARIAS ----------");
        // Creamos una estructura 'try-catch'.
        // Intentará ejecutar el bucle 'do-while' próximo y en caso de error lo pillará y lo mostrará por consola.
        try {
            // Creamos un bucle 'do-while'.
            // Repetirá el menú de opciones mientras sea diferente a 4 o a 3.
            do {
                System.out.println("Elija una opción:");
                System.out.println("1. Agregar Ingrediente.");
                System.out.println("2. Eliminar Ingredientes.");
                System.out.println("3. Modificar Ingredientes.");
                System.out.println("4. Crear Receta.");
                System.out.println("5. Listados.");
                System.out.println("6. Salir.");
                System.out.println("--------------------------------------------------------------");
                opcion = sc.nextInt();
                // Creamos una estructura de control 'switch'.
                // Irá manejando y ejecutando cada punto del menú.
                switch (opcion) {
                    case 1:
                        agregarIngrediente(ingredientes);
                        break;
                    case 2:
                        for (Ingrediente ingrediente : ingredientes) {
                            System.out.println(ingrediente.toString());
                        }
                        eliminarIngredientes(ingredientes);
                        break;
                    case 3:
                        for (Ingrediente ingrediente : ingredientes) {
                            System.out.println(ingrediente.toString());
                        }
                        modificarIngredientes(ingredientes);
                        break;
                    case 4:
                    System.out.println("---------- HA ENTRADO EN LA OPCIÓN DE LISTADOS ----------");
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
                    // Creamos otra estructura de control 'switch' para la opción de "Listados".
                    // Irá manejando y ejecutando cada punto de este submenú. 
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
                    case 5:
                        break;
                    default:
                        break;
                }
            } while (opcion != 5 && opcion != 6);
        } catch (Exception e) {
            System.out.println("Error. Introduzca una opción válida y vuelva a intentarlo: " + e.getMessage());
        } finally {
            sc.close(); // Cerramos escáner.
        }
    }

    // Creamos un método para agregar ingredientes.
    public static void agregarIngrediente(ArrayList<Ingrediente> ingredientes) {

        // Declaración de variables.
        String nombre;
        double precio_por_persona;

        // Presentación de la opción para agregar un ingrediente junto a la petición de datos. 
        System.out.println("---------- HA ENTRADO EN LA OPCIÓN PARA AGREGAR UN INGREDIENTE ----------");
        System.out.println("Introduzca el nombre del ingrediente: ");
        nombre = sc.next();
        System.out.println("Ahora, introduzca el precio por persona (no pongas puntos, solo comas): ");
        precio_por_persona = sc.nextDouble();

        // Creamos un nuevo objeto de 'Ingrediente'.
        Ingrediente nuevoIngrediente = new Ingrediente(nombre, precio_por_persona);

        ingredientes.add(nuevoIngrediente); // Añadimos el ingrediente dentro del ArrayList.

        System.out.println("Ingrediente creado con éxito.");
    }

    // Creamos un método para eliminar ingredientes.
    public static void eliminarIngredientes(ArrayList<Ingrediente> ingredientes) {

        // Declaración de variables.
        boolean encontrado = false;
        String nombre;

        // Presentación de la opción junto con la petición de eliminación.
        System.out.println("---------- HA ENTRADO EN LA OPCIÓN PARA ELIMINAR UN INGREDIENTE ----------");
        System.out.println("Introduzca el nombre del ingrediente que desee eliminar: ");
        nombre = sc.next();
        // Creamos un bucle 'for-each'.
        // Recorrerá el ArrayList de ingredientes para dar con el nombre.
        for (Ingrediente ingrediente : ingredientes) {
            // Creamos una estructura de control 'if'.
            // Si el nombre puesto coincide con el de la lista, se eliminará con el método 'remove()'.
            if (ingrediente.getNombre().equalsIgnoreCase(nombre)) {
                ingredientes.remove(ingrediente);
                System.out.println("Ingrediente eliminado con éxito.");
                encontrado = true; // Establecemos encontrado como 'true', así saber que lo hemos encontrado.
                break; // Salimos de la estructura.
            }
        }
        // Creamos una estructura de control 'if'.
        // En caso de que no se haya encontrado el ingrediente, el programa lo indicará.
        if (!encontrado) {
            System.out.println("No se encontró el ingrediente con ese nombre (está mal puesto o no existe).");
        }
    }

    // Creamos un método para modificar ingredientes.
    public static void modificarIngredientes(ArrayList<Ingrediente> ingredientes) {

        // Declaración de variables.
        boolean encontrado = false;
        String nombreIngrediente;
        String nombre;
        double precio;

        // Presentación de la opción junto con la petición de modificación.
        System.out.println("---------- HA ENTRADO EN LA OPCIÓN PARA MODIFICAR UN INGREDIENTE ----------");
        System.out.println("Introduzca el nombre del ingrediente que desee modificar: ");
        nombreIngrediente = sc.next();
        // Creamos un bucle 'for-each'.
        // Recorrerá el ArrayList de ingredientes para dar con el nombre.
        for (Ingrediente ingrediente : ingredientes) {
            // Creamos una estructura de control 'if'.
            // Si el nombre puesto coincide con el de la lista, se pedirá los nuevos datos a añadir.
            if (ingrediente.getNombre().equalsIgnoreCase(nombreIngrediente)) {
                encontrado = true; // Establecemos encontrado como 'true', así saber que lo hemos encontrado.
                System.out.println("Ingrese el nuevo nombre del ingrediente: ");
                nombre = sc.next();
                System.out.println("Ingrese el nuevo precio del ingrediente por persona: ");
                precio = sc.nextDouble();

                // Actualizamos los atributos del ArrayList de ingredientes.
                ingrediente.setNombre(nombre);
                ingrediente.setPrecio_por_persona(precio);

                System.out.println("Ingrediente modificado con éxito.");
                break; // Salimos de la estructura.
            }
        }
        // Creamos una estructura de control 'if'.
        // En caso de que no se haya encontrado el ingrediente, el programa lo indicará.
        if (!encontrado) {
            System.out.println("No se encontró el ingrediente con ese nombre (está mal puesto o no existe).");
        }
    }

}
