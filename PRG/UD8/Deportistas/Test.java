package Deportistas;

// Importación de librerías.
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int opcion;
        int numDeportistas = 0;

        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);

        // Creamos un array de deportistas.
        Deportista[] deportistas = null;

        // Creamos una estructura "try-catch".
        // Intentará acceder al fichero binario especificado en la ruta del objeto. Al lograrlo, asigna el array de objetos a la variable 'clientes'.
        // Si no lo logra, asigna un valor vacío al array de 'clientes' para poder continuar el flujo del programa.
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\Activitat_8_4\\deportistas.dat"))){
            deportistas = (Deportista[]) ois.readObject(); // Leemos el objeto almacenado en el archivo usando el método 'readObject()', también hacemos un cast 'Cliente[]' para asignarlo a la variable 'clientes'.
            ois.close(); // Cerramos el 'ObjectInputStream'.
        } catch (Exception e) {
            deportistas = new Deportista[0];
        }
        
        // Presentación del programa junto al menú.
        System.out.println("______________________________________________________________________________________________\n");
        System.out.println("Bienvenido al programa. Aquí podrás gestionar la selección de deportes en un club social.\n");
        // Creamos una estructura "try-catch".
        // Intentará ejecutar el bucle de debajo, si no puede porque el usuario intenta poner un valor no válido o
        // cualquier cosa, el programa avisará dando un error.
        // Terminará cerrando el escáner.
        try {
            // Creamos un bucle 'do-while'.
            // Ejecutará el menú de opciones constantemente hasta que el usuario elija la opción 6.
            do {
                System.out.println("Elija una opción:\n");
                System.out.println("1. Alta.");
                System.out.println("2. Baja.");
                System.out.println("3. Modificación de datos.");
                System.out.println("4. Listar por orden alfabético de nombres.");
                System.out.println("5. Listar por orden de edad.");
                System.out.println("6. Salir.");
                System.out.println("______________________________________________________________________________________________\n");
                opcion = sc.nextInt();

                // Creamos una estructura de control 'switch'.
                // Manejará el menú de opciones y según la opción escogida, gestionará una opción disponible.
                switch (opcion) {
                    // Manejamos el caso de 'Alta'.
                    case 1:
                        System.out.println("__________________________________________________________________________________\n");
                        System.out.println("Ha entrado en la opción para dar de alta a un nuevo deportista...");
                        System.out.println("__________________________________________________________________________________\n");
                        System.out.println("Identificación del deportista: ");
                        String DNI = sc.next();
                        System.out.println("Escriba el nombre del deportista: ");
                        String nombre = sc.next();
                        System.out.println("Fecha de nacimiento del deportista: \n");
                        System.out.println("Año: \n");
                        int año = sc.nextInt();
                        System.out.println();
                        System.out.println("Mes: \n");
                        int mes = sc.nextInt();
                        System.out.println();
                        System.out.println("Dia: \n");
                        int dia = sc.nextInt();
                        System.out.println();
                        System.out.println("Escriba el deporte que realiza:");
                        String deporteActivo = sc.next();
                        Deporte deporte = Deporte.valueOf(deporteActivo.toUpperCase()); 
                        System.out.println();
                        Deportista[] d = Arrays.copyOf(deportistas, deportistas.length + 1); // Creamos un array de deportistas copiando toda la información.
                        d[d.length - 1] = new Deportista(DNI, nombre, año, mes, dia, deporte); // Creamos un nuevo objeto 'Deportista' con la información proporcionada y lo añadimos al final del array.
                        deportistas = d; // Asignamos el nuevo array a la variable original de clientes.
                        numDeportistas++; // Incrementamos el contador del número de deportistas.
                        System.out.println("\nSe ha añadido con éxito al deportista.\n");    
                        break;
                    // Manejamos el caso de 'Baja'.
                    case 2:
                        // Creamos un bucle 'for-each'.
                        // Irá mostrando cada deportista dentro del array.
                        for (Deportista deportista : deportistas) {
                            String capitalizado = capitalize(deportista.getDeporte().name().toLowerCase()); // Capitalizamos la letra del deporte del deportista, usamos 'name()' para coger el nombre del deporte.
                            System.out.println(deportista.toString().replace(deportista.getDeporte().name(), capitalizado)); // Remplazamos el nombre del deporte y lo mostramos por consola junto al 'toString()' con toda la información.
                        }
                        deportistas = darDeBaja(deportistas, numDeportistas); // Declaramos que el array 'deportistas' será igual al método de dar de baja.
                        numDeportistas--; // Decrementamos el contador del número de deportistas.
                        break;
                    // Manejamos el caso de 'Modificar deportistas'.
                    case 3:
                        for (Deportista deportista : deportistas) {
                            String capitalizado = capitalize(deportista.getDeporte().name().toLowerCase()); // Capitalizamos la letra del deporte del deportista, usamos 'name()' para coger el nombre del deporte.
                            System.out.println(deportista.toString().replace(deportista.getDeporte().name(), capitalizado)); // Remplazamos el nombre del deporte y lo mostramos por consola junto al 'toString()' con toda la información.
                        }
                        modificarDeportistas(deportistas, numDeportistas); // Llamamos al método de 'modificarDeportistas'.
                        break;
                    // Manejamos el caso de 'Listar deportistas por orden alfabético de nombre'.
                    case 4:
                        listarPorNombre(deportistas); // Llamamos al método de 'listarPorNombre'.
                        break;
                    // Manejamos el caso de 'Listar deportistas por orden de edad'.
                    case 5:
                        listarPorEdad(deportistas); // Llamamos al método de 'listarPorEdad'.
                        break;
                    case 6:
                        // Creamos una estructura 'try-catch'.
                        // Guardará los datos en el fichero binario con su ruta.
                        // Si no puede, indicará un error.
                        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\Activitat_8_4\\deportistas.dat"))) {
                            oos.writeObject(deportistas); // Escribimos en el objeto 'oos' el array deportistas.
                            oos.close(); // Cerramos el 'oos'.
                        } catch (Exception e) {
                            System.out.println("Error. No se ha encontrado el archivo: " + e.getMessage());
                        }
                    default:
                        break;
                }
            } while (opcion != 6); 
        } catch (Exception e) {
            System.out.println("Error. Introduzca un valor númerico que corresponda con las opciones y vuelva a intentarlo: " + e.getMessage());
        } finally {
            sc.close(); // Cerramos escáner.
        }

    }

    // Creamos un método para dar de baja a un deportista.
    public static Deportista[] darDeBaja(Deportista[] deportistas, int numDeportistas) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Presentación de la opción para dar de baja a un deportista.
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Ha entrado en la opción para dar de baja a un deportista...");
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Seleccione el deportista que quiera dar de baja (introduciendo el nombre del respectivo deportista): ");
        String nombre = sc.next();

        // Buscamos el deportista por nombre.
        int indice = -1; // Declaramos un índice, lo inicializamos con '-1' al principio.
        // Creamos un bucle 'for'.
        // Recorrerá la longitud del array de 'deportistas' para ir comparando los nombres.
        for (int i = 0; i < deportistas.length; i++) {
            // Creamos una estructura de control 'if'.
            // Comparará la cadena del nombre proporcionado.
            if (deportistas[i].nombre.equals(nombre)) {
                indice = i; // Si coincide, actualizamos el valor de 'indice' con la posición del deportista.
                break;
            }
        }

        // Creamos una estructura de control 'if'.
        // Verificará si el índice es diferente a -1, si lo es, creará un nuevo array sin el deportista y lo devolverá.
        // En caso contrario mostrará un error. 
        if (indice != -1) {
            Deportista[] d = new Deportista[deportistas.length - 1]; // Creamos un nuevo array sin el deportista dado de baja.
            // Creamos un bucle 'for'.
            // Recorrerá el array de 'deportistas' y verá si coincide la posición del deportista encontrado.
            for (int i = 0, j = 0; i < deportistas.length; i++) {
                if (i != indice) { 
                    d[j++] = deportistas[i]; // Copiamos el deportista en la posición 'i' al nuevo array y actualizamos el índice del nuevo array 'j'.
                }
            }
            System.out.println("\nSe ha dado de baja al deportista.\n");
            return d; // Devolvemos el array nuevo sin el deportista.
        } else {
            System.out.println("\nNo se encontró ningún deportista con el nombr proporcionado o no hay ninguno.\n");
            return deportistas;
        }
    }

    // Creamos un metodo para modificar los deportistas.
    public static void modificarDeportistas(Deportista[] deportistas, int numDeportistas) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Presentación de la opción para modificar un Deportista.
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Ha entrado en la opción para modificar un deportista...");
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Seleccione el deportista que quiera modificar (introduciendo el nombre del respectivo deportista): ");
        String nombre = sc.next();

        boolean encontrado = false; // Creamos una variable para comprobar si se ha encotnrado el deportista.
        // Creamos un bucle 'for'.
        // Recorrerá la longitud del array de deportistas y una vez encuentre el deportista indicado anteriormente pedirá modificar los datos.
        for (int i = 0; i < deportistas.length; i++) {
            // Creamos una estructura de control 'if'.
            // Comparará el nombre puesto anteriormente con el del array y irá pidiendo modidficar los nuevos datos.
            if (deportistas[i].nombre.equalsIgnoreCase(nombre)) {
                encontrado = true; // Declaramos que el 'encontrado' será true.
                System.out.println("Deportista encontrado. Ingrese los nuevos datos: ");
                System.out.println("Nuevo nombre del deportista: ");
                String nuevoNombre = sc.next();
                System.out.println("Nuevo deporte que realiza:");
                String nuevoDeporte = sc.next();

                // Actualizamos los datos.
                deportistas[i].nombre = nuevoNombre;
                deportistas[i].deporte = Deporte.valueOf(nuevoDeporte.toUpperCase()); // Usamos 'valueOf' y 'toUpperCase()' para pasar el valor del enumerado ya que está en mayúscula.

                System.out.println("\nLos datos del deportista han sido modificados con éxito.\n");
                break;
            }
        }

        // Creamos una estructura de control 'if'.
        // Si no se ha encontrado ningún deportista, nos generará un error y el programa lo indicará.
        if (!encontrado) {
            System.out.println("No se encontró ningún deportista con el nombre proporcionado o no hay ninguno.\n");
        }

    }

    // Creamos un método para listar por orden alfabético de nombre a los deportistas.
    public static void listarPorNombre(Deportista[] deportistas) {
        System.out.println("\nListado de deportistas por orden alfabético de nombres:\n");
        Arrays.sort(deportistas, Comparator.comparing(Deportista::getNombre)); // Ordenamos el nombre del array de deportistas usando 'arrays.sort()' y implementamos un comparador de la clase de 'Comparator', usamos los ":" para coger el getter de la clase 'Deportista'.
        // Creamos un bucle 'for-each'.
        // Irá mostrando cada deportista dentro del array.
        for (Deportista deportista : deportistas) {
            String capitalizado = capitalize(deportista.getDeporte().name().toLowerCase()); // Capitalizamos la letra del deporte del deportista, usamos 'name()' para coger el nombre del deporte.
            System.out.println(deportista.toString().replace(deportista.getDeporte().name(), capitalizado)); // Remplazamos el nombre del deporte y lo mostramos por consola junto al 'toString()' con toda la información.
        }
    }

    // Creamos un método para listar por orden de edad a los deportistas.
    public static void listarPorEdad(Deportista[] deportistas) {
        System.out.println("\nListado de deportistas por orden de edad:\n");
        Arrays.sort(deportistas, Comparator.comparingInt(Deportista::getEdad)); // Ordenamos la edad del array de deportistas usando 'arrays.sort()' y implementamos un comparador de la clase de 'Comparator', usamos los ":" para coger el getter de la clase 'Deportista'.
        // Creamos un bucle 'for-each'.
        // Irá mostrando cada deportista dentro del array.
        for (Deportista deportista : deportistas) {
            String capitalizado = capitalize(deportista.getDeporte().name().toLowerCase()); // Capitalizamos la letra del deporte del deportista, usamos 'name()' para coger el nombre del deporte.
            System.out.println(deportista.toString().replace(deportista.getDeporte().name(), capitalizado)); // Remplazamos el nombre del deporte y lo mostramos por consola junto al 'toString()' con toda la información.
        }
    }

    // Creamos un método para capitalizar la primera letra de cada deporte en el enumerado.
    public static String capitalize(String Deporte) {
        return Character.toUpperCase(Deporte.charAt(0)) + Deporte.substring(1); // Devolvemos el primer carácter convertido en mayúscula, usamos 'substring()' para por si el primer carácter está repetido, solo se ponga el primer carácter en mayúscula.
    }
}
