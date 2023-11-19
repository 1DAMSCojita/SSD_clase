
import java.util.Scanner;

public class Calculadora_suma_y_media {
    public static void main(String[] args) {
        
        double x = 0.0;
        double y = 0.0;

        Scanner sc = new Scanner(System.in); 

        System.out.println("Escribe un número:");
        x = sc.nextDouble();
        System.out.println("Escribe otro número:");
        y = sc.nextDouble();

        double fin = cálculo_suma_números(x, y);
        double fin_2 = cálculo_promedio(x, y);
        System.out.println("La suma de tus números es " + fin + " y el promedio es " + fin_2);
        sc.close();
    }

    public static double cálculo_suma_números(double x, double y) {
        return x + y;
    }

    public static double cálculo_promedio(double x, double y) {
        return (x + y) / 2.0;
    }
}
