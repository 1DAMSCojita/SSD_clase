package Ejercicio_2;

public class TestJornada {
    public static void main(String[] args) {

        // Creamos una instancia de la clase Jornada y aplicándole información a los atributos.
        Jornada j = new Jornada("Y2448045P", "06/02/2024 18:00:00", "06/02/2024 21:30:00");

        // Enseñamos la información por consola.
        System.out.println(j.toString());
        System.out.println(j.minutosTrabajadosJornada());
        
    }
}
