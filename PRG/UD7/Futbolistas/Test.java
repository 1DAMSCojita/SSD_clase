package Futbolistas;

// Importación de librerías.
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
        // Creamos un array que almacena 5 futbolistas con su respectiva información.
        Futbolista[] futbolistas = {
            new Futbolista("12345778J", "Julscrem", 17, 2),
            new Futbolista("12345878D", "David", 18, 1),
            new Futbolista("12345978S", "Soka", 19, 2),
            new Futbolista("12345678F", "Felipe", 39, 0),
            new Futbolista("12345578B", "Brunho", 18, 2)
        };

        
        // Ordenamos los futbolistas por DNI mediante al array.
        System.out.println("_____________________________________________________________________________");
        System.out.println();
        System.out.println("Ordenación por DNI:");
        System.out.println();
        Arrays.sort(futbolistas);
        for (int i = 0; i < futbolistas.length; i++) {
            System.out.println(futbolistas[i]);
        }

        // Ordenamos los futbolistas por nombre mediante al array.
        System.out.println("_____________________________________________________________________________");
        System.out.println();
        System.out.println("Ordenación por nombre:");
        System.out.println();
        Arrays.sort(futbolistas, Futbolista.nombreComparator);
        for (int i = 0; i < futbolistas.length; i++) {
            System.out.println(futbolistas[i]);
        }

        // Ordenamos los futbolistas por edad mediante al array.
        System.out.println("_____________________________________________________________________________");
        System.out.println();
        System.out.println("Ordenación por edad:");
        System.out.println();
        Arrays.sort(futbolistas, Futbolista.edadComparator);
        // Creamos un bucle 'for'.
        // Recorrerá el array e irá mostrando la información por cada futbolista.
        for (int i = 0; i < futbolistas.length; i++) {
            System.out.println(futbolistas[i]);
        }
        System.out.println("_____________________________________________________________________________");

    }
}
