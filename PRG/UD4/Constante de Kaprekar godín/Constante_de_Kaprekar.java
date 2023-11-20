
// Importación de librerías.
import java.util.Arrays;
import java.util.Scanner;

public class Constante_de_Kaprekar {
    public static void main(String[] args) {

        // Declaración de variables.
        int x = 0; // 'x' será el número introducido por el usuario.
        int iteraciones = 0; // 'iteraciones' será el número de iteraciones.

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.

        // Presentamos la aplicación.
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("¡Bienvenido a la Constante de Kaprekar en Java! En este programa llegarás siempre al mismo resultado. ");
        System.out.println("Prúebalo. Introduce un número de 4 cifras.");
        System.out.println();
        System.out.println("Nota: Dos de las cifras que introduzcas deben ser diferentes.");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        x = sc.nextInt(); // Guardamos el número añadido por el usuario.

        // Creamos una estructura de control 'if'.
        // Este 'if' verificará si el número que introdució el usuario es o no de 4 cifras.
        // Si no lo es, pues dará un mensaje de error y el programa se detiene.
        if (x < 1000 || x > 9999) {
            System.out.println("Error. Introduce un número de 4 cifras válido y vuelve a intentarlo.");
            return;
        }

        // Llamamos a la función 'kaprekarIteraciones' (que es la principal) para contar las iteraciones.
        iteraciones = kaprekarIteraciones(x, 0);

        System.out.println("El número " + x + " necesita " + iteraciones + " iteraciones."); // Mostramos las iteraciones que el programa necesitó por consola.
    }

    // Creamos una nueva función para calcular las iteraciones hasta llegar a la constante de Kaprekar.
    public static int kaprekarIteraciones(int x, int iteracion) {

        // Creamos una estructura de control 'if'.
        // Este 'if' verificará si el número ya es la constante de Kaprekar o si se alcanzó el límite de iteraciones.
        if (x == 6174 || iteracion >= 7) {
            return iteracion;
        }

        // Declaramos la variable array 'digitos' y llamamos a la función de 'obtenerDigitos'.
        int[] digitos = obtenerDigitos(x);

        // Declaramos las variables 'ascendente' y 'descendente' llamando a la función 'formarNumero'. Si es true la guardamos en ascendente, si no, en descendente.
        int ascendente = formarNumero(digitos, true);
        int descendente = formarNumero(digitos, false);

        // Declaramos la variable 'diferencia' que será el cálculo básicamente.
        int diferencia = descendente - ascendente;
        System.out.printf("%04d - %04d = %04d%n", descendente, ascendente, diferencia); // Mostramos por consola el paso.
        // ↑
        // Usamos esta sintaxis y un 'printf' para poder printear "%04d" en cada posición. ¿Esto por qué se realiza? Pues simplemente lo hacemos para que en caso de que
        // el número por ejemplo sea 999 (que dé en un cálculo) poder añadirle un 0 en la primera posición. De esa manera, saldrá '0999' complementando las cuatro cifras.

        // Realizamos una llamada recursiva para devolver el resultado y el número de iteraciones.
        return kaprekarIteraciones(diferencia, iteracion + 1);
    }

    // Creamos una nueva función para obtener un array de dígitos a partir de un número.
    public static int[] obtenerDigitos(int x) {
        // Declaramos la variable y array 'digitos', le ponemos 4 para que examine pues las 4 cifras introducidas.
        int[] digitos = new int[4];

        // Creamos un bucle 'for'.
        // Este bucle se encargará de extraer los dígitos del número y almacenarlos dentro del array.
        for (int i = 3; i >= 0; i--) {
            digitos[i] = x % 10;
            x /= 10;
        }

        return digitos; // Devolvemos los dígitos almacenados.
    }

    // Creamos una nueva función para formar un número a partir de un array de dígitos.
    public static int formarNumero(int[] digitos, boolean ascendente) {
        // Declaramos la variable 'x' que en esta función almacenará el número generado.
        int x = 0;

        // Creamos una estuctura de control 'if'.
        // Si se requiere un orden ascendente, ordenamos el array y ya.
        if (ascendente) {
            Arrays.sort(digitos);
        // Si no, realizaremos un intercambio de elementos en el array.
        } else {
            Arrays.sort(digitos);
            // Intercambiamos el elemento actual con su correspondiente simétrico.
            // Esto se hace básicamente para invertir el orden.
            int cuenta_bucle;
            for (int i = 0; i < digitos.length / 2; i++) {
                cuenta_bucle = digitos[i];
                digitos[i] = digitos[digitos.length - 1 - i];
                digitos[digitos.length - 1 - i] = cuenta_bucle;
            }
        }

        // Creamos un bucle 'for-each'.
        // Recorrerá el array de dígitos y formará el número.
        for (int digito : digitos) {
            x = x * 10 + digito;
        }

        // Devolvemos el número formado.
        return x;
    }
}
