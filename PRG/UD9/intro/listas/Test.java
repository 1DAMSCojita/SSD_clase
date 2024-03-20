package intro.listas;

import java.util.*;

public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // List
        // Es una colección que almacena los elementos junto con un identificador.

        // ArrayList, LinkedList, Vector
        // Podemos tener métodos duplicados.

        ArrayList<String> lista1 = new ArrayList<>();
        Vector<String> lista2 = new Vector<>();
        LinkedList<String> lista3 = new LinkedList<>();

        List<String> lista4 = new ArrayList<>();
        List<String> lista5 = new ArrayList<>();

        // Métodos Básicos de List
        // add(Object o) lista4.add("hola");
        // add(int pos, Object o) lista4.add(5, "hola");
        // get(int pos)

        lista1.add("Paquete");
        lista1.add("Manolete");

        lista4.add("hola");
        lista4.add("caracola");
        lista4.add("no");
        lista4.add("sé");

        /*
            for (int i = 0; i < lista4.size(); i++) {
                String elemento = lista4.get(i);
                System.out.println(elemento);
            }
        */

        Test objTest = new Test();

        // lista4.addAll(lista4);

        // System.out.println(lista4.lastIndexOf("caracola"));

        // objTest.mostrarElementosLista(lista4);

        // String elementoEliminado = "";
        // elementoEliminado = lista4.remove(2);

        // objTest.mostrarElementosLista(lista4);
        // System.out.println("Elemento eliminado: " + elementoEliminado);
         
        // String elemento = "caracola";
        // int i = lista4.indexOf(elemento.toLowerCase());
        // System.out.println("Posición del elemento " + elemento + ": " + i);
    
        
        // String elemento = lista4.set(3, "culo");
        // System.out.println("Elemento: " + elemento);

        // System.out.println(lista4.size());
        // lista4.clear();
        // System.out.println(lista4.size());

        // objTest.mostrarElementosLista(lista4);

        // lista5 = lista4.subList(1, 5);

        // ArrayList<String> s = new ArrayList<>();
        // s.add("Terror y diversión");
        // String[] a = new String[s.size()];
        // a = s.toArray(a);
        // System.out.println(a.length);

        // ArrayList
        // ArrayList<Integer> al1 = new ArrayList<>();
        // ArrayList<Integer> al2 = new ArrayList<>();
        
        // al1.add(23);
        // al1.add(-12);
        // al1.add(0);
        // al1.add(6);

        // objTest.mostrarElementosLista(al1);
        // al2 = (ArrayList<Integer>) al1.clone();
        // objTest.mostrarElementosLista(al2);

        // removeRange

        // Vector
        // Vector<Integer> v1 = new Vector<>();
        // v1.add(23);
        // v1.add(-12);
        // v1.add(0);
        // v1.add(6);
        // v1.ensureCapacity(8);
        // System.out.println(v1.size());
        // Integer[] arrayInt = new Integer[v1.size()];
        // v1.copyInto(arrayInt);
        // System.out.println(Arrays.deepToString(arrayInt));

        // LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        // addFirst
        ll.addFirst(3);
        // addLast
        ll.addLast(2);
        // getFirst
        // getLast

        // peek
        // poll
        // removeFirst
        // removeLast
        
        objTest.mostrarElementosLista(ll);
    }

    <T> void mostrarElementosLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

}
