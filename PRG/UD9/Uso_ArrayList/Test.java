package Uso_ArrayList;

// Importación de liberías.
import java.util.*;

public class Test<T> {
    public static void main(String[] args) {
        
        // Creación del ArrayList.
        ArrayList<String> al = new ArrayList<>();
        
        // Añadimos varios elementos al ArrayList.
        al.add("Buenas");
        al.add("hoy");
        al.add("es");
        al.add("día");
        al.add("lectivo");
        al.add("Requete");
        al.add("Jueves");

        // Sustituimos el valor de posición 2 por otro nuevo.
        al.set(2, "no es");

        // Consultamos el tamaño del ArrayList.
        System.out.println(al.size());

        // Eliminamos el elemento que está en la posición 2.
        al.remove(2);

        // Eliminamos el elemento con valor "Requete".
        al.remove(5);

        // Obtenemos el valor del elemento de la posición 3.
        al.get(3);

        // Creamos una instancia de Test para poder llamar a métodos. Añadimos <String> para parametrizar (si no mostrará advertencias). 
        Test<String> oTest = new Test<>();

        // Llamamos a los métodos para recorrer el ArrayList.
        oTest.recorrerArrayFor(al);
        oTest.recorrerArrayForEach(al);

        // Comprobamos si existe un valor en el ArrayList.
        System.out.println(al.contains("Requete"));

        // Borramos todos los elementos del ArrayList.
        al.clear();

    }

    // Creamos un método para recorrer el array con un for.
    public void recorrerArrayFor(ArrayList<T> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    // Creamos un método para recorrer el array con un for-each.
    public void recorrerArrayForEach(ArrayList<T> a) {
        for (T t : a) {
            System.out.println(t);
        }
    }
}
