
package Activitat_5_4;

public class Alumne {

    // Declaración de variables. Aplicamos encapsulamiento privado en cada uno de ellos.  
    private String nom;
    private int intentsTeoric;
    private int intentsPractic;
    private boolean teoric;
    private boolean practic;
    private boolean carnet;

    // Declaración de constructor. 
    Alumne(String nom, int intentsTeoric, int intentsPractic) {
        this.nom = nom;
        this.intentsTeoric = intentsTeoric;
        this.intentsPractic = intentsPractic;
    }

    // Declaración de métodos getters y setters.
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIntentsTeoric() {
        return intentsTeoric;
    }

    public void setIntentsTeoric(int intentsTeoric) {
        this.intentsTeoric = intentsTeoric;
    }

    public int getIntentsPractic() {
        return intentsPractic;
    }

    public void setIntentsPractic(int intentsPractic) {
        this.intentsPractic = intentsPractic;
    }
    
    public boolean isTeoric() {
        return teoric;
    }

    public void setTeoric(boolean teoric) {
        this.teoric = teoric;
    }

    public boolean isPractic() {
        return practic;
    }

    public void setPractic(boolean practic) {
        this.practic = practic;
    }

    public boolean isCarnet() {
        return carnet;
    }

    public void setCarnet(boolean carnet) {
        this.carnet = carnet;
    }
}