package ej2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Alumno {

    static JTextField txtNumero;

    static JLabel lblResBin;
    static JLabel lblResOct;
    static JLabel lblResHex;

    static JCheckBox checkBoxBin;
    static JCheckBox checkBoxOct;
    static JCheckBox checkBoxHex;

    public static void crearFormularioAlumno(){
        JPanel pnlPrincipal = new JPanel();
        String caption = "Gestion de alumnos";
        int ancho= 400;
        int largo = 300;

        JFrame frmPrincipal = Funciones.crearFormulario(caption, ancho, largo);
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        JLabel lblTitulo = new JLabel("CAMBIO DE BASE");

        JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlTitulo.add(lblTitulo);

        // Nombre
        // Box
        Box boxNombre = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblNombre = new JLabel("Valor decimal");
        // Texto
        txtNumero = new JTextField("0", 20);
        // Separador fijo

        JButton btnCalc = new JButton("Calcular");
        btnCalc.addActionListener(new btnClacularActionLisener());
        boxNombre.add(Box.createHorizontalStrut(5));
        // Añadimos los elementoss
        boxNombre.add(lblNombre);
        boxNombre.add(Box.createHorizontalStrut(5));
        boxNombre.add(txtNumero);
        boxNombre.add(Box.createHorizontalStrut(5));
        boxNombre.add(btnCalc);
        
        // Panel
        JPanel pnlNombre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlNombre.add(boxNombre);

        // Nivel
        // Box
        Box boxCheck = Box.createHorizontalBox();

        // Opciones
        checkBoxBin = new JCheckBox("Binario", false);
        checkBoxOct = new JCheckBox("Octal", false);
        checkBoxHex = new JCheckBox("Hexadecimal", false);

        // Añadimos los elementos
        
        boxCheck.add(checkBoxBin);
        boxCheck.add(Box.createHorizontalStrut(5));
        boxCheck.add(checkBoxOct);
        boxCheck.add(Box.createHorizontalStrut(5));
        boxCheck.add(checkBoxHex);
        // Panel
        JPanel pnlNivel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlNivel.add(boxCheck);

        Box boxVertical = Box.createVerticalBox();
        Box boxVertical2 = Box.createVerticalBox();
        Box boxHorizontal = Box.createHorizontalBox();


        JLabel lblResultado = new JLabel("Resultado");
        JLabel lblBinario = new JLabel("Binario:");
        JLabel lblOctal = new JLabel("Octal:");
        JLabel lblHexadecimal = new JLabel("Hexadecimal:");
        
        lblResBin = new JLabel("0 ");
        lblResOct = new JLabel("0 ");
        lblResHex = new JLabel("0 ");


        boxVertical.add(lblBinario);
        boxVertical.add(lblOctal);
        boxVertical.add(lblHexadecimal);

        boxVertical2.add(lblResBin);
        boxVertical2.add(lblResOct);
        boxVertical2.add(lblResHex);

        boxHorizontal.add(Box.createHorizontalStrut(22));
        boxHorizontal.add(lblResultado);
        boxHorizontal.add(Box.createHorizontalStrut(22));
        boxHorizontal.add(boxVertical);
        boxHorizontal.add(Box.createHorizontalStrut(30));
        boxHorizontal.add(boxVertical2);

        JPanel pnlLbl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlLbl.add(boxHorizontal);




        // Box principal
        // Añadimos los paneles y separadores pertienentes
        Box boxPrincipal = Box.createVerticalBox();
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlTitulo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlNombre);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlNivel);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlLbl);

        pnlPrincipal.add(boxPrincipal);
        // Añadimos todos los paneles


        frmPrincipal.setVisible(true);
    }
    private static class btnClacularActionLisener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            int sum = Integer.parseInt(txtNumero.getText());
            if (checkBoxBin.isSelected()== true) {
                lblResBin.setText(Integer.toBinaryString(sum));
            }
            if (checkBoxOct.isSelected()== true) {
                lblResOct.setText(Integer.toOctalString(sum));
            }
            if (checkBoxHex.isSelected()== true) {
                lblResHex.setText(Integer.toHexString(sum));
            }
        }
        
    }
}
