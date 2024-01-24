package Activitat_6_6;

public class Malabarista extends ArtistaCirco {
    
    // Declaración de variables.
    int numPelotas;

    // Declaración de constructor. Inicializamos también los atributos.
    public Malabarista(String nombre, int edad, TipoActuacion tipoActuacion, int numPelotas) {
        super(nombre, edad, tipoActuacion); // Usamos 'super' para coger los atributos de la clase padre.
        this.numPelotas = numPelotas;
        // Creamos una estructura de control 'if'.
        // Verificará si el número que hemos puesto es entre 3 y 10.
        // Si no se cumple esta condición, nos mostrará un mensaje indicándolo.
        if (numPelotas >= 3 && numPelotas <= 10) {
            this.numPelotas = numPelotas;
        } else {
            this.numPelotas = 0;
        }
    }

    // Sobreescribimos el método abstracto de la clase padre para realizar malabares con el número de pelotas.
    @Override
    protected void realizarActuacion() {
       System.out.println("El malabarista realiza la actuación con " + numPelotas + " pelotas."); 
    }

    // Sobreescribimos el método 'toString()' para incluir información específica del malabarista.
    public String toString() {
        return super.toString() + String.format(". Tiene " + numPelotas + " pelotas.");
    }
}
