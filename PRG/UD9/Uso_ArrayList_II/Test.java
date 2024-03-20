package Uso_ArrayList_II;

// Importación de librerías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Creamos un nuevo ArrayList.
        ArrayList<String> al = new ArrayList<>();

        // Agregamos colores en el ArrayList.
        al.add("Azul");
        al.add("Blanco");
        al.add("Negro");
        al.add("Verde");

        // Recorremos la colección iterando a través de todos los elementos del ArrayList con un bucle 'for-each'.
        for (String colores : al) {
            System.out.println(colores);
        }

        // Insertamos un elemento en la primera posición del ArrayList.
        al.add(1, "Morado");
        
        // Recuperamos un elemento específico del ArrayList.
        System.out.println(al.get(3));

        // Actualizamos un elemento del ArrayList por otro.
        al.set(3, "Rojo");

        // Quitamos el tercer elemento del ArrayList.
        al.remove(3);

        // Buscamos un elemento concreto en el ArrayList.
        al.contains("Negro");

        // Ordenamos el ArrayList alfabéticamente con el método 'sort'.
        Collections.sort(al);

        // Mezclamos los elementos en el ArrayList.
        Collections.shuffle(al);

        // Invertimos los elementos en el ArrayList.
        Collections.reverse(al);

        // Intercambiamos dos elementos del ArrayList.
        Collections.swap(al, 1, 3);

        // Extraemos una parte (rango) del ArrayList. Para ello creamos una nueva lista y usamos el método 'subList'. Finalmente lo mostramos.
        List<String> parte = al.subList(1, 3);
        System.out.println("Parte extraida: " + parte);

        // Reemplazamos el segundo elemento del ArrayList por otro.
        al.set(2, "Amarillo");

        // Copiamos el ArrayList.
        @SuppressWarnings("unused")
        ArrayList<String> al2 = new ArrayList<>(al);

        // Vacíamos el ArrayList.
        al.clear();

        // Probamos si el ArrayList está vacío.
        String[] arraylist = (String[]) al.toArray(new String[al.size()]);
        System.out.println(arraylist.length);

    }
}
