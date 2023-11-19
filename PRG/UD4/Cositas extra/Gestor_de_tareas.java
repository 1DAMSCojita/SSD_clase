
// Importación de librerías.
import java.util.Scanner; 

public class Gestor_de_tareas {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int opcion = 0;
        String nueva_tarea = "";
        boolean marcar_tarea_completada = false;

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        do {
            System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Bienvenido. Este programa te servirá para gestionar tus tareas de manera sencilla y automática. Se te dará una série de opciones dependiendo de lo que quieras hacer.");
            System.out.println("Elige una opción: ");
            System.out.println();
            System.out.println("Opción 1. Agrega una nueva tarea. ");
            System.out.println("Opción 2. Marcar una tarea como completada. ");
            System.out.println("Opción 3. Mostrar la lista de tareas pendientes. ");
            System.out.println("Opción 4. Salir.");
            System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese la nueva tarea: ");
                    nueva_tarea = sc.next();
                    System.out.println("Tarea agregada: " + nueva_tarea);
                    break;
                }
                case 2 -> {
                    System.out.println("¿Has completado... " + nueva_tarea + "?");
                    marcar_tarea_completada = sc.nextBoolean();
                    if (marcar_tarea_completada == true) {
                        System.out.println("Tarea marcada como completada. Bien hecho.");
                    } else {
                        System.out.println("Entonces si no has completado la tarea... ¿Para qué has escogido esta opción? Mamahuevo.");
                    }
                    break;
                }
                case 3 -> {
                    System.out.println("Lista de tareas pendientes: ");
                    System.out.println(nueva_tarea);
                    break;
                }
                case 4 -> {
                    break;
                }
                default -> {
                    System.out.println("Error. Introduce una opción válida y vuelve a intentarlo. ");
                    break;
                }
            }
        } while (opcion == 1 || opcion == 2 || opcion == 3);
        sc.close(); // Cerramos escáner.
    }
}