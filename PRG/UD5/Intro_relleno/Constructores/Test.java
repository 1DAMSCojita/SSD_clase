package Constructores;

public class Test {
    public static void main(String[] args) {
        
        Animal a = new Animal("mono", 4, true);
        Animal b = new Animal("gato", 4);
        Animal c = new Animal(true);

        a.mostrar_informacion();
        b.mostrar_informacion();
        c.mostrar_informacion();

    }
}