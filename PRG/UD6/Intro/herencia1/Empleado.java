package Intro.herencia1;

public class Empleado extends Persona {

    double salario;
    boolean delMes;
    String altura;

    public Empleado(String nombre, int edad, double altura, double peso, double salario, boolean delMes) {
        super(nombre, edad, altura, peso);
        this.delMes = delMes;
        this.altura = "Alto.";
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, double altura, double peso) {
        this.delMes = false;
        this.altura = "Alto.";
    }

    void mostrar_informacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Salario: " + salario);
        System.out.println("Empleado del mes: " + (delMes ? "Sí." : "No."));
    }

    @Override
    public boolean equals(Object o) {
        Empleado e = (Empleado)o;

        return (this.getNombre().equals(e.getNombre()) && this.edad == e.edad); 
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.salario;
    }
}
