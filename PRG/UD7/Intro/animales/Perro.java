package Intro.animales;

public class Perro implements Sonido {
    
    public void voz() {
        System.out.println("WOFF WOFF!");
    }

    @Override
    public void vozDurmiendo() {
        System.out.println("...zzzz... never gonna give you up... zzzz... versión perril.");
    }
}
