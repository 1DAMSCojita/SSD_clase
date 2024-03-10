package Clientes;

// Importación de librerías.
import java.io.*;

public class Cliente implements Serializable { // Implementamos la clase "Serializable". Importante para gestionar ficheros binarios.
        
    // Declaración de atributos.
    String id;
    String nombre;
    String telefono;

    // Declaración de constructor.
    Cliente(String id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Sobreescribimos el método 'toString()' para mostrar información de los clientes.
    @Override
    public String toString() {
        return "-Cliente: " + "ID = " + id + ", Nombre = " + nombre + ", Teléfono: " + telefono;
    }
}
