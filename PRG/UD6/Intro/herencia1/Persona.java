package Intro.herencia1;

public class Persona {

    private String nombre;
    protected int edad;
    public double altura;
    double peso;

    public Persona() {

    }

    public Persona(String nombre, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void mostrar_informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    @Override
    public String toString() {
        return nombre + " " + edad;
    } 
}