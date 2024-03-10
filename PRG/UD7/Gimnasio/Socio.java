package Gimnasio;

public interface Socio {
	
    // Creamos un método que registrará la asistencia del socio.
    boolean registrarAsistencia();

    // Creamos un método que indica que el socio está realizando un ejercicio.
    void realizarEjercicio(String ejercicio);

    // Creamos un método que obtiene y devuelve el nombre del socio.
    String obtenerNombre();
    
}
