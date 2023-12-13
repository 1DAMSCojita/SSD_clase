package Activitat_5_4;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una instancia a la clase Autoescola para coger los objetos y métodos de todo lo realizado.
        Autoescola ae = new Autoescola();

        // Llamamos a los métodos correspondientes.
        ae.examenTeoric();
        ae.examenPractic();
        ae.donarCarnet();

        // El programa muestra un resumen de nuestra estadía en la autoescuela.
        System.out.println("______________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Resumen autoescuela. ");
        System.out.println();
        System.out.println("Nombre: " + ae.a.getNom());
        System.out.println("Teórico: " + "Has hecho " + ae.a.getIntentsTeoric() + " intento/s. " + "Apto: " + ae.a.isTeoric());
        System.out.println("Práctico: " + "Has hecho " + ae.a.getIntentsPractic() + " intento/s. " + "Apto: " + ae.a.isPractic());
        System.out.println("Obtiene carnet: " + ae.a.isCarnet());
        System.out.println("______________________________________________________________________________________________________");
    }
}
