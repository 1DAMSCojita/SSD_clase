package Guerra_de_Barcos_1_0;

public class BuqueGuerra extends Barco {
    
    // Declaración de variables.
    String[] casillasNoTocadas;
    TipoBarco tipoBarco;

    // Declaración de constructor.
    BuqueGuerra(String nombre, String[] casillas, String[] casillasNoTocadas, TipoBarco tipoBarco) {
        this.nombre = nombre;
        this.casillas = casillas;
        this.casillasNoTocadas = casillasNoTocadas;
        this.tipoBarco = tipoBarco;
    }

    @Override
    public void obtenerNombre() {
        System.out.println("Barco: " + nombre);
    }

    public void obtenerTamaño() {
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTamaño'");
    }

    public void disparar() {
        throw new UnsupportedOperationException("Unimplemented method 'disparar'");
    }

    public String toString() {
        return "El buque se llama " + nombre + ", dispone de " + casillas + " casillas." + " No ha tocado " + casillasNoTocadas + " casillas." + " El tipo de barco es " + tipoBarco;
    }

    

}
