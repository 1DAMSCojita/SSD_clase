package intro.juegoAdivinarNumero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AdivinarNumero {

	private static final int NUMERO_CELDAS = 10;
    private static final int NUMERO_MAXIMO_INTENTOS = 5;
    private int numeroSecreto;
    private int intentos;
    private JButton[][] botonesNumeros;

    public AdivinarNumero() {
		// Creamos el formulario principal.
    	int ancho = 600;
    	int alto = 600;
		JFrame frmPrincipal = FuncionesEntornoGrafico.configuraFormulario("Adivina el Número", ancho, alto, true);		
		
		// Capturamos el contenedor del formulario principal volcándolo en un panel.
		JPanel pnlPrincipal= (JPanel)frmPrincipal.getContentPane();
		// Establecemos el layout del panel principal.
		pnlPrincipal.setLayout(new BorderLayout());

        // Creamos un panel con GridBagLayout.
        JPanel grdJuego = new JPanel(new GridBagLayout());
        // Creamos el gestor de valores para la grid.
        GridBagConstraints gbcValores = new GridBagConstraints();
        // Creamos un array bidimensional (para "mapear la grid") de botones.
        botonesNumeros = new JButton[NUMERO_CELDAS][NUMERO_CELDAS];

        // Creamos los botones y los añadimos al panel de la grid.
        int numero = 1;
        for (int row = 0; row < NUMERO_CELDAS; row++) {
            for (int col = 0; col < NUMERO_CELDAS; col++) {
                gbcValores.gridx = col;
                gbcValores.gridy = row;
                gbcValores.fill = GridBagConstraints.BOTH;
                gbcValores.weightx = 1.0;
                gbcValores.weighty = 1.0;
                
                JButton button = new JButton(String.valueOf(numero));
                button.addActionListener(new ButtonClickListener(numero));
                botonesNumeros[row][col] = button;
                grdJuego.add(button, gbcValores);
                numero++;
            }
        }

        // Generamo el número secreto.
        numeroSecreto = new Random().nextInt(100) + 1;
        intentos = 0;

        // Añadimos el panel de la grid al panel principal.
        pnlPrincipal.add(grdJuego, BorderLayout.CENTER);

        // Mostramos el formulario principal.
        frmPrincipal.setVisible(true);
    }

    // Clase para gestionar el click sobre los botones.
    private class ButtonClickListener implements ActionListener {
        private final int numeroBoton;

        public ButtonClickListener(int numeroBoton) {
            this.numeroBoton = numeroBoton;
        }

        // Método que se dispara una vez se ha realizado el click.
        @Override
        public void actionPerformed(ActionEvent e) {
            intentos++;
            if (numeroBoton == numeroSecreto) {
                JOptionPane.showMessageDialog(null, "!Genial! ¡Has dado con el número secreto: " + numeroSecreto + "!");
                System.exit(0);
            } else {
                if (intentos >= NUMERO_MAXIMO_INTENTOS) {
                    JOptionPane.showMessageDialog(null, "¡Has quemado todos los intentos! El número secreto era " + numeroSecreto + ".");
                    System.exit(0);
                }
                deshabilitarBotones(numeroBoton);
            }
        }
    }

    // Método para deshabilitar los botones que ya no interesen.
    private void deshabilitarBotones(int numeroBoton) {
        if (numeroBoton < numeroSecreto) {
            for (int row = 0; row < NUMERO_CELDAS; row++) {
                for (int col = 0; col < NUMERO_CELDAS; col++) {
                    int num = Integer.parseInt(botonesNumeros[row][col].getText());
                    if (num <= numeroBoton) {
                        botonesNumeros[row][col].setEnabled(false);
                    }
                }
            }
        } else {
            for (int row = 0; row < NUMERO_CELDAS; row++) {
                for (int col = 0; col < NUMERO_CELDAS; col++) {
                    int num = Integer.parseInt(botonesNumeros[row][col].getText());
                    if (num >= numeroBoton) {
                        botonesNumeros[row][col].setEnabled(false);
                    }
                }
            }
        }
    }
}
