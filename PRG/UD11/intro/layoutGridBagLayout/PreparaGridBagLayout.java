package intro.layoutGridBagLayout;

import java.awt.*;
import javax.swing.*;

import intro.layoutFlowLayOut.Funciones;

public class PreparaGridBagLayout {

    // GRID BAG LAYOUT
    // Los componentes que pongamos ocuparán toda la celda.

    // GridBagConstraints()

    // add(Component comp, GridBagConstraints constr);

    // Atributos de la clase GridBagLayout
    // - gridx -> Indica el número de columna (será un integer) donde se encuentra el componente.
    // - gridi -> Indica el número de fila donde se encuentra el componente.
    // - gridwidth -> Indica cuántas celdas en horizontal ocupa. - REMAINDER
    // - gridheight
    // - weigthx, weighty
    // - fill: NONE, VERTICAL, HORIZONTAL, BOTH.
    // - ipadx, ipady
    // - insets
    // - anchor: CENTER, NORTH, NORTHWEST, NORTHEAST, WEST, etc...
    
    public static void creaEjemploGridBagLayout() {

        JPanel pnlPrincipal = new JPanel();
        String caption = "GridBagLayout";
        int ancho = 300;
        int alto = 300;
        JFrame frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();   
        pnlPrincipal.setLayout(new GridBagLayout());

        // Definimos los valores a utilizar.
        // Seguiremos el constructor:
        /*
         * GridBagConstraints()
         * int gridx, // Número de columna donde se coloca el compontente.
         * int gridy, // Número de fila donde se coloca el componente.
         * int gridwidth, // Número de celdas en horizontal que ocupa.
         * int gridheight, // Número de celdas en vertical que ocupa.
         * double weightx, // Lo que estira la celda en horizontal.
         * double weighty, // Lo que estira la celda en vertical.
         * int anchor (GridBagConstraints.CENTER), // Situación del componente en la celda.
         * int fill (GridBagConstraints.BOTH), // Cómo estira el compontente en la celda.
         * Insets insets, // (a, b, c, d) -> Relleno externo a la celda.
         * int ipadx, // Relleno interno en horizontal de la celda.
         * int ipady, // Relleno interno en vertical de la celda.
        */

        // JTextArea
        JTextArea txtArea = new JTextArea("Área de texto");
        GridBagConstraints gbcValores = new GridBagConstraints();
        gbcValores.gridx = 0;
        gbcValores.gridy = 0;
        gbcValores.gridwidth = 2;
        gbcValores.gridheight = 2;
        gbcValores.weightx = 0.0;
        gbcValores.weighty = 1.0;
        gbcValores.anchor = GridBagConstraints.CENTER;
        gbcValores.fill = GridBagConstraints.BOTH;

        pnlPrincipal.add(txtArea, gbcValores);

        // Botón 1.
        JButton btn1 = new JButton("Botón 1");
        gbcValores.gridx = 2;
        gbcValores.gridy = 0;
        gbcValores.gridwidth = 1;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;
        gbcValores.weighty = 1.0;
        gbcValores.anchor = GridBagConstraints.NORTH;
        gbcValores.fill = GridBagConstraints.NONE;

        pnlPrincipal.add(btn1, gbcValores);

        // Botón 2
        JButton btn2 = new JButton("Botón 2");
        pnlPrincipal.add(btn2,
                new GridBagConstraints(2, 1, 1, 1, 0.0, 1.0, 
                GridBagConstraints.NORTH, GridBagConstraints.NONE, 
                new Insets(0, 0, 0, 0), 0, 0)
        );

        // Botón 3
        JButton btn3 = new JButton("Botón 3");
        gbcValores.gridx = 0;
        gbcValores.gridy = 2;
        gbcValores.gridwidth = 1;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;
        gbcValores.weighty = 0.0;
        gbcValores.anchor = GridBagConstraints.CENTER;
        gbcValores.fill = GridBagConstraints.NONE;

        pnlPrincipal.add(btn3, gbcValores);

        // Botón 4
        JButton btn4 = new JButton("Botón 4");
        gbcValores.gridx = 2;
        gbcValores.gridy = 2;
        gbcValores.gridwidth = 1;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;
        gbcValores.weighty = 0.0;
        gbcValores.anchor = GridBagConstraints.CENTER;
        gbcValores.fill = GridBagConstraints.NONE;

        pnlPrincipal.add(btn4, gbcValores);

        // Texto
        JTextField txtTexto = new JTextField("Texto");
        gbcValores.gridx = 1;
        gbcValores.gridy = 2;
        gbcValores.gridwidth = 1;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 1.0;
        gbcValores.weighty = 0.0;
        gbcValores.anchor = GridBagConstraints.CENTER;
        gbcValores.fill = GridBagConstraints.HORIZONTAL;

        pnlPrincipal.add(txtTexto, gbcValores);

        

        frmPrincipal.setVisible(true);
    }

}
