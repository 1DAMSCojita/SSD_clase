package Activitat_6_5;

public class TestEspacial {
    public static void main(String[] args) {
        
        // Creamos instancias de clases y añadimos cada nave con su respectiva información.
        NaveGuerra ng = new NaveGuerra("Arcano", 12, 53);
        NaveGuerra ng2 = new NaveGuerra("Arcano", 12, 53);
        // Creamos una instancia de la 'NaveEspacial' y añadimos que será igual a 'ng' (o ng2) que es el objeto creado de la clase 'NaveGuerra'.
        NaveEspacial ne = ng;
        NaveEspacial ne2 = ng2;
        NaveExploradora nE = new NaveExploradora("Samans", 5, TipoPlaneta.HELADO);
        NaveExploradora nE2 = new NaveExploradora("Samans", 5, TipoPlaneta.HELADO);

        // Mostramos toda la información a su vez llamando a los métodos correspondientes.
        System.out.println(); // Salto.
        System.out.println(ng.toString());
        System.out.println(ne.toString());
        System.out.println(nE.toString());
        System.out.println("____________________________________________"); // Separador.
        System.out.println(); // Salto.
        System.out.println(ng.equals(ne2));
        System.out.println(ne.equals(ng2));
        System.out.println(nE.equals(nE2));
        System.out.println(); // Salto.
        ng.despegue();
        ne.despegue();
        nE.despegue();
        System.out.println("____________________________________________"); // Separador.
        System.out.println(); // Salto.
        ng.aterrizar();
        ne.aterrizar();
        nE.aterrizar();

    }
}
