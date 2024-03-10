package Agenda;

// Importación de librerías.
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {

        // Declaración de variables y arrays.
        int opcion;
        String[] nombres = new String[20];
        String[] telefonos = new String[20];
        int numContactos = 0;

        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);

        // Cargamos datos desde el archivo. Asignamos que 'numContactos' será igual a la función de 'cargarDesdeArchivo()' para poder cargar los datos.
        numContactos = cargarDesdeArchivo(nombres, telefonos);

        // Presentación del programa junto al menú.
        System.out.println("__________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido al programa. En esta agenda podrás escoger las siguientes opciones: ");
        System.out.println();
        System.out.println("1. Nuevo contacto.");
        System.out.println("2. Buscar por nombre.");
        System.out.println("3. Mostrar todos los contactos.");
        System.out.println("4. Salir y guardar.");

        // Creamos una estructura 'try-catch'.
        // Verificará si puede ejecutar el código siguiente y en caso de que no pillará el error.
        // Terminará cerrando el escáner.
        try {
            // Creamos un bucle 'do-while'.
            // Ejecutará constantemente el código hasta que el usuario escoga la opción 4.
            do {
                System.out.println("__________________________________________________________________________________"); // Separador.
                System.out.println("\nElige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // Consumimos un salto de línea ya que queda libre y si no se añade el código no funciona correctamente.
                // Creamos una estructura de control 'switch'.
                // Irá manejando el menú según la opción escogida por el usuario.
                switch (opcion) {
                    // Para el caso 1 manejaremos la situación de "Nuevo contacto".
                    case 1:
                        // Creamos una estructura de control 'if'.
                        // Si el número de contactos es superior a 20, implica que estará llena, por lo tanto, el programa lo avisará.
                        // Si no (osea todo marcha correctamente), nos dará la opción directa de introducir el nuevo contacto.
                        if (numContactos >= 20) {
                            System.out.println("La agenda ya está llena. No se pueden añadir más contactos.");
                        } else {
                            System.out.println(); // Salto de línea.
                            System.out.println("Nombre: ");
                            String nombre = sc.nextLine();
                            // Creamos una estructura de control 'if'.
                            // Llamará a la función de "buscarNombre" estáticamente y verificará si el contacto a existe.
                            // En caso contrario y que sea un nuevo contacto entonces pedirá el número de teléfono.
                            if (buscarNombre(nombres, numContactos, nombre) != -1) {
                                System.out.println("El contacto ya existe en la agenda. Si se llama igual, prueba a cambiar el nombre añadiendo un número o diferenciándolo de alguna manera.");
                            } else {
                                System.out.println(); // Salto de línea.
                                System.out.println("Teléfono del contacto: ");
                                String numTelefono = sc.nextLine();
                                nombres[numContactos] = nombre; // Almacenamos el nombre del contacto en el array.
                                telefonos[numContactos] = numTelefono; // Almacenamos el teléfono del contacto en el array.
                                numContactos++; // Incrementamos el contador de contactos.
                                System.out.println("Se ha agregado el contacto.");
                            }
                        }
                        break;
                    // Para el caso 2 manejaremos la situación de "Buscar por nombre".
                    case 2:
                        System.out.println(); // Salto de línea.
                        System.out.println("Buscar: ");
                        String buscar = sc.nextLine();
                        System.out.println(); // Salto de línea.
                        buscarPorNombre(nombres, telefonos, numContactos, buscar); // Llamamos a la función de 'buscarPorNombre'.
                        break;
                    // Para el caso 3 manejaremos la situación de "Mostrar todos los contactos".
                    case 3:
                        System.out.println(); // Salto de línea.
                        System.out.println("Lista de contactos: ");
                        System.out.println(); // Salto de línea.
                        mostrarTodosContactos(nombres, telefonos, numContactos); // Llamamos a la función de 'mostrarTodosContactos'.
                        break;
                    // Para el caso 4 manejaremos la situación de "Salir y guardar" que guardará los contactos en el fichero 'agenda.txt' y cerrará el programa.
                    case 4:
                        guardarEnArchivo(nombres, telefonos, numContactos); // Llamamos a la función de 'guardarEnArchivo'.
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            } while (opcion != 4);
        } catch (Exception e) {
            System.out.println("Error. Por favor, introduce un valor numérico correcto: " + e.getMessage());
        } finally {
            sc.close(); // Cerramos el escáner.
        }
    }

    // Creamos un método que buscará el nombre en un array.
    public static int buscarNombre(String[] nombres, int numContactos, String nombre) {
        // Creamos un bucle 'for'.
        // Recorrerá el número de contactos que haya y comparará los nombres para saber si existen.
        for (int i = 0; i < numContactos; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                return i; // Devolvemos el índice del nombre si es encontrado en el array.
            }
        }
        return -1; // Devolvemos '-1'.
    }

    // Creamos un método que mostrará los contactos que coinciden con el nombre buscado.
    public static void buscarPorNombre(String[] nombres, String[] telefonos, int numContactos, String buscar) {
        boolean encontrado = false; // Creamos una variable para encontrar si se encuentra algún contacto.
        for (int i = 0; i < numContactos; i++) {
            // Creamos una estructura de control 'if'.
            // Comprobará si el nombre coincide con el criterio de búsqueda usando los métodos 'toLowerCase()' y "contains()".
            // 'toLowerCase()' convertirá el nombre del contacto en minúscula para no distinguir entre mayúsculas y minúsculas.
            // 'contains(buscar.toLowerCase)' comprobará si el si el nombre convertido a minúscula contiene la cadena de búsqueda. 
            if (nombres[i].toLowerCase().contains(buscar.toLowerCase())) {
                System.out.println("-" + nombres[i] + ": " + telefonos[i]); // Mostramos el nombre y el teléfono por consola.
                encontrado = true; // Cambiamos el valor de 'encontrado' a true.
            }
        }
        // Creamos una estructura de control 'if'.
        // Si 'encontrado' sigue siendo false (es decir, que no se encuentra el nombre que se intenta buscar), el programa avisará al usuario.
        if (!encontrado) {
            System.out.println("No se encontraron contactos con ese nombre.");
        }
    }

    // Creamos un método que mostrará todos los contactos.
    public static void mostrarTodosContactos(String[] nombres, String[] telefonos, int numContactos) {
        // Creamos una estructura de control 'if'.
        // Si el número de contactos es 0, significa que no hay contactos, por lo que, el programa lo indicará.
        if (numContactos == 0) {
            System.out.println("No hay contactos en la agenda.");
            return;
        }

        String[] nombresOrdenados = Arrays.copyOf(nombres, numContactos); // Creamos un array que contendrá los nombres ordenados y esto lo hará copiando todo lo del array 'nombres' y 'numContactos' usando el método 'copyOf()'.
        Arrays.sort(nombresOrdenados); // Ordenamos los nombres alfabéticamente.

        // Creamos un bucle 'for-each'.
        // Mostrará todos los contactos en la agenda. 
        for (String nombre : nombresOrdenados) {
            int i = buscarNombre(nombres, numContactos, nombre); // Creamos una nueva variable que contendrá la función llamada estáticamente de 'buscarNombre' para poder enseñar todos los nombres.
            System.out.println("-" + nombre + ": " + telefonos[i]);
        }
    }

    // Creamos un método para poder guardar los datos en un archivo.
    public static void guardarEnArchivo(String[] nombres, String[] telefonos, int numContactos) {
        // Creamos una estructura 'try-catch'.
        // Guardará en el archivo 'agenda.txt' todos los contactos que pongamos en el programa.
        // En caso de que no pueda hacerlo o haya cualquier tipo de problema, nos saltará un error.
        // Usamos 'PrintWriter' para escribir los datos de los contactos en el archivo de texto, ya que es más fácil de usar y 
        // integra funcionalidades específicas para la escritura de datos.
        try (PrintWriter writer = new PrintWriter(new FileWriter("src\\Activitat_8_2\\agenda.txt"))) {
            // Creamos un bucle 'for'.
            // Recorrerá el número de contactos y en el fichero añadirá el nombre y el teléfono.
            for (int i = 0; i < numContactos; i++) {
                writer.println(nombres[i] + "," + telefonos[i]);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en un archivo: " + e.getMessage());
        }
    }

    // Creamos un método para poder cargar los datos desde un archivo si existe.
    public static int cargarDesdeArchivo(String[] nombres, String[] telefonos) {
        File archivo = new File("src\\Activitat_8_2\\agenda.txt"); // Creamos un objeto File para representar el archivo.
        int numContactosCargados = 0; // Creamos una variable para contar los contactos cargados del archivo 'agenda.txt'.
        // Creamos una estructura de control 'if'.
        // Verificará si el archivo existe.
        if (archivo.exists()) {
            // Creamos una estructura 'try-catch'.
            // Creará un escáner para leer el archivo y cargará los datos.
            try (Scanner scanner = new Scanner(archivo)) {
                int i = 0; // Inicializamos un contador.
                // Creamos un bucle 'while'.
                // Iterará sobre cada línea del archivo usando el método 'hasNextLine()'.
                while (scanner.hasNextLine() && i < 20) {
                    // Creamos una variable que almacenará los datos del fichero.
                    String[] datos = scanner.nextLine().split(","); // Dividimos la línea en nombre y teléfono usando la coma como delimitador.
                    // Creamos una estructura de control 'if'.
                    // Verificará si hay exactamente dos elementos en el array.
                    if (datos.length == 2) {
                        nombres[i] = datos[0]; // Asignamos el nombre del contacto al array nombres (usando el array de datos).
                        telefonos[i] = datos[1]; // Asignamos el telefono del contacto al array telefonos (usando el array de datos).
                        i++; // Incrementamos el contador.
                        numContactosCargados++; // Incrementamos también el contador de los contactos cargados.
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el archivo: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error genérico: " + e.getMessage());
            }
        }
        return numContactosCargados; // Devolvemos los contactos cargados.
    }
}
