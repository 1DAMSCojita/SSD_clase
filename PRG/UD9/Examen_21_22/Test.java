package Examen_21_22;

// Importación de librerías.
import java.util.*;

public class Test {

    // Creamos otro contador para usarlo en vez de el de la clase 'Proceso'.
    static int contador = 0;

    // Declaración de ArrayLists estáticos para poder usarse en cada método.
    static ArrayList<Proceso> procesos = new ArrayList<>();
    static ArrayList<String> orden_de_las_letras = new ArrayList<>();
    static ArrayList<Integer> orden_de_numeros = new ArrayList<>();
    static ArrayList<String> oll = new ArrayList<>();
    static ArrayList<Integer> onl = new ArrayList<>();

    // Declaración de escáner estático para poder usarlo en cada método.
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

        // Creamos instancias de los procesos.
        procesos.add(new Proceso("leer pedido", 1));
        procesos.add(new Proceso("preparar los ingredientes", 4));
        procesos.add(new Proceso("cocinar ingredientes", 5));
        procesos.add(new Proceso("montar el plato", 3));
        procesos.add(new Proceso("decorar y servir", 2));
        
        // Añadimos letras en el ArrayList de 'orden_de_las_letras'.
        orden_de_las_letras.add("L");
        orden_de_las_letras.add("P");
        orden_de_las_letras.add("C");
        orden_de_las_letras.add("M");
        orden_de_las_letras.add("D");

        // Añadimos números en el ArrayList de 'orden_de_numeros'.
        orden_de_numeros.add(1);
        orden_de_numeros.add(4);
        orden_de_numeros.add(5);
        orden_de_numeros.add(3);
        orden_de_numeros.add(2);

