package Extra.Examen_22_23_Bruno;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<List<Gemelos>, Integer> info = new LinkedHashMap<>(); // Creamos un map que contiene una lista de gemelos y un integer
        List<Gemelos> gemelo1 = new ArrayList<>(); // Creamos un arrayList de gemelos
        int diferenciaEdad1 = 0; // Creamos las diferencias de edad
        int diferenciaEdad2 = 0;
        int diferenciaEdad3 = 0;
        gemelo1.add(new Gemelos("Anna", 25, true)); // Creamos los gemelos
        gemelo1.add(new Gemelos("Joan", 25, false));
        List<Gemelos> gemelo2 = new ArrayList<>();// Creamos un arrayList de gemelos
        gemelo2.add(new Gemelos("Olga", 40, false)); // Creamos los gemelos
        gemelo2.add(new Gemelos("Joel", 40, true));
        List<Gemelos> gemelo3 = new ArrayList<>();// Creamos un arrayList de gemelos
        gemelo3.add(new Gemelos("Pere", 65, false)); // Creamos los gemelos
        gemelo3.add(new Gemelos("Josep", 65, true));
        List<Double> crearArchivo = new ArrayList<>(); // Creamos un arrayList para crear el archivo
        crearArchivo.add(0.7); // Le añadimos los valores
        crearArchivo.add(0.8);
        crearArchivo.add(0.9);
        Funciones.escribirArchivo("velocidades.txt", crearArchivo); // Llamamos al metodo de escribirArchvio y le añadimos la ruta y el arrayList crearArchivo
        List<Double> doulist = new ArrayList<>(); // Creamos un arrayList de tipo double
        doulist.addAll(Funciones.leerArchivo("velocidades.txt"));
        int velocidad = (int)(Math.random() * 3); // Declaramos velocidad y le añadimos un numero aleatorio del 0 al 2
        double vel = doulist.get(velocidad); // Pillamos la velocidad del archivo dependiendo de la pocision de velocidad1 
        doulist.remove(velocidad); // Eliminamos esa velocidad
        velocidad = (int)(Math.random() * 2); // Declaramos velocidad y le añadimos un numero aleatorio del 0 al 1
        double ve2 = doulist.get(velocidad); // Pillamos la velocidad del archivo dependiendo de la pocision de velocidad1 
        doulist.remove(velocidad); // Eliminamos esa velocidad
        double ve3 = doulist.get(0); // Le damos la velocidad restante
        doulist.remove(0); // Eliminamos la velocidad
 
        info.put(gemelo1, diferenciaEdad1); // Ponemos los gemelos y la diferencia de edad en el mapa
        info.put(gemelo2, diferenciaEdad2);
        info.put(gemelo3, diferenciaEdad3);
        
        NaveEspacial ne = new NaveEspacial(gemelo1, vel, 5); // Creamos una NaveEspacial 
        ne.viajeEspacial(); // Usamos el metodo de viajeEspacial()
        diferenciaEdad1 += Funciones.calcularEdad(5, vel); // Usamos calcularEdad para ver la diferencia de edad
        System.out.println(); // Ponemos un enter
        NaveEspacial ne2 = new NaveEspacial(gemelo2, ve2, 7); // Creamos una NaveEspacial 
        ne2.viajeEspacial(); // Usamos el metodo de viajeEspacial()
        diferenciaEdad2 += Funciones.calcularEdad(7, ve2); // Usamos calcularEdad para ver la diferencia de edad
        System.out.println(); // Ponemos un enter
        NaveEspacial ne3 = new NaveEspacial(gemelo3, ve3, 3); // Creamos una NaveEspacial 
        ne3.viajeEspacial(); // Usamos el metodo de viajeEspacial()
        diferenciaEdad3 +=  Funciones.calcularEdad(3, ve3); // Usamos calcularEdad para ver la diferencia de edad
        System.out.println(); // Ponemos un enter
        info.put(gemelo1, diferenciaEdad1); // Añadimos la nueva diferencia de edad
        info.put(gemelo2, diferenciaEdad2);
        info.put(gemelo3, diferenciaEdad3);
        List<NaveEspacial> naves = new ArrayList<>(); // Creamos un arrayList de naves
        naves.add(ne); // Añadimos las naves
        naves.add(ne2);
        naves.add(ne3);
        List<List<Gemelos>> todosgemelo = new ArrayList<>(); // Creamos un arrayList de una lista de gemelos
        todosgemelo.add(gemelo1); // Le añadimos las listas de gemelos
        todosgemelo.add(gemelo2);
        todosgemelo.add(gemelo3);
        for (Map.Entry<List<Gemelos>, Integer> entry : info.entrySet()) { // Hacemos un forEach para mostrar la informacion del map
            List<Gemelos> gemelo = entry.getKey(); // Creamos una lista de gemelos para guardar la key del mapa
            Collections.sort(gemelo); // Ordenamos gemelos
            System.out.print("Gemelos: "); // Mostramos los gemelos
            for (Gemelos h : gemelo) {
                System.out.print(h.toString() + " ");
            }
            System.out.println("Tienen una diferencia de edad de: " + entry.getValue() + " años"); // Decimos la diferencia de edad que tienen

        }
        System.out.println(); // Ponemos un enter
        for (NaveEspacial naveEspacial : naves) { // Hacemos un forEach de nave espacial

            System.out.println("La nave de los gemelos: " + todosgemelo.get(0) + " viajaba con una velocidad de: " + naveEspacial.velocidad + " y tuvo una duracion de: " + naveEspacial.tiempoViaje); // Mostramos los hermanos usando todosgemelos y su gemelo en la pocicion 0, su velocidad y su duracion
            todosgemelo.remove(0); // Eliminamos el gemelo en todosgemelo en la pocicion 0
        }

    }
}
