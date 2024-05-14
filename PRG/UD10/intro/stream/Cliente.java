package intro.stream;

import java.time.LocalDateTime;

public class Cliente implements Comparable<Cliente> {

    String nombre;
    final String DNI;
    final int añoNacimiento;

    Cliente(String nombre, String DNI, int añoNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.añoNacimiento = añoNacimiento;
    }

    public int edad() {
        return LocalDateTime.now().getYear() - añoNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "DNI: " + DNI + "Edad: " + edad();
    }

    @Override
    public int compareTo(Cliente cli) {
        return this.DNI.compareTo(cli.DNI);
    }

}
