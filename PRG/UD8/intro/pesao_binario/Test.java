package intro.pesao_binario;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        int opcion;
        
        double[] numTotal = new double[10];

        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("_______________________________________________________________________________________________________________\n");
                System.out.println("Bienvenido al programa para gestionar números (ni siquiera sé porqué ni que). Pero bueno, elige una opción: \n");
                System.out.println("1. Añadir información. ");
                System.out.println("2. Leer información.");
                System.out.println("_______________________________________________________________________________________________________________\n");
                opcion = sc.nextInt();
                switch (opcion) {   
                    case 1:
                        System.out.println("Escribe un número entero: ");
                        int x = sc.nextInt();
                        numTotal = new double[x];
                        for (int i = 0; i < x; i++) {
                            System.out.println("\nEscribe un número decimal: ");
                            double y = sc.nextDouble();

                            numTotal[i] = y;
                        }
                        break;
                    case 2:
                        System.out.println(Arrays.toString(numTotal));
                        try(ObjectOutputStream oisAmoogis = new ObjectOutputStream(new FileOutputStream("decimales.dat"))) {
                            oisAmoogis.writeObject(numTotal);
                        } catch (Exception e) {
                            System.out.println("Error genérico: " + e.getMessage());
                        }
                        break;
                    default:
                        break;
                }
            } while (opcion != 2);
        } catch (Exception e) {
            System.out.println("Error. Introduce un valor númerico válido que corresponda con las opciones: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
