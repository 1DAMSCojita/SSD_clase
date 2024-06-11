package ejercicio_1;

import java.awt.*;
import javax.swing.*;

public class FuncionesRegistroUsuario {

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
        String caption = "Registro de usuario básico";
        int ancho = 300;
        int alto = 300;
        JFrame frmPrincipal = FuncionesRegistroUsuario.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        // Titulo
        JLabel lblTitulo = new JLabel("REGISTRO DE USUARIO BÁSICO");
        lblTitulo.setFont(new Font("Comics Sans MS", Font.PLAIN, 16));
        // Panel para el título.
        JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
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

        // Apellido
        // Box
        Box boxApellido = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblApellido = new JLabel("Apellidos:");
        // Texto
        JTextField txtApellido = new JTextField(6);
        // Separador fijo y añadir elementos.
        boxApellido.add(Box.createHorizontalStrut(5));
        boxApellido.add(lblApellido);
        boxApellido.add(Box.createHorizontalStrut(5));
        boxApellido.add(txtApellido);
        // Panel
        JPanel pnlApellido = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlApellido.add(boxApellido);

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

        // Contraseña
        // Box
        Box boxContraseña = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblContraseña = new JLabel("Contraseña:");
        // Texto
        JTextField txtContraseña = new JTextField(10);
        // Separador fijo y añadir elementos.
        boxContraseña.add(Box.createHorizontalStrut(5));
        boxContraseña.add(lblContraseña);
        boxContraseña.add(Box.createHorizontalStrut(5));
        boxContraseña.add(txtContraseña);
        // Panel
        JPanel pnlContraseña = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlContraseña.add(boxContraseña);

        // ConfirmarContraseña
        // Box
        Box boxConfirmarContraseña = Box.createHorizontalBox();
        // Etiqueta
        JLabel lblConfirmarContraseña = new JLabel("Confirmar Contraseña:");
        // Texto
        JTextField txtConfirmarContraseña = new JTextField(10);
        // Separador fijo y añadir elementos.
        boxConfirmarContraseña.add(Box.createHorizontalStrut(5));
        boxConfirmarContraseña.add(lblConfirmarContraseña);
        boxConfirmarContraseña.add(Box.createHorizontalStrut(5));
        boxConfirmarContraseña.add(txtConfirmarContraseña);
        // Panel
        JPanel pnlConfirmarContraseña = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlConfirmarContraseña.add(boxConfirmarContraseña);

        // Botón Registrar
        // Box
        Box boxRegistrar = Box.createHorizontalBox();
        // Botón
        JButton btnRegistrar = new JButton("Registrar");
        // Separador fijo y añadir elementos.
        boxRegistrar.add(Box.createHorizontalStrut(5));
        boxRegistrar.add(btnRegistrar);
        // Panel
        JPanel pnlBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnlBoton.add(boxRegistrar);

        // Box principal y separadores pertinetes.
        // Añadimos los paneles.
        Box boxPrincipal = Box.createVerticalBox();
        boxPrincipal.add(pnlTitulo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlNombre);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlApellido);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlCorreo);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlContraseña);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlConfirmarContraseña);
        boxPrincipal.add(Box.createVerticalStrut(5));
        boxPrincipal.add(pnlBoton);

        pnlPrincipal.add(boxPrincipal);

        frmPrincipal.setVisible(true);
    }

}
