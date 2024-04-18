package Extra.Examen_22_23_Bruno;

import java.util.List;

public class NaveEspacial implements AMVE {
    Gemelos viaja; // Creamos las variables
    Gemelos queda;
    double velocidad;
    int tiempoViaje;

    public NaveEspacial(List<Gemelos> gemelos, double velocidad, int tiempoViaje){ // Creamos el constructor
        for (Gemelos gemelo : gemelos) { // Hacemos un forEach de gemelos
            if (gemelo.viaje == true) { // Si el gemelo tiene el viaje en true
                this.viaja = gemelo; // Se añade la informacion actual a viaja
            }else{ // Si no 
                this.queda = gemelo; // Se añade la informacion a queda
            }
        }
        this. velocidad = velocidad; 
        this.tiempoViaje = tiempoViaje;
    }
    @Override
    public void viajeEspacial() { // Hacemos override a viajeEspacial()
        try {
            System.out.println("Preparando el viaje para: " + viaja ); // Decimos quien es el que viaja
            Thread.sleep(0); // Esperamos unos segundos
            int edadQueda = queda.edad; // Creamos la variable edadQueda y le añadimos la edad
            edadQueda += Funciones.calcularEdad(tiempoViaje, velocidad); // Usamos el metodo calcularEdad
            System.out.println("Cuando " + viaja.nom + " que tenia: " + viaja.edad + " años" + " llego su gemelo tenia: " + edadQueda + "años"); // Decimos la nueva edad del que queda
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
