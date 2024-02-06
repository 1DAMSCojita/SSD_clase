package el_mejor_programa_del_siglo;

public class Pals implements Julen {

    String tipoNombre;
    String residencia;
    int nivelDeGay = (int)(Math.random() * 10000);

    public Pals(String tipoNombre, String residencia) {
    	if (tipoNombre.startsWith("Pal")) {
            this.tipoNombre = tipoNombre;
        } else {
            System.exit(0);
        }
        this.residencia = residencia;
    }

    @Override
    public void accion() {
        int numd = (int)(Math.random() * 5) + 1;
        if (numd == 1) {
            System.out.println(tipoNombre + " te palea.");
        } else if (numd == 2) {
            System.out.println(tipoNombre + " le encantas por ponerle motes y te habla más.");
        } else if (numd == 3) {
            System.out.println(tipoNombre + " se caga en el arte del beatbox porque no le gusta.");
        } else if (numd == 4) {
            System.out.println(tipoNombre + " odia la ensalada de cum y te dice que si la has probado eres un rarito.");
        } else if (numd == 5) {
            System.out.println(tipoNombre + " se sienta en el banco. No quiere jugar a nada.");
        }
    }

    @Override
    public void jugarJuego() {
        System.out.println(tipoNombre + " no juega a ningún juego en específico.");
    }
    
    @Override
    public String toString() {
        return "-Nombre: " + tipoNombre + ", reside en " + residencia + ". Su nivel de gay es " + nivelDeGay;
    }

    
}
