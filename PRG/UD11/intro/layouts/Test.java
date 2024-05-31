package intro.layouts;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        JFrame frmPrincipal = new JFrame("Calculadora");

        JPanel panelPrincipal = (JPanel)frmPrincipal.getContentPane();

        JLabel lblDisplay = new JLabel("Hola");
        panelPrincipal.add(lblDisplay);

        JPanel pnlBotones = new JPanel();
        
        // JButton btn0 = new JButton("0");
        FuncionesControles.agregaBotonAPanel("0", pnlBotones);
        FuncionesControles.agregaBotonAPanel("1", pnlBotones);
        FuncionesControles.agregaBotonAPanel("2", pnlBotones);
        FuncionesControles.agregaBotonAPanel("3", pnlBotones);
        FuncionesControles.agregaBotonAPanel("4", pnlBotones);
        FuncionesControles.agregaBotonAPanel("6", pnlBotones);
        FuncionesControles.agregaBotonAPanel("7", pnlBotones);
        FuncionesControles.agregaBotonAPanel("9", pnlBotones);

        FuncionesControles.agregaBotonAPanel("+", pnlBotones);
        FuncionesControles.agregaBotonAPanel("-", pnlBotones);
        FuncionesControles.agregaBotonAPanel("*", pnlBotones);
        FuncionesControles.agregaBotonAPanel("/", pnlBotones);
        FuncionesControles.agregaBotonAPanel("=", pnlBotones);
        
        panelPrincipal.add(pnlBotones);

        frmPrincipal.setVisible(true);
    }
}
