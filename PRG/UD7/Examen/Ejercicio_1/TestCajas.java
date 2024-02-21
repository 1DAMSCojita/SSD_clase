package Ejercicio_1;

public class TestCajas {
    public static void main(String[] args) {
        
        // Creamos instancias de la clase 'Caja' y 'CajaCarton' añadiendo información.
        Caja c = new Caja(4, 1, 7, Unidad.M);
        CajaCarton cc = new CajaCarton(2, 3, 4, Unidad.CM);

        // Llamamos a los métodos y al 'toString'
        c.getVolumen();
        c.setEtiqueta("Nombre: Stefan, Direccion: C/Sant Pepe");
        System.out.println(c.toString());

        cc.getVolumen();
        cc.setEtiqueta("Nombre: Paco, Dirección: C/Aplaco  7");
        System.out.println(cc.toString());

    }
}
