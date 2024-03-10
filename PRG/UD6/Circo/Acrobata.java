package Circo;

public class Acrobata extends ArtistaCirco {
    
    // Declaración de variables.
    String especialidad;

    // Declaración de constructor. Inicializamos también los atributos.
    Acrobata(String nombre, int edad, TipoActuacion tipoActuacion, String especialidad) {
        super(nombre, edad, tipoActuacion); // Usamos 'super' para coger los atributos de la clase padre.
        this.especialidad = especialidad;
    }

    // Sobreescribimos el método 'toString()' para incluir información específica del acróbata.
    @Override
    protected void realizarActuacion() {
       System.out.println("¡El acróbata realiza una acrobacia!");
    }

    // Sobreescribimos el método 'toString()' para incluir información específica del acróbata.
    public String toString() {
        return super.toString() + String.format(" Su especialidad es " + especialidad);
    }
}

    
