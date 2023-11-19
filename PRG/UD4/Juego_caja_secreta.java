
// Importación de librerías.
import java.util.Scanner;

public class Juego_caja_secreta {    
    public static void main(String[] args) {

        // Declaración de variables.
        int longitud_combinacion = 0;
        
        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println();
        System.out.println("¡Bienvenido al juego de la caja secreta! En este juego tendrás que adivinar la combinación secreta " );
        System.out.println("para poder abrir la caja. Especifica la longitud de la combinación (del 1 al 5 como máximo). ");
        System.out.println();
        System.out.println("Nota: Ten en cuenta que cuánto más mayor sea la longitud, más difícil será el juego.");
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println();
        longitud_combinacion = sc.nextInt(); // Guardamos el nivel de dificultad del usuario.
        System.out.println();
        
        int fin = caja_secreta(longitud_combinacion);
        System.out.println(fin);
        sc.close(); // Cerramos escáner.
    }

    // Declaramos una nueva función llamada 'caja_secreta'. Aquí es dónde básicamente el juego se va a realizar y donde se toman todas las decisiones.
    public static int caja_secreta(int longitud_combinacion) {

        Scanner sc = new Scanner(System.in); // Creamos otra entrada de datos.

        // Declaración de variables.
        int[] numeros = new int[5];
        numeros[0] = (int) (Math.random() * 5 + 1);
        numeros[1] = (int) (Math.random() * 5 + 1);
        numeros[2] = (int) (Math.random() * 5 + 1);
        numeros[3] = (int) (Math.random() * 5 + 1);
        numeros[4] = (int) (Math.random() * 5 + 1); // Cada posición de numeros tendrá un valor aleatorio del 1 al 5.
        int[] numero_adivinanza = new int[5];

        // Creamos múltiples estructuras de control 'if'. 
        // Por cada dígito que el usuario ponga (del 1-5), el juego se volverá más difícil. Esto quiere decir que por ejemplo si el usuario pone "2"
        // se generarán dos números aleatorios y tendrá que adivinar dos también. 
        if (longitud_combinacion == 1) {
            // Creamos una estructura de control 'while.'
            // Todo lo de la estructura se realizará mientras el número que el usuario ha puesto sea diferente al generado.
            while (numero_adivinanza[0] != numeros[0]) {
                System.out.println("¡Adivina el número!");
                numero_adivinanza[0] = sc.nextInt(); // Guardamos el número que el usuario ha escogido.
                // Vamos creando diferentes estructuras de control 'if' para ir controlando diversas situaciones.
                // Si el número que el usuario ha introducido es igual al generado, ganará. Si no, se irá comparando que si es mayor o menor, se
                // le vaya dando pistas al usuario.
                if (numero_adivinanza[0] == numeros[0]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! You win.");
                } else if (numero_adivinanza[0] > numeros[0]) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[0] < numeros[0]) {
                    System.out.println("Prueba con un número mayor.");
                }
                // Con esta última estructura 'if' simplemente enseñaremos la contraseña secreta de manera más ordenada.
                if (numero_adivinanza[0] == numeros[0]) {
                    System.out.println("La contraseña secreta es: " + numero_adivinanza[0]);
                }
            }
        }
        if (longitud_combinacion == 2) {
            // Aquí hacemos exactamente lo mismo que el anterior 'if'. Pero, añadiendo más números.
            // Y a partir de aquí pues haremos lo mismo por todas las dificultades hasta llegar a la última y ya.
            while (numero_adivinanza[0] != numeros[0]) {
                System.out.println("¡Adivina el primer número!");
                numero_adivinanza[0] = sc.nextInt(); 
                if (numero_adivinanza[0] == numeros[0]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[0] > numeros[0] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[0] < numeros[0]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue; // Usamos un 'continue' para que pase al siguiente bucle y continue el flujo del programa.
            }
            while (numero_adivinanza[1] != numeros[1]) {
                System.out.println("¡Adivina el segundo número!");
                numero_adivinanza[1] = sc.nextInt(); 
                if (numero_adivinanza[1] == numeros[1]) {
                    System.out.println("¡Felicidades! ¡Has adivinado todos los números! You win.");
                } else if (numero_adivinanza[1] > numeros[1] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[1] < numeros[1]) {
                    System.out.println("Prueba con un número mayor.");
                }
                if (numero_adivinanza[0] == numeros[0] && numero_adivinanza[1] == numeros[1]) {
                    System.out.println("La contraseña secreta es: " + numero_adivinanza[0] + numero_adivinanza[1]);
                }
            }
        }
        if (longitud_combinacion == 3) {
            while (numero_adivinanza[0] != numeros[0]) {
                System.out.println("¡Adivina el primer número!");
                numero_adivinanza[0] = sc.nextInt(); 
                if (numero_adivinanza[0] == numeros[0]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[0] > numeros[0] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[0] < numeros[0]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[1] != numeros[1]) {
                System.out.println("¡Adivina el segundo número!");
                numero_adivinanza[1] = sc.nextInt(); 
                if (numero_adivinanza[1] == numeros[1]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[1] > numeros[1] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[1] < numeros[1]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[2] != numeros[2]) {
                System.out.println("¡Adivina el tercer número!");
                numero_adivinanza[2] = sc.nextInt(); 
                if (numero_adivinanza[2] == numeros[2]) {
                    System.out.println("¡Felicidades! ¡Has adivinado todos los números! You win.");
                } else if (numero_adivinanza[2] > numeros[2] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[2] < numeros[2]) {
                    System.out.println("Prueba con un número mayor.");
                }
            }
            if (numero_adivinanza[0] == numeros[0] && numero_adivinanza[1] == numeros[1] && numero_adivinanza[2] == numeros[2]) {
                    System.out.println("La contraseña secreta es: " + numero_adivinanza[0] + numero_adivinanza[1] + numero_adivinanza[2]);
            }
        }
        if (longitud_combinacion == 4) {
            while (numero_adivinanza[0] != numeros[0]) {
                System.out.println("¡Adivina el primer número!");
                numero_adivinanza[0] = sc.nextInt(); 
                if (numero_adivinanza[0] == numeros[0]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[0] > numeros[0] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[0] < numeros[0]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[1] != numeros[1]) {
                System.out.println("¡Adivina el segundo número!");
                numero_adivinanza[1] = sc.nextInt(); 
                if (numero_adivinanza[1] == numeros[1]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[1] > numeros[1] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[1] < numeros[1]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[2] != numeros[2]) {
                System.out.println("¡Adivina el tercer número!");
                numero_adivinanza[2] = sc.nextInt(); 
                if (numero_adivinanza[2] == numeros[2]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[2] > numeros[2] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[2] < numeros[2]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[3] != numeros[3]) {
                System.out.println("¡Adivina el cuarto número!");
                numero_adivinanza[3] = sc.nextInt(); 
                if (numero_adivinanza[3] == numeros[3]) {
                    System.out.println("¡Felicidades! ¡Has adivinado todos los números! You win.");
                } else if (numero_adivinanza[3] > numeros[3] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[3] < numeros[3]) {
                    System.out.println("Prueba con un número mayor.");
                }
                if (numero_adivinanza[0] == numeros[0] && numero_adivinanza[1] == numeros[1] && numero_adivinanza[2] == numeros[2] && numero_adivinanza[3] == numeros[3]) {
                    System.out.println("La contraseña secreta es: " + numero_adivinanza[0] + numero_adivinanza[1] + numero_adivinanza[2] + numero_adivinanza[3]);
                }
            }
        }
        if (longitud_combinacion == 5) {
            while (numero_adivinanza[0] != numeros[0]) {
                System.out.println("¡Adivina el primer número!");
                numero_adivinanza[0] = sc.nextInt(); 
                if (numero_adivinanza[0] == numeros[0]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[0] > numeros[0] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[0] < numeros[0]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[1] != numeros[1]) {
                System.out.println("¡Adivina el segundo número!");
                numero_adivinanza[1] = sc.nextInt(); 
                if (numero_adivinanza[1] == numeros[1]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[1] > numeros[1] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[1] < numeros[1]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[2] != numeros[2]) {
                System.out.println("¡Adivina el tercer número!");
                numero_adivinanza[2] = sc.nextInt(); 
                if (numero_adivinanza[2] == numeros[2]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[2] > numeros[2] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[2] < numeros[2]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[3] != numeros[3]) {
                System.out.println("¡Adivina el cuarto número!");
                numero_adivinanza[3] = sc.nextInt(); 
                if (numero_adivinanza[3] == numeros[3]) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número! Préparate para el siguiente.");
                } else if (numero_adivinanza[3] > numeros[3] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[3] < numeros[3]) {
                    System.out.println("Prueba con un número mayor.");
                }
                continue;
            }
            while (numero_adivinanza[4] != numeros[4]) {
                System.out.println("¡Adivina el quinto número!");
                numero_adivinanza[4] = sc.nextInt(); 
                if (numero_adivinanza[4] == numeros[4]) {
                    System.out.println("¡Felicidades! ¡Has adivinado todos los números! You win.");
                } else if (numero_adivinanza[4] > numeros[4] ) {
                    System.out.println("Prueba con un número menor.");
                } else if (numero_adivinanza[4] < numeros[4]) {
                    System.out.println("Prueba con un número mayor.");
                }
                if (numero_adivinanza[0] == numeros[0] && numero_adivinanza[1] == numeros[1] && numero_adivinanza[2] == numeros[2] && numero_adivinanza[3] == numeros[3] && numero_adivinanza[4] == numeros[4]) {
                    System.out.println("La contraseña secreta es: " + numero_adivinanza[0] + numero_adivinanza[1] + numero_adivinanza[2] + numero_adivinanza[3] + numero_adivinanza[4]);
                }
            }
        }
        sc.close(); // Cerramos escáner.

        return longitud_combinacion; // Devolvemos 'longitud_combinacion'. Esto es meramente para devolver algo y que la función no dé error.
    }
}
