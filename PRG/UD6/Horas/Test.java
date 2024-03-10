package Horas;

public class Test {
    public static void main(String[] args) {

        // Creamos una instancia a la clase Hora y colocamos el tiempo correspondiente.
        Hora h = new Hora(15, 10);
        
        // Llamamos a los métodos para ver los resultados.
        System.out.println(); // Salto de línea.
        h.inc();
        System.out.println(h);
        h.setMinuto(30);
        System.out.println(); // Salto de línea.
        System.out.println(h);
        h.setHora(0);
        System.out.println("______"); // Separador.
        System.out.println(); // Salto de línea.
        System.out.println(h);
    }
}
