package Examen_23_24;

import java.io.*;

public class Jugador implements IPersona, Serializable {

    // Declaración de atributos.
    private final String DNI;
    private String nombre;
    private int edad;
    private Posicion posicion;

    // Declaración de constructor.
    Jugador(String DNI, String nombre, int edad, Posicion posicion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    // Implementación de métodos de la interfaz y getters y setters.
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }


    public Posicion getPosicion() {
        return posicion;
    }


    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    // Sobreescribimos el método 'toString()' para mostrar información del jugador.
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | " + "Edad: " + edad + " | " + "Posición: " + posicion + " | " + "DNI: " + DNI; 
    }

}
