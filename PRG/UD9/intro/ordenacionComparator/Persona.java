package intro.ordenacionComparator;

public class Persona {
    private String nombre;
    public String apellido;
    public int edad;

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad;
    }
    
}
