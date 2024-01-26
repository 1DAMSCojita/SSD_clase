package Intro.animales;

public class Test {
    public static void main(String[] args) {
        
        Sonido s = new Sonido() {
            
            @Override
            public void voz() {
                System.out.println("Hola a todos... ¡Bieeenvenidooos a TownnnGamePlayyy! Tengo que informaros que me gustan las menores.");
            }

            /* 
            public void otro() {
                System.out.println("El que lea esto es gei");
            }
            */
        };
        
        //s.voz();
        //s.vozDurmiendo();
        s.vozRepetida(5);
    }
}
