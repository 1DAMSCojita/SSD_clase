package Intro.animales;

public interface Sonido extends SonidoZzz {
    
    void voz(); // Método de la interfaz.

    default void vozRepetida(int n) {
        for (int i = 0; i < n; i++) {
            voz();
        }
    }
}
