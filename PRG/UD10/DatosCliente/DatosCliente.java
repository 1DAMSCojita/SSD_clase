package DatosCliente;

// Importación de librerías.
import java.time.*;

public class DatosCliente {

    // Declaración de atributos.
    Cliente c;
    LocalDate fechaNacimiento;

    // Declaración de constructor.
    DatosCliente(Cliente c, LocalDate fechaNacimiento) {
        this.c = c;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Implementamos el método especificado para devolver la edad.
    public int edad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears(); // Devolvemos la edad calculando el periodo entre la fecha de nacimiento y los años. 
    }

    // Getter para el dni del cliente.
    public String getDni() {
        return c.dni;
    }

    // Sobreescribimos el método 'toString()' para mostrar información del cliente.
    @Override
    public String toString() {
        return "Nombre: " + c.nombre + " | " + "Edad: " + edad();
    }
    

}
