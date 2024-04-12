package Uso_Iterator;

// Importación de librerías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una instancia de la clase 'MercadoDeFrutas'.
        MercadoDeFrutas mf = new MercadoDeFrutas();

        // Añadimos frutas a la colección usando los métodos.
        System.out.println("-------------------------------------------------------");
        mf.añadirFruta(new Fruta("Plátano", 0.80));
        mf.añadirFruta(new Fruta("Manzana", 0.40));
        mf.añadirFruta(new Fruta("Pera", 0.50));
     
        testIterator(mf); // Llamamos al método de 'testIterator()' y le pasamos por parámetro el mercado de frutas.
        System.out.println("-------------------------------------------------------");
        System.out.println("Precio total de las frutas: " + mf.getPrecioTotal()); // Imprimimos el precio total de las frutas llamando al método 'getPrecioTotal()' de la clase 'MercadoDeFrutas'.

    }

    // Creamos un método para comprobar que se pueda recorrer la colección de frutas con un iterator.
    // Tendremos que añadir por parámetro la instancia de la clase 'MercadoDeFrutas'.
    public static void testIterator(MercadoDeFrutas mercado) {
        Iterator<Fruta> iterator = mercado.getIterator(); // Creamos un iterator de la clase fruta, usamos el parámetro de 'MercadoDeFrutas' y cogemos el getter del iterator creado.
        // Creamos un bucle 'while'.
        // En resumen lo que hará será iterar sobre la colección de frutas.
        while (iterator.hasNext()) {
            Fruta fruta = iterator.next(); // Obtenemos las frutas.
            System.out.println("-Fruta: " + fruta.nombre + " | " + "Precio: " + fruta.precio);
        }
    }
}
