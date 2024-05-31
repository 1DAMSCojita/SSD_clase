package intro.layoutFlowLayOut;

import java.awt.*;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        
        // Divide en 5 zonas: norte, sur, este, oeste y centro.
        // en cada parte puede tener un componente.

        // Los componentes de las zonas norte y sur ocupan espacio posible horizontal y lo minimo verticalmente.
        
        // Las zonas este y oeste ocurren al contrario.

        // La zona central es la única parte que varia en todas las direcciones.

        JPanel pnlPrincipal = new JPanel();
        String caption = "Diseño de Border Layout";
        int ancho = 300;
        int alto = 300;
        JFrame frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();
        
        // Establecemos el diseño.
        pnlPrincipal.setLayout(new BorderLayout());

        // Norte
        JTextField txtNorte = new JTextField("Norte");
        pnlPrincipal.add(txtNorte, BorderLayout.NORTH);

        // Oeste
        JTextArea txtOeste = new JTextArea("OesteXXXXXXXXXX");
        txtOeste.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        JScrollPane scrollOeste = new JScrollPane(txtOeste);
        pnlPrincipal.add(scrollOeste, BorderLayout.WEST);

        // Centro
        JTextPane txtCentro = new JTextPane();
        pnlPrincipal.add(txtCentro, BorderLayout.CENTER);

        // Este
        JTextField txtEste = new JTextField("Este");
        pnlPrincipal.add(txtEste, BorderLayout.EAST);

        // Sur
        JToggleButton tbnSur = new JToggleButton("Sur");
        pnlPrincipal.add(tbnSur, BorderLayout.SOUTH);

        // Hacemos visible el formulario.
        frmPrincipal.setVisible(true);

    }
}
