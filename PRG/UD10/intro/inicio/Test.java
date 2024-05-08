package intro.inicio;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Stefan");
        Cliente c2 = new Cliente("Eduardo");
        Cliente c3 = new Cliente("Barabarabara");
        Cliente c4 = new Cliente("Bereberebere");

        List<Cliente> listaClientes = new ArrayList<>();

        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        listaClientes.add(c4);

        // Comparator<Cliente> comp = new Comparator<>() {
        //     public int compare (Cliente c1, Cliente c2){
        //         return c1.nombre.compareTo(c2.nombre);
        //     }
        // };

        // Collections.sort(listaClientes, new Comparator<>() {
        //     public int compare(Cliente c1, Cliente c2) {
        //         return c1.nombre.compareTo(c2.nombre);
        //     }
        // });

        // LAMBDA
        // Comparator<Cliente> comp = (o1,  o2) -> o1.nombre.compareTo(o2.nombre);      
        
        Collections.sort(listaClientes, (o1,  o2) -> o1.nombre.compareTo(o2.nombre));

        for (Cliente c : listaClientes) {
            System.out.println(c.nombre);
        }

    }
}
