package prueba;

public class Persona {
    
    // ATRIBUTOS (o propiedades)
    String nombre;
    int edad;
    double altura;

    // CONSTRUCTOR
    Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        saludar();
    }

    // MÉTODOS
    public void saludar() {
        System.out.println("¡Hola!");
    }

    public void caminar() {
        System.out.println("Estoy caminando.");
    }

    public void cumpleanos() {
        edad++;
    }

}
