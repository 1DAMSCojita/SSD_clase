package Usar_variables_estaticas;

public class Test {
    public static void main(String[] args) {
        // Crear una instancia de OtraClase
        OtraClase otraInstancia = new OtraClase();

        // Obtener el valor en OtraClase
        System.out.println("Valor en OtraClase: " + otraInstancia.getValor());

        // También puedes acceder directamente al atributo estático sin el getter
        System.out.println("Valor directo desde MiClase: " + MiClase.obtenerAtributoEstatico());
    }
}
