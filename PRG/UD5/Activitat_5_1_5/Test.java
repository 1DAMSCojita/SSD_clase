package Activitat_5_1_5;

// Importación de librerías.
import java.util.Scanner;

public class Test {

    public static Scanner sc = new Scanner(System.in); // Declaramos un scanner público y estático que nos servirá para todas las funciones.
    public static void main(String[] args) {

        // Declaración de variable solo para elegir una ruta en la gestión de banco.
        int opcion;

        // Creamos una instancia a la clase CompteCorrent_2. Esta primera instancia mostrará el DNI/NIE, el nombre y el saldo.
        CompteCorrent_5 c = new CompteCorrent_5();

        // Creamos otra instancia a la clase CompteCorrent_2. Esta segunda instancia muestra El DNI/NIE y el saldo. El titular es vacío. Mostrará solamente "none".
        CompteCorrent_5 b = new CompteCorrent_5("X2331983S", 5.0);
    
        // Ingresamos 30€.
        c.ingresar_dinero(20);
        System.out.println();
        b.ingresar_dinero(30);

        // Sacamos 20€.
        c.ingresar_dinero(10);
        System.out.println();
        b.sacar_dinero(20);

        // Mostamos el estado actual, toda la información de cada usuario y gestor. Llamando a los métodos.
        c.mostrar_informacion();
        c.mostrar_informacion_gestor(); // Aquí llamamos al método 'mostrar_informacion_gestor' de la clase CompteCorrent.
        System.out.println();
        b.mostrar_informacion();
        b.mostrar_informacion_gestor_2(); // Aquí llamamos al método 'mostrar_informacion_gestor' de la clase CompteCorrent.
        
        // Establecemos el nombre del banco.
        System.out.println("________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Gestión de banco. Elige una de estas opciones: 1- Mostrar el nombre del banco, 2- Cambiar el nombre del banco.");
        System.out.println("________________________________________________________________________________________________________________");
        System.out.println();
        opcion = sc.nextInt();
        sc.nextLine(); // Agregamos otro sc para que consuma el carácter de la nueva línea restante.
        // Creamos una estructura de control "if".
        // Si elegimos 1, se mostrará el nombre del banco por defecto.
        // Pero si elegimos 2, se dará la opción de cambiar el nombre del banco.
        if (opcion == 1) {
            System.out.println("Nombre del banco: " + CompteCorrent_5.getnombre_banco()); // Mostramos el nombre por defecto del banco llamando al método de la clase CompteCorrent.    
        } else if (opcion == 2) {
            System.out.println("Escribe el nuevo nombre para el banco:");
            CompteCorrent_5.banco = sc.nextLine();
            CompteCorrent_5.setnombre_banco(CompteCorrent_5.banco); // De una manera estática hacemos que el nombre del banco se cambie con un set.
            System.out.println("Nombre del banco: " + CompteCorrent_5.getnombre_banco()); // Tomamos el nombre nuevo del banco y lo mostramos por consola.
        }
        sc.close(); // Cerramos escáner.
    }
}
