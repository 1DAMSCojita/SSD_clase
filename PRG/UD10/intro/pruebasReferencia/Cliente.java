package intro.pruebasReferencia;

public class Cliente {

    String nombre;

    Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Hola, " + nombre;
    }
}
