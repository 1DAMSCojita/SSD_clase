package Activitat_5_3;

public class Hora {
    
    // Declaración de variables. Las encapsulamos como privadas.
    private int hora;
    private int minuto;
    private int segundo;
    private int n; // Esta variable 'n' guarda el número de segundos para incrementar.

    // Declaración de constructor.
    Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Creamos un método para conseguir la hora.
    public int gethora() {
        return hora;
    }

    // Creamos un método para cambiar la hora.
    public void sethora(int hora) {
        this.hora = hora;
    }

    // Creamos un método para conseguir el minuto.
    public int getminuto() {
        return minuto;
    }

    // Creamos un método para cambiar el minuto.
    public void setminuto(int minuto) {
        this.minuto = minuto;
    }

    // Creamos un método para conseguir el segundo.
    public int getsegundo() {
        return segundo;
    }

    // Creamos un método para cambiar el segundo.
    public void setsegundo(int segundo) {
        this.segundo = segundo;
    }

    // Creamos un método para conseguir el valor por el cuál los segundos se van a incrementar.
    public int getn() {
        return n;
    }

    // Creamos un método para cambiar el valor por el cuál los segundos se van a incrementar.
    public void setn(int n) {
        this.n = n;
    }

    // Creamos un método que irá incrementando los seguros.
    public void incrementar_segundo(int n) {
        System.out.println(); // Salto de línea.

        // Obtenemos la hora, minuto y segundo.
        hora = gethora();
        minuto = getminuto();
        segundo = getsegundo();

        // Creamos un bucle 'for'.
        // El bucle se realizará 'n' veces (es decir, el valor que sea n).
        for (int i = 0; i < n; i++) {
            segundo++; // Incrementamos el segundo.
            // Creamos una estructura de control 'if'.
            // Si los segundos superan 59, incrementamos el minuto y reiniciamos los segundos a 0.
            if (segundo > 59) {
                minuto++;
                segundo = 0;
                // Creamos otra estructura de control 'if'.
                // Si los minutos superan 59, incrementamos la hora y reiniciamos los minutos a 0.
                if (minuto > 59) {
                    hora++;
                    minuto = 0;
                    // Creamos una última estructura de control 'if'.
                    // Si los horas son iguales a 24, la reiniciamos a 0.
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
            System.out.println(hora + ":" + minuto + ":" + segundo); // Mostramos la hora, minuto y segundo actuales por consola.
        }
    }
}
