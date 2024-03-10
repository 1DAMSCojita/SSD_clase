package Naves;

public class NaveGuerra extends NaveEspacial {
    
    // Declaración de variables.
    int numeroArmas;

    // Declaración de constructor que inicializa los atributos.
    NaveGuerra(String nombre, int capacidadTripulantes, int numeroArmas) {
        super(nombre, capacidadTripulantes); // Añadimos 'super' para coger los atributos de la clase padre ya definidos.
        this.numeroArmas = numeroArmas;
    }
    
    // Sobreescribimos el método de la clase padre para indicar el despegue con el número de armas.
    @Override
    void despegue() {
        System.out.println("La nave ha despegado con " + numeroArmas + " armas.");
    }

    // Sobreescribimos el método 'toString()' para mostrar información sobre la nave de guerra. Usamos 'super.toString()' para pillar el primer 'toString()' de la clase padre y no tener que escribir la cadena entera.
    public String toString() {
        return super.toString() + String.format(" Tiene " + numeroArmas + " armas.");
    }

    // Sobreescribimos el método 'equals (Object o)' para comparar naves por el nombre, capacidad de tripulantes y el número de armas.
    public boolean equals(Object o) {
        NaveGuerra ng = (NaveGuerra)o;

        return super.equals(o) && numeroArmas == ng.numeroArmas; // Comprobamos si el nombre, la capacidad de tripulantes y el número de armas son iguales a los de los objetos 'ng' y 'o', respectivamente. Usamos 'super' para pillar la comparativa ja hecha de la clase padre y solo añadir la de número de armas.
    }
}
