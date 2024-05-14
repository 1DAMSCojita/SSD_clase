package Referencia_metodos;

public class Test {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
    
        // Creamos dos arrays con palabras.
        String[] palabras = {"Hola", "Caracola"};
        String[] palabras2 = {"Adiós","Carabola"};

        String[] cadenas = new String[palabras.length]; // Creamos un array de Strings y le asignamos la longitud del primer array de palabras.
    
        Funcion funcion = (a, b) -> a.toString() + " " + b.toString(); // Creamos una función y usamos lambda para diseñar el resultado.

        operarArrays(palabras, palabras2, cadenas, funcion); // Usamos el método 'operarArrays' y le pasamos por parámetro los arrays de palabras, la cadena y la función.
        
        // Creamos un bucle 'for-each'.
        // Recorerá el array de cadenas y mostrará las palabras por consola.
        for (String s : cadenas) {
            System.out.println(s);
        }

    }

    static <T, V, U> U[] operarArrays(T[] op1, V[] op2, U[] resultat, Funcion<T, V, U> f) {
        
        // Creamos una estructura 'try-catch'.
        // Intentará ejecutar el próximo bucle de asignación, en caso de un error inesperado capturara la excepción
        // y la mostrará por consola.
        try {
            // Creamos un bucle 'for'.
            // Aplicará la función a los elementos correspondientes y guardará el resultado.
            for (int i = 0; i < op1.length; i++) {
                resultat[i] = f.operar(op1[i], op2[i]); // Aplicamos la función f iterando sobre cada array, y lo guardamos en el array de resultat.
            }
        } catch (IndexOutOfBoundsException e) {
            // Si la longitud del primer array es superior a la del segundo, saltará la excepción de 'IndexOutOfBounds', detiendo el programa, para ello
            // la capturamos y avisamos al usuario que ponga una longitud acorde (ya que no supe como solucionar el error).
            System.out.println("Error. La longitud del primer array de palabras no puede ser superior al del segundo array.");
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }
        return resultat; // Devolvemos el array con los resultados pertinentes.
    }

}
