package Biblioteca;

public class Z_Todo_en_uno {

    // Clase que representa un libro
    class Libro {
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

        // Método toString para imprimir el libro de manera legible
        @Override
        public String toString() {
            return "Libro{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", anioPublicacion=" + anioPublicacion +
                    '}';
        }
    }

    // Clase que representa un usuario
    class Usuario {
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

        // Método toString para imprimir el usuario de manera legible
        @Override
        public String toString() {
            return "Usuario{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }

    // Clase que representa una biblioteca
    class Biblioteca {
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

    // Clase principal que contiene el método main
    public class Test {
        public static void main(String[] args) {
            // Crear una instancia de la biblioteca con capacidad para 10 libros y 5 usuarios
            Biblioteca biblioteca = new Biblioteca(10, 5);

            // Crear instancias de libros y usuarios
            Z_Todo_en_uno.Libro libro1 = new Z_Todo_en_uno.Libro("Java Programming", "John Doe", 2020);
            Z_Todo_en_uno.Libro libro2 = new Z_Todo_en_uno.Libro("Data Structures in Python", "Jane Smith", 2019);

            Z_Todo_en_uno.Usuario usuario1 = new Z_Todo_en_uno.Usuario("Alice", 25);
            Z_Todo_en_uno.Usuario usuario2 = new Z_Todo_en_uno.Usuario("Bob", 30);

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
}
