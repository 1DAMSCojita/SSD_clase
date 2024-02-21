package Ejercicio_3;

public class Persona implements Empleado, Comparable<Persona> { // Añadimos que Persona implementa Empleado que a su vez extiende de la interfaz Cliente.

    // Declaración de variables.
    private int numero_de_horas_trabajadas;
    private double saldo;
    final private String DNI;
    private String nombre;
    @SuppressWarnings("unused")
    private boolean esCliente;
    @SuppressWarnings("unused")
    private boolean esEmpleado;

    // Declaración de constructor.
    public Persona(int numero_de_horas_trabajadas, double saldo, String DNI, String nombre, boolean esCliente, boolean esEmpleado) {
        this.numero_de_horas_trabajadas = numero_de_horas_trabajadas;
        this.saldo = saldo;
        this.DNI = DNI;
        this.nombre = nombre;
        this.esCliente = esCliente;
        this.esEmpleado = esEmpleado;
    }

    @Override
    public double getSaldo() {
        return numero_de_horas_trabajadas;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void incrementarSaldo(double increment) {
        this.saldo += increment;
    }

    @Override
    public String getDNI() {
        return this.DNI;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getHoras() {
        return this.numero_de_horas_trabajadas;
    }

    @Override
    public void setHoras(int numero_de_horas_trabajadas) {
       this.numero_de_horas_trabajadas = numero_de_horas_trabajadas;
    }

    @Override
    public void incrementarHoras(int incremento) {
        this.numero_de_horas_trabajadas += incremento;
    }
    
    @Override
    public String toString() {
        return "DNI: " + DNI + "\nNombre: " + nombre + "\nHoras Trabajadas: " + numero_de_horas_trabajadas + "\nSaldo: " + saldo;
    }

    @Override
    public int compareTo(Persona p) {
        
        return DNI.compareTo(p.DNI);
    }
    
    ComparaSaldo cs = new ComparaSaldo();
    ComparaHoras ch = new ComparaHoras();
    
}
