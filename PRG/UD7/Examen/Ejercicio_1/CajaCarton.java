package Ejercicio_1;

public class CajaCarton extends Caja {

    // Declaración de variables.
    static double cartonTotal = 0;
    private double area;

    // Declaración de constructor.    
    CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, unidad);
        
        area = (ancho * alto) * 2 + (ancho + fondo) * 2 + (fondo * alto) * 2;

        cartonTotal += area;
    }

    public double getArea() {
        return area;
    }

    public double getVolum() {
        return super.getVolumen() * 0.8;
    }


    // Sobreescribimos el método 'toString()' para mostrar información de la caja.
    @Override
    public String toString() {
        return super.toString() + ". La caja es de cartón";
    }

    
}