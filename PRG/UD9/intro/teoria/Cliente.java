package intro.teoria;

public class Cliente implements Comparable<Cliente> {

    final String DNI;
    String nombre;

    public Cliente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nDNI: " + this.DNI; 
    }

    @Override
    public int compareTo(Cliente o) {
        return this.DNI.compareTo(o.DNI);
    }

    static <U> int edad(U[] arrayDeUso) {
        
        int contador = 0;
        
        for (@SuppressWarnings("unused") U u : arrayDeUso) {
            contador++;
        }
        
        return contador;
    }

}
