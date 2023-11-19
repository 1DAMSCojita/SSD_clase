
// Importación de librerías.
import java.util.Scanner; 

public class Decimal_y_binario {
    public static void main(String[] args) {

        // Presentamos el programa.
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. Este programa consiste en realizar conversiones de decimales y binarios.");
        System.out.println("Elije una de estas opciones:");
        System.out.println();
        System.out.println("1- Realizar conversión de decimal a binario. ");
        System.out.println("2- Realizar conversión de binario a decimal. ");
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();

        String resultado = conversion(); // Llamamos a la función 'conversion' y la introducimos en una nueva variable.
        System.out.println("El resultado es: " + resultado); // Mostramos el resultado por consola.
    }

    // Declaramos una nueva función que realizará la conversión y posteriormente devolverá el resultado. La haremos 'String' ya que el resultado que devolverá es string.
    public static String conversion() {

        // Declaración de variables.
        int x = 0;
        String conversion_b_o_d= "";
        int residuo = 0;
        int opcio = 0;

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos
        opcio = sc.nextInt(); // Guardamos el número introducido por el usuario.

        // Creamos una estructura condicional "if".
        // Si el usuario pulsa 1, el programa comprenderá que lo que quiere hacer es convertir de decimal a binario.
        // Si el usuario pulsa 2, el programa comprenderá que lo que quiere hacer es convertir de binario a decimal.
        if (opcio == 1) {
            System.out.println("Escribe tu número que quieras convertir a binario: "); // Pedimos al usuario que ponga el número en el que quiera convertir a binario.
            x = sc.nextInt(); // Guardamos el número del usuario.
            // Empieza el programa.
            // Creamos un bucle 'while', mientras que 'x' sea mayor a 0:
            while (x > 0) {
                residuo = x % 2; // Obtenemos el residuo de la división por 2.
                conversion_b_o_d = residuo + conversion_b_o_d; // Guardamos el resto de la división y la sumamos con el binario.
                x = x / 2; // Dividimos el número decimal por 2.
            }    
        } else if (opcio == 2) {
            System.out.println("Escribe tu número que quieras convertir a decimal."); // Pedimos el número.
            sc.nextLine(); // Guardamos la entrada
            conversion_b_o_d = sc.nextLine(); // Guardamos la entrada dentro de conversion_b_o_d
            for (int i = conversion_b_o_d.length() - 1; i >= 0; i--) { // Leemos el número de derecha a izquierda.
                if (conversion_b_o_d.charAt(i) == '1') { // Comprobamos si el número de la posición es 1 o diferente.
                    x += Math.pow(2, conversion_b_o_d.length() - 1 - i); // Suma todos los resultados elevado a 2 en cada posición de la cadena.
                } else {
                    x = x + 0; // No sumamos nada.
                }
                System.out.println("El nombre decimal es: " + x); // Imprimimos el  resultado por pantalla.
            }
            // Nota: El código a partir de aquí puede mostrar el resultado 8 veces por alguna razón que no sé cómo arreglar. Pero al final será el número
            // decimal correcto. Después también mostrará de nuevo el número que hayamos escogido debajo. Ya que igualmente devolverá la cadena
            // 'conversion_b_o_d' y a main se llamará la función. 
        } 
        sc.close(); // Cerramos escáner.
        return conversion_b_o_d; // Devolvemos el resultado.
        
    }
}
