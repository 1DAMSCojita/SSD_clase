package coche_prueba;

public class Coche {
    
    // Declaración de atributos.
    String nombre_propietario;
    int caballos;
    double kilometraje;
    String matricula;
    String marca;

    Coche(String nombre_propietario, String matricula, String marca) {
        this.nombre_propietario = nombre_propietario;
        this.matricula = matricula;
        this.marca = marca;
    }

    Coche(int caballos) {
        this.caballos = caballos;
    }

    Coche(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Declaración de métodos.
    public void arranque() {
        System.out.println("El coché está arrancando...");
    }

    public void llenargasolina() {
        System.out.println("¡Has llenado la gasolina! ¡Todo completo!");
    }

    public void aceitecambiado() {
        System.out.println("Hay que cambiar el aceite...");
    }

}
