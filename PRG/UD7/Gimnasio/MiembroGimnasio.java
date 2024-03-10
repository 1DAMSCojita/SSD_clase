package Gimnasio;

// Importación de librerías.
import java.util.Random;

public class MiembroGimnasio implements Entrenador { // Añadimos que 'MiembroGimnasio' implemente 'Entrenador'. Que a su vez, implementa 'Socio'.
	
	// Sobreescribimos el método 'registrarAsistencia()'.
	@Override
    public boolean registrarAsistencia() {
		Random random = new Random(); // Generamos un valor booleano aleatorio. Un 0 o 1.
		return random.nextBoolean(); // Devolvemos el valor booleano generado anteriormente.
    }

	// Implementamos el método 'realizarEjercicio' de la interfaz 'Entrenador'. Añadiendo información del ejercicio.
    public void realizarEjercicio(String ejercicio) {
        System.out.println("¡El socio realiza " + ejercicio + "!");
    }

    // Implementamos el método 'obtenerNombre' de la interfaz 'Entrenador'. 
    public String obtenerNombre() {
        return "Juan"; // Devolvemos el nombre.
    }

    // Implementamos el método 'darInstrucciones' de la interfaz 'Entrenador'.
    public void darInstrucciones(String instruccion) {
        System.out.println(instruccion); // Enseñamos la instrucción que el usuario pondrá en el Test.
    }

    // Implementamos el método 'evaluarRendimiento' de la interfaz 'Entrenador'. 
    public void evaluarRendimiento() {
        Random random = new Random(); // Generamos un valor booleano aleatorio. Un 0 o 1.
        // Creamos una estructura de control 'if'.
        // Si el valor booleano generado anteriormente es 1 (es decir, true) enseñamos un mensaje positivo relacionado con el rendimiento del socio.
        // En caso contrario, pues enseñamos un mensaje indicando que el rendimiento es insuficiente y motivando a que el socio continue intentándolo.
        if (random.nextBoolean() == true) {
            System.out.println("-Tu rendimiento es correcto. ¡Continua así!");
        } else if (random.nextBoolean() == false) {
            System.out.println("-Tu rendimiento es insuficiente. ¡Continua intentándolo!");
        }
    }
   
}
