package intro.juegoAdivinarNumero;

import javax.swing.*;

public class FuncionesEntornoGrafico {

	static JFrame configuraFormulario(String Caption, int ancho, int alto, boolean centrar) {
		// Creamos el formulario.
		JFrame frmFormulario = new JFrame(Caption);
		// Especificamos la funcionalidad al cerrar el formulario: cerrar la aplicación.
		frmFormulario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// Especificamos el tamaño del formulario (ancho, alto).
		frmFormulario.setSize(ancho, alto);
		// Centramos el formulario.
		if (centrar)
			frmFormulario.setLocationRelativeTo(null);
		
		return frmFormulario;
	}
}
