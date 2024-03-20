package intro.teoria;

public class Contenedor<T> {

    // class NombreClase<T> extends ClaseLimite> {
    // ...
    // }

    // class NombreClase<T super Estudiante> {
    // ...
    // }

    private T objeto;

    public Contenedor() {

    }

    void guardar(T nuevo) {
        objeto = nuevo;
    }

    T getObjeto() {
        T aux = objeto;
        objeto = null;
        return aux;
    }

}
