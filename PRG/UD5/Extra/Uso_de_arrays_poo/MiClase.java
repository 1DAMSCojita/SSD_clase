package Uso_de_arrays_poo;

public class MiClase {

    private int[] arrayNumeros;

    // Constructor que inicializa el array
    public MiClase(int longitud) {
        arrayNumeros = new int[longitud];
        inicializarArray();
    }

    // Método privado para inicializar el contenido del array (puedes personalizar esto según tus necesidades)
    private void inicializarArray() {
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = i + 1;  // Inicializar el array con números del 1 al tamaño del array
        }
    }

    // Getter para acceder al array desde fuera de la clase (opcional)
    public int[] getArrayNumeros() {
        return arrayNumeros;
    }
    
}
