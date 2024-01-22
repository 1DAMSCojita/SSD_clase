package Activitat_6_6;

public abstract class ArtistaCirco {
    
    // Declaración de variables.
    private String nombre;
    private int edad;
    private TipoActuacion tipoActuacion;

    // Declaración del constructor inicializando los atributos.
    ArtistaCirco(String nombre, int edad, TipoActuacion tipoActuacion) {
        this.nombre = nombre;
        this.edad = edad;  
        this.tipoActuacion = tipoActuacion;
    }

    // Creamos una método no implementable pero que las clases hijas deberán de usar obligatoriamente. Usamos 'protected' para aplicar encapsulación.
    protected abstract void realizarActuacion();

    // Sobreescribimos el método 'toString()' para mostrar información sobre el artista.
    @Override
    public String toString() {
        return String.format("El artista se llama " + nombre + ", tiene" + edad + " años y su actuación será " + tipoActuacion);
    }

    // Sobreescribimos el método 'equals (Object o)' para comparar artistas por el nombre y edad.
    public boolean equals(Object o) {
        ArtistaCirco ac = (ArtistaCirco)o;

        return this.nombre.equals(ac.nombre) && this.edad == ((ArtistaCirco)o).edad && tipoActuacion == ac.tipoActuacion; // Comprobamos si el nombre, la edad y el tipo de actuación son iguales a los de los objetos 'ac' y 'o', respectivamente.
    }

}