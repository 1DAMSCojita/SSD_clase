package el_mejor_programa_del_siglo;

public class Test {
    public static void main(String[] args) {
        
        /* 
        Juls[] juls = {
            new Juls("Julardo", "Alaior"),
            new Juls("Julingo", "Alaior"),
            new Juls("Jusordio", "Alaior"),
            new Juls("Jusordio", "Alaior")
        };

        Pals[] pals = {
            new Pals("Palstacii", "Realidad Alterna"),
            new Pals("Nuls", "Realidad Alterna"),
            new Pals("Palurd", "Realidad Alterna"),
            new Pals("Palito", "Realidad Alterna")
        };

        for (Juls j : juls) {
            System.out.println(j);
        }

        for (Pals p : pals) {
            System.out.println(p);
        }
        */

        Pals p = new Pals("Palstacii", "Realidad Alterna");

        System.out.println(p.toString());
        p.accion();

    }
}