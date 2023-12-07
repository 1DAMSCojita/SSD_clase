package Activitat_5_1_1;

public class Test {
    public static void main(String[] args) {
        
        // Creamos una instancia a la clase CompteCorrent. La información estará dentro y ya tendremos una cuenta. 
        CompteCorrent c = new CompteCorrent("Y2448045P", "Stefan", 0.0);
    
        // Ingresamos 30€.
        c.ingresar_dinero(30);

        // Sacamos 20€.
        c.sacar_dinero(20);

        // Mostamos el estado actual, toda la información. Llamando al método.
        c.mostrar_informacion();
        
    }
}
