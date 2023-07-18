package Swing;

import javax.swing.*;
import java.awt.*;

public class Pruebas {
    public static void main(String[] args) {
        GridLayout disposicionFramePadreGridLayout = new GridLayout();

        JFrame framePadre = new JFrame();
        JPanel panelPrincipalIzquierdo = new JPanel();
        JPanel panelPrincipalDerecho = new JPanel();
        JLabel panelDerechoLabel = new JLabel("Label 1 ");
        JPanel panelDerechoCuadrado = new JPanel();
        JPanel containerPanelDerechoLabel = new JPanel();


        framePadre.setSize(1200, 800);
        containerPanelDerechoLabel.setPreferredSize(new Dimension(framePadre.getWidth() / 2 - 60, 40));
        panelDerechoCuadrado.setBackground(Color.GREEN);
        panelPrincipalIzquierdo.setBackground(Color.orange);
        panelPrincipalDerecho.setBackground(Color.blue);
        containerPanelDerechoLabel.setOpaque(false);


        framePadre.add(panelPrincipalIzquierdo);
        framePadre.add(panelPrincipalDerecho);

        panelPrincipalDerecho.add(containerPanelDerechoLabel);
        panelPrincipalDerecho.add(panelDerechoCuadrado);

        containerPanelDerechoLabel.add(panelDerechoLabel);


        panelDerechoCuadrado.setPreferredSize(new Dimension(framePadre.getSize().width / 2 - 60, framePadre.getSize().height - 200));

        framePadre.setLayout(disposicionFramePadreGridLayout);
        panelPrincipalDerecho.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));
        framePadre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        framePadre.setVisible(true);
    }
}
