package Intro.musica;

import java.util.Arrays;

public abstract class Instrumento {

    Nota[] melodia;

    Instrumento() {
        this.melodia= new Nota[0];
    }

    public void add(Nota nota) {
        this.melodia = Arrays.copyOf(melodia, melodia.length + 1);
        this.melodia[this.melodia.length - 1] = nota;
    }

    public abstract void interpretar();
}
