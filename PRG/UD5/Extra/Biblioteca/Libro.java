package Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor para inicializar los atributos del libro
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters para obtener los atributos del libro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
