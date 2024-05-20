package StarWarsCompleto;

public class Test {

    /* 
     * 4 clases y una interfaz. Más allá de más clases.
     * ----------
     * IFuerza
     * int getNivelMidclorianos();
     * void setNivelMidiclorianos
     * 
     * default int estableceNivelMidiclorianos() {
     *  }
     * 
     *  String getColorSable()
     *  void setColorSable();
     * 
     * static String estableceColorSable(List<String> listaColores) {
     *  // Devuelve null si la lista esta vacía, un color al azar si no está.
     *  // Collections.shuffle(listaColores)
     * }
     * 
     * String getNombre();
     * void setNombre(boolean es JarJarBinks);
     * String generaNombre();
     * 
     * static int estableceFuerzaMental() {
     *  // Devolverá un número aleatorio entre 1 y 10.
     * }
     * 
     * private static int aleatorio entero(int limite, int inicio) {
     * }
     * -----------
     * // MisticoDeLaFuerza
     * 
     * 4 atributos, todos finales, encapsulada.
     * - nombre, apellido, ciudad_natal, nombreMadre
     * Constructor que recoje estos datos.
     * Métodos getNombre() -> pilla el nombre por parámetro y devuelve los dos primeros carácteres.
     * Método getApellido() -> devuelve los tres primeros carácteres del apellido.
     * Método getCiudadNatal() -> devuelve los tres primeros carácteres de la ciudad natal.
     * Método getNombreMadre() -> devuelve los dos primeros carácteres de nombreMadre.
     * ---------
     * // Jedi
     * Hereda de la clase MisticoDeLaFuerza e implementa las interfícies IFuerza y Comparable
     * Clase encapsulada, atributos: 
     * - int nivelMidiclorianos
     * - String colorSable
     * - String nombre
     * - int fuerzaMental
     * Constructor que además de incluir los atributos, también pedir los atributos de la clase padre.
     * También pide el color del sable y la fuerzaMental.
     * Se va a llamar al método setNivelMidiclorianos(), setColorSable(), setNombre(false) y también llamar a setFuerzaMental()
     * Segundo constructor donde los cuatro parámetros de la clase padre estarán vacíos, llamar a setNivelMidiclorianos(), setColorSable(), setNombre(true)
     * y por último setFuerzaMental(1)
     * 
     * @Override:
     * setNivelMidiclorianos()
     * setNivelMidicloriano que llama a estableceNivelMidiclorianos()
     * setColorSable() -> establece el color del sable
     * getNombre()
     * setNombre() si el booleano es true, devuelve JarJar Binks, si no, devuelve una cadena que es: getApellido espacio getNombreMadre concatenado con
     * getCiudadNatal.
     * getFuerzaMental()
     * setFuerzaMental()
     * 
     * toString() -> devuelve información de la clase.
     * 
     * Para acabar un método que nos dé un orden natural a nivel de nombre.
     * ----
     * 
     * // Sidth
     * Extiende de MisticoFuerza e implementa IFuerza y Comparable. Clase encapsulada.
     * Atributos -> 
     * - nivelMidicloriano
     * - colorSable
     * - nombre
     * - nombreJedi 
     * 
     * Primer constructor recibe nombreMadre, ciudad_natal y colorSable.
     * Dentro del método se llama al setNivelMidiclorianos(),setColorSable(), setNombre(false).
     * 
     * Constructor por defecto que tiene los primeros parámetros de la clase padre, setNombre(true)
     * 
     * Getters y Setters:
     * getNivelMidiclorianos()
     * setNivelMidiclorianos()
     * getColorSable()
     * setColorSable()
     * getNombre()
     * setNombre() si es true asigna a this.nombre Darth Binks, si es false devuelve Darth + " " + getNombreMadre + getCiudadNatal
     * setNombreJedi(String nombreJedi)
     * 
     * toString() -> devuelve el nombre, el color del sable, el nivel de midicloriano y si nombreJedi no es null devuelve el antiguo nombre de Jedi.
     * También tiene un método para ordenar naturalmente con el nombre.
     * ----
     * Test
     * 
     * Menú:
     * 
     * 14 puntos.
     * 
     * 1- Dar de alta a un Jedi (llama un método y pasa un conjunto y puede haber Jedis y Sidths)
     * 2- Dar de alta a un Sidth.
     * 3- Mostrar un listado de todo el conjunto Sidth y Jedis.
     * 4- Mostrar sólo los Jedi (se pasa a la función dos parámetros, el conjunto y predicado que provoca ver si son o no son Jedis)
     * 5- Mostrar sólo los Sidth (igual que antes pero el predicado especifica si son Sidths)
     * 6- Recuento total del conjunto (usar Streams)
     * 7- Recuento solo de Jedis (pasar colección y predicado).
     * 8- Recuento de Sidth (se la pasa conjunto y mismo predicado).
     * 9- Recuento de todos los que tengan un nivel de midicloriano superior a 25000 (solo conjunto).
     * 10- Listado de Jedis ordenados por fuerza mental (set y predicado)
     * 11- Listado de Sidth ordenado por nivel de midicloriano.
     * 12- Transformar en Sidth a todos los Jedis que tengan una fuerza mental inferior a 6. 
     * 0- salir
     * 
     * 
    */


}
