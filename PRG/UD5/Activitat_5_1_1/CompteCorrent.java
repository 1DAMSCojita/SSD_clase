package Activitat_5_1_1;

public class CompteCorrent {

    // Declaración de variables.
    String id;
    String nombre;
    double saldo;

    // Declaración de constructor.
    CompteCorrent(String id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // Creamos un método para sacar dinero.
    // Contendrá una estructura de control 'if'. La cuál se encargará de 
    // verificar si el saldo es mayor o igual a la cantidad. En ese caso, restará para sacar dinero.
    // Si no, indicará al usuario que no tiene dinero y no podrá realizar nada.
    public void sacar_dinero(double cantidad) {
       if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.println("Tienes: " + this.saldo + " saldo.");
       } else {
        System.out.println("No tienes suficiente dinero para sacar.");
       }
    }

    // Creamos un método para ingresar dinero.
    // Se sumará el saldo con la cantidad correspondiente. 
    public void ingresar_dinero(double cantidad) {
        saldo += cantidad;
    }

    // Creamos un método para mostrar la información.
    // Iremos mostrando el id, nombre y saldo.
    public void mostrar_informacion() {
        System.out.println("DNI o NIE " + id);
        System.out.println("Nombre del titular: " + nombre);
        System.out.println("Saldo: " + saldo);
    }
}