package Activitat_6_5;

public class NaveExploradora extends NaveEspacial {

    // Declaramos el enumerado.
    TipoPlaneta tipoPlaneta;

    // Declaración de constructor. Añadimos el enumerado.
    NaveExploradora(String nombre, int capacidadTripulantes, TipoPlaneta tipoPlaneta) {
        super(nombre, capacidadTripulantes); // Añadimos 'super' para coger los atributos de la clase padre ya definidos.
        this.tipoPlaneta = tipoPlaneta;
    }

    // Sobreescribimos el método de la clase padre para indicar el despegue al tipo de planeta correspondiente.
    @Override
    void despegue() {
        System.out.println("Despegamos hacia un tipo de planeta " + tipoPlaneta);
    }
    
    // Sobreescribimos el método 'toString()' para mostrar información sobre la nave de exploración. Usamos 'super.toString()' para pillar el primer 'toString()' de la clase padre y no tener que escribir la cadena entera.
    public String toString() {
        return super.toString() + String.format(" El tipo de planeta al que viajarán es " + tipoPlaneta);
    }

    // Sobreescribimos el método 'equals (Object o)' para comparar naves por el nombre, capacidad de tripulantes y el tipo de planeta..
    public boolean equals(Object o) {
        NaveExploradora nE = (NaveExploradora)o;
        
        return super.equals(o) && tipoPlaneta == nE.tipoPlaneta; // Comprobamos si el nombre, la capacidad de tripulantes y el tipo de planeta son iguales a los de los objetos 'ne' y 'o', respectivamente. Usamos 'super' para pillar la comparativa ja hecha de la clase padre y solo añadir la del tipoPlaneta.
    }
}
