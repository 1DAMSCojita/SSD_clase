package Activitat_5_2;

public class Equacions {
 
    // Declaración de variables.
    private double coeficiente_a; // Declaramos esta variable que será el primer coeficiente. La encapsulamos como privada.
    private double coeficiente_b; // Declaramos esta variable que será el segundo coeficiente. La encapsulamos como privada.
    private double coeficiente_c; // Declaramos esta variable que será el tercer coeficiente. La encapsulamos como privada.
    private double cont; // Declaramos la variable 'cont' que calculará el discriminante y lo guardará el resultado del cálculo en la raíz.
    private double resultado_1; // Declaramos la variable 'resultado_1' que guarda el resultado de la propia raíz.
    private double resultado_2; // Declaramos la variable 'resultado_2' que guarda el resultado de la propia raíz siendo positivo.
    private double resultado_3; // Declaramos la variable 'resultado_3' que guarda el resultado de la propia raíz siendo negativo.

    // Declaración de constructor.
    public Equacions(double coeficiente_a, double coeficiente_b, double coeficiente_c) {
        this.coeficiente_a = coeficiente_a;
        this.coeficiente_b = coeficiente_b;
        this.coeficiente_c = coeficiente_c;
    }

    // Creamos métodos para modificar los coeficientes. Uno para cada uno.
    public void setcoeficiente_a(double coeficiente_a) {
        this.coeficiente_a = coeficiente_a;
    }

    public void setcoeficiente_b(double coeficiente_b) {
        this.coeficiente_b = coeficiente_b;
    }

    public void setcoeficiente_c(double coeficiente_c) {
        this.coeficiente_c = coeficiente_c;
    }

    // Creamos método para calcular el discriminante.
    // Este método calcula las raíces de una ecuación de segundo grado con los coeficientes a, b y c.
    // Calcula el discriminante (que es cont) para guardarlo en la raíz en si.
    // Usamos una estructura de control 'if' para determinar los siguientes casos: 
    // Si el discriminante es positivo (cont > 0), hay dos raíces reales y diferentes, se calculan con la fórmula específica.
    // Si el discriminante es cero (cont == 0), solamente habrá una raíz única. Y al igual que la anterior también se calculará con la fórmula.
    // Y finalmente, si el discriminante es negativo (no se cumple ningún caso). Mostrará un aviso de que no hay un resultado.
    public void calculo() {
        cont = Math.sqrt(coeficiente_b * coeficiente_b - (4 * coeficiente_a * coeficiente_c));
        if (cont > 0) {
            resultado_1 = (cont);
            resultado_2 = (-coeficiente_b + resultado_1) / (2 * coeficiente_a);
            resultado_3 = (-coeficiente_b - resultado_1) / (2 * coeficiente_a);
            //System.out.println(resultado_1); // Ocultamos el primer resultado ya que no es necesario.
            System.out.println();
            System.out.println("El resultado es:");
            System.out.println();
            System.out.println(resultado_2);
            System.out.println("_____________________");
            System.out.println();
            System.out.println(resultado_3);
            System.out.println();
        } else if (cont == 0) {
            resultado_1 = (cont);
            resultado_2 = (-coeficiente_b) / (2 * coeficiente_a);
            resultado_3 = (coeficiente_b) / (2 * coeficiente_a);
            //System.out.println(resultado_1); // Ocultamos el primer resultado ya que no es necesario.
            System.out.println();
            System.out.println("El resultado es:");
            System.out.println();
            System.out.println();
            System.out.println(resultado_2);
            System.out.println("_____________________");
            System.out.println();
            System.out.println(resultado_3);
            System.out.println();
        } else {
            System.out.println("No hay resultados reales.");
        }
    }
    
    // Creamos otro método booleano que verifica si el discriminante es positivo o negativo.
    public boolean es_positivo() {
        if (cont > 0) {
            System.out.println("El discriminante es positivo.");
        } else {
            System.out.println("El discriminante es negativo.");
        }
        return true;
    }
}