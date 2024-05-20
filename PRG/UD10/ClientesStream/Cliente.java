package ClientesStream;

public class Cliente {

    // Declaración de atributos.
    String nombre;
    int edad;

    // Declaración de constructor.
    Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobreescribimos el método 'toString()' para mostrar información de los clientes.
    @Override
    public String toString() {
        return "-Nombre: " + nombre + " | " + "Edad: " + edad;
    }

}
