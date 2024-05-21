package StarWarsCompleto;

// Importación de librerías.
import java.util.Collections;
import java.util.List;

public interface IFuerza {

    // Añadimos todos los métodos de la interfaz.
    int getNivelMidclorianos();
    void setNivelMidicloriano();

    default int estableceNivelMidiclorianos() {
        return aleatorioEntero(30000, 10000);
    }

    String getColorSable();
    void setColorSable();
    
    static String estableceColorSable(List<String> listaColores) {
        if (listaColores.size() == 0 || listaColores == null) {
            return null;
        } else {
            Collections.shuffle(listaColores);
            return listaColores.get(0);
        }
    }
    

    String getNombre();
    void setNombre(boolean esJarJarBinks);
    String generaNombre();
    
    int getFuerzaMental();
    void setFuerzaMental();

    static int estableceFuerzaMental() {
       return aleatorioEntero(10, 1);
    } 

    private static int aleatorioEntero(int limite, int inicio) {
        return (int)((Math.random() * limite) + inicio);
    }

}
