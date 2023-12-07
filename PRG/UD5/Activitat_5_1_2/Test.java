package Activitat_5_1_2;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una instancia a la clase CompteCorrent_2. Esta primera instancia mostrará el DNI/NIE, el nombre y el saldo.
        CompteCorrent_2 c = new CompteCorrent_2();

        // Creamos otra instancia a la clase CompteCorrent_2. Esta segunda instancia muestra El DNI/NIE y el saldo. El titular es vacío. Mostrará solamente "none".
        CompteCorrent_2 b = new CompteCorrent_2("X2331983S", 5.0);
    
        // Ingresamos 30€.
        c.ingresar_dinero(20);
        System.out.println();
        b.ingresar_dinero(30);

        // Sacamos 20€.
        c.ingresar_dinero(10);
        System.out.println();
        b.sacar_dinero(20);

        // Mostamos el estado actual, toda la información. Llamando al método.
        c.mostrar_informacion();
        System.out.println();
        b.mostrar_informacion();
        
    }
}
