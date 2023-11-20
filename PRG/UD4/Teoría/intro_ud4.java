
// import java.util.Scanner;

// import java.util.Arrays;

public class intro_ud4 {
    public static void main(String[] args) {
     
            // ESTRUCTURES DE SELECCIÓ
            // if, if-else
            // switch

            // Condicional simple: if
                
            /* 
            * if (condicio) {
            * 
            *      bloc d'instruccions
            *      ...
            * 
            * }
            */

            // int a = 1;
            // int b = 2;

            // if (a < b) {
            //     System.out.println("a es menor que b.");
            // } else if (a > b) {
            //     System.out.println("a es mayor que b.");
            // } else {
            //     System.out.println("a y b son iguales.");
            // }
            
            // SWITCH
            // Solo se puede usar con vaiables de número entero, String o tipos que puedan convertirse a números enteros como char.
            // char bababooey = 'a';

            // switch (bababooey) {
            //     case 'a':
            //         System.out.println("Hola.");
            //         break;
            //     case 'b':
            //         System.out.println("Cara");
            //         break;
            //     case 'c':
            //         System.out.println("De");
            //         break;
            //     case 'd':
            //         System.out.println("Bola");
            //         default:
            //            System.out.println("Sin coincidencia");
            // }

            // o

            // int a = 8;

            //     switch (a) {
            //         case 10, 9, 8 -> {
            //             System.out.println("Hola");
            //         }
            //         case 1 -> {
            //             System.out.println("Cara");
            //         }
            //         case 2 -> {
            //             System.out.println("De");
            //         }
            //         case 3 -> {
            //             System.out.println("Bola");
            //         }
            //         default ->
            //             System.out.println("Adiós."); 
            //     }
            
            // int mes = -1;
            // String info = "";

            // Scanner sc = new Scanner(System.in);

            // System.out.println("Escribe un mes (1 al 12) por favor: ");
            // mes = sc.nextInt();

            // info = switch(mes) {
            //     case 1, 3, 5, 7, 8, 10, 12 -> {
            //         yield "Este mes tiene 31 días.";
            //     }
            //     case 4, 6, 9, 11 -> {
            //         yield "Este mes tiene 30 días.";
            //     }
            //     case 2 -> {
            //         yield "Este mes tiene 28 días (o los que sea lol)";
            //     }
            //     default -> { 
            //         yield "El valor introducido no corresponde con ningún mes";
            //     }
            // };
            // System.out.println(info);

            // ESTRUCTURAS DE REPETICIÓN

            // BUCLES CONTROLADOS POR CONDICIÓN: WHILE / DO-WHILE

            // WHILE
            // Repite un bloque de código mientras la condición sea verdadera.
            // La condición se verifica ANTES de ejecutar el bloque de código.
        
            // int numero = 1;

            // while (numero <= 5) {
            //      System.out.println("Iteración WHILE: " + numero);
            //      numero++;
            // }

            // DO-WHILE
            // La condición se verifica después de ejecutar el bloque de código.
            // Se garantiza que el bloque se ejecute al menos una vez, incluso
            // si la condición es inicialmente false.

            // int iteracion = 6;

            // do {
            //     System.out.println("Iteración DO WHILE: " + iteracion);
            //     iteracion++;
            // } while (iteracion <= 5);

            // BUCLES CONTROLADOS POR CONTADOR: FOR
            // for (int i = 1; i <= 5; i++) {
            //     System.out.println("Iteración FOR " + i);
            // }

            // SALIDAS ANTICIPADA: break y continue

            // break
            // for (int i = 1; i <= 5; i++) {

            //     if (i == 3) {
            //         continue;    
            //     }
            //     System.out.println("Iteración " + i);
            // }

            // BUCLES ANIDADOS
            // for (int i = 0; i <= 10; i++) {
            //     System.out.println();
            //     System.out.println("Tabla del " + i);
            //     for (int j = 0; j <= 10; j++) {
            //         int resultado = i * j;
            //         System.out.println();
            //         System.out.println( i + " x " + j + " = " + resultado);
            //     }
            // }

            // ARRAYS
            // Elementos homogéneos, todos del mismo tipo.
            // Índice. Todos los elementos de un array se identifican con un índice. Empiezan a contar
            // elementos por el 0.

            // DECLARACIÓN ARRAYS

            // tipoDeDato [ ] nombreDelArray

            // INCIALIZACIÓN DIRECTA

            // int[] numeros = {5, 10, -1, 6};

            // INICIALIZACIÓN INDIRECTA

            // int[] numeros_2 = new int[5];
            // numeros_2[0] = 3;
            // numeros_2[1] = 0;
            // numeros_2[2] = -5;
            // numeros_2[3] = 23;
            // numeros_2[4] = 13;

            // int primerNumero = numeros[0];
            // int otroNumero = numeros_2[3];

            // int longitudNumeros = numeros.length;
            // int longitudNumeros_2 = numeros_2.length;

            // RECORRIENDO ARRAYS

            // BUCLE FOR

            // int[] numeros = {5, 10, -1, 6};

            // for (int i = 0; i < numeros.length; i++) {
            //     System.out.println("El elemento de índice " + i + " es: " + numeros[i]); 
            // }

            // BUCLE FOR EACH
            // for (int numero : numeros) {
            //     System.out.println(numero);
            // }
            
            // String[] ciudades = {"Madrid", "Barcelona", "Valencia", "Es Castell"};

            // for (String ciudad : ciudades) {
            //     System.out.println("Ciudad: " + ciudad);
            // }

            // MÉTODOS

            // clone()
            // int[] numeros = {1, 2, 3, 4, 5};
            // int[] copia = numeros.clone();

            // System.out.println(numeros[0]);
            // numeros[0] = 10;
            // System.out.println(numeros[0]);
            // System.out.println(copia[0]);

            // System.out.println(numeros);
            // System.out.println(copia);

            // equals(Object o)
            // int[] numeros = {1, 2, 3};
            // int[] otros_numeros = {1, 2, 3};

            // System.out.println(numeros);
            // System.out.println(otros_numeros);

            // boolean son_iguales = Arrays.equals(numeros, otros_numeros);
            
            // System.out.println(son_iguales);

            // toString()
            // int[] numeros = {1, 2, 3, 4};
            // String array_como_cadena = Arrays.toString(numeros);
            
            // System.out.println(array_como_cadena);

            // sort()
            // int[] numeros = {5, 1, 4, 3, 2};
            // System.out.println(Arrays.toString(numeros));
            // Arrays.sort(numeros);
            // System.out.println(Arrays.toString(numeros));

            // binarySearch()
            // int[] numeros = {1, 2, 3, 4, 5};
            // String[] cadenas = {"una", "dos", "tres", "cuatro", "cinco"};
            // int indice = Arrays.binarySearch(cadenas, cadenas[1]);
            // System.out.println(indice);

            // fill()
            // int[] numeros = new int [5];
            // Arrays.fill(numeros, -30);

            // for (int numero : numeros) {
            //     System.out.println(numero);
            // }

            // copyOf()
            // int[] numeros = {1, 2, 3, 4, 5};
            // int[] copia = Arrays.copyOf(numeros, 3);
            
            // for (int numero : copia) {
            //     System.out.println(numero);
            // }    

            // copyOfRange()
            // int[] numeros = {89, -2, 3, 4, 5};
            // int[] copia = Arrays.copyOfRange(numeros, 1, 4);
            
            // for (int numero : copia) {
            //     System.out.println(numero);
            // }
        }
    }
