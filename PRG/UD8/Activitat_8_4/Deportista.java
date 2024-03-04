package Activitat_8_4;

// Importación de librerías.
import java.io.*;
import java.time.*;

public class Deportista implements Serializable { // Implementamos la clase 'Serializable' para poder manipular ficheros binarios con ella.

    // Declaración de atributos.
    final String DNI;
    String nombre;
    LocalDate fechaDeNacimiento;
    private int edad;
    Deporte deporte;

    // Declaración de constructor.
    Deportista(String DNI, String nombre, int año, int mes, int dia, Deporte deporte) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaDeNacimiento = LocalDate.of(año, mes, dia); // Declaramos que la fecha de nacimiento será igual al 'LocalDate.of()' del año, mes y día. Para ello usamos el método ahora mencionado.
        this.edad = Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
        this.deporte = deporte;
    }

    // Creamos un 'getter' para nombre.
    public String getNombre() {
        return nombre;
    }

    // Creamos un 'getter' para la edad.
    public int getEdad() {
        return edad;
    }

    // Creamos un 'getter' para el deporte.
    public Deporte getDeporte() {
        return deporte;
    }

    // Sobreescribimos el método 'toString()' para mostrar información del deportista.
    @Override
    public String toString() {
        return "-Deportista: " + "DNI: " + DNI + ", Nombre: " + nombre + ", Edad: " + edad + ", hace: " + deporte + ".";
    }

}
