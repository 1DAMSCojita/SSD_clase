
package Activitat_5_4;

public class Autoescola {

    // Creamos una instancia de la clase 'Alumne'. Obtenemos los valores de la clase para poder usarlas y realizar los exámenes.
    Alumne a = new Alumne("Stefan", 1, 1);

    // Creamos un método que devolverá un boolean indicando si hemos aprobado el examen teórico o no.
    public boolean examenTeoric() {
        a.setTeoric(Math.random() >= 0.5); // Creamos un número aleatorio entre el 0 y 1. Si es 0, es false. Si es 1, es true.
        // Creamos una estructura de control 'if'.
        // Verificará si hemos aprobado el examen si sale 1 del número aleatorio anteriormente generado. Si no, devolverá false. 
        if (a.isTeoric() == true) {
            return true;
        } else {
            return false;
        }
    }

    // Creamos un método que devolverá un boolean indicando si hemos aprobado el examen práctico o no.
    public boolean examenPractic()  {
        a.setPractic(Math.random() >= 0.5); // Creamos un número aleatorio entre el 0 y 1. Si es 0, es false. Si es 1, es true.
        // Creamos una estructura de control 'if'.
        // Verificará si hemos aprobado el examen si sale 1 del número aleatorio anteriormente generado. Si no, devolverá false.
        if (a.isTeoric() == true) {
            return true;
        } else {
            return false;
        }
    }

    // Creamos un método que devolverá un boolean indicando si hemos obtenido el carnet.
    // En la estructura de control 'if' indicamos que si hemos aprobado el teórico y el práctico. Devolverá true. En el caso contrario, devolverá false. 
    public boolean donarCarnet() {
        if (a.isTeoric() == true && a.isPractic() == true) {
            a.setCarnet(true);
            return true;
        } else {
            a.setCarnet(false);
            return false;
        }
    }


}