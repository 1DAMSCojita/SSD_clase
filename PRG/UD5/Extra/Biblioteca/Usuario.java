package Biblioteca;

public class Usuario {

    private String nombre;
    private int edad;

    // Constructor para inicializar los atributos del usuario
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters para obtener los atributos del usuario
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}
