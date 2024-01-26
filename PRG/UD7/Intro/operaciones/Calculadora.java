package Intro.operaciones;

public class Calculadora implements OperacionesMatematicas {

    double x;
    double y;

    Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void sumar(double x, double y) {
        double res = x + y;
        System.out.println(res);
    }

    public void restar(double x, double y) {
        double res = x + y;
        System.out.println(res);
    }

    public void multiplicar(double x, double y) {
        double res = x + y;
        System.out.println(res);
    }

    public void dividir(double x, double y) {
        double res = x + y;
        System.out.println(res);
    }
        
}
