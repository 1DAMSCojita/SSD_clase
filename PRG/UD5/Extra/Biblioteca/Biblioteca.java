package Biblioteca;

public class Biblioteca {

    private Libro[] libros;  // Array para almacenar libros
    private Usuario[] usuarios;  // Array para almacenar usuarios

    // Constructor para inicializar la biblioteca con capacidad para libros y usuarios
    public Biblioteca(int capacidadLibros, int capacidadUsuarios) {
        libros = new Libro[capacidadLibros];
        usuarios = new Usuario[capacidadUsuarios];
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = libro;
                System.out.println("Libro agregado a la biblioteca: " + libro.getTitulo());
                return;
            }
        }
        System.out.println("La biblioteca está llena, no se puede agregar más libros.");
    }

    // Método para agregar un usuario a la biblioteca
    public void agregarUsuario(Usuario usuario) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                System.out.println("Usuario agregado a la biblioteca: " + usuario.getNombre());
                return;
            }
        }
        System.out.println("La biblioteca está llena, no se pueden agregar más usuarios.");
    }

    // Método para mostrar el catálogo de libros en la biblioteca
    public void mostrarCatalogo() {
        System.out.println("Catálogo de libros en la biblioteca:");
        for (Libro libro : libros) {
            if (libro != null) {
                System.out.println(libro);
            }
        }
    }

    // Método para mostrar la lista de usuarios en la biblioteca
    public void mostrarUsuarios() {
        System.out.println("Usuarios registrados en la biblioteca:");
        for (Usuario usuario : usuarios) {
            if (usuario != null) {
                System.out.println(usuario);
            }
        }
    }
}

