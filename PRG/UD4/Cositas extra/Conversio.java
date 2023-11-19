
import java.util.Scanner;

public class Conversio {
    	public static void main(String[] args) {
		
		// Declaración de variables.
		double x = 0;
		double conversion;
		double resultado;
		String mensaje_error = "";
		char opcion = ' ';
		
		Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.
		
		// Presentamos el programa.
		System.out.println("Bienvenido. En este programa se te ofrecerá dos opciones para convertir tu moneda.");
		System.out.println(); // Espacio en consola.
		System.out.println("Opción A. Convertir euros a doláres USA. ");
		System.out.println("Opción B. Transformar euros a libras esterlinas. ");
		opcion = sc.nextLine().charAt(0); // Guardamos la opción deseada por el usuario.
		mensaje_error = (opcion != 'A' && opcion != 'B') ? "Error. Vuelve a iniciar el programa y elige una opción válida." : ""; // Esta variable 'mensaje_error' comprobará si la opción escogida por el usuario no es ni 'A', ni 'B'. En caso de que lo sea, mostrará un mensaje de error y animará a reiniciar el programa. Si el usuario no lo hace, cualquier valor que introduzca posteriormente será 0. Pero, en caso de que si sea una opción válida, el programa seguirá su curso correctamente y no mostrará nada.
		System.out.println(mensaje_error); // Mostramos el mensaje de error en caso de que el usuario no introduzca correctamente la opción.
		
		// Comienza el programa, en función de una opción escogida se calculará la conversión a doláres o a libras esterlinas.
		System.out.println();
		System.out.println("Introduce tus euros: ");
		x = sc.nextDouble(); // Guardamos los euros que el usuario quiera cambiar.
		conversion = (opcion == 'A') ? 1.18 : (opcion == 'B') ? 0.90 : 0; // Comprobamos si ¿es opcion = A? En caso de que si, se le añade el valor 1.18 a la conversión. En caso contrario, hacemos otra pregunta. ¿Es opcion = B? En caso de que si, se le asigna el valor 0.95 a 'conversio', si no ocurre nada de eso, el valor será 0.
		resultado = x * conversion; // 'resultado' será los euros introducidos por el usuario multiplicado la conversión que toque. 
		System.out.println("Recibirás: " + resultado); // Imprimimos el resultado por pantalla.

        sc.close();
	}
}
