package Gimnasio;

public class Test {

	public static void main(String[] args) {
		
		// Creamos una instancia a la clase 'MiembroGimnasio'. Obtendremos todos los métodos de 'Entrenador' y 'Socio'.
		MiembroGimnasio mg = new MiembroGimnasio();
		
		// Creamos una estructura de control 'if'.
		// Dado el valor booleano generado del método 'registrarAsistencia()' de la interfaces 'Entrenador' y 'Socio',
		// si el valor sale 1 (lo que significaría true) concluirá que el entrenador ha asistido. Por lo tanto, el pro
		// grama continuará su flujo. En caso contrario y que salga 0, el programa mostrará que el entrenador no ha asi
		// stido, por lo tanto, no habrá entrenamiento por hoy y únicamente mostrará el mensaje y ya.
		if (mg.registrarAsistencia() == true) {
			System.out.println("El entrenador ha asistido.");
			System.out.println("Nombre del socio: " + mg.obtenerNombre());
			System.out.println("_______________________________________________"); // Separador.
			System.out.println(); // Espacio en consola.
			mg.realizarEjercicio("estiramientos");
			mg.darInstrucciones("-Estira el brazo un poco más...");
			mg.realizarEntrenamientoPersonalizado("-Ahora, realiza flexiones apoyando el abdomen sobre el suelo y levantándote.");
			mg.evaluarRendimiento();
			System.out.println(); // Espacio en consola.
			Entrenador.anunciarNuevoEntrenador(); // Llamamos a este método en específico de esta manera porque es estático y lo tenemos que hacer de esta manera.
			/*
			 * Nota:
			 * El método 'realizarSeguimiento()' es un método privado en la interfaz 'Entrenador'. No podemos llamarlo directamente desde
			 * fuera de la interfaz. Pero lo que si que podemos hacer es llamarlo indirectamente que es lo que estamos haciendo en el 
			 * método por defecto 'realizarEntrenamientoPersonalizado()', ya que forma parte indirectamente de este método.
			 */
		} else {
			System.out.println("El entrenador no ha asistido. No hay entrenamiento por hoy.");
		}		
	}

}
