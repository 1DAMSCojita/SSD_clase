package Activitat_7_4;

// Importación de librerías.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Llamada implements Comparable<Llamada> {

    // Declaración de variables.
    String numero_telefono;
    String numero_interlocutor;
    boolean esLlamadaSaliente;
    LocalDateTime fechaInicio;
    LocalDateTime fechaFinal;
    Zona zonaInterlocutor;
    static final double[] TARIFAS = {0.10, 0.15, 0.20, 0.25, 0.30}; // Creamos un array estático y double para las tarifas.

    // Declaración de constructor.
    public Llamada(String numero_telefono, String numero_interlocutor, boolean esLlamadaSaliente, String fechaInicio, String fechaFinal, Zona zonaInterlocutor) {
        this.numero_telefono = numero_telefono;
        this.numero_interlocutor = numero_interlocutor;
        this.esLlamadaSaliente = esLlamadaSaliente;
        this.zonaInterlocutor = zonaInterlocutor;

        // Definimos un formato para parsear las fechas en formato "dd/MM/yyyy HH:mm:ss".
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Convertimos el String fechaInicio y fechFinal a un objeto LocalDateTime utilizando el formateador definido.
        LocalDateTime fecha_inicio = LocalDateTime.parse(fechaInicio, formatter);
        LocalDateTime fecha_final = LocalDateTime.parse(fechaFinal, formatter);

        this.fechaInicio = fecha_inicio;
        this.fechaFinal = fecha_final;
    }

    // Implementamos un método para calcular la duración en minutos de la llamada.
    public double calcularDuracion() {
        return fechaInicio.until(fechaFinal, ChronoUnit.MINUTES); // Utilizamos el método until() para obtener la diferencia en minutos entre fechaInicio y fechaFinal y devolvemos esa diferencia.
    }

    // Implementamos un método para calcular el coste de la llamada si es saliente.
    public double calcularCoste() {
        // Creamos una estructura de control 'if'.
        // Si la llamada es saliente, obtendremos la tarifa según la zona y calcularemos la duración, luego devolvemos la conversión.
        if (esLlamadaSaliente) {
            double tarifa = TARIFAS[zonaInterlocutor.ordinal()]; // Obtenemos la tarifa según la zona del interlocutor.
            double duracionMinutos = calcularDuracion(); // Declaramos una nueva variable que tendrá dentro el método de calcularDuracion().
            return tarifa * duracionMinutos / 100; // Realizamos la conversión a euros multiplicando la tarifa por la duración y dividiéndolo por 100.
        }
        return 0.0; // Devolvemos un resultado en double.
    }

    // Sobreescribimos el método 'toString()' para mostrar información de la llamada.
    @Override
    public String toString() {
        return "-Teléfono del cliente: " + numero_telefono + ", teléfono del interlocutor: " + numero_interlocutor + ", la llamada se dió el " + fechaInicio + " y duró " + calcularDuracion() + " minutos" + ". Coste de la llamada: " + calcularCoste() + " céntimos.";
    }

    // Implementamos un comparador estático.
	public static Comparator<Llamada> Comparador = new Comparator<Llamada>() {
	    
        // Creamos un método que comparará las llamadas.
        public int compare(Llamada l1, Llamada l2) { 
	        int comparacion = l1.numero_telefono.compareTo(l2.numero_telefono); // Comparamos los números de teléfono de las llamadas y lo guardamos en una nueva variable.
            // Creamos una estructura de control 'if'.
            // Si los números de teléfono son diferentes, devolvemos el resultado de la comparación.
            // Si no, comparamos las fechas de inicio de las llamadas.
	    	if(comparacion != 0) {
	    		return comparacion;
	    	} else {
	    		return l1.fechaInicio.compareTo(l2.fechaInicio);
	    	}
	    }
	};

    // Añadimos el método 'compareTo' pero devolvemos 0 ya que no usamos este método exactamente aunque es obligatorio para implementar la interficie de Comparable por defecto.
    public int compareTo(Llamada o) {
        return 0;
    }

}