package StarWarsCompleto;

// Importación de liberías.
import java.util.*;

public class Jedi extends MisticoDeLaFuerza implements IFuerza, Comparable<Jedi> {
    
    // Declaración de atributos.
    private Integer nivelMidclorianos;
    private String colorSable;
    private String nombre;
    private int fuerzaMental;

    // Declaración de constuctor.
    Jedi(String nombre, String apellido, String ciudad_natal, String nombreMadre) {
        super(nombre, apellido, ciudad_natal, nombreMadre);
        setColorSable();
        setFuerzaMental();
        setNombre(false);
        setNivelMidicloriano();
    }

    // Declaración de constructor por defecto.
    Jedi() {
        super("", "", "", "");
        this.fuerzaMental = 1;
        setNivelMidicloriano();
        setNombre(true);
        setColorSable();
    }

    private List<String> colorSable() {
        List<String> colores = new ArrayList<>();
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Morado");
        return colores;
    }

    @Override
    public int getNivelMidclorianos() {
        return nivelMidclorianos;
    }

    @Override
    public void setNivelMidicloriano() {
        this.nivelMidclorianos = estableceNivelMidiclorianos();
    }

    @Override
    public String getColorSable() {
        return colorSable;
    }

    @Override
    public void setColorSable() {
        this.colorSable = IFuerza.estableceColorSable(colorSable());
    }

    @Override
    public void setNombre(boolean esJarJarBinks) {
        if (esJarJarBinks) {
            this.nombre = "JarJarBinks";
        } else {
            this.nombre = generaNombre();
        }
    }

    @Override
    public String generaNombre() {
        return getApellido() + " " + getNombre() + " " + getNombreMadre() + getCiudad_natal();
    }

    @Override
    public int getFuerzaMental() {
        return fuerzaMental;
    }

    @Override
    public void setFuerzaMental() {
        this.fuerzaMental = IFuerza.estableceFuerzaMental();
    }

    @Override
    public int compareTo(Jedi o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "-Nombre: " + nombre + " | " + "Nivel Midicloriano: " + nivelMidclorianos +  " | " + "Color sable: " + colorSable + " | " + "Fuerza mental: " + fuerzaMental;
    }

}
