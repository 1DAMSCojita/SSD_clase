package Usar_variables_estaticas;

public class OtraClase {

    private int valor;

    // Constructor que utiliza directamente el atributo estático
    public OtraClase() {
        this.valor = MiClase.obtenerAtributoEstatico(); // Puedes usar el getter si lo prefieres
    }

    public int getValor() {
        return valor;
    }
}
