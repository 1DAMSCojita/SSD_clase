package Usar_variables_estaticas;

public class Todo_en_uno {
    
    public static class MiClase {
        private static int atributoEstatico = 42;
    
        // Getter estático opcional (no necesario para acceder al atributo desde otra clase)
        public static int obtenerAtributoEstatico() {
            return atributoEstatico;
        }
    }
    
    public static class OtraClase {
        private int valor;
    
        // Constructor que utiliza directamente el atributo estático
        public OtraClase() {
            this.valor = MiClase.obtenerAtributoEstatico(); // Puedes usar el getter si lo prefieres
        }
    
        public int getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de OtraClase
        OtraClase otraInstancia = new OtraClase();
    
        // Obtener el valor en OtraClase
        System.out.println("Valor en OtraClase: " + otraInstancia.getValor());
    
        // También puedes acceder directamente al atributo estático sin el getter
        System.out.println("Valor directo desde MiClase: " + MiClase.obtenerAtributoEstatico());
    }
}
