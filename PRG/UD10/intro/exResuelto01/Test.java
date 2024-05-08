package intro.exResuelto01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Pedro", 20);
        Cliente c2 = new Cliente("Dwyane Johnson", 45);
        Cliente c3 = new Cliente("Mewing", 32);
        Cliente c4 = new Cliente("Cum", 35);

        Cliente[] grupoClientes = {c1, c2, c3, c4};

        // Saludo<Cliente> saludoClientes = c -> "¡Buenos días " + c.nombre + "!";

        System.out.println(maximo(grupoClientes, (a, b) -> a.edad - b.edad).nombre);
    }

    static <T> List<String> saludaGrupo(T[] grupo, Saludo<T> saludo) {

        List<String> listado = new ArrayList<>();
        for (T cliente : grupo) {
            String mensaje = saludo.saludar(cliente);
            listado.add(mensaje);
        }
        return listado;
    }

    // Implementa un método estático que recibe por parámetro un array de tipo genérico y un comparador para ese tipo.
    // Devuelve el valor máximo de los elementos del array según el criterio de orden del comparador. Se va aplicar a un array
    // de clientes.
    static <T> T maximo(T[] valores, Comparator<T> comparador) {

        if (valores == null || valores.length == 0) {
            return null; 
        }
        T valorMaximo = valores[0];
        
        for (T valor : valores) {
            if (comparador.compare(valor, valorMaximo) > 0) {
                valorMaximo = valor;
            }
        }

        return valorMaximo;
    } 

}
