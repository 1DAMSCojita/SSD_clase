package Llamada;

// Importación de librerías.
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
        // Creamos un array que contendrá todas las llamadas con su respectiva información.
        Llamada[] llamadas = {
            new Llamada("+34617890345", "+43653123456", true, "31/01/2024 19:55:33", "31/01/2024 20:05:33", Zona.ZONA_1),
            new Llamada("+34617891345", "+43653122456", false, "01/02/2024 16:43:01", "01/02/2024 20:24:33", Zona.ZONA_2),
            new Llamada("+34617892345", "+43653124456", true, "02/02/2024 17:13:31", "02/02/2024 20:26:33", Zona.ZONA_3),
            new Llamada("+34617893345", "+43653125456", false, "03/02/2024 15:43:29", "03/02/2024 20:27:33", Zona.ZONA_4),
            new Llamada("+34617894345", "+43653126456", true, "04/02/2024 18:02:12", "04/02/2024 20:43:33", Zona.ZONA_5)
        };

        Arrays.sort(llamadas, Llamada.Comparador); // Ordenamos el array de llamadas usando el método 'Arrays.sort()'.

        // Creamos un bucle 'for-each'.
        // Recorrerá el array de llamada y mostrará cada llamada por consola.
        for (Llamada llamada : llamadas) {
            System.out.println(llamada);
        }
        
    }
}
