package ejercicio_3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FuncionesCuadrado {

    static JTextField txtNumero;
    static JLabel lblResultado;

    public static JFrame creaFormulario(String caption, int ancho, int alto) {
        JFrame formulario = new JFrame(caption);
        formulario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        formulario.setSize(ancho, alto);
        // Centramos el formulario en la pantalla.
        formulario.setLocationRelativeTo(null);

        return formulario;
    }

    public static void creaFormularioBase() {

        JPanel pnlPrincipal = new JPanel();
        String caption = "Formulario para calcular raíz cuadrada con ActionListener";
        int ancho = 400;
        int alto = 400;
        JFrame frmPrincipal = FuncionesCuadrado.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        // Titulo
        JLabel lblTitulo = new JLabel("CÁLCULO CUADRADO BÁSICO");
        lblTitulo.setFont(new Font("Comics Sans MS", Font.PLAIN, 16));
        // Panel para el título.
        JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlTitulo.add(lblTitulo);

        // Numero
        // Box
        Box boxNumero = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblNumero = new JLabel("Numero:");
        // Texto
        txtNumero = new JTextField(6);
        // Botón Calcular Cuadrado
        JButton btnCalcular = new JButton("Calcular Cuadrado");
        btnCalcular.addActionListener(new btnCalcularActionListener());
        // Etiqueta para mostrar el resultado. 
        lblResultado = new JLabel("Resultado: ");
        // Separador fijo y añadir elementos.
        boxNumero.add(Box.createHorizontalStrut(5));
        boxNumero.add(lblNumero);
        boxNumero.add(Box.createHorizontalStrut(5));
        boxNumero.add(txtNumero);
        boxNumero.add(Box.createHorizontalStrut(5));
        boxNumero.add(btnCalcular);
        // Panel
        JPanel pnlNumero = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlNumero.add(boxNumero);

        // Box principal
        // Añadimos elementos y separadores
        Box boxPrincipal = Box.createVerticalBox();
        boxPrincipal.add(pnlTitulo);
        boxPrincipal.add(Box.createHorizontalStrut(5));
        boxPrincipal.add(pnlNumero);
        boxPrincipal.add(Box.createVerticalStrut(10));
        boxPrincipal.add(lblResultado);

        pnlPrincipal.add(boxPrincipal);

        frmPrincipal.setVisible(true);
    }

    private static class btnCalcularActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtenemos el texto del JTextField
            String texto = txtNumero.getText();
            try {
                // Convertimos el texto a un número.
                int numero = Integer.parseInt(texto);
                // Calculamos el cuadrado del número.
                int cuadrado = numero * numero;
                // Mostramos el resultado en el JLabel.
                lblResultado.setText("Resultado: " + cuadrado);                
            } catch (NumberFormatException ex) {
                lblResultado.setText("Por favor, ingrese un número válido.");
            } catch (Exception ex) {
                lblResultado.setText("Error genérico.");
            }
        }
        
    }

}
