package intro.cambiodebase;

import java.awt.*;
import javax.swing.*;

public class Editor {

    public static void creaFormularioBase() {

        JPanel pnlPrincipal = new JPanel();
        String caption = "Cambio de base";
        int ancho = 300;
        int alto = 300;
        JFrame frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        pnlPrincipal.setLayout(new BorderLayout());

        // Titulo
        JLabel lblTitulo = new JLabel("CAMBIO DE BASE");

        JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlTitulo.add(lblTitulo);

        // Valor decimal.
        // Box
        Box boxValor = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblValor = new JLabel("Valor decimal:");
        // Texto
        JTextField txtValor = new JTextField(10);
        JButton btnCalcular = new JButton("Calcular");
        // Separador fijo
        boxValor.add(lblValor);
        boxValor.add(Box.createHorizontalStrut(5));
        boxValor.add(txtValor);
        boxValor.add(Box.createHorizontalStrut(5));
        boxValor.add(btnCalcular);
        // Panel
        JPanel pnlValor = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlValor.add(boxValor);

        // Botones para cambiar base.
        // Box
        Box boxBases = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblBases = new JLabel("Base:");
        JCheckBox chkbokBinario = new JCheckBox("Binario", true);
        JCheckBox chkbokOctal = new JCheckBox("Octal", true);
        JCheckBox chkbokHexadecimal = new JCheckBox("Hexadecimal", false);
        // Agruapamos las opciones.
        ButtonGroup chkboxBase = new ButtonGroup();
        chkboxBase.add(chkbokBinario);
        chkboxBase.add(chkbokOctal);
        chkboxBase.add(chkbokHexadecimal);
        // Añadimos los elementos.
        boxBases.add(Box.createHorizontalStrut(5));
        boxBases.add(lblBases);
        boxBases.add(Box.createHorizontalStrut(5));
        boxBases.add(chkbokBinario);
        boxBases.add(Box.createHorizontalStrut(5));
        boxBases.add(chkbokOctal);
        boxBases.add(Box.createHorizontalStrut(5));
        boxBases.add(chkbokHexadecimal);
        // Panel
        JPanel pnlBase = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlBase.add(boxBases);

        // Box principal y separadores pertinentes
        // Añadimos los paneles
        Box boxPrincipal = Box.createVerticalBox();
        boxPrincipal.add(pnlTitulo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlValor);
        boxPrincipal.add(Box.createVerticalStrut(1));
        boxPrincipal.add(pnlBase);
        boxPrincipal.add(Box.createVerticalStrut(5));

        pnlPrincipal.add(boxPrincipal);

        frmPrincipal.setVisible(true);

    }

}
