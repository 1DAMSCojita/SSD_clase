package Circo;

public class PayasoMalabarista extends Malabarista {
    
    // Declaración de variables.
    String tipoPayaso;

    // Declaración de constructor. Inicializamos los atributos.
    PayasoMalabarista(String nombre, int edad, TipoActuacion tipoActuacion, int numPelotas, String tipoPayaso) {
        super(nombre, edad, tipoActuacion, numPelotas);  // Usamos 'super' para coger los atributos de la clase padre. Tenemos que agregar un número al final para hacer referencia a la variable de 'numPelotas' de la clase Malabarista ya que es la que estamos heredando.
        this.tipoPayaso = tipoPayaso;
    }

    // Creamos un método llamado 'realizarBroma()' para que el payaso realice una broma divertida.
    public void realizarBroma() {
        System.out.println("El payaso realiza una broma divertida: ");
        System.out.println(); // Salto.
        System.out.println("-¡Oigan chicos! ¿Qué le dice un tronco a otro tronco? ¡Qué pasa tronco! JAJAJAJA :clown:");
    }

    // Sobreescribimos el método 'toString()' para incluir información específica del payaso.
    @Override
    public String toString() {
        return super.toString() + String.format(" El payaso es " + tipoPayaso);
    }
}
