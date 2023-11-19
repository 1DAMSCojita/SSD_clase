
import java.util.Scanner; 

public class Fahrenheit_y_celsius {
    public static void main(String[] args) {
        
        String opcion = "";
        double x = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido. En este programa se te dará la opción de realizar conversiones de grados. Elije tu opción.");
        System.out.println();
        System.out.println("Opción A. Convertir de Celsius a Fahrenheit.");
        System.out.println("Opción B. Convertir de Fahrenheit a Celsius.");
        opcion = sc.nextLine();

        double fin = cálculo(opcion, x);
        System.out.println("El resultado es: " + fin);
        sc.close();
    }

    public static double cálculo(String opcion, double x) {

        double resultado = 0.0;

        Scanner sc = new Scanner(System.in);

        if (opcion.equals("A")) {
            System.out.println("Introduce los Celsius que quieras convertir a Fahrenheit:");
            x = sc.nextDouble();
            resultado = (x * 9 / 5) + 32;
            sc.close();
            return resultado;

        } else if (opcion.equals("B")) {
            System.out.println("Introduce los Fahrenheits que quieras convertir a Celsius:");
            x = sc.nextDouble();
            resultado = (x - 32) * 5 / 9;
            sc.close();
            return resultado;
        }
        sc.close();

        return resultado;
    }
}
