package Activitat_5_1_5;

public class Gestor {

    // Declaración de variables.
    private String nom_gestor; // Declaramos la variable 'nom_gestor' que incluirá el nombre del gestor y la hacemos private ya que en el 'get' será público.
    private String telefon_gestor; 
    int import_maxim;

    // Declaramos de constructores.
    Gestor(String nom_gestor, String telefon_gestor, int import_maxim) {
        this.nom_gestor = nom_gestor;
        this.telefon_gestor = telefon_gestor;
        this.import_maxim = import_maxim;
    }

    Gestor(String nom_gestor, String telefon_gestor) {
        this(nom_gestor, telefon_gestor, 10000);
    }

    // Creamos un método para añadir el nombre del gestor.
    public String getnom_gestor() {
        return nom_gestor;
    }

    // Creamos un método para añadir el teléfono del gestor.
    public String gettelefon_gestor() {
        return telefon_gestor;
    }

}
