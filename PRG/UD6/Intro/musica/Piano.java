package Intro.musica;

public class Piano extends Instrumento {
    
    @Override
    public void interpretar() {
        for (int i = 0; i < melodia.length; i++) {
            System.out.println(melodia[i]);
        }
    }
}
