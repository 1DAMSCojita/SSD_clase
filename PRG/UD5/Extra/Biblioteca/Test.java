package Biblioteca;

public class Test {
    public static void main(String[] args) {
        // Crear una instancia de la biblioteca con capacidad para 10 libros y 5 usuarios
        Biblioteca biblioteca = new Biblioteca(10, 5);

        // Crear instancias de libros y usuarios
        Libro libro1 = new Libro("Java Programming", "John Doe", 2020);
        Libro libro2 = new Libro("Data Structures in Python", "Jane Smith", 2019);

        Usuario usuario1 = new Usuario("Alice", 25);
        Usuario usuario2 = new Usuario("Bob", 30);

        // Agregar libros y usuarios a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        // Mostrar el catálogo y la lista de usuarios en la biblioteca
        biblioteca.mostrarCatalogo();
        biblioteca.mostrarUsuarios();
    }
}
