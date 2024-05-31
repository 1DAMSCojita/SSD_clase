package intro.teoria;

import javax.swing.*;

public class Test {

        // 11 - ENTORNO GRÁFICO

        // 11.1 GUI - Interfície gráfica de usuario.

        // Librerías (API): 2

        // AWT

        // Swing -> Controles y Contenedores
        // J

        // JButton

        // JToggleButton

        // JCheckBox

        // JRadioButton

        // JLabel

        // JList

        // JComboBox

        // JTextField

        // JFormattedTextField

        // JPasswordField

        // JTextArea

        // JTextPane

        // ------------

        // CONTENEDORES

        // JFrame

        // JDialog

        // JPanel

        // JScrollPane

        // JTabbedPane
    public static void main(String[] args) {
        
        // Crear el contenedor principal.
        JFrame frmPrincipal = new JFrame("Mi primer formulario chispas");

        // Crear un panel de contenido.
        JPanel pnlContenido = (JPanel)frmPrincipal.getContentPane();

        JLabel lblDisplay = new JLabel("Hola cara de bola");

        pnlContenido.add(lblDisplay);

        frmPrincipal.pack();

        // Centramos el contenedor principal en la pantalla.
        frmPrincipal.setLocationRelativeTo(null);



        frmPrincipal.setVisible(true);

    }

}
