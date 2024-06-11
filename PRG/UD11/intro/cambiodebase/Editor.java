package intro.cambiodebase;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Editor {

    static JTextField txtValor;
    static JCheckBox chkbokBinario, chkbokOctal, chkbokHexadecimal;
    static ButtonGroup chkboxBase;  
    static JLabel lblBinario, lblOctal, lblHexadecimal;

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
        txtValor = new JTextField(10);
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new btnCalcularActionListener());
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
        chkbokBinario = new JCheckBox("Binario", true);
        chkbokOctal = new JCheckBox("Octal", true);
        chkbokHexadecimal = new JCheckBox("Hexadecimal", false);
        // Agruapamos las opciones.
        chkboxBase = new ButtonGroup();
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

        // Resultado
        // Box
        Box boxResultado = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblResultado = new JLabel("Resultado");
        // Añadimos los elementos.
        boxResultado.add(lblResultado);
        // Panel
        JPanel pnlResultado = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlResultado.add(boxResultado);

        // Botones
        Box boxResultadoBases = Box.createVerticalBox();
        // Etiqueta
        lblBinario = new JLabel("Binario:");
        lblOctal = new JLabel("Octal:");
        lblHexadecimal = new JLabel("Hexadecimal:");
        // Añadimos los elementos.
        boxResultadoBases.add(Box.createVerticalStrut(5));
        boxResultadoBases.add(lblBinario);
        boxResultadoBases.add(Box.createVerticalStrut(5));
        boxResultadoBases.add(lblOctal);
        boxResultadoBases.add(Box.createVerticalStrut(5));
        boxResultadoBases.add(lblHexadecimal);
        // Panel
        JPanel pnlResultadoBase = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlResultadoBase.add(boxResultadoBases);

        // Creamos un panel horizontal que contenga pnlResultado y pnlResultadoBase
        Box boxResultadoCompleto = Box.createHorizontalBox();
        boxResultadoCompleto.add(pnlResultado);
        boxResultadoCompleto.add(Box.createHorizontalStrut(10));
        boxResultadoCompleto.add(pnlResultadoBase);

        // Box principal y separadores pertinentes
        // Añadimos los paneles
        Box boxPrincipal = Box.createVerticalBox();
        boxPrincipal.add(pnlTitulo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlValor);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlBase);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(boxResultadoCompleto);

        pnlPrincipal.add(boxPrincipal);

        frmPrincipal.setVisible(true);
    }

    private static class btnCalcularActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String valorDecimal = txtValor.getText();
            try {
                int valorNumerico = Integer.parseInt(valorDecimal);
                if (chkbokBinario.isSelected()) {
                    lblBinario.setText(Integer.toBinaryString(valorNumerico));                    
                } else {
                    lblBinario.setText("");
                }
                if (chkbokOctal.isSelected()) {
                    lblOctal.setText(Integer.toOctalString(valorNumerico));
                } else {
                    lblOctal.setText("");
                }
                if (chkbokHexadecimal.isSelected()) {
                    lblHexadecimal.setText(Integer.toHexString(valorNumerico).toUpperCase());
                } else {
                    lblHexadecimal.setText("");
                }
            } catch (NumberFormatException ex) {
                String mensaje = "Error, introduzca un valor válido.";
                JOptionPane.showMessageDialog(null, mensaje);
            } catch (Exception ex) {
                String mensaje = "Error genérico.";
                JOptionPane.showMessageDialog(null, mensaje);
            }   
        }
        
    }

}
