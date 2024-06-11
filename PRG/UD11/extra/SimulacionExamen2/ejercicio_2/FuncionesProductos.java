package ejercicio_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FuncionesProductos {

    static JTextField txtCantidad, txtPrecioUnitario;
    static JLabel lblPrecioTotal;

    public static JFrame creaFormulario(String caption, int ancho, int alto) {
        JFrame formulario = new JFrame(caption);
        formulario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        formulario.setSize(ancho, alto);
        // Centramos el formulario en la pantalla.
        formulario.setLocationRelativeTo(null);

        return formulario;
    }

    public static void creaFormularioBase() {

        String caption = "Formulario de Pedido de Productos";
        int ancho = 500;
        int alto = 300;
        JFrame frmPrincipal = FuncionesProductos.creaFormulario(caption, ancho, alto);

        // Capturamos el panel del formulario principal.
        JPanel pnlPrincipal = (JPanel)frmPrincipal.getContentPane();

        pnlPrincipal.setLayout(new BorderLayout());

        // Titulo
        JLabel lblTitulo = new JLabel("FORMULARIO DE PEDIDO", JLabel.CENTER);
        pnlPrincipal.add(lblTitulo, BorderLayout.NORTH);

        // Panel central para los campos de texto
        JPanel pnlCentro = new JPanel(new GridLayout(3, 2, 5, 5));

        // Nombre del producto
        JLabel lblNombreProducto = new JLabel("Nombre del producto:");
        JTextField txtNombreProducto = new JTextField(20);
        pnlCentro.add(lblNombreProducto);
        pnlCentro.add(txtNombreProducto);

        // Cantidad
        JLabel lblCantidad = new JLabel("Cantidad:");
        txtCantidad = new JTextField(10);
        pnlCentro.add(lblCantidad);
        pnlCentro.add(txtCantidad);

        // Precio unitario 
        JLabel lblPrecioUnitario = new JLabel("Precio unitario:");
        txtPrecioUnitario = new JTextField(10);
        pnlCentro.add(lblPrecioUnitario);
        pnlCentro.add(txtPrecioUnitario);

        pnlPrincipal.add(pnlCentro, BorderLayout.CENTER);

        // Botón Calcular Total
        JButton btnCalcularTotal = new JButton("Calcular Total");
        btnCalcularTotal.addActionListener(new btnCalcularTotalActionListener());
        pnlPrincipal.add(btnCalcularTotal, BorderLayout.EAST);

        // Etiqueta para mostrar el precio total
        lblPrecioTotal = new JLabel("Precio Total:");
        pnlPrincipal.add(lblPrecioTotal, BorderLayout.SOUTH);

        frmPrincipal.setVisible(true);
    }

    private static class btnCalcularTotalActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int cantidad = Integer.parseInt(txtCantidad.getText());
                double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());
                double precioTotal = cantidad * precioUnitario;
                lblPrecioTotal.setText("Precio total: " + precioTotal);
            } catch (NumberFormatException ex) {
                lblPrecioTotal.setText("Por favor, ingrese valores válidos.");
            } catch (Exception ex) {
                lblPrecioTotal.setText("Error genérico.");
            }
        }
        
    }

}
