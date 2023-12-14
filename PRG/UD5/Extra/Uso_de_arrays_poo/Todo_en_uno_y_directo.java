package Uso_de_arrays_poo;

public class Todo_en_uno_y_directo {

    public static class MiClase {
        private int[] arrayNumeros;

        // Constructor que inicializa el array con valores específicos
        public MiClase() {
            arrayNumeros = new int[]{47, 52, 32, 48, 21};
        }

        // Getter para acceder al array desde fuera de la clase
        public int[] getArrayNumeros() {
            return arrayNumeros;
        }

        // Otros métodos de la clase...
    }

    public static void main(String[] args) {
        // Crear una instancia de MiClase
        MiClase instancia = new MiClase();

        // Obtener el array y mostrar su contenido
        int[] arrayObtenido = instancia.getArrayNumeros();

        System.out.println("Contenido del array:");
        for (int numero : arrayObtenido) {
            System.out.println(numero);
        }
    }
}
