package el_mejor_programa_del_siglo;

public class Genis {
    
    int kilometrosHora = (int)(Math.random() * 240) + 10;

    Genis() {

    }

    public void derrapar() {
        System.out.println("Genis derrapa con el coche.");
    }

    public void pasaInspeccion() {
        int pasa = (int)(Math.random() * 2) + 1;
        if (pasa == 1) {
            System.out.println("Genis pasa la inspección del ITV.");
        } else if (pasa == 2) {
            System.out.println("Genis no pasa con la ITV.");
        }
    }

    public void vienePolicia() {
        System.out.println("La policia para a Genis.");
        if (kilometrosHora > 10 && kilometrosHora < 50) {
            System.out.println("Genis no recibe multa. Velocidad adecuada.");
        } else if (kilometrosHora > 80 && kilometrosHora < 240) {
            System.out.println("Genis recibe multa porque va demasiado rápido.");
        }
    }
    
    @Override
    public String toString() {
        return "Genis va a " + kilometrosHora + " km/h.";    
    }

}
