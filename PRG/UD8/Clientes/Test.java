package Clientes;

// Importación de liberías.
import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int opcion;
        int numClientes = 0;

        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);

        // Declaración de arrays con clientes.
        Cliente[] clientes = null;

        // Creamos una estructura "try-catch".
        // Intentará acceder al fichero binario especificado en la ruta del objeto. Al lograrlo, asigna el array de objetos a la variable 'clientes'.
        // Si no lo logra, asigna un valor vacío al array de 'clientes' para poder continuar el flujo del programa.
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\Activitat_8_3\\clientes.dat"))){
            clientes = (Cliente[]) ois.readObject(); // Leemos el objeto almacenado en el archivo usando el método 'readObject()', también hacemos un cast 'Cliente[]' para asignarlo a la variable 'clientes'.
            ois.close(); // Cerramos el 'ObjectInputStream'.
        } catch (Exception e) {
            clientes = new Cliente[0];
        }

        // Presentación del programa junto al menú.
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Bienvenido al programa. Aquí podrás gestionar datos de clientes de una empresa.\n");
        // Creamos una estructura "try-catch".
        // Intentará ejecutar el bucle de debajo, si no puede porque el usuario intenta poner un valor no válido o
        // cualquier cosa, el programa avisará dando un error.
        // Terminará cerrando el escáner. 
        try {
            // Creamos un bucle 'do-while'.
            // Ejecutará el menú de opciones constantemente hasta que el usuario elija la opción 5.
            do {
                System.out.println("Elija una opción:\n");
                System.out.println("1. Añadir nuevo cliente.");
                System.out.println("2. Modificar datos.");
                System.out.println("3. Dar de baja a un cliente.");
                System.out.println("4. Listar los clientes.");
                System.out.println("5. Salir.");
                System.out.println("__________________________________________________________________________________\n");
                opcion = sc.nextInt();

                // Creamos una estructura de control 'switch'.
                // Manejará el menú de opciones y según la opción escogida, gestionará una opción disponible.
                switch (opcion) {
                    // Manejamos el caso de 'Añadir nuevo cliente'.
                    case 1:
                        System.out.println("__________________________________________________________________________________\n");
                        System.out.println("Ha entrado en la opción para añadir un nuevo cliente...");
                        System.out.println("__________________________________________________________________________________\n");
                        System.out.println("Identificación del cliente: ");
                        String id = sc.next();
                        System.out.println("Escriba el nombre del cliente: ");
                        String nombre = sc.next();
                        System.out.println("Número de teléfono del cliente: ");
                        String telefono = sc.next();
                        Cliente[] c = Arrays.copyOf(clientes, clientes.length + 1); // Creamos un array de clientes copiando toda la información.
                        c[c.length - 1] = new Cliente(id, nombre, telefono); // Creamos un nuevo objeto 'Cliente' con la información proporcionada y lo añadimos al final del array.
                        clientes = c; // Asignamos el nuevo array a la variable original de clientes.
                        numClientes++; // Incrementamos el contador del número de clientes.
                        System.out.println("\nSe ha añadido con éxito al cliente.\n");
                        break;
                    // Manejamos el caso de 'Modificar datos'.
                    // Podremos modificar el nombre y el teléfono del cliente escogido.
                    case 2:
                        ListaClientes(clientes, numClientes); // Llamamos a la función de 'ListaClientes' para mostrar los usuarios que hay (de esta manera, el usuario podrá ver más comódamente que usuarios querrá modificar para que no tenga que escoger otra opción).
                        modificarClientes(clientes, numClientes); // Llamamos a la función de "modificarClientes" para cambiar el nombre y el teléfono del cliente.
                        break;
                    // Manejamos el caso de 'Dar de baja a un cliente'.
                    // Podremos dar de baja a un cliente eliminándolo del array de objetos.
                    case 3:
                        ListaClientes(clientes, numClientes); // Llamamos a la función de 'ListaClientes' para mostrar los usuarios que hay (de esta manera, el usuario podrá ver más comódamente que usuarios querrá dar de baja para que no tenga que escoger otra opción).
                        clientes = darDeBaja(clientes, numClientes); // Llamamos a la función 'darDeBaja' para poder eliminar los clientes del array.
                        numClientes--; // Decrementamos el número de clientes.
                        break;
                    // Manejamos el caso de 'Listar los clientes'.
                    // Listaremos todos los clientes que haya en el programa.
                    case 4:
                        ListaClientes(clientes, numClientes); // Llamamos a la función de 'ListaClientes' para mostrar los usuarios que hay.
                        break;
                    // Manejamos el caso de 'Salir'.
                    // Guardaremos los datos en un fichero binario al salir.
                    case 5:
                        // Creamos una estructura 'try-catch'.
                        // Guardará los datos en el fichero binario con su ruta.
                        // Si no puede, indicará un error.
                        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\Activitat_8_3\\clientes.dat"))) {
                            oos.writeObject(clientes); // Escribimos en el objeto 'oos' el array de clientes.
                            oos.close(); // Cerramos el 'oos'.
                        } catch (Exception e) {
                            System.out.println("Error. No se ha encontrado el archivo: " + e.getMessage());
                        }
                    default:
                        break;
                }
            } while (opcion != 5); 
        } catch (Exception e) {
            System.out.println("Error. Introduzca un valor númerico que corresponda con las opciones y vuelva a intentarlo: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Creamos un método para listar los clientes.
    public static void ListaClientes(Cliente[] clientes, int numClientes) { 

        // Creamos un bucle 'for-each'.
        // Mostrará la información del array de clientes. En resumen, los clientes que haya en el programa.
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    
    }

    // Creamos un metodo para modificar los clientes.
    public static void modificarClientes(Cliente[] clientes, int numClientes) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Presentación de la opción para modificar un cliente.
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Ha entrado en la opción para modificar un cliente...");
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Seleccione el cliente que quiera modificar (introduciendo el ID del respectivo cliente): ");
        int clienteid = sc.nextInt();

        Cliente clienteAModificar = clientes[clienteid - 1]; // Obtenemos el cliente que se va a modificar usando el ID proporcionado por el usuario. Esto lo haremos asignándole el array a la variable.

        System.out.println("Ingrese el nuevo nombre del cliente: ");
        String nuevoNombre = sc.next();
        System.out.println("Ingrese el nuevo número de teléfono del cliente: ");
        String nuevoTelefono = sc.next();

        clienteAModificar.nombre = nuevoNombre; // Actualizamos el nombre proporcionándole el que haya sido ingresado (con la nueva variable usada).
        clienteAModificar.telefono  = nuevoTelefono; // Actualizamos el teléfono proporcionándole el que haya sido ingresado (con la nueva variable usada).

        System.out.println("\nLos datos de los clientes han sido modificados con éxito.\n");
        
    }
    
    
    public static Cliente[] darDeBaja(Cliente[] clientes, int numClientes) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Presentación de la opción para dar de baja a un cliente.
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Ha entrado en la opción para dar de baja a un cliente...");
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Seleccione el cliente que quiera dar de baja (introduciendo el ID del respectivo cliente): ");
        int clienteid = sc.nextInt();

        Cliente[] c = new Cliente[clientes.length - 1]; // Creamos un nuevo array con el tamaño reducido para almacenar los clientes después de darlos de baja.
        
        // Creamos un bucle 'for'.
        // Recorrerá el array de clientes para copiarlos todos excepto al que se va a dar de baja.
        for (int i = 0, j = 0; i < clientes.length; i++) {
            // Creamos una estructura de control 'if'.
            // Si el índice corresponde con el cliente que se va a dar de baja, continuaremos con la iteración del bucle sin copiar al cliente.
            if (i == clienteid - 1) {
                continue;
            }
            c[j++] = clientes[i]; // Copiamos el cliente actual al nuevo array de clientes.
        }

        clientes = c; // Actualizamos 'clientes' para que apunte al nuevo array que no incluye al cliente dado de baja.

        System.out.println("\nSe ha dado de baja al cliente.\n");
        return c; // Devolvemos el array que no incluirá al cliente dado de baja.
    }

}
