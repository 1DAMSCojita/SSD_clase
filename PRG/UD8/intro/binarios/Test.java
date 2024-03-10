package Intro.binarios;

import java.io.*;

@SuppressWarnings("unused")
public class Test {
    public static void main(String[] args) {

        String fichero = "cancionPirata.dat";
        String ficheroNumeros = "datos.dat";
        String cancion = "";
        
        String estrofa = "Con diez cañones por banda, \n";
        estrofa += "viento en popa a toda vela, \n";
        estrofa += "no corta el mar, sino vuela, \n";
        estrofa += "un velero bergantín. \n";
        estrofa += "Espronceda. ";

        /*
        String fichero_2 = "dOu.dat";
        
        String estrofa_2 = "¿Te gusta XAL? \n";
        estrofa_2 += "T'agrada XAL? \n";
        estrofa_2 += "Ayuda \n";
        estrofa_2 += "No sé que poner \n";
        */

        GestionFicherosBinarios.escribeFicheroStringToObject(estrofa, fichero);

        cancion = GestionFicherosBinarios.leerFicheroObjectToString(ficheroNumeros);

        System.out.println(cancion);
    }
}
