package Intro.musica;

public class Test {
    public static void main(String[] args) {
        
        Piano p = new Piano();

        p.add(Nota.SI);
        p.add(Nota.DO);
        p.add(Nota.MI);

        p.interpretar();
    }
}
