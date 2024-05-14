package Interficies_Funcionales_II;

// Importación de librerías.
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        
        // Creamos un array de clientes y les añadimos un nombre y una edad.
        Cliente[] clientes = {
            new Cliente("Juan", 24),
            new Cliente("Stefan", 18),
            new Cliente("Pedro", 32),
            new Cliente("Miguel", 21),
        };

        // Usamos el objeto de Consumer (de tipo cliente) y creamos una variable, usamos lamba para mostrar la información.
        Consumer<Cliente> cli = c -> System.out.println("-Cliente " + c.nombre + ", tiene " + c.edad + " años.");

        paraCada(clientes, cli); // Llamamos al método de 'paraCada' y le pasamos el array de clientes y la variable anteriormente creada para mostrar todo por consola.
    }

    static <T> void paraCada(T[] arrayP, Consumer<T> c) {

        // Creamos un bucle 'for'.
        // Recorrerá el primer array 'arrayP'.
        for (int i = 0; i < arrayP.length; i++) {
            c.accept(arrayP[i]); // Llamamos al método 'accept'para que el objeto c use el 'arrayP' cada posición.            
        }
    }

}
