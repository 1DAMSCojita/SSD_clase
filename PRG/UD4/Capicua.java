// Importación de librerías.
import java.util.Scanner;

public class Capicua {
	public static void main(String[] args) {
		
		// Declaración de variables.
		String entrada = "";

		Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.
		
		// Presentamos el programa.
		System.out.println("Bienvenido. En este programa te dire si el número que has introducido es o no capicua (Solo del 1 al 9999). ");
		System.out.println("Introduce tu número: ");
		entrada = sc.nextLine(); // Guardamos el número introducido por el usuario.

		// Vamos comparando si los carácteres son iguales en resumen. En el primer bloque, lo hacemos en base al primer carácter, i comprobamos si 'x'
		// es mayor o igual a 0 y a 9 (usamos ascii para que básicamente se pueda comprar un char de manera correcta). En caso de que si, diremos que
		// es capicua, y si no, no lo es. Pero, si el usuario introduce un valor que no es válido, el programa lo avisará con un mensaje de error. 
		// En el primer bloque, solo comprueba que hemos escrito el número correctamente. Es solamente para seguir el flujo. A partir de los siguientes 
		// bloques haremos EXACTAMENTE lo mismo pero añadiendo más carácteres y variables hasta llegar a los dígitos máximos permitidos. 
		if (entrada.length() == 1) {
			char x = entrada.charAt(0);
			if (x >= 48 && x <= 57) {
				System.out.println("Es capicua.");
			} else {
				System.out.println("Error.");
			}
		} else if (entrada.length() == 2) {
			char x = entrada.charAt(0);
			char y = entrada.charAt(1);
			if (x >= 48 && x <= 57 && y >= 48 && y <= 57) {
				if (x == y) {
					System.out.println("Es capicua.");
				} else {
					System.out.println("No es capicua.");
				}
				} else {
					System.out.println("Error.");
				}
		} else if (entrada.length() == 3) {
			char x = entrada.charAt(0);
			char y = entrada.charAt(1);
			char z = entrada.charAt(2);
			if (x >= 48 && x <= 57 && y >= 48 && y <= 57 && z >= 48 && z <= 57) {
				if (x == z) {
					System.out.println("Es capicua.");
				} else {
					System.out.println("No es capicua.");
				}
				} else {
					System.out.println("Error.");
				}
		} else if (entrada.length() == 4) {
			char x = entrada.charAt(0);
			char y = entrada.charAt(1);
			char z = entrada.charAt(2);
			char n = entrada.charAt(3);
			if (x >= 48 && x <= 57 && y >= 48 && y <= 57 && z >= 48 && z <= 57 && n >= 48 && n <= 57) {
				if (x == n && y == z) {
					System.out.println("Es capicua.");
				} else {
					System.out.println("No es capicua.");
				}
				} else {
					System.out.println("Error.");
				}
		} else {
			System.out.println("Error.");
		}
        sc.close(); // Cerramos escáner.
	}
}

