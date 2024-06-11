package ej;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.text.Position;

public class Alumno {
    static JTextField txtDNI, txtNombre, txtEdad;
    static JRadioButton rdbNivelB, rdbNivelM, rdbNivelS;
    static JTextArea txtArea;

    public static void crearFormularioAlumno(){
        JPanel pnlPrincipal = new JPanel();
        String caption = "Gestion de alumnos";
        int ancho= 400;
        int largo = 500;

        JFrame frmPrincipal = Funciones.crearFormulario(caption, ancho, largo);
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        // Creamos el menu

        JMenuBar mnbMenu = creaMenu();
        frmPrincipal.setJMenuBar(mnbMenu);
        

        JLabel lblTitulo = new JLabel("Alumno");
        lblTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        pnlTitulo.add(lblTitulo);

        // DNI
        // Box.
        Box boxDNI = Box.createHorizontalBox();
        // Etiqueta.
        JLabel lblDni = new JLabel("DNI");
        // Texto.
        txtDNI = new JTextField(6);
        // Separacion fijo.
        boxDNI.add(Box.createHorizontalStrut(5));
        // Añadimos los elementos
        boxDNI.add(lblDni);
        boxDNI.add(Box.createHorizontalStrut(29));
        boxDNI.add(txtDNI);
        // Panel.
        JPanel pnlDNI = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlDNI.add(boxDNI);

        // Nombre
        // Box
        Box boxNombre = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblNombre = new JLabel("Nombre");
        // Texto
        txtNombre = new JTextField(20);
        // Separador fijo
        boxNombre.add(Box.createHorizontalStrut(5));
        // Añadimos los elementoss
        boxNombre.add(lblNombre);
        boxNombre.add(Box.createHorizontalStrut(5));
        boxNombre.add(txtNombre);
        // Panel
        JPanel pnlNombre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlNombre.add(boxNombre);

        // Edad
        // Box
        Box boxEdad = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblEdad = new JLabel("Edad");
        // Texto
        txtEdad = new JTextField(2);
        // Separador fijo
        boxEdad.add(Box.createHorizontalStrut(5));
        // Añadimos los elementoss
        boxEdad.add(lblEdad);
        boxEdad.add(Box.createHorizontalStrut(22));
        boxEdad.add(txtEdad);
        // Panel
        JPanel pnlEdad = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlEdad.add(boxEdad);

        // Nivel
        // Box
        Box boxNivel = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblNivel = new JLabel("Nivel");
        // Opciones
        rdbNivelB = new JRadioButton("B", false);
        rdbNivelM = new JRadioButton("M", false);
        rdbNivelS = new JRadioButton("S", true);
        // Agruparlos
        ButtonGroup btgNivel = new ButtonGroup();
        btgNivel.add(rdbNivelB);
        btgNivel.add(rdbNivelM);
        btgNivel.add(rdbNivelS);
        // Añadimos los elementos
        boxNivel.add(Box.createHorizontalStrut(5));
        boxNivel.add(lblNivel);
        boxNivel.add(Box.createHorizontalStrut(22));
        boxNivel.add(rdbNivelB);
        boxNivel.add(Box.createHorizontalStrut(5));
        boxNivel.add(rdbNivelM);
        boxNivel.add(Box.createHorizontalStrut(5));
        boxNivel.add(rdbNivelS);
        // Panel
        JPanel pnlNivel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlNivel.add(boxNivel);

        // Botones
        // Box

        Box boxBotones = Box.createHorizontalBox();
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new btnAcceparActionLisener());
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new btnCancelActionLisener());
        // Añadimos los elementos.
        boxBotones.add(Box.createHorizontalStrut(5));
        boxBotones.add(btnAceptar);
        boxBotones.add(Box.createHorizontalStrut(5));
        boxBotones.add(btnCancelar);
        boxBotones.add(Box.createHorizontalStrut(5));
        // Panel 
        JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnlBotones.add(boxBotones);
        
        // Text Area
        Box boxTxtArea = Box.createHorizontalBox();
        txtArea = new JTextArea(10, 30);
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            txtArea.read(reader, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        JScrollPane scrollPane = new JScrollPane(txtArea);
        boxTxtArea.add(scrollPane);
        JPanel pnlText = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlText.add(boxTxtArea);

        // Box principal
        Box boxPrincipal = Box.createVerticalBox();
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlTitulo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlNombre);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlDNI);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlEdad);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlNivel);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlBotones);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlText);

        pnlPrincipal.add(boxPrincipal);

        pnlPrincipal.add(boxPrincipal);
        // Añadimos todos los paneles


        frmPrincipal.setVisible(true);
    }
    private static class btnAcceparActionLisener implements ActionListener{
        @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Nombre: " + txtNombre.getText() + "\n" +
                              "DNI: " + txtDNI.getText() + "\n" +
                              "Edad: " + txtEdad.getText() + "\n" +
                              "Nivel: " + (rdbNivelB.isSelected() ? "B" : rdbNivelM.isSelected() ? "M" : "S") + "\n";

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", true))) {
                    writer.write(data);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
                    txtArea.read(reader, null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
        private static class btnCancelActionLisener implements ActionListener{
            @Override
                public void actionPerformed(ActionEvent e) {
                    txtNombre.setText("");
                    txtDNI.setText("");
                    txtEdad.setText("");
            }
        }
    private static JMenuBar creaMenu(){
        // Creamos el menu
        // 1 items
        // - Items para ficheros.

        JMenuItem mniLeerFichero = new JMenuItem("Leer ficheros");
        JMenuItem mniBorrarFichero = new JMenuItem("Borrar ficheros");
        
        // 2 Barra del menu
        JMenuBar mnbMenu = new JMenuBar();
        // 3 Menus
        // - Menu para Ficheros.
        JMenu mnuFicheros = new JMenu("Ficheros");
        // 4 Añadir items a su menu correspondiente
        mnuFicheros.add(mniLeerFichero);
        mnuFicheros.addSeparator();
        mnuFicheros.add(mniBorrarFichero);
        // 5 Añadir los menus a la barra
        mnbMenu.add(mnuFicheros);

        return mnbMenu;
    }
}
