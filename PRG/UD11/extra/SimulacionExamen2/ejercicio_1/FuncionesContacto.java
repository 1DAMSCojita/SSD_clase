package ejercicio_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FuncionesContacto {

    public static JFrame creaFormulario(String caption, int ancho, int alto) {
        JFrame formulario = new JFrame(caption);
        formulario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        formulario.setSize(ancho, alto);
        // Centramos el formulario en la pantalla.
        formulario.setLocationRelativeTo(null);

        return formulario;
    }

    public static void creaFormularioBase() {

        String caption = "Formulario de Contacto";
        int ancho = 500;
        int alto = 300;
        JFrame frmPrincipal = FuncionesContacto.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        JPanel pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        // Titulo
        JLabel lblTitulo = new JLabel("FORMULARIO DE CONTACTO BÁSICO");
        JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlTitulo.add(lblTitulo);

        // Nombre
        // Box
        Box boxNombre = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblNombre = new JLabel("Nombre:");
        // Texto
        JTextField txtNombre = new JTextField(6);
        // Separador fijo y añadir elementos.
        boxNombre.add(Box.createHorizontalStrut(5));
        boxNombre.add(lblNombre);
        boxNombre.add(Box.createHorizontalStrut(5));
        boxNombre.add(txtNombre);
        // Panel
        JPanel pnlNombre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlNombre.add(boxNombre);

        // Correo
        // Box
        Box boxCorreo = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblCorreo = new JLabel("Correo electrónico:");
        // Texto
        JTextField txtCorreo = new JTextField(10);
        // Separador fijo y añadir elementos.
        boxCorreo.add(Box.createHorizontalStrut(5));
        boxCorreo.add(lblCorreo);
        boxCorreo.add(Box.createHorizontalStrut(5));
        boxCorreo.add(txtCorreo);
        // Panel
        JPanel pnlCorreo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlCorreo.add(boxCorreo);

        // Teléfono
        // Box
        Box boxTelefono = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblTelefono = new JLabel("Telefono:");
        // Texto
        JTextField txtTelefono = new JTextField(6);
        // Separador fijo y añadir elementos.
        boxTelefono.add(Box.createHorizontalStrut(5));
        boxTelefono.add(lblTelefono);
        boxTelefono.add(Box.createHorizontalStrut(5));
        boxTelefono.add(txtTelefono);
        // Panel
        JPanel pnlTelefono = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlTelefono.add(boxTelefono);

        // Mensaje
        // Box
        Box boxMensaje = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblMensaje = new JLabel("Mensaje:");
        // Texto
        JTextArea txtMensaje = new JTextArea(6, 6);
        // Separador fijo y añadir elementos.
        boxMensaje.add(Box.createHorizontalStrut(5));
        boxMensaje.add(lblMensaje);
        boxMensaje.add(Box.createHorizontalStrut(5));
        boxMensaje.add(txtMensaje);
        // Panel
        JPanel pnlMensaje = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlMensaje.add(boxMensaje);

        // Botón Enviar
        // Box
        Box boxEnviar = Box.createHorizontalBox();
        // Botón
        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new btnEnviarActionListener());
        // Separador fijo y añadir elementos.
        boxEnviar.add(Box.createHorizontalStrut(5));
        boxEnviar.add(btnEnviar);
        // Panel
        JPanel pnlBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnlBoton.add(boxEnviar);

        // Box principal y separadores pertinetes.
        // Añadimos los paneles.
        Box boxPrincipal = Box.createVerticalBox();
        boxPrincipal.add(pnlTitulo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlNombre);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlCorreo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlTelefono);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlMensaje);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlBoton);

        pnlPrincipal.add(boxPrincipal);

        frmPrincipal.setVisible(true);

    }

    private static class btnEnviarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String mensaje = "¡Se ha añadido la información al formulario con éxito!";
            JOptionPane.showMessageDialog(null, mensaje);
        }
        
    }

}
