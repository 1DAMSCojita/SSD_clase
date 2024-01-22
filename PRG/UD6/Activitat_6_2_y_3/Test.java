package Activitat_6_2_y_3;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una instancia a la clase 'HoraExacta'. 
        HoraExacta he = new HoraExacta(15, 57, 56);

        // Llamamos al método 'sonIguales' de la clase 'HoraExacta'. añadiendo los parámetros.
        he.sonIguales(15, 57, 56);
        
        // Comentario de todos los métodos anteriores ya que para esta actividad en específico no nos harán falta.
        
        System.out.println(); // Salto de línea.
        he.inc();
        System.out.println(he.toString());
        System.out.println(); // Salto de línea.
        he.setSegundo(10);
        System.out.println("______"); // Separador.
        System.out.println(); // Salto de línea.
        System.out.println(he.toString());
        System.out.println("______"); // Separador.
        System.out.println(); // Salto de línea.
        
    }
}
