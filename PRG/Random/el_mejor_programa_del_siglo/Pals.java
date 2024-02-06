package el_mejor_programa_del_siglo;

public class Pals {

    String tipoNombre;
    String residencia;
    int nivelDeGay = (int)(Math.random() * 10000);

    public Pals(String tipoNombre, String residencia) {
    	if (tipoNombre.startsWith("Pal")) {
            this.tipoNombre = tipoNombre;
        } else {
            System.out.println("Por favor. Proporcione un tipo de Pals correcto. En el objeto Pals los nombres deben empezar con el prefijo Pal.");
        }
        this.residencia = residencia;
    }
    
    @Override
    public String toString() {
        return "-Nombre: " + tipoNombre + ", reside en " + residencia + ". Su nivel de gay es " + nivelDeGay;
    }
}
