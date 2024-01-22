package Intro.herencia1;

public class Test {
    public static void main(String[] args) {
        
        Empleado e = new Empleado("Paco", 32, 1.70, 57,5000.05, true);
        Empleado e2 = new Empleado("Paco", 32, 1.70, 57,5000.05, true);
 
        System.out.println(e.toString());
        System.out.println(e2.toString());
        
        System.out.println(e.equals(e2));
    
    }
}
 