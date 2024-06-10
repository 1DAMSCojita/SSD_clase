package intro.alumno;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import intro.layoutFlowLayOut.Funciones;

public class Alumno {

    static JTextField txtDni, txtNombre, txtEdad;
    static JTextArea txtArea;
    static JRadioButton rbtNivelB, rbtNivelM, rbtNivelS;

    public static void creaFormularioAlumno() {

        JPanel pnlPrincipal = new JPanel();
        String caption = "Formulario Alumno";
        int ancho = 400;
        int alto = 500;
        JFrame frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        // Creamos el menú.
        JMenuBar mnbMenu = creaMenu();
        frmPrincipal.setJMenuBar(mnbMenu);

        JLabel lblAlumno = new JLabel("Alumno");
        lblAlumno.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        // Panel para el título.
        JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlTitulo.add(lblAlumno);

        // DNI
        // Box.
        Box boxDni = Box.createHorizontalBox();
        // Etiqueta.
        JLabel lblDni = new JLabel("DNI:");
        // Texto.
        txtDni = new JTextField(6);
        // Separador fijo.
        boxDni.add(Box.createHorizontalStrut(5));
        // Añadimos los elementos.
        boxDni.add(lblDni);
        boxDni.add(Box.createHorizontalStrut(28));
        boxDni.add(txtDni);
        // Panel
        JPanel pnlDni = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlDni.add(boxDni);

        // Nombre
        // Box
        Box boxNombre = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblNombre = new JLabel("Nombre:");
        // Texto
        txtNombre = new JTextField(6);
        // Separador fijo.
        boxNombre.add(Box.createHorizontalStrut(5));
        // Añadimos los elementos.
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
        JLabel lblEdad = new JLabel("Edad:");
        // Texto
        txtEdad = new JTextField(2);
        // Separador fijo.
        boxEdad.add(Box.createHorizontalStrut(5));
        // Añadimos los elementos.
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
        JLabel lblNivel = new JLabel("Nivel:");
        rbtNivelB = new JRadioButton("B", false);
        rbtNivelM = new JRadioButton("M", false);
        rbtNivelS = new JRadioButton("S", true);
        // Agrupamos las opciones.
        ButtonGroup btgNivel = new ButtonGroup();
        btgNivel.add(rbtNivelB);
        btgNivel.add(rbtNivelM);
        btgNivel.add(rbtNivelS);
        // Añadimos los elementos.
        boxNivel.add(Box.createHorizontalStrut(5));
        boxNivel.add(lblNivel);
        boxNivel.add(Box.createHorizontalStrut(22));
        boxNivel.add(rbtNivelB);
        boxNivel.add(Box.createHorizontalStrut(5));
        boxNivel.add(rbtNivelM);
        boxNivel.add(Box.createHorizontalStrut(5));
        boxNivel.add(rbtNivelS);
        // Panel
        JPanel pnlNivel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlNivel.add(boxNivel);

        // Botones 
        // Box
        Box boxBotones = Box.createHorizontalBox();
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new btnAceptarActionListener());
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new btnCancelarActionListener());
        // Añadimos los elementos.
        boxNivel.add(Box.createHorizontalStrut(5)); // Separador fijo.
        boxBotones.add(btnAceptar);
        boxNivel.add(Box.createHorizontalStrut(5)); // Separador fijo.
        boxBotones.add(btnCancelar);
        // Panel
        JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnlBotones.add(boxBotones);

        // Text Area
        Box boxArea = Box.createHorizontalBox();
        txtArea = new JTextArea(10, 30);
        try (BufferedReader br = new BufferedReader(new FileReader("src\\intro\\alumno\\alumno.txt"))) {
            txtArea.read(br, null);
        } catch (Exception e) {
            System.out.println("Se ha producido un error al leer el fichero: " + e.getMessage());
        }
        JScrollPane scrollPane = new JScrollPane(txtArea);
        boxArea.add(scrollPane);
        JPanel pnlArea = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlArea.add(boxArea);

        // Box principal y separadores pertinentes.
        // Añadimos los paneles 
        Box boxPrincipal = Box.createVerticalBox();
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlTitulo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlDni);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlNombre);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlEdad);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlNivel);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlBotones);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlArea);

        pnlPrincipal.add(boxPrincipal);

        frmPrincipal.setVisible(true);
    }

    private static JMenuBar creaMenu() {
        // Creamos el menú:
        // 1r Items
        // - Items para ficheros
        JMenuItem mniLeerFichero = new JMenuItem("Leer Fichero");
        JMenuItem mniBorrarFichero = new JMenuItem("Borrar Fichero");
        // 2nda Barra del menú
        JMenuBar mnbMenu = new JMenuBar();
        // 3r Menús
        // - Menú para Ficheros.
        JMenu mnuFicheros = new JMenu("Ficheros");
        // 4r Añadir los items a su menú correspondiente.
        mnuFicheros.add(mniLeerFichero);
        mnuFicheros.addSeparator();
        mnuFicheros.add(mniBorrarFichero);
        // 5nto Añadir los menús a la barra.
        mnbMenu.add(mnuFicheros);
        
        return mnbMenu;
    }

    private static class btnAceptarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String datos = "DNI: " + txtDni.getText() + "\n" +
                           "Nombre: " + txtNombre.getText() + "\n" +
                           "Edad: " + txtEdad.getText() + "\n" +
                           "Nivel: " + (rbtNivelB.isSelected() ? "B" : rbtNivelB.isSelected() ? "M" : "S");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\intro\\alumno\\alumno.txt"))) {
                bw.write(datos);
            } catch (Exception ex) {
                System.out.println("Error al escribir en el fichero: " + ex.getMessage());
            }
        }
        
    }

    private static class btnCancelarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            txtDni.setText("");
            txtNombre.setText("");
            txtEdad.setText("");
        }

    }

}
