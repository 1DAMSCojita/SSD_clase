package Examen_22_23;

public class Gemelo extends Persona {

    // Declaración de atributos.
    boolean viaja;

    // Declaración de constructor.
    Gemelo(String nombre, int edad, boolean viaja) {
        super(nombre, edad);
        this.viaja = viaja;
    }

    // Sobreescribimos el método 'toString()' para mostrar información del gemelo.
    @Override
    public String toString() {
        return super.toString() + ", " + viaja;
    }

    //

}

