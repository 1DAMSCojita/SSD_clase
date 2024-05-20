package DatosCliente;

import java.time.LocalDate;
// Importación de librerías.
import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        // Creamos el array de clientes y especificamos el DNI y el nombre de cada uno.
        Cliente[] aClientes = {
            new Cliente("Y2448045P", "Stefan"),
            new Cliente("P2302021G", "Pere"),
            new Cliente("J2391938A", "Jose"),
            new Cliente("E2199291A", "Eustaquio")
        };

        Map<String, DatosCliente> mapaClientes = new HashMap<>(); // Creamos el mapa de clientes.

        // Creamos el array de datos y dentro por cada posición del array de clientes también añadimos la fecha de cada cliente.
        DatosCliente[] datosClientes = {
            new DatosCliente(aClientes[0], LocalDate.of(2005, 6, 3)),
            new DatosCliente(aClientes[1], LocalDate.of(1990, 5, 6)),
            new DatosCliente(aClientes[2], LocalDate.of(1987, 4, 1)),
            new DatosCliente(aClientes[3], LocalDate.of(2003, 1, 15))
        };

        // Creamos un bucle 'for-each'.
        // Recorrerá el array de datos y irá añadiendo todo al mapa.
        for (DatosCliente dc : datosClientes) {
            mapaClientes.put(dc.getDni(), dc); // Añadimos al mapa el DNI en base al getter de la clase y el array de datos.
        }

        // Creamos un bucle 'for-each'.
        // Recorrerá el mapa y mostrará la información de los clientes por consola.
        for (Map.Entry<String, DatosCliente> c : mapaClientes.entrySet()) {
            System.out.println("-DNI: " + c.getKey() + ", Datos cliente: " + c.getValue());
        }
    }
}
