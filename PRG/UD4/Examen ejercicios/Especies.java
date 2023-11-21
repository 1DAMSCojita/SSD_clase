
// Importación de librerías.
import java.util.Scanner;

public class Especies {
    public static void main(String[] args) {
        
        // Declaración de variables.
        String x; // Declaramos 'x' que será el nombre que el usuario proporcionará sobre las especies.

        Scanner sc = new Scanner(System.in); // Creamos una entrada de datos.
        
        // Presentamos la aplicación.
        System.out.println("___________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Bienvenido. En este programa te iré especificando información sobre el nombre de las especies de peces comunes en Menorca.");
        System.out.println("Escribe la especie.");
        System.out.println();
        System.out.println("Nota: Ten en cuenta que hay tres especies: Lubina, Dorada, Mero.");
        System.out.println("Cualquier otra especie no la reconoceré.");
        System.out.println("____________________________________________________________________________________________________________________________");
        System.out.println();
        
        // Guardamos la especie escogida. Usamos next para que no printee también en la siguiente línea y 
        // usamos el .toLowerCase para distinguir minúsculas y mayúsculas.
        x = sc.next().toLowerCase(); 

        // Usamos una estructura de control 'switch'. La definimos en la variable recomendación.
        // Dependiendo de los casos, irá alternando. Respecto a la especie que introduzca el usuario.
        switch (x) {
            case "lubina": 
                System.out.println("Es una especie muy común en Menorca. Recomendación: Se encuentra con mayor frecuencia en aguas profundas");
                break;
            case "dorada": 
                System.out.println("Es una especie popular entre los pescadores de la región. Recomendación: Suele encontrarse en aguas de Menorca.");
                break;       
            case "mero":
                System.out.println("Es una especie de gran tamaño que habita en las aguas de Menorca. Recomendación: Pueden encontrarse cerca de formaciones rocosas.");
                break;

            default: 
                System.out.println("Esta especie no está en nuestro catálogo.");
                break;
        }

        sc.close(); // Cerramos escáner.
    }
}
