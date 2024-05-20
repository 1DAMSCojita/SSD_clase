package funcionesAuxiliares;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GestionEntrar {

    @SuppressWarnings("resource")
    public static int entrarValorEntero() {
            
            int valor = -1;
            boolean error = true;

            while (error) {
                try {
                    valor = new Scanner(System.in).nextInt();
                    error = false;
                } catch (InputMismatchException e) {
                    System.out.println("Introduzca un valor numérico entero válido.");
                } catch (Exception e) {
                    System.out.println("Se ha producido un error al entrar el valor numérico de tipo entero. Prueba de nuevo");
                }
            }

            return valor;
    }

    @SuppressWarnings("resource")
    public static String entrarCadena() {
        String valor = "";
        boolean error = true;

        while (error) {
            try {
                valor = new Scanner(System.in).nextLine();
                error = !(valor.trim().length() > 0);
            } catch (NoSuchElementException e) {
                System.out.println("Introduzca un valor válido.");
            } catch (Exception e) {
                System.out.println("Se ha producido un error al entrar el valor de la cadena.");
            }
        }

        return valor.trim();
    }



}
