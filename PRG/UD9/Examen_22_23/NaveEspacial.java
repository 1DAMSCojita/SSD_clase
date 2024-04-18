package Examen_22_23;

public class NaveEspacial implements AMVE {

    // Declaración de atributos.
    Gemelo gemeloViaja;
    Gemelo gemeloTierra;
    double velocidad;
    int tiempoViaje;

    // Declaración de constructor.
    NaveEspacial(Gemelo gemeloViaja, Gemelo gemeloTierra, double velocidad, int tiempoViaje) {
        this.gemeloViaja = gemeloViaja;
        this.gemeloTierra = gemeloTierra;
        this.velocidad = velocidad;
        this.tiempoViaje = tiempoViaje;
    }

    // Implementamos y sobreescribimos el método de 'vueloEspacial()' de la interfaz 'AMVE'.
    @Override
    public void vueloEspacial() {
        System.out.println("Viaje espacial iniciado.");
        System.out.println("Elevando la nave...");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("Error al iniciar el viaje: " + e.getMessage());
        }
        System.out.println("Nave en el espacio.");
        System.out.println("Continuando...");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("Error al continuar el viaje: " + e.getMessage());
        }
        System.out.println("Ruta completada.");
        System.out.println("Aterrizando...");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("Error al aterrizar: " + e.getMessage());
        }
        System.out.println("¡Viaje completado con éxito!");
    }

    // Sobreescribimos el método 'toString()' para mostrar información de la nave espacial.
    @Override
    public String toString() {
        return "Velocidad: " + velocidad + " | " + "Tiempo de viaje: " + tiempoViaje;
    }

}
