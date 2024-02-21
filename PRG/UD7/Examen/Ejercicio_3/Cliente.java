package Ejercicio_3;

public interface Cliente {
    
    String getDNI();
    String getNombre();

    // Creamos un método que incrementará el número de horas trabajadas en el mes.
    double getSaldo();

    // Creamos un método que incrementará su saldo.
    void setSaldo(double saldo);

    void incrementarSaldo(double increment);

}
