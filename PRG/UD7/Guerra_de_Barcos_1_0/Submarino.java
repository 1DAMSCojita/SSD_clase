package Guerra_de_Barcos_1_0;

public class Submarino extends BuqueGuerra {

    // Declaración de variables.
    boolean sumergido;

    // Declaración de constructor.
    Submarino(String nombre, String[] casillas, String[] casilasNoTocadas, TipoBarco tipoBarco, boolean sumergido) {
        super(nombre, casillas, casilasNoTocadas, tipoBarco);
        this.sumergido = sumergido;
    }

    // Sobreescribimos el método 'toString()' para mostrar información del barco.
    @Override
    public String toString() {
        return "El nombre del submarino es " + nombre + ", tiene " + casillas + " casillas." + " No ha tocado " + casillasNoTocadas + " casillas." + " El tipo de barco es " + tipoBarco + ". Sumergido: " + sumergido;
    }


}
