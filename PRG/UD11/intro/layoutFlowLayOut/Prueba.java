package intro.layoutFlowLayOut;

import javax.swing.*;
import java.awt.*;

public class Prueba {

    public static void main(String[] args) {

        // FlowLayout

        // Coloca los componentes de izquierda a derecha, en el orden en le cual lo vamos añadiendo, es el default.
        JFrame frmPrincipal = new JFrame("FlowLayout");
        JPanel pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        pnlPrincipal.setLayout(new FlowLayout());

        // pnlPrincipal.add();

        frmPrincipal.setVisible(true);

        // BorderLayout

        // GridLayout

        // BoxLayout

        // GridBackLayout

        // GroupLayout

        // CardLayout

    }

}
