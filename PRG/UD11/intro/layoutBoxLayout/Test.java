package intro.layoutBoxLayout;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import intro.layoutFlowLayOut.Funciones;

public class Test {
    public static void main(String[] args) {

        // BoxLayout
        // Contenedor único -> Box
        // No varian su tamaño.

        // Box boxBotonesVertical = Box.createVerticalBox();
        // Box boxBotonesHorizontal = Box.createHorizontalBox();
    
        // Espacios en blanco:
        // Box.createVerticalStrut(int height);
        // Box.createHorizontalStrut(int width);

        // Box.CreateVerticalGlue()
        // Box.CreateHorizontalGlue()

        JPanel pnlPrincipal = new JPanel();
        String caption = "Diseño de Box Layout";
        int ancho = 400;
        int alto = 200;
        JFrame frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        Box boxBotones = Box.createHorizontalBox();
        JButton btn1 = new JButton("B1");
        JButton btn2 = new JButton("Botón 2");
        JButton btn3 = new JButton("B3");

        Component separadorBordeIzq = Box.createHorizontalStrut(5);
        Component separadorBordeDer = Box.createHorizontalStrut(5);

        boxBotones.add(separadorBordeIzq);
        boxBotones.add(btn1);
        boxBotones.add(Box.createHorizontalStrut(20));
        boxBotones.add(btn2);
        boxBotones.add(Box.createHorizontalGlue());
        boxBotones.add(btn3);
        boxBotones.add(separadorBordeDer);
        
        pnlPrincipal.add(boxBotones);

        frmPrincipal.setVisible(true);
    }
}
