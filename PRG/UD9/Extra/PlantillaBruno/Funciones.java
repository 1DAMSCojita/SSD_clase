package Extra.PlantillaBruno;

import java.util.*;
import java.io.*;
public class Funciones {
    
    public static List<Persona> leerArchivoBinario(){
        List<Persona> personas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("archivo.dat"))) {
            while (true) {
                Persona persona = (Persona) ois.readObject();
                personas.add(persona);
            }
        } catch (EOFException e) {
        
        }catch (IOException | ClassNotFoundException e) {
           System.out.println("Error: " + e.getMessage());
           
        }
        return personas;
    }
    public static void escribirArchivoBinario(List<Persona> personas){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("archivo.dat"))) {
            for (Persona persona : personas) {
                oos.writeObject(persona);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Persona> leerArchivoTexto(String archivo){
        List<Persona> doulist = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = br.readLine())!= null) {
                String[] cont = linea.split(" ");
                doulist.add(new Persona(cont[0], Integer.parseInt(cont[1])));
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return doulist;
    }
    public static void escribirArchivoTexto(String archivo, List<Persona> personas){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))){
            for (Persona persona : personas) {
                String personaTexto = persona.nombre + " " + persona.edad;
                bw.write(personaTexto);
                bw.newLine();  // Esto añade una nueva línea después de cada persona
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
