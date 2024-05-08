package Examen_23_24;

import java.util.*;

public class Plantilla {

    @SuppressWarnings("resource")
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        final String DNI;
        String nombre;
        int edad;
        Posicion posicion;

        try {
            posicion = MetodosAuxiliares.obtenerPosicion();

            System.out.println("Introduzca el nombre del jugador: ");
            nombre = new Scanner(System.in).nextLine();

            System.out.println("Introduzca el DNI del jugador: ");
            DNI = new Scanner(System.in).nextLine();

            System.out.println("Introduzca la edad del jugador: ");
            edad = MetodosAuxiliares.entrarValorEntero();

            plantilla.put(dorsal, new Jugador(DNI, nombre, edad, posicion));

        } catch (InputMismatchException e) {
            System.out.println("Introduzca un valor válido.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error al intentar dar de alta un jugador: " + e.getMessage());
        }
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        Map<Integer, Jugador> plantillaOrdenada = new TreeMap<>();
        plantillaOrdenada.putAll(plantilla);
        for(Integer i : plantilla.keySet()) {
            System.out.println("Dorsal: " + i + " | " + "Nombre: " + plantillaOrdenada.get(i).getNombre());
        }

        System.out.println("");
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        
        Posicion posicionAUX = MetodosAuxiliares.devuelvePosicionSegunCadena(posicion);

        Comparator<Jugador> comparaNombres = new Comparator<>() {
            @Override
            public int compare(Jugador o1, Jugador o2) {
                if (o1.getNombre().compareTo(o2.getNombre()) != 0) {
                    return o1.getNombre().compareTo(o2.getNombre());
                } else {
                    Integer dorsalo1 = -1;
                    Integer dorsalo2 = -1;
                    for (Map.Entry<Integer, Jugador> p : plantilla.entrySet()) {
                        if (Objects.equals(o1, p.getValue())) {
                            dorsalo1 = p.getKey();
                        }
                        if (Objects.equals(o2, p.getValue())) {
                            dorsalo2 = p.getKey();
                        }
                    }
                    return dorsalo1 - dorsalo2;
                }
            }
        };

        Map<Jugador, Integer> plantillaInvertida = new TreeMap<>(comparaNombres);

        for (Map.Entry<Integer, Jugador> p : plantilla.entrySet()) {
            if (p.getValue().getPosicion() == posicionAUX) {
                plantillaInvertida.put(p.getValue(), p.getKey());
            }
        }

        for (Map.Entry<Jugador, Integer> pi : plantillaInvertida.entrySet()) {
            System.out.println("Nombre: " + pi.getKey().getNombre() + " | " + "Dorsal: " + pi.getValue());
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (!plantilla.containsKey(dorsal)) {
            return false;
        }

        Jugador jugador = plantilla.get(dorsal);
        System.out.println(jugador);

        int opcion = -1;

        while (opcion != 4) {
            System.out.println("Indique qué valor del jugador quiere modificar o salir para volver al menú principal: ");
            System.out.println("1. Nombre.");
            System.out.println("2. Edad.");
            System.out.println("3. Posición.");
            System.out.println("4. Salir y volver al menú principal.");
            opcion = MetodosAuxiliares.entrarValorEntero();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre actual: " + jugador.getNombre());
                    System.out.println("Indique el nuevo nombre: ");
                    jugador.setNombre(MetodosAuxiliares.entrarCadena());
                    break;
                case 2:
                    System.out.println("Edad actual: " + jugador.getEdad());
                    System.out.println("Indique la nueva edad: ");
                    jugador.setEdad(MetodosAuxiliares.entrarValorEntero());
                    break;
                case 3:
                    System.out.println("Posición actual: " + jugador.getPosicion());
                    System.out.println("Indique la nueva posición: ");
                    jugador.setPosicion(MetodosAuxiliares.obtenerPosicion());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Escoja una opción válida.");
                    break;
            }
        }
        return true;
    }
}
