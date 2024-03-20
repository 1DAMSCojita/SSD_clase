package intro.teoria;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Una colección sirve para guardar un conjunto de objetos.
        // Estos objetos los podemos llamar elementos.
        
        // Permiten un conjunto de métodos para gestionar esots datos:
        // Inserción, eliminación, búsqueda y ordenación.

        // Para ello Java nos proporciona una interfaz llamada "Collection".

        // Las listas son importantes para guardar sucesiones de datos que pueden estar repetidos y cuyo orden sea relevante. Estas listas vendrían a ser la 
        // sustitución de los arrays.

        // Tipos fundamentales:

        // List.
        // Queue.
        // Set.

        // No se puede hacer instancias de un tipo genérico.
        // No se pueden crear arrays de tipo genérico.
        // No podemos utilizar excepciones genéricas.

        Contenedor<Integer> c = new Contenedor<>(); 

        c.guardar(15);

        Integer i = c.getObjeto();

        System.out.println(i);

        Contenedor<Double> d = new Contenedor<>();

        d.guardar(10.5);

        Double x = d.getObjeto();

        System.out.println(x);

        Contenedor<String> s = new Contenedor<>();

        s.guardar("Like a mango with a roll");

        String cadena = s.getObjeto();

        System.out.println(cadena);

        Contenedor<Cliente> cc = new Contenedor<>();

        cc.guardar(new Cliente("412231321S", "Culs"));

        Cliente cli = cc.getObjeto();

        System.out.println(cli);

        Cliente[] clientes = {
            new Cliente("324242B", "Paco"),
            new Cliente("343242A", "Paca"),
            new Cliente("353562S", "Pepa")
        };

        Comparator<Cliente> ordenNatural = Comparator.naturalOrder();

        Comparator<Cliente> ordenInverso = ordenNatural.reversed();

        Comparator<Cliente> ordenInversoin = ordenInverso.reversed();

        Arrays.sort(clientes, ordenNatural);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        Arrays.sort(clientes, ordenInverso);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        Arrays.sort(clientes, ordenInversoin);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

    }
}
