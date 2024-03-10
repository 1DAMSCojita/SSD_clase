package Intro.ejercicio_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

@SuppressWarnings("unused")
public class Test {
    public static void main(String[] args) {
        
        String texto = "";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("src\\intro\\ejercicio_2\\numeros.txt");
            br = new BufferedReader(fr);
            texto = br.readLine();
            
            String nums[] = texto.split(" ");
            double suma = 0.0;
            
            for (String num : nums) {
                double valores = Double.parseDouble(num);
                suma += valores;
            }

            double media = suma / nums.length;
            System.out.println(suma);
            System.out.println(media);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo o ocurrió un error inesperado." + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error." + e.getMessage());
        }
        


    }
}
