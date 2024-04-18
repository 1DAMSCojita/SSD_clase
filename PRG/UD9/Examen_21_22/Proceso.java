package Examen_21_22;

public class Proceso {

    // Declaración de atributos.
    public static int contador = 0;
    int id = 0;
    String descripcion;
    long segundos;

    // Declaración de constructor.
    Proceso(String descripcion, long segundos) {
        id = contador++;
        this.descripcion = descripcion;
        this.segundos = segundos;
    }

    // Sobreescribimos el método 'toString()' para los procesos.
    @Override
    public String toString() {
        return descripcion + "...";
    }

}
