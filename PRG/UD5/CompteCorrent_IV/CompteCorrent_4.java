package Activitat_5_1_4;

public class CompteCorrent_4 {

    // Declaración de variables.
    String id; // Dejamos id tal cual para que sea visible para las clases vecinas.
    public String nombre; // Añadimos "public" a nombre para que se pueda ver en cualquier clase.
    private double saldo; // Añadimos "private" a saldo para que no sea visible en más clases.
    private static String nombre_banco = "Imagin Bank"; // Añadimos la variable para el nombre de banco.
    static String banco; // Añadimos una nueva variable estática para banco.

    // Declaración de constructores.
    // Haremos una sobrecarga de un único constructor que a su vez tendrá distintos datos.
    // Para ello, usaremos un this() con dentro los valores correspondientes.
    // En este primer constructor. Volvemos a definir todas las variables con un this()
    CompteCorrent_4(String id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    // En este constructor default, escribimos los valores por defecto.
    CompteCorrent_4() {
        this("Y2448045P", "Stefan", 1.0);
    }
    
    // En este constructor sobrecargamos el constructor inicial, añadiendo otros valores.
    CompteCorrent_4(String id, double saldo) {
        this("X2331983S", "none", 5.0);
    }

    // Creamos un método para sacar dinero.
    // Contendrá una estructura de control 'if'. La cuál se encargará de 
    // verificar si el saldo es mayor o igual a la cantidad. En ese caso, restará para sacar dinero.
    // Si no, indicará al usuario que no tiene dinero y no podrá realizar nada.
    public void sacar_dinero(double cantidad) {
       if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.println();
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
        System.out.println("DNI o NIE: " + id);
        System.out.println("Nombre del titular: " + nombre);
        System.out.println("Saldo: " + saldo);
    }

    // Creamos un método para obtener el nombre del banco.
    public static String getnombre_banco() {
        return nombre_banco;
    }

    // Creamos un método para CAMBIAR el nombre del banco.
    public static void setnombre_banco(String nombre_banco) {
        CompteCorrent_4.nombre_banco = banco; // Especificamos que la clase de CompteCorrent4 y la variable de nombre_banco es igual a la variable de banco.
    }
}