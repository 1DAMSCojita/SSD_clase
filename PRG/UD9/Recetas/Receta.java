package Recetas;

import java.util.*;

public class Receta {

    // Declaración de atributos.
    String nombreReceta;
    int numComensales;

    // Creación de ArrayList.
    List<Ingrediente> ingredientes = new ArrayList<>();

    // Declaración de constructor.
    Receta(String nombreReceta, ArrayList<Ingrediente> ingredientes, int numComensales) {
        this.nombreReceta = nombreReceta;
        this.numComensales = numComensales;
        this.ingredientes = ingredientes;
    }

    // Getters y Setters.
    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }
    
    public int getNumComensales() {
        return numComensales;
    }

    public void setNumComensales(int numComensales) {
        this.numComensales = numComensales;
    }

    // Creamos un método para agregar un ingrediente a la receta.
    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    // Creamos un método para eliminar un ingrediente de la receta.
    public void eliminarIngrediente(Ingrediente ingrediente) {
        ingredientes.remove(ingrediente);
    }

    // Creamos un método para mostrar ingredientes de la receta.
    public void mostrarIngredientes() {
        System.out.println("Ingredientes de la receta: " + nombreReceta + ":");
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println(ingrediente);
        }
    }

    // Creamos un método para calcular el coste total de la receta.
    public double calcularCosteTotal() {
        double costeTotal = 0.0;
        for (Ingrediente ingrediente : ingredientes) {
            costeTotal += ingrediente.getPrecio_por_persona();
        }
        return costeTotal * numComensales;
    }

    // Sobreescribimos el método 'toString()' para mostrar información de la receta.
    public String toString() {
        return "-Nombre de la receta: " + nombreReceta + " | " + "Número de comensales: " + numComensales + " | " + "Ingredientes: " + ingredientes + " | " + "Coste total de la receta: " + calcularCosteTotal();
    }

}
