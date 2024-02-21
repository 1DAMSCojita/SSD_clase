package Ejercicio_2;

// Importación de liberías.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Jornada implements Comparable<Jornada> { // Implementamos un comparador por defecto.

    // Declaración de variables.
    String DNI;
    LocalDateTime fecha_entrada;
    LocalDateTime fecha_salida;

    // Declaración de constructor.
    public Jornada (String DNI, String fecha_entrada, String fecha_salida) {
        this.DNI = DNI;
        
        // Definimos un formato para parsear las fechas en formato "dd/MM/yyyy HH:mm:ss".
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Convertimos el String fecha_entrada y fecha_salida a un objeto LocalDateTime utilizando el formateador definido.
        LocalDateTime fechaentrada = LocalDateTime.parse(fecha_entrada, formatter);
        LocalDateTime fechasalida = LocalDateTime.parse(fecha_salida, formatter);
 
        this.fecha_entrada = fechaentrada;
        this.fecha_salida = fechasalida;
    }

    // Creamos un método para computar el número de minutos trabajados en la jornada.
    public double minutosTrabajadosJornada() {
        return fecha_entrada.until(fecha_salida, ChronoUnit.MINUTES); // Utilizamos el método until() para obtener la diferencia en minutos entre fecha_entrada y fecha_salida.
    }

    // Sobreescribimos y añadimos un método para comparar objetos.
    @Override
    public int compareTo(Jornada o) {
        // Creamos una estructura de control 'if'.
        // Si ambos DNI son iguales, devolverá la comparación de la fecha entrada y salida.
        // Si no, devolverá la comparación entre los DNIs.
        if (DNI.equals(o.DNI)) {
            return fecha_entrada.compareTo(o.fecha_salida);
        } else {
            return DNI.compareTo(o.DNI);
        }
    }

    // Sobreescribimos el método 'toString()' para mostrar información.
    @Override
    public String toString() {
        return "DNI del empleado: " + DNI + ". La jornada duró "  + minutosTrabajadosJornada() + " minutos.";
    }
}