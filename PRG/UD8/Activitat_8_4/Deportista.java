package Activitat_8_4;

// Importación de librerías.
import java.time.*;

public class Deportista {

    // Declaración de atributos.
    String DNI;
    String nombre;
    LocalDate fechaDeNacimiento;
    int edad;
    Deporte deporte;

    // Declaración de constructor.
    Deportista(String DNI, String nombre, int año, int mes, int dia, int edad, Deporte deporte) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaDeNacimiento = LocalDate.of(año, mes, dia);
        this.edad = edad;
        this.deporte = deporte;
    }

    // Sobreescribimos el método 'toString()' para mostrar información del deportista.
    @Override
    public String toString() {
        return "-Deportista: " + "DNI: " + DNI + ", Nombre:" + nombre + ", Edad: " + edad + ", hace " + deporte;
    }

}
