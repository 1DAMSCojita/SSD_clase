package intro.teoria;

import intro.teoria_dos.ExcepcionDivisionPorCero;

public class Division {
    
    double x;
    double y;

    Division(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void division() throws ArithmeticException {
        try {
            if (y == 0) {
                throw new ExcepcionDivisionPorCero();
            }
            double resultado = x / y;
            System.out.println(resultado);
        }
        catch (ExcepcionDivisionPorCero e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Error génerico." + e.getMessage());
        }
        finally {
            System.out.println("Estoy en el finally.");
        }
        System.out.println("Final del método.");
    }
    
    public void division_2() {
        try {
            division();
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado." + e.getMessage());
        }
    }

}