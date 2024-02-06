package el_mejor_programa_del_siglo;

public class Juls implements Julen {

    String tipoNombre;
    String residencia;
    int nivelDeGay = (int)(Math.random() * 10000);
    
    public Juls(String tipoNombre, String residencia) {
        if (tipoNombre.startsWith("Ju")) {
            this.tipoNombre = tipoNombre;
        } else {
            System.out.println("Por favor. Proporcione un tipo de Juls correcto. En el objeto Juls los nombres deben empezar con el prefijo Ju.");
        }
        this.residencia = residencia;
    }

    @Override
    public void accion() {
        int numd = (int)(Math.random() * 6);
        if (numd == 1) {
            System.out.println(tipoNombre + " te julea.");
        } else if (numd == 2) {
            System.out.println(tipoNombre + " se enfada contigo por ponerle motes y no te habla.");
        } else if (numd == 3) {
            System.out.println(tipoNombre + " se pone a hacer beatbox.");
        } else if (numd == 4) {
            System.out.println(tipoNombre + " se come una ensalada de cum y te dice que si no has probado eso, significa que no has probado nada en tu vida.");
        } else if (numd == 5) {
            System.out.println(tipoNombre + " juega a la pelota.");
        }
    }

    @Override
    public void jugarJuego() {
        int numd = (int)(Math.random() * 7);
        if (numd == 1) {
            System.out.println(tipoNombre + " juega a Risk of Rain 2.");
        } else if (numd == 2) {
            System.out.println(tipoNombre + " juega a un juego random de carreras del 1001 juegos.");
        } else if (numd == 3) {
            System.out.println(tipoNombre + " juega al FNAA 3D ( ͡° ͜ʖ ͡°)");
        } else if (numd == 4) {
            System.out.println(tipoNombre + " juega a un juego random de hacer parkour.");
        } else if (numd == 5) {
            System.out.println(tipoNombre + " juega a PokeMMO.");
        } else if (numd == 6) {
            System.out.println(tipoNombre + " juega al Lethal Company.");
        }
    }

    @Override
    public String toString() {
        return "-Nombre: " + tipoNombre + ", reside en " + residencia + ". Su nivel de gay es " + nivelDeGay;
    }
    


}
