package StarWarsCompleto;

public class MisticoDeLaFuerza {

    // Declaración de atributos.
    private final String nombre;
    private final String apellido;
    private final String ciudad_natal;
    private final String nombreMadre;

    // Declaración de constructor.
    MisticoDeLaFuerza(String nombre, String apellido, String ciudad_natal, String nombreMadre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad_natal = ciudad_natal;
        this.nombreMadre = nombreMadre;
    }

    // Getters.
    // Por cada uno pillamos el primer carácter segundo (o los especificados) con String.valueOf() y con charAt() para
    // pillar los carácteres por posición.
    public String getNombre() {
        return String.valueOf(nombre.charAt(0)) + String.valueOf(nombre.charAt(1));
    }

    public String getApellido() {
        return String.valueOf(apellido.charAt(0)) + String.valueOf(apellido.charAt(1)) + String.valueOf(apellido.charAt(2));
    }

    public String getCiudad_natal() {
        return String.valueOf(ciudad_natal.charAt(0)) + String.valueOf(ciudad_natal.charAt(1)) + String.valueOf(ciudad_natal.charAt(2));
    }

    public String getNombreMadre() {
        return String.valueOf(nombreMadre.charAt(0)) + String.valueOf(nombreMadre.charAt(1));
    }
    

}