        // Llamamos a los métodos pertinentes.
        ejecuciondeProcesos();
        ordenarPorTiempoDeEjecucion();
        ordenarPorProcesosAlfabetico();

    }

    // Creamos un método que pedirá las letras al usuario y controlará excepciones por si el usuario no introduce correctamente los datos.
    public static void peticiondeLetras() {
        String letra;
        System.out.println("Escribe la letra del proceso: ");
        letra = sc.nextLine();
        // Creamos una estructura de control 'if'.
        // Si la letra ingresada no coincide con la letra esperada según el contador, se 
        // mostrará un mensaje de error y se volverá a repetir la petición, así, sucesivamente
        // hasta que el usuario introduzca la orden correcta.
        if (!letra.equalsIgnoreCase(orden_de_las_letras.get(contador))) {
            System.out.println("La respuesta no es válida. Prueba de nuevo.");
            peticiondeLetras(); // Volvemos a llamar al mismo método (como aplicando recursividad) para volver a pedir la letra.
        }
        oll.add(letra); // Añadimos la letra a un nuevo ArrayList.
        oll.clear(); // Limpiamos el ArrayList borrando el proceso después de la ejecución.
    }

    // Creamos un método que pedirá el tiempo de ejecución y controlará excepciones por si el usuario no introduce correctamente los segundos del proceso.
    public static void peticiondeTiempoEjecucion() {
        int tiempoEjecucion;
        // Creamos una estructura 'try-catch'.
        // Intentará ejecutar la petición de datos y en caso de que el usuario no introduzca correctamente los valores, agarrará las excepciones y 
        // volverá a pedir los datos sucesivamente.
        try {
            System.out.println("Escribe el tiempo de ejecución: ");
            // Guardamos el tiempo de ejecución escogido por el usuario, usamos el 'Integer.parseInt()' para convertir la entrada a un Integer, ya
            // que el ArrayList de orden de números es Integer. Lo interpretamos como cadena (e ahí el 'sc.nextLine()') para poder convertirlo al 
            // Integer ya que si usamos 'sc.nextInt()' dará error porque no se permite convertir el tipo primitivo int a Integer.
            tiempoEjecucion = Integer.parseInt(sc.nextLine()); 
            // Creamos un bucle 'while'.
            // Mientras que el tiempo de ejecución que introduzca el usuario no esté acorde al orden de números, se volverá a pedir el tiempo sucesivamente. 
            while (tiempoEjecucion != orden_de_numeros.get(contador)) {
                System.out.println("La respuesta no es válida. Prueba de nuevo.");
                tiempoEjecucion = Integer.parseInt(sc.nextLine());
            }
            onl.add(tiempoEjecucion); // Añadimos el tiempo en ejecución a un nuevo ArrayList.
            onl.clear(); // Limpiamos el ArrayList borrando el proceso después de la ejecución.
            contador++; // Incrementamos el contador para pasar al siguiente proceso.
        } catch (InputMismatchException e) {
            // Capturamos una excepción en la que el usuario no introduzca un número que no sea acorde al orden del ArrayList y volvemos
            // a ejecutar el método para volver a pedir los datos.
            System.out.println("Error. Introduce un número válido y vuelve a intentarlo.");
            peticiondeTiempoEjecucion(); // Volvemos a llamar al mismo método.
        } catch (Exception e) {
            // Capturamos excepciones genéricas en las que el usuario introduzca cualquier valor que no sea un número (como un carácter especial) y volvemos
            // a ejecutar el método para volver a pedir los datos.
            System.out.println("Error. Introduce un número válido y vuelve a intentarlo.");
            peticiondeTiempoEjecucion(); // Volvemos a llamar al mismo método.
        }
        
    }

    public static void ejecuciondeProcesos() {
        // Creamos un bucle 'for-each'.
        // Recorrerá la longitud del ArrayList de 'orden_de_las_letras'.
        // Por cada iteración, llamará a los métodos 'peticiondeLetras()' y 'peticiondeTiempoEjecucion()' y 
        // validará que los valores coincidan con los predefinidos en los ArrayLists.
        for (int i = 0; i < orden_de_las_letras.size(); i++) {
            peticiondeLetras();
            peticiondeTiempoEjecucion();
        }
        // Creamos un bucle 'for-each'.
        // Irá mostrando cada proceso y ejecutándolo.
        for (Proceso proceso : procesos) {
            System.out.println(proceso.toString());
            // Creamos una estructura 'try-catch'.
            // Verificará si la ejecución de procesos se ejecutan correctamente y en caso de cualquier excepción la capturará.
            try {
                Thread.sleep(proceso.segundos * 1000); // Multiplicamos los segundos por 1000 para convertirlos en milisegundos, pausando el tiempo especificado en cada proceso.
            } catch (Exception e) {
                System.out.println("Error en los procesos: " + e.getMessage());
            }
        }
        System.out.println("¡Plato completado! "); // Mensaje avisando que el plato se entregó con éxito.
    }

    // Creamos un método que ordenará cada proceso por tiempo de ejecución y los mostrará al final del programa.
    public static void ordenarPorTiempoDeEjecucion() {
        System.out.println("\n----- PROCESOS ORDENADOS POR TIEMPO DE EJECUCIÓN -------");
        Collections.sort(procesos, new ComparaEjecucion()); // Ordenamos el ArrayList de procesos y implementamos el comparador de ejecución creado con la clase Comparator usada.
        // Creamos un bucle 'for-each'.
        // Mostrará cada proceso ordenado por tiempo de ejecución.
        for (Proceso proceso : procesos) {
            System.out.println(proceso.toString());
        }
        System.out.println("--------------------------------------------------------");
    }

    // Creamos un método que ordenará cada proceso por orden alfabético y los mostrará al final del programa.
    public static void ordenarPorProcesosAlfabetico() {
        System.out.println("\n------- PROCESOS ORDENADOS POR ORDEN ALFABÉTICO --------");
        Collections.sort(procesos, new ComparaProcesosAlfabetico()); // Ordenamos el ArrayList de procesos y implementamos el comparador de orden alfabético creado con la clase Comparator usada.
        // Creamos un bucle 'for-each'.
        // Mostrará cada proceso ordenado por tiempo de ejecución.
        for (Proceso proceso : procesos) {
            System.out.println(proceso.toString());
        }
        System.out.println("--------------------------------------------------------");
    }

}
