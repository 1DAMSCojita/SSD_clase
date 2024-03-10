package Hora_exacta;

//import Activitat_6_1.*; // Importamos el package en el cúal estaba la clase 'Hora'.

public class HoraExacta extends Horas.Hora { // Aplicamos herencia. La clase 'HoraExacta' heredará los atributos y métodos de la clase 'Hora'.

    // Declaración de la variable 'segundo' que es la que falta para la hora exacta.
    int segundo;

    // Declaración de constructor para 'HoraExacta'. Aquí hay que tener en cuenta que el constructor de la clase 'Hora' tiene que ser cambiado a público.
    // También añadimos el super para llamar al override de la clase heredada 'Hora'.
    HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        this.segundo = segundo;
    }
    
    // Creamos un método llamado 'setSegundo'. 
    // Si el valor es superior a 59, imprimirá un mensaje de error.
    // De lo contrario, establece que 'segundo' será 'x'. 
    void setSegundo(int x) {
        if (x > 59) {
            System.out.println("No se puede cambiar los segundos.");
        } else {
            segundo = x;
            System.out.println("Se ha podido cambiar los segundos.");
        }
    }

    // Creamos un método 'inc()' que incrementará la hora en un segundo.
    protected void inc() {
        segundo++; // Incrementamos el segundo.
        // Creamos una estructura de control 'if'.
        // Al igual que la actividad anterior, si el segundo es superior a 59 (lo que significa que pasa un minuto) segundo se volverá 0 y el minuto se incrementará en uno.
        // Mismo proceso para 'hora'.
        // También añadimos otro 'if' que verificará si la hora es superior a 23 (siendo las 11) pues cambiará a 0 (las 12).
        if (segundo > 59) {
            segundo = 0;
            minuto++;
            if (minuto > 59) {
                minuto = 0;
                hora++;
                if (hora > 23) {
                    hora = 0;
                }
            }
        }
    }

    // Creamos un método booleano llamado 'sonIguales'.
    // Este método verificará si las horas son diferentes o iguales (las que pongamos como parámetro de entrada).
    // Creamos nuevas variables que son los parámetros de entrada que introduciremos en el Test y posteriormente nos indicará si nuestra hora es igual o diferente
    // a la original.
    boolean sonIguales (int horax, int minutox, int segundox) {
        // Creamos una estructura de control 'if'.
        // Si la hora, minuto y segundo que pongamos como parámetro es igual a las variables originales, será igual y devolveremos un 'true'.
        // En caso contrario, pues indicaremos que son distintos.
        if (horax == hora && minutox == minuto && segundox == segundo) {
            System.out.println("Son iguales.");
            return true;
        } else {
            System.out.println("Son distintos.");
            return false;
        }
    }

    // Sobrescribimos el método 'toString()'.
    @Override
    public String toString() {
        return super.toString() +  ":" + String.format("%02d", segundo); // Devolvemos una cadena de texto llamando al override de la clase padre que es 'Hora'. Lo modificamos para que se muestren correctamente los segundos.
    }
}
