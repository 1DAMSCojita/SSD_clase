package ejercicio_2;

import java.awt.*;
import javax.swing.*;

public class FuncionesReservaHotel {

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
        String caption = "Formulario de Reserva de Hotel";
        int ancho = 500;
        int alto = 300;
        JFrame frmPrincipal = FuncionesReservaHotel.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        // Establacemos el diseño.
        pnlPrincipal.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(20);
        JLabel lblApellido = new JLabel("Apellidos:");
        JTextField txtApellido = new JTextField(20);
        JLabel lblFechaLlegada = new JLabel("Fecha de llegada:");
        JTextField txtFechaLlegada = new JTextField(10);
        JLabel lblFechaSalida = new JLabel("Fecha de salida:");
        JTextField txtFechaSalida = new JTextField(10);
        JLabel lblPersonas = new JLabel("Número de personas:");
        JTextField txtPersonas = new JTextField(4);
        JButton btnReservar = new JButton("Reservar");

        pnlPrincipal.add(lblNombre);
        pnlPrincipal.add(txtNombre);
        pnlPrincipal.add(lblApellido);
        pnlPrincipal.add(txtApellido);
        pnlPrincipal.add(lblFechaLlegada);
        pnlPrincipal.add(txtFechaLlegada);
        pnlPrincipal.add(lblFechaSalida);
        pnlPrincipal.add(txtFechaSalida);
        pnlPrincipal.add(lblPersonas);
        pnlPrincipal.add(txtPersonas);
        pnlPrincipal.add(new JLabel());
        pnlPrincipal.add(btnReservar);

        frmPrincipal.setVisible(true);
    }
}
