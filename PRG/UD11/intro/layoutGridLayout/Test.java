package intro.layoutGridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import intro.layoutFlowLayOut.Funciones;

public class Test {
    public static void main(String[] args) {
        
        // Cada celda puede haber un componente y se van añadiendo de izquierda a derecha (es decir, en una fila) y según el orden del método.
        // Su constructor pedirá dos parámetros: número de filas y de columnas.

        JPanel pnlPrincipal = new JPanel();
        String caption = "Diseño de Border Layout";
        int ancho = 300;
        int alto = 300;
        JFrame frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();
        
        // Establecemos el diseño.
        pnlPrincipal.setLayout(new GridLayout(3, 2));

        JButton btn1 = new JButton("Botón 1");
        JButton btn2 = new JButton("Botón 2");
        JButton btn3 = new JButton("Botón 3");
        JButton btn4 = new JButton("Botón 4");
        JButton btn5 = new JButton("Botón 5");
        JButton btnX = new JButton("Botón X");

        pnlPrincipal.add(btn1);
        pnlPrincipal.add(btn2);
        pnlPrincipal.add(btnX);
        pnlPrincipal.add(btn3);
        pnlPrincipal.add(btn4);
        pnlPrincipal.add(btn5);

        frmPrincipal.setVisible(true);

    }
}
