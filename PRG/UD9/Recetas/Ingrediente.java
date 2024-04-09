package Recetas;

public class Ingrediente {

    // Declaración de atributos.
    String nombre;
    double precio_por_persona;

    // Declaración de constructor.
    Ingrediente (String nombre, double precio_por_persona) {
        this.nombre = nombre;
        this.precio_por_persona = precio_por_persona;
    }

    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_por_persona() {
        return precio_por_persona;
    }

    public void setPrecio_por_persona(double precio_por_persona) {
        this.precio_por_persona = precio_por_persona;
    }

    // Sobreescribimos el método 'toString()' para mostrar información general del ingrediente.
    @Override
    public String toString() {
        return "-Ingrediente: " + nombre + " | Precio: " + precio_por_persona;
    }

}