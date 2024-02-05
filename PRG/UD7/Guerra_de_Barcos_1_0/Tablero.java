package Guerra_de_Barcos_1_0;

public class Tablero {
    
    char[][] tablero = new char[10][10];

    public Tablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '■';
            }
        }
    }

    public void mostrar_tablero() {
        System.out.print("  1 2 3 4 5 6 7 8 9 10");
        char letra ='A';
        for (char[] tb : tablero) {
            System.out.println();
            System.out.print(letra);
            letra++;
            for (char t : tb) {
                System.out.print(" ");
                System.out.print(t);
            }
        }
    }


}
