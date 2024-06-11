package ej;

import javax.swing.*;

public class Funciones {
    static JFrame crearFormulario(String caption, int ancho, int largo){
        JFrame formulario = new JFrame(caption);
        formulario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        formulario.setSize(ancho, largo);
        return formulario;
    }
}