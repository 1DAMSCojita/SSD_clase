package intro.bordeLayoutConEventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Editor {
    
    JFrame frmPrincipal;
    JPanel pnlPrincipal;
    JTextField txtNorte = new JTextField("");
    JTextArea txtAreaCentro = new JTextArea("");
    JButton btnEntrar = new JButton("Entrar");
    JButton btnReset = new JButton("Reset");
    int suma;

    public Editor() {

        frmPrincipal = new JFrame("Border Layout con Eventos");
        frmPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frmPrincipal.setSize(300, 600);
        pnlPrincipal = (JPanel) frmPrincipal.getContentPane();
        pnlPrincipal.setLayout(new BorderLayout());

        JPanel pnlBotones = new JPanel();
        pnlBotones.setLayout(new GridBagLayout());

        pnlPrincipal.add(txtNorte, BorderLayout.NORTH);
        pnlPrincipal.add(txtAreaCentro, BorderLayout.CENTER);
        btnReset.addActionListener(new btnResetActionListener());
        pnlPrincipal.add(btnReset, BorderLayout.SOUTH);

        GridBagConstraints gbcValores = new GridBagConstraints();
        JButton btn1 = new JButton("1");
        btn1.addActionListener(new btn1ActionListener());
        gbcValores.gridx = 0;
        gbcValores.gridy = 0;
        gbcValores.gridwidth = 1;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;
        gbcValores.weighty = 1.0;
        gbcValores.anchor = GridBagConstraints.NORTH;
        gbcValores.fill = GridBagConstraints.BOTH;
        pnlBotones.add(btn1, gbcValores);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new btn2ActionListener());
        gbcValores.gridx = 1;
        gbcValores.gridy = 0;
        gbcValores.gridwidth = 1;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;
        gbcValores.weighty = 1.0;
        gbcValores.anchor = GridBagConstraints.NORTH;
        gbcValores.fill = GridBagConstraints.BOTH;
        pnlBotones.add(btn2, gbcValores);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new btnPlusActionListener());
        gbcValores.gridx = 0;
        gbcValores.gridy = 1;
        gbcValores.gridwidth = 2;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;
        gbcValores.weighty = 1.0;
        gbcValores.anchor = GridBagConstraints.NORTH;
        gbcValores.fill = GridBagConstraints.BOTH;
        pnlBotones.add(btnPlus, gbcValores);

        btnEntrar.addActionListener(new btnEntrarActionListener());
        gbcValores.gridx = 0;
        gbcValores.gridy = 2;
        gbcValores.gridwidth = 2;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;
        gbcValores.weighty = 1.0;
        gbcValores.anchor = GridBagConstraints.NORTH;
        gbcValores.fill = GridBagConstraints.BOTH;
        pnlBotones.add(btnEntrar, gbcValores);

        pnlPrincipal.add(pnlBotones, BorderLayout.EAST);

        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
    }
    private class btnEntrarActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] num = txtNorte.getText().split("\\+");
            suma = 0;
            for (int i = 0; i < num.length; i++) {
                suma = suma + Integer.parseInt(num[i]);
            }
            txtAreaCentro.setText(txtAreaCentro.getText() + "\n" + String.valueOf(suma));
        }
    }
    private class btnResetActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtAreaCentro.setText("");
            txtNorte.setText("");
        }
    }
    private class btn1ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtNorte.setText(txtNorte.getText() + "1");
        }
    }
    private class btn2ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtNorte.setText(txtNorte.getText() + "2");
        }
    }
    private class btnPlusActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtNorte.setText(txtNorte.getText() + "+");
        }
    }
}
