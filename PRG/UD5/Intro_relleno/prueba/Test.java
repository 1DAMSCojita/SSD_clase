package prueba;

public class Test {
    public static void main(String[] args) {

        Persona p = new Persona("Palstacii", 18, 1.65);
        
        /* 
        p.nombre = "Palstacii";
        p.altura = 1.63;
        p.edad = 18;

        p.nombre = "Gungo";
        p.altura = 1.64;
        p.edad = 19;
        */ 

        System.out.println("Eres un poco " + p.nombre);
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Altura: " + p.altura);
        System.out.println("Edad: " + p.edad);

        /*
        System.out.println("Nombre: " + q.nombre);
        System.out.println("Altura: " + q.altura);
        System.out.println("Edad: " + q.edad);
        */
        p.saludar();
        p.caminar();
        p.cumpleanos();

        System.out.println("Has cumplido un " + p.edad + " año más.");

        /*
        q.saludar();
        q.caminar();
        System.out.println(q.edad);
        */
    }



}
