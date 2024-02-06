package el_mejor_programa_del_siglo;

import java.util.Scanner;

public class David {
 
    David() {

    }

    public void preguntaXAL() {
        String resp;
        Scanner sc = new Scanner(System.in);

        System.out.println("David te pregunta si te gusta XAL. ¿Cuál es tu respuesta?");
        resp = sc.nextLine();
        if (resp.equalsIgnoreCase("Si")) {
            System.out.println("David le encanta que te guste XAL. Se va alegremente y preparado para preguntártelo el siguiente día.");
        } else if (resp.equalsIgnoreCase("No")) {
            System.out.println("David se pone a llorar porque no te gusta XAL y se va corriendo. Al día siguiente te lo preguntará de nuevo a ver si cambias de opinión.");
        } else {
            while (resp != "Si" || resp != "No") {
                System.out.println("David no entiende tu respuesta. Te vuelve a preguntar si te gusta XAL.");
                resp = sc.nextLine();
                if (resp.equalsIgnoreCase("Si")) {
                    System.out.println("David le encanta que te guste XAL. Se va alegremente y preparado para preguntártelo el siguiente día.");
                    break;
                } else if (resp.equalsIgnoreCase("No")) {
                    System.out.println("David se pone a llorar porque no te gusta XAL y se va corriendo. Al día siguiente te lo preguntará de nuevo a ver si cambias de opinión.");
                    break;
                }
            }
        }
        sc.close();
    }

    public void haceExamen() {
        int nota = (int)(Math.random() * 10) + 1;

        System.out.println("David hace el examen de C.");
        if (nota > 1 && nota < 4) {
            System.out.println("David ha suspendido.");
        } else if (nota == 5) {
            System.out.println("David ha aprobado.");
        } else if (nota == 6 || nota > 6 && nota < 10) {
            System.out.println("David ha sacado un ¡" + nota + "!" + " Le ha ido bien.");
        }

    }
    
}
