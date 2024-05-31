package intro.layouts;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FuncionesControles {

    static void agregaBotonAPanel(String caption, JPanel panel) {
        JButton boton = new JButton(caption);
        panel.add(boton);
    }

}
