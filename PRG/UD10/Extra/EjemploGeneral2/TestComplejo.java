package EjemploGeneral2;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// Definición de la clase Estudiante
class Estudiante {
    private String nombre;
    private int edad;
    private double notaMedia;

    // Constructor
    public Estudiante(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNotaMedia() { return notaMedia; }
}

public class TestComplejo {
    public static void main(String[] args) {
        // Crear una lista de estudiantes
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Juan", 20, 8.5),
            new Estudiante("Ana", 22, 9.0),
            new Estudiante("Pedro", 21, 7.8),
            new Estudiante("Maria", 23, 8.9)
        );

        // Definir un predicado para filtrar estudiantes con nota media mayor que 8.0
        Predicate<Estudiante> esBuenEstudiante = e -> e.getNotaMedia() > 8.0;

        // Definir un Consumer para imprimir el nombre de un estudiante
        Consumer<Estudiante> imprimirNombre = e -> System.out.println(e.getNombre());

        // Ordenar la lista de estudiantes por nombre
        List<Estudiante> estudiantesOrdenados = estudiantes.stream()
            .sorted(Comparator.comparing(Estudiante::getNombre))
            .collect(Collectors.toList());

        // Usar un stream para filtrar estudiantes con nota media mayor que 8.0
        estudiantesOrdenados.stream()
            .filter(esBuenEstudiante)
            .forEach(imprimirNombre);

        // Encontrar el estudiante con la nota media más alta y más baja
        Estudiante mejorEstudiante = estudiantesOrdenados.stream()
            .max(Comparator.comparing(Estudiante::getNotaMedia))
            .orElse(null);
        Estudiante peorEstudiante = estudiantesOrdenados.stream()
            .min(Comparator.comparing(Estudiante::getNotaMedia))
            .orElse(null);
        System.out.println(" Mejor estudiante: " + mejorEstudiante.getNombre());
        System.out.println(" Peor estudiante: " + peorEstudiante.getNombre());
        
        // Crear un nuevo stream saltando los dos primeros estudiantes
        Stream<Estudiante> streamSaltandoDos = estudiantesOrdenados.stream()
            .skip(2);

        // Imprimir los nombres de los estudiantes en el nuevo stream
        streamSaltandoDos.forEach(imprimirNombre);
    }
}
