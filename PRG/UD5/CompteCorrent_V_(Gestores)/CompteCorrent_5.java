package Activitat_5_1_5;

public class CompteCorrent_5 {

    // Declaración de variables.
    String id; // Dejamos id tal cual para que sea visible para las clases vecinas.
    public String nombre; // Añadimos "public" a nombre para que se pueda ver en cualquier clase.
    private double saldo; // Añadimos "private" a saldo para que no sea visible en más clases.
    private static String nombre_banco = "Imagin Bank"; // Añadimos la variable para el nombre de banco.
    static String banco; // Añadimos una nueva variable estática para banco.

    // Creamos dos instancias a la clase Gestor. Cada gestor estará integrado en una cuenta posteriormente.
    Gestor ge = new Gestor("Pedro", "+34643267890", 10000);
    Gestor ge2 = new Gestor("Carlos", "+34657892134", 100000); 

    // Declaración de constructores.
    // Haremos una sobrecarga de un único constructor que a su vez tendrá distintos datos.
    // Para ello, usaremos un this() con dentro los valores correspondientes.
    // En este primer constructor. Volvemos a definir todas las variables con un this()
    CompteCorrent_5(String id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    // En este constructor default, escribimos los valores por defecto.
    CompteCorrent_5() {
        this("Y2448045P", "Stefan", 1.0);
    }
    
    // En este constructor sobrecargamos el constructor inicial, añadiendo otros valores.
    CompteCorrent_5(String id, double saldo) {
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
        CompteCorrent_5.nombre_banco = banco; // Especificamos que la clase de CompteCorrent4 y la variable de nombre_banco es igual a la variable de banco.
    }

    // Creamos un método para mostrar la información del primer gestor.
    public void mostrar_informacion_gestor() {
        System.out.println("Nombre del gestor: " + ge.getnom_gestor());
        System.out.println("Teléfono: " + ge.gettelefon_gestor());
        System.out.println("Importe máximo: " + ge.import_maxim);
    }

    // Creamos un método para mostrar la información del segundo gestor.
    public void mostrar_informacion_gestor_2() {
        System.out.println("Nombre del gestor: " + ge2.getnom_gestor());
        System.out.println("Teléfono: " + ge2.gettelefon_gestor());
        System.out.println("Importe máximo: " + ge2.import_maxim);
    }
}