package StarWarsCompleto;

import java.util.*;

public class Test {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        // Declaración de variables.
        int opcion = 0;

        try {
            System.out.println("------------------------- SISTEMA DE GESTIÓN PERSONAJES STAR WARS -------------------------");
            do {
                System.out.println("Elija una opción: ");
                System.out.println("1. Dar de alta a un Jedi.");
                System.out.println("2. Dar de alta a un Sith.");
                System.out.println("3. Mostrar un listado de todo el conjunto de Jedis y Siths.");
                System.out.println("4. Mostrar un listado de únicamente Jedis.");
                System.out.println("5. Mostrar un listado de únicamente Siths.");
                System.out.println("6. Recuento total del conjunto.");
                System.out.println("7. Recuento de Jedis.");
                System.out.println("8. Recuento de Siths.");
                System.out.println("9. Recuento de los midiclorianos que tengan un nivel superior a 25000.");
                System.out.println("10. Listado de Jedis ordenados por fuerza mental.");
                System.out.println("11. Listado de Siths ordenados por nivel de midicloriano.");
                System.out.println("12. Transformar en Siths todos los Jedis que tengan una fuerza mental inferior a 6.");
                System.out.println("0. Salir.");
                System.out.println("-------------------------------------------------------------------------------------------");
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
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    default:
                        break;
                }
            } while (opcion != 0);
        } catch (InputMismatchException e) {
            System.out.println("Error. Introduzca una excepción válida y vuelva a intentarlo.");
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }

    }

}
