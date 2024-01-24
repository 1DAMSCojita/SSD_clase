package Intro;

public class Test {
    public static void main(String[] args) {
        
        B b = new B();

        A a = b;

        b.metodo();
        b.metodonoabs();
        System.out.println(b.nombre);

        System.out.println(a.nombre);
        a.metodo();
        a.metodonoabs();

    }
}
