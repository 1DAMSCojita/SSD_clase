package Atletas;

public class TestAtletes {
    public static void main(String[] args) {
        
        // Creamos una instancia para cada clase, 'a2', 'c2' y 's2' serán nuevos objetos creados para realizar comprobaciones en las comparaciones.
        Atleta a = new Atleta("Pedro", 17);
        Atleta a2 = new Atleta("Pedro", 17);
        Corredor c = new Corredor("Paco", 20, 100);
        Corredor c2 = new Corredor("Paula", 21, 120);
        Saltador s = new Saltador("Patricio", 23, 20);
        Saltador s2 = new Saltador("Patricio", 23, 20);

        // Llamamos a los métodos para mostrar información por consola. 
        System.out.println(); // Salto de línea.
        System.out.println(a.toString());
        System.out.println("______________"); // Separador.
        System.out.println(); // Salto de línea.
        System.out.println(c.toString());
        System.out.println("______________"); // Separador.
        System.out.println(); // Salto de línea.
        System.out.println(s.toString()); // Separador.
        System.out.println(); // Salto de línea.
        System.out.println(a.equals(a2));
        System.out.println(c.equals(c2));
        System.out.println(s.equals(s2));
    }
}
