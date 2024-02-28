package Activitat_8_4;

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Test {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int opcion;

        // Declaración de escáner.
        Scanner sc = new Scanner(System.in);
        
        // Presentación del programa junto al menú.
        System.out.println("______________________________________________________________________________________________\n");
        System.out.println("Bienvenido al programa. Aquí podrás gestionar la selección de deportes en un club social.\n");
        try {
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
                
                    default:
                        break;
                }
            } while (opcion != 6); 
        } catch (Exception e) {
            System.out.println("Error. Introduzca un valor númerico que corresponda con las opciones y vuelva a intentarlo: " + e.getMessage());
        } finally {
            sc.close();
        }

    }
}
