package Activitat_6_1;

public class Hora {
    
    // Declaración de variables.
    public int hora;
    public int minuto;

    // Declaración de constructor.
    public Hora (int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    // Declaración del método 'inc' que incrementará la hora en un minuto. También manejará situaciones como pasar de hora con el minuto correcto.
    protected void inc() {
        minuto++; // Incrementamos el minuto.
        // Creamos una estructura de control 'if'.
        // Si el minuto es superior a 59 (lo que significa que pasa de hora) minuto se volverá 0 y la hora se incrementará en una.
        // También añadimos otro 'if' que verificará si la hora es superior a 23 (siendo las 11) pues cambiará a 0 (las 12).
        if (minuto > 59) {
            minuto = 0;
            hora++;
            if (hora > 23) {
                hora = 0;
            }
        } 
    }

    // Declaración del método 'setMinuto', asignará valor a los minutos si es válido. Para ello devolverá 'true' o 'false' si ha sido posible poder modificar los minutos.
    boolean setMinuto(int y) {
        // Creamos una estructura de control 'if'.
        // Si el valor es superior a 59, el programa imprimirá que no se puede cambiar los minutos y devolverá 'false'.
        // En caso contrario, el programa imprimirá que se puede cambiar los minutos y devolverá 'true'.
        if (y > 59) {
            System.out.println("No se puede cambiar los minutos.");
            return false;
        } else {
            minuto = y;
            System.out.println("Es posible cambiar los minutos.");
            return true;
        }
    }

    // Declaración del método 'setHora', asigna un valor entre 0 y 23 a la hora. Para ello devolverá 'true' o 'false' si ha sido posible cambiar las horas.
    boolean setHora(int x) {
        // Creamos una estructura de control 'if'.
        // Si el valor es superior a 59, el programa imprimirá que no se puede cambiar las horas y devolverá 'false'.
        // En caso contrario, el programa imprimirá que se puede cambiar las horas y devolverá 'true'.
        if (x > 23) {
            System.out.println("No ha sido posible cambiar las horas.");
            return false;
        } else {
            hora = x;
            System.out.println("Ha sido posible cambiar las horas.");
            return true;
        }
    }

    // Sobrescribimos el método 'toString()'.
    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto); // Devolvemos una cadena de texto con la hora y el minuto. Usamos 'String.format' para que te coloque en formato String, luego agregamos '%02d' para poder imprimir números como 00:00 por ejemplo. 
    }
    
}
