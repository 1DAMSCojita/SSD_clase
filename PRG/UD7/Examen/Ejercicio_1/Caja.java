package Ejercicio_1;

public class Caja {
    
    // Declaración de variables.
    final int ancho;
    final int alto;
    final int fondo;
    private double volumen;
    Unidad unidad;

    // Declaración de constructor.
    Caja (int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;

        switch (unidad) {
            case CM:
                this.volumen = (ancho/100) * (alto/100) * (fondo/100);
                break;
            case M:
                this.volumen = ancho * alto * fondo;
        }
    }

    // Implementamos un método que devuelve el volumen de la caja en metros cúbicos.
    double getVolumen() {
        return volumen;
    }

    // Implementamos un método que modifique el valor de la etiqueta de la caja.
    void setEtiqueta(String etiqueta) {
        etiqueta.trim().substring(0, 29);
    }

    // Devolvemos una cadena con la representación de la caja.
    public String toString() {
        return "La caja tiene " + ancho + unidad + ", " + alto + " de alto." + " Y " + fondo + unidad + " de fondo.";
    }

    // Creamos un método que verificará si dos cajas son iguales.
    public boolean equals(Object o) {
        Caja c = (Caja)o;

        return c.getVolumen() == ((Caja)o).getVolumen();
    }

}
