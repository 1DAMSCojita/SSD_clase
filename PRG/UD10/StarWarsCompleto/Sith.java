package StarWarsCompleto;

import java.util.*;

public class Sith extends MisticoDeLaFuerza implements IFuerza, Comparable<Sith> {

    // Declaración de atributos.
    private Integer nivelMidclorianos;
    private String colorSable;
    private String nombre;
    private String nombreJedi;

    // Declaración de constuctor.
    Sith(String nombre, String apellido, String ciudad_natal, String nombreMadre) {
        super(nombre, apellido, ciudad_natal, nombreMadre);
        setColorSable();
        setNombre(false);
        setNivelMidicloriano();
    }

    // Declaración de constructor por defecto.
    Sith() {
        super("", "", "", "");
        setNivelMidicloriano();
        setNombre(true);
        setColorSable();
    }

    private List<String> colorSable() {
        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
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
            this.nombre = "Darth Binks";
        } else {
            this.nombre = generaNombre();
        }
    }

    @Override
    public String generaNombre() {
        return  "Darth " + getNombreMadre() + getCiudad_natal();
    }

    @Override
    public int getFuerzaMental() {
        return 0;
    }

    @Override
    public void setFuerzaMental() {
        
    }

    @Override
    public int compareTo(Sith o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "-Nombre: " + nombre + " | " + "Nivel Midicloriano: " + nivelMidclorianos +  " | " + "Color sable: " + colorSable + " | " + "Nombre Jedi: " + nombreJedi;
    }


}
