package Examen_23_24;

import java.util.*;

public class MetodosAuxiliares {

    static void menu(Map<Integer, Jugador> plantilla) {

        Set<String> nombresEliminados = new TreeSet<>();
        Set<Integer> dorsalesEliminados = new TreeSet<>();

        int opcion = -1;

        System.out.println("----- MENÚ PARA LA GESTÓN DE UNA PLANTILLA DE FÚTBOL -----");
        do {
            pintaMenu();
            opcion = entrarValorEntero();
            switch (opcion) {
                case 1: // Alta.
                    if (plantilla.keySet().size() == 99) {
                        System.out.println("Todos los dorsales están ya asignados, no se puede dar de alta a un nuevo jugador.");
                        break;
                    }

                    Plantilla.altaJugador(plantilla, dorsalAleatorio(plantilla.keySet()));
                    break;
                case 2: // Editar.
                    System.out.println("Introduzca el dorsal del jugador a editar (1-99):");
                    Integer dorsalAEditar = entrarValorEntero();

                    if (!Plantilla.editarJugador(plantilla, dorsalAEditar)) {
                        System.out.println("Dorsal no encontrado en la plantilla.");
                    }
                    break;
                case 3: // Eliminar.
                    System.out.println("Introduzca el dorsal del jugador a eliminar (1-99):");
                    Integer dorsalAEliminar = entrarValorEntero();

                    if (plantilla.keySet().contains(dorsalAEliminar)) {
                        Jugador jugadorEliminado = Plantilla.eliminarJugador(plantilla, dorsalAEliminar);
                        if (jugadorEliminado != null) {
                            nombresEliminados.add(jugadorEliminado.getNombre());
                            dorsalesEliminados.add(dorsalAEliminar);
                        }
                    } else {
                        System.out.println("Dorsal no encontrado en la plantilla.");
                    }
                    break;
                case 4: // Listado dorsales.
                    Plantilla.mostrar(plantilla);
                    break;
                case 5: // Listado de jugadores de una posición.
                    Posicion posicion = obtenerPosicion();
                    String cadenaPosicion = devuelveCadenaPosicion(posicion);
                    Plantilla.mostrar(plantilla, cadenaPosicion);
                    break;
                case 6: // Salir de la aplicación. 
                    System.out.println("Relación de nombres y dorsales eliminados en esta sesión: ");
                    if (nombresEliminados.size() > 0) {
                        imprimirEliminados(nombresEliminados);
                    } else {
                        System.out.println("No hay nombres eliminados.");
                    }
                    if (dorsalesEliminados.size() > 0) {
                        imprimirEliminados(dorsalesEliminados);
                    } else {
                        System.out.println("No hay dorsales eliminados.");
                    }
                    break;
                default:
                    break;
            }
           
        } while (opcion != 6);
        

    }
    
    private static void pintaMenu() {
        System.out.println("Elija una opción: ");
        System.out.println("1. Dar de alta a un jugador.");
        System.out.println("2. Editar un jugador.");
        System.out.println("3. Eliminar un jugador.");
        System.out.println("4. Listado de dorsales.");
        System.out.println("5. Listado de jugadores de una posición.");
        System.out.println("6. Salir.");
        System.out.println("----------------------------------------------------------");
    }

    private static Integer dorsalAleatorio(Set<Integer> dorsales) {
        Integer dorsal = -1;

        while (dorsal == -1) {
            Random aleatorio = new Random();
            dorsal = aleatorio.nextInt(99 - 1 + 1) + 1;
            if (dorsales.contains(dorsal)) {
                dorsal = -1;
            }
        }

        return dorsal;
    }

    public static Posicion obtenerPosicion() {

        Posicion posicion = null;

        while (posicion == null) {
            pedirPosicion();
            int pos = entrarValorEntero();
            switch (pos) {
                case 1:
                    posicion = Posicion.PORTERO;
                    break;
                case 2:
                    posicion = Posicion.DEFENSA;
                    break;
                case 3:
                    posicion = Posicion.CENTROCAMPISTA;
                    break;
                case 4:
                    posicion = Posicion.DELANTERO;
                    break;
                default:
                    System.out.println("Valor no es válido.");
                    posicion = null;
                    break;
            }
        }

        return posicion;
    }

    private static void pedirPosicion() {
        String texto = "Introduzca la posición del jugador: ";
        texto += "\n1 - Portero";
        texto += "\n2 - Defensa";
        texto += "\n3 - Centrocampista";
        texto += "\n4 - Delantero";
        System.out.println(texto);
    }

    @SuppressWarnings("resource")
    public static int entrarValorEntero() {
        
        int valor = -1;
        boolean error = true;

        while (error) {
            try {
                valor = new Scanner(System.in).nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un valor numérico entero válido.");
            } catch (Exception e) {
                System.out.println("Se ha producido un error al entrar el valor numérico de tipo entero. Prueba de nuevo");
            }
        }

        return valor;
    }

    static Posicion devuelvePosicionSegunCadena(String cadenaPosicion) {

        Posicion posicion = null;

        switch (cadenaPosicion) {
            case "portero":
                posicion = Posicion.PORTERO;
                break;
            case "defensa":
                posicion = Posicion.DEFENSA;
                break;
            case "centrocampista":
                posicion = Posicion.CENTROCAMPISTA;
                break;
            case "delantero":
                posicion = Posicion.DELANTERO;
                break;
            default:
                break;
        }

        return posicion;
    }

    @SuppressWarnings("resource")
    public static String entrarCadena() {
        String valor = "";
        boolean error = true;

        while (error) {
            try {
                valor = new Scanner(System.in).nextLine();
                error = !(valor.trim().length() > 0);
            } catch (NoSuchElementException e) {
                System.out.println("Introduzca un valor válido.");
            } catch (Exception e) {
                System.out.println("Se ha producido un error al entrar el valor de la cadena.");
            }
        }

        return valor.trim();
    }

    static String devuelveCadenaPosicion(Posicion posicion) {

        String cadenaPosicion = "";
        switch (posicion) {
            case PORTERO:
                cadenaPosicion = "portero";
                break;
            case DEFENSA:
                cadenaPosicion = "defensa";
                break;
            case CENTROCAMPISTA:
                cadenaPosicion = "centrocampista";
                break;
            case DELANTERO:
                cadenaPosicion = "delantero";
                break;
            default:
                break;
        }
        return cadenaPosicion;
    }

    static <T> void imprimirEliminados(Set<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

}
