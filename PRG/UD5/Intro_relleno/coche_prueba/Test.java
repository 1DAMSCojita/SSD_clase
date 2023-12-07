package coche_prueba;

public class Test {
    public static void main(String[] args) {
        
        Coche c = new Coche("Stefan", "4353FSX", "Volswagen");
        Coche q = new Coche(100);
        Coche z = new Coche(1.43);

        System.out.println("________________________________________");
        System.out.println();
        System.out.println("Propietario: " + c.nombre_propietario);
        System.out.println("Caballos: " + q.caballos);
        System.out.println("Kilometraje: " + z.kilometraje);
        System.out.println("Matrícula: " + c.matricula);
        System.out.println("Marca: " + c.marca);
        System.out.println("___________________________________________");

        System.out.println();
        c.arranque();
        c.llenargasolina();
        c.aceitecambiado();

    }
}
