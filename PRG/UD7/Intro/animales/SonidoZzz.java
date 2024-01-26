package Intro.animales;

public interface SonidoZzz {
    
    int VERSION = 1;
    
    // Métodos por defecto.
    default void vozDurmiendo() {
        roncar();
    }

    // Métodos estáticos (pueden ser públicos o privados)
    static void bostezo() {
        bosteza();
    }

    private static void bosteza() {
        System.out.println("¡aaaaauuuuuuuuuuuuhhhhh never gonna give you uppppppppppppppppppp!");
    }

    private static void roncar() {
        System.out.println("...zzzz... never gonna give you up... zzzz...");
    }
    
}
