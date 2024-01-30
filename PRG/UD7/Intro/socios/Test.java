package Intro.socios;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
        Socio s = new Socio(2481148, "Germán", "29-01-2024");
        Socio s2 = new Socio(2481149, "Maquelele", "29-01-2024");
        Socio s3 = new Socio(2481150, "Town", "29-01-2024");

        Socio[] misSocios = {s, s2, s3};

        ComparaEdades c = new ComparaEdades();

        Arrays.sort(misSocios, c);

        System.out.println(s.compareTo(s2));
        
        int[] miArray = {5, 3, 6, 9, 3, 4, 1, 0, 10};

        Arrays.sort(miArray);

        System.out.println(Arrays.toString(miArray));

        System.out.println(misSocios);


    }
}
