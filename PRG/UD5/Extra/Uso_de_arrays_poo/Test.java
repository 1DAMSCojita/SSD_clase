package Uso_de_arrays_poo;

public class Test {
    public static void main(String[] args) {
        // Crear una instancia de MiClase con un array de longitud 5
        MiClase instancia = new MiClase(5);

        // Obtener el array y mostrar su contenido
        int[] arrayObtenido = instancia.getArrayNumeros();

        System.out.println("Contenido del array:");
        for (int numero : arrayObtenido) {
            System.out.println(numero);
        }
    }
    
}
