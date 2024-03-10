package Intro.prueba;

public abstract class A {

    String nombre = "Gei";

    abstract void metodo();

    void metodonoabs() {
        System.out.println("Soy un método no abstracto A.");
    }
}