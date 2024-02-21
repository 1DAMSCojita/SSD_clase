package intro.teoria_tres;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        int[] numeros = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una serie de 5 números enteros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numeros));
        sc.close();

    }
    /* 
    private static void pregunta() {

        double altura;
        int edad;
        String nombre;



    }
    */
}
