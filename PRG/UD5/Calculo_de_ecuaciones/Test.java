package Activitat_5_2;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una instancia. Llamamos a la clase 'Equacions' y le ponemos los valores que queramos para calcular.
        Equacions e = new Equacions(6, 100, 6);
        
        e.calculo(); // Llamamos al método 'calculo()' de la clase 'Equacions' que realizará el cálculo de los valores que hemos puesto.
        e.es_positivo(); // Llamamos al método 'es_positivo()' de la clase 'Equacions' que nos indicará si el discriminante es positivo o negativo.
    }
}