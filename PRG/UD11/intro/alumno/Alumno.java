package intro.alumno;

import java.awt.*;
import javax.swing.*;

import intro.layoutFlowLayOut.Funciones;

public class Alumno {

    public static void creaFormularioAlumno() {

        JPanel pnlPrincipal = new JPanel();
        String caption = "Formulario Alumno";
        int ancho = 300;
        int alto = 300;
        JFrame frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

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
        JTextField txtDni = new JTextField(6);
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
        JTextField txtNombre = new JTextField(6);
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
        JTextField txtEdad = new JTextField(2);
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
        JRadioButton rbtNivelB = new JRadioButton("B", false);
        JRadioButton rbtNivelM = new JRadioButton("M", false);
        JRadioButton rbtNivelS = new JRadioButton("S", true);
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
        JButton btnCancelar = new JButton("Cancelar");
        // Añadimos los elementos.
        boxNivel.add(Box.createHorizontalStrut(5)); // Separador fijo.
        boxBotones.add(btnAceptar);
        boxNivel.add(Box.createHorizontalStrut(5)); // Separador fijo.
        boxBotones.add(btnCancelar);
        // Panel
        JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnlBotones.add(boxBotones);

        // Box principaly separadores pertinentes.
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

        pnlPrincipal.add(boxPrincipal);

        frmPrincipal.setVisible(true);
    }
}
