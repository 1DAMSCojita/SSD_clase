
import java.util.Scanner; // Importamos la librería para el escáner.

public class Calculadora {
    public static void main(String[] args) {
     
        // Declaramos las variables.
        double x = 0;
        double y = 0;
        double resultado = 0;
        char opcion = ' ';
        String mensaje_error = "";
        String mensaje_pillin = "";

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos el programa.
        System.out.println("Bienvenido. En este programa tendrás a tu disposición una calculadora que te permetirá varias opciones. Elige una de ellas: ");
        System.out.println();
        System.out.println("Opción A. Sumar.");
        System.out.println("Opción B. Restar.");
        System.out.println("Opción C. Multiplicar.");
        System.out.println("Opción D. Dividir.");
        opcion = sc.nextLine().charAt(0);

        // Creamos el mensaje de error en caso de que el usuario no introduzca ninguna opción válida.
        mensaje_error = (opcion != 'A' && opcion != 'B' && opcion != 'C' && opcion != 'D') ? "Error. Reinicia el programa y introduce una opción válida. Si sigues, el programa podría no funcionar correctamente. " : ""; // Verificamos si el usuario ha ingresado una opción válida. Si es así, el programa continuará su flujo. Si no, mostrará un mensaje de error recomendando reiniciar el programa.
        System.out.println(mensaje_error); // Mostramos el mensaje de error por consola advirtiendo al usuario.

        // Comienza el programa. Pediremos dos números y haremos un cálculo dependiendo de la opción.
        System.out.println(); // Espacio para la consola.
        System.out.println("Escribe un número: ");
        x = sc.nextDouble(); // Guardamos el número introducido por el usuario.
        System.out.println("Escribe otro número: ");
        y = sc.nextDouble(); // Guardamos el número introducido por el usuario.
        resultado = (opcion == 'A') ? x + y : (opcion == 'B') ? x - y : (opcion == 'C') ? x * y : (opcion == 'D') ? x / y : 0; // Comprobamos las opciones en base a operadores ternarios. Si el usuario ha elegido una de las opciones, se realizará el cálculo correspondiente y se guardará en la variable 'resultado'.
        mensaje_pillin = (opcion == 'D' && (x == 0) || (opcion == 'D') && (y == 0)) ? "Intendo dividir por cero... ¿eh pillín? No se puede dividir por 0, amigo." : ""; // Si el usuario intenta dividir por 0, el programa lo detectará y le recordará al final que no se puede.       
        System.out.println("El resultado de tu operación es: " + resultado); // Mostramos el resultado por consola.
        System.out.println(mensaje_pillin);

        sc.close(); // Cerramos el escáner.
    }
}
