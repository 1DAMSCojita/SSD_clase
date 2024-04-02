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
            // Repetirá el menú de opciones mientras la opción sea diferente a 5 o 6.
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
                    // Manejamos el caso de 'Agregar Ingrediente.'
                    case 1:
                        agregarIngrediente(ingredientes); // Llamamos al método de 'agregarIngrediente()'.
                        break;
                    // Manejamos el caso de 'Eliminar Ingredientes.'
                    case 2:
                        // Proporcionamos un listado de los ingredientes disponibles para que el usuario elija con exactitud el que quiera.
                        // Para ello, usamos un bucle 'for-each', que recorre el ArrayList de ingredientes y mostrará los nombres.
                        System.out.println("Ingredientes disponibles: ");
                        for (Ingrediente ingrediente : ingredientes) {
                            System.out.println(ingrediente.getNombre());
                        }
                        eliminarIngredientes(ingredientes); // Llamamos al método de 'eliminarIngredientes()'
                        break;
                    // Manejamos el caso de 'Modificar Ingredientes.'
                    case 3:
                        // Proporcionamos un listado de los ingredientes disponibles para que el usuario elija con exactitud el que quiera.
                        // Para ello, usamos un bucle 'for-each', que recorre el ArrayList de ingredientes y mostrará los nombres.
                        System.out.println("Ingredientes disponibles: ");
                        for (Ingrediente ingrediente : ingredientes) {
                            System.out.println(ingrediente.toString());
                        }
                        modificarIngredientes(ingredientes); // Llamamos al método de 'modificarIngredientes()'
                        break;
                    // Manejamos el caso de 'Crear Receta.'
                    case 4:
                        // Pendiente por hacer.
                        break;
                    // Manejamos el caso de 'Listados'. Incluye un submenú.
                    case 5:
                        // Presentación del submenú de listados con todas las opciones.
                        System.out.println("---------- HA ENTRADO EN LA OPCIÓN DE LISTADOS ----------");
                        System.out.println("Elija una opción:");
                        System.out.println("1. Listado de Ingredientes (por orden alfabético).");
                        System.out.println("2. Listado de Ingredientes (por precio por persona).");
                        System.out.println("3. Listado de Recetas (alfabético).");
                        System.out.println("4. Listado de Recetas (por número de comensales).");
                        System.out.println("5. Listado de Recetas (por precio).");
                        System.out.println("6. Listado de Recetas (por número de ingredientes).");
                        System.out.println("7. Volver.");
                        System.out.println("--------------------------------------------------------------");
                        opcion = sc.nextInt();
                        // Creamos otra estructura de control 'switch' para la opción de "Listados".
                        // Irá manejando y ejecutando cada punto de este submenú. 
                        switch (opcion) {
                            case 1:
                                ingredientesOrdenAlfabetico(ingredientes); // Llamamos al método de 'ingredientesOrdenAlfabetico()'
                                break;
                            case 2:
                                ingredientesOrdenPrecioPorPersona(ingredientes); // Llamamos al método de 'ingredientesOrdenPrecioPorPersona()'
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
                    default:
                        break;
                }
            } while (opcion != 5 && opcion != 6);
        } catch (Exception e) {
            System.out.println("> Error genérico: " + e.getMessage());
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
        System.out.println("> Introduzca el nombre del ingrediente: ");
        sc.nextLine(); // Consumimos el carácter de nueva línea restante en el búfer antes de leer el nombre (para evitar errores).
        nombre = sc.nextLine();
        System.out.println("> Ahora, introduzca el precio por persona (solo comas): ");
        precio_por_persona = sc.nextDouble();

        // Creamos un nuevo objeto de 'Ingrediente'.
        Ingrediente nuevoIngrediente = new Ingrediente(nombre, precio_por_persona);

        ingredientes.add(nuevoIngrediente); // Añadimos el ingrediente dentro del ArrayList.

        System.out.println("> Ingrediente agregado con éxito."); // Mensaje que indica que el ingrediente se añadió con éxito.
        System.out.println("--------------------------------------------------------------"); // Separador.
    }

    // Creamos un método para eliminar ingredientes.
    public static void eliminarIngredientes(ArrayList<Ingrediente> ingredientes) {

        // Declaración de variables.
        boolean encontrado = false;
        String nombre;

        // Creamos una estructura de control 'if'.
        // Si el ArrayList de ingredientes está vacío, mostrará un mensaje indicándolo.
        // En caso de que no (es decir, que si que haya), ejecutará el bloque para eliminar ingredientes.
        if (ingredientes.isEmpty()) {
            System.out.println("No hay ningún ingrediente todavía. Prueba a añadir uno.");
        } else {
            // Presentación de la opción junto con la petición de eliminación.
            System.out.println("---------- HA ENTRADO EN LA OPCIÓN PARA ELIMINAR UN INGREDIENTE ----------");
            System.out.println("> Introduzca el nombre del ingrediente que desee eliminar: ");
            sc.nextLine(); // Consumimos el carácter de nueva línea restante en el búfer antes de leer el nombre (para evitar errores).
            nombre = sc.nextLine();
            // Creamos un bucle 'for-each'.
            // Recorrerá el ArrayList de ingredientes para dar con el nombre.
            for (Ingrediente ingrediente : ingredientes) {
                // Creamos una estructura de control 'if'.
                // Si el nombre puesto coincide con el de la lista, se eliminará con el método 'remove()'.
                if (ingrediente.getNombre().equalsIgnoreCase(nombre)) {
                    ingredientes.remove(ingrediente);
                    System.out.println("> Ingrediente eliminado con éxito."); // Mensaje que indica que el ingrediente se eliminó con éxito.
                    encontrado = true; // Establecemos encontrado como 'true', así saber que lo hemos encontrado.
                    break; // Salimos de la estructura.
                }
            }
            // Creamos una estructura de control 'if'.
            // En caso de que no se haya encontrado el ingrediente, el programa lo indicará.
            if (!encontrado) {
                System.out.println("> No se encontró el ingrediente con ese nombre (está mal puesto o no existe).");
            }
        }
        System.out.println("--------------------------------------------------------------"); // Separador.
    }

    // Creamos un método para modificar ingredientes.
    public static void modificarIngredientes(ArrayList<Ingrediente> ingredientes) {

        // Declaración de variables.
        boolean encontrado = false;
        String nombreIngrediente;
        String nombre;
        double precio;

        // Creamos una estructura de control 'if'.
        // Si el ArrayList de ingredientes está vacío, mostrará un mensaje indicándolo.
        // En caso de que no (es decir, que si que haya), ejecutará el bloque para modificar ingredientes.
        if (ingredientes.isEmpty()) {
            System.out.println("> No hay ningún ingrediente todavía. Prueba a añadir uno.");
        } else {
            // Presentación de la opción junto con la petición de modificación.
            System.out.println("---------- HA ENTRADO EN LA OPCIÓN PARA MODIFICAR UN INGREDIENTE ----------");
            System.out.println("> Introduzca el nombre del ingrediente que desee modificar: ");
            sc.nextLine(); // Consumimos el carácter de nueva línea restante en el búfer antes de leer el nombre (para evitar errores).
            nombreIngrediente = sc.nextLine();
            // Creamos un bucle 'for-each'.
            // Recorrerá el ArrayList de ingredientes para dar con el nombre.
            for (Ingrediente ingrediente : ingredientes) {
                // Creamos una estructura de control 'if'.
                // Si el nombre puesto coincide con el de la lista, se pedirá los nuevos datos a añadir.
                if (ingrediente.getNombre().equalsIgnoreCase(nombreIngrediente)) {
                    encontrado = true; // Establecemos encontrado como 'true', así saber que lo hemos encontrado.
                    System.out.println("> Ingrese el nuevo nombre del ingrediente: ");
                    nombre = sc.nextLine();
                    System.out.println("> Ingrese el nuevo precio del ingrediente por persona (solo comas): ");
                    precio = sc.nextDouble();

                    // Actualizamos los atributos del ArrayList de ingredientes.
                    ingrediente.setNombre(nombre);
                    ingrediente.setPrecio_por_persona(precio);

                    System.out.println("> Ingrediente modificado con éxito."); // Mensaje que indica que el ingrediente se modificó con éxito.
                    break; // Salimos de la estructura.
                }
            }
            // Creamos una estructura de control 'if'.
            // En caso de que no se haya encontrado el ingrediente, el programa lo indicará.
            if (!encontrado) {
                System.out.println("> No se encontró el ingrediente con ese nombre (está mal puesto o no existe).");
            }
        }
        System.out.println("--------------------------------------------------------------"); // Separador.
    }

    // Creamos un método para listar los ingredientes por orden alfabético.
    public static void ingredientesOrdenAlfabetico(ArrayList<Ingrediente> ingredientes) {

        // Creamos una estructura de control 'if'.
        // Si el ArrayList de ingredientes está vacío, mostrará un mensaje indicándolo.
        // En caso de que no (es decir, que si que haya), ejecutará el bloque para listar los ingredientes por orden alfabético.
        if (ingredientes.isEmpty()) {
            System.out.println("> No hay ningún ingrediente todavía. Prueba a añadir uno.");
        } else {
            System.out.println("----- LISTADO DE INGREDIENTES POR ORDEN ALFABÉTICO ------");
            Collections.sort(ingredientes, Comparator.comparing(Ingrediente::getNombre)); // Ordenamos el nombre del ArrayList de ingredientes usando 'Collections.sort()' y implementamos un comparador de la clase de 'Comparator', usamos los ":" para coger el getter del nombre de la clase 'Ingrediente'. 
            // Creamos un bucle 'for-each'.
            // Recorrerá el ArrayList de ingredientes e irá mostrando cada nombre ordenado.
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(ingrediente.getNombre());
            }
        }
        System.out.println("--------------------------------------------------------------"); // Separador.
    }

    // Creamos un método para listar los ingredientes por precio por persona.
    public static void ingredientesOrdenPrecioPorPersona(ArrayList<Ingrediente> ingredientes) {

        // Creamos una estructura de control 'if'.
        // Si el ArrayList de ingredientes está vacío, mostrará un mensaje indicándolo.
        // En caso de que no (es decir, que si que haya), ejecutará el bloque para listar los ingredientes por orden de precio por persona.
        if (ingredientes.isEmpty()) {
            System.out.println("> No hay ningún ingrediente todavía. Prueba a añadir uno.");
        } else {
            System.out.println("----- LISTADO DE INGREDIENTES DE PRECIO POR PERSONA ------");
            Collections.sort(ingredientes, Comparator.comparing(Ingrediente::getPrecio_por_persona)); // Ordenamos el precio por persona del ArrayList de ingredientes usando 'Collections.sort()' y implementamos un comparador de la clase de 'Comparator', usamos los ":" para coger el getter del precio de la clase 'Ingrediente'. 
            // Creamos un bucle 'for-each'.
            // Recorrerá el ArrayList de ingredientes e irá mostrando cada precio ordenado.
            // Usamos el 'toString()' para mostrar también el nombre así sabremos a que ingrediente va relacionado el precio.
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(ingrediente.toString());
            }
        }
        System.out.println("--------------------------------------------------------------"); // Separador.
    }
}
