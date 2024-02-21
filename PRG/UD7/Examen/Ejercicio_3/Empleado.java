package Ejercicio_3;

public interface Empleado extends Cliente {
    
    String getDNI();
    String getNombre();
    int getHoras();
    void setHoras(int horasTrabajadas);
    void incrementarHoras(int incremento);

}
