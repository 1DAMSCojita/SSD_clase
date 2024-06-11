package ejercicio_3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FuncionesContador {

    static JLabel lblContador;
    static final int[] contador = {0};

    public static JFrame creaFormulario(String caption, int ancho, int alto) {
        JFrame formulario = new JFrame(caption);
        formulario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        formulario.setSize(ancho, alto);
        // Centramos el formulario en la pantalla.
        formulario.setLocationRelativeTo(null);

        return formulario;
    }

    public static void creaFormularioBase() {

        String caption = "Contador";
        int ancho = 500;
        int alto = 300;
        JFrame frmPrincipal = FuncionesContador.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        JPanel pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        pnlPrincipal.setLayout(new GridLayout(3, 1, 10, 10));

        // Etiqueta para mostrar el valor del contador
        lblContador = new JLabel("0", JLabel.CENTER);
        lblContador.setFont(new Font("Arial", Font.BOLD, 24));
        pnlPrincipal.add(lblContador);

        // Botón Incrementar
        JButton btnIncrementar = new JButton("Incrementar");
        btnIncrementar.addActionListener(new btnIncrementarActionListener());
        pnlPrincipal.add(btnIncrementar);

        // Botón Reiniciar 
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.addActionListener(new btnReiniciarActionListener());
        pnlPrincipal.add(btnReiniciar);

        frmPrincipal.setVisible(true);
    }

    private static class btnIncrementarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            contador[0]++;
            lblContador.setText(String.valueOf(contador[0]));
        }
        
    }

    private static class btnReiniciarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            contador[0] = 0;
            lblContador.setText(String.valueOf(contador[0]));
        }

    }

}
