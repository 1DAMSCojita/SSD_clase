package intro.bordeLayoutConEventos;

import java.awt.*;
import javax.swing.*;
import intro.layoutFlowLayOut.Funciones;

public class Editor {
    
    JFrame frmPrincipal;
    JPanel pnlPrincipal;
    JTextField txtNorte = new JTextField("Norte");
    JTextArea txtAreaCentro = new JTextArea("Área Centro");
    JButton btnEntrar = new JButton("Entrar");
    JButton btnReset = new JButton("Reset");

    public Editor() {
        pnlPrincipal = new JPanel();
        String caption = "Border Layout con Eventos";
        int ancho = 300;
        int alto = 300;
        frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();
        pnlPrincipal.setLayout(new BorderLayout());

        pnlPrincipal.add(txtNorte, BorderLayout.NORTH);
        pnlPrincipal.add(txtAreaCentro, BorderLayout.CENTER);
        // Botón Entrar
        // btnEntrar.addActionListener();

    }

}
