package Usar_variables_estaticas;

public class MiClase {
    
    private static int atributoEstatico = 42;

    // Getter estático opcional (no necesario para acceder al atributo desde otra clase)
    public static int obtenerAtributoEstatico() {
        return atributoEstatico;
    }
}