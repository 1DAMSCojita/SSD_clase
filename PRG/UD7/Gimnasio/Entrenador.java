package Gimnasio;

public interface Entrenador extends Socio { // Añadimos que esta interfaz extenderá de la otra interfaz 'Socio'.
	
    // Creamos un método que permitirá al entrenador dar instrucciones a los socios.
    void darInstrucciones(String instruccion);

    // Creamos un método que realizará la evaluación del rendimiento del socio.
    void evaluarRendimiento();

    // Creamos un método por defecto que implementará la posibilidad de realizar entrenamientos personalizados.
    // Dentro de este método llamaremos a otros métodos ya definidos en la misma interfaz (los cuales son 
    // 'darInstrucciones()' y 'evaluarRendimiento()'). Con esto, cualquier clase que implemente la interfaz
    // 'Entrenador' tendrá acceso a este método por defecto para realizar entrenamientos personalizados.
    default void realizarEntrenamientoPersonalizado(String instruccion) {
        realizarSeguimiento();
        darInstrucciones(instruccion);
        evaluarRendimiento();
    }

    // Creamos un método estático que anunciará la llegada de un nuevo entrenador.
    static void anunciarNuevoEntrenador() {
        System.out.println("Un nuevo entrenador se aproxima...");
    }

    // Creamos un método privado que realizará un seguimiento interno (utilizado a través del método default).
    private void realizarSeguimiento() {
        System.out.println("Realizando seguimiento interno...");
    }

	

}
