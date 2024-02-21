package Ejercicio_3;

import java.util.Arrays;

public class TestBanco {
    public static void main(String[] args) {
        
        // Creamos una instancia a la clase Persona con información.
        Persona p1 = new Persona(4, 999.99, "Y2448045P", "Stefan", true, false);
        Persona p2 = new Persona(4, 999.99, "Y2448045P", "Stefan", true, false);
        Persona p3 = new Persona(4, 999.99, "Y2448045P", "Stefan", true, false);
        
        Persona[] p = {p1, p2, p3};
        
        p2.setSaldo(2000);
        p3.setSaldo(5);

        Arrays.sort(p);
        System.out.println(Arrays.deepToString(p));

    }
}
