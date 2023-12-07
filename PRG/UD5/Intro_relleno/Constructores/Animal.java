package Constructores;

public class Animal {
    
    String especie;
    int patas;
    boolean mamifero;

    Animal(String especie, int patas, boolean mamifero) {
        this.especie = especie;
        this.patas = patas;
        this.mamifero = mamifero;
    }

    Animal(String especie, int patas) {
        this.especie = especie;
        this.patas = patas;
        this.mamifero = true;
    }

    Animal(boolean mamifero) {
        this("Humano", 2, mamifero);
        //this.especie = "Humano";
        //this.patas = 2;
        //this.mamifero = mamifero;
    }

    public void mostrar_informacion() {
        System.out.println("Especie: " + this.especie);
        System.out.println("Patas: " + this.patas);
        System.out.println("Mamífero: " + this.mamifero);
    }

}
