package Examen_22_23;

import java.util.*;

public class Test {

    // Creamos otro contador para usarlo en vez de 
    static int contador = 0;

    // Declaración de ArrayLists estáticos para poder usarse en cada método.
    static ArrayList<String> orden_de_las_letras = new ArrayList<>();
    static ArrayList<Integer> orden_de_numeros = new ArrayList<>();
    static ArrayList<String> oll = new ArrayList<>();
    static ArrayList<Integer> onl = new ArrayList<>();
    static ArrayList<Proceso> procesos = new ArrayList<>();

    // Declaración de escáner estático para poder usarlo en cada método.
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

        // Creamos instancias de los procesos.
        procesos.add(new Proceso("leer pedido", 1));
        procesos.add(new Proceso("preparar los ingredientes", 4));
        procesos.add(new Proceso("cocinar ingredientes", 5));
        procesos.add(new Proceso("montar el plato", 3));
        procesos.add(new Proceso("decorar y servir", 2));
        
        // Añadimos procesos a los ArrayLists.
        orden_de_las_letras.add("L");
        orden_de_las_letras.add("P");
        orden_de_las_letras.add("C");
        orden_de_las_letras.add("M");
        orden_de_las_letras.add("D");
        orden_de_numeros.add(1);
        orden_de_numeros.add(4);
        orden_de_numeros.add(5);
        orden_de_numeros.add(3);
        orden_de_numeros.add(2);

        for (int i = 0; i < orden_de_las_letras.size(); i++) {
            asignarOrdenLetras();
            asignarOrdenNumeros();
        }

        System.out.println("Introduce enter para continuar con el programa: ");
        sc.nextLine();
        for (Proceso proceso : procesos) {
            System.out.println(proceso.toString());
            try {
                Thread.sleep(proceso.segundos * 1000);
            } catch (Exception e) {
                System.out.println("Error genérico: ");
            }
        }       
        oll.clear();
        onl.clear();
    }

    public static void asignarOrdenLetras() {
        String letra;
        System.out.println("Escribe la letra del proceso: ");
        letra = sc.nextLine();
        if (!letra.equalsIgnoreCase(orden_de_las_letras.get(contador))) {
            System.out.println("La respuesta no es válida. Prueba de nuevo.");
            asignarOrdenLetras();
        }
        oll.add(letra);
    }

    public static void asignarOrdenNumeros() {
        int tiempoEjecucion;
        try {
            System.out.println("Escribe el tiempo de ejecución: ");
            tiempoEjecucion = Integer.parseInt(sc.nextLine());
            while (tiempoEjecucion != orden_de_numeros.get(contador)) {
                System.out.println("La respuesta no es válida. Prueba de nuevo.");
                tiempoEjecucion = Integer.parseInt(sc.nextLine());
            }
            onl.add(tiempoEjecucion);
            contador++;
        } catch (InputMismatchException e) {
            System.out.println("Error. Introduce un número válido y vuelve a intentarlo.");
            asignarOrdenNumeros();
        } catch (Exception e) {
            System.out.println("Error. Introduce un número válido y vuelve a intentarlo.");
            asignarOrdenNumeros();
        }
        
    }


}
