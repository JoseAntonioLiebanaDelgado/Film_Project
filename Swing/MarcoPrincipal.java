package Swing;

import javax.swing.*;
import java.awt.*;

public class MarcoPrincipal {
    public static void main(String[] args) {

//---------------------------------------------------------------------------------------------------------------------------------------------------

        GridLayout disposicionFramePadreGridLayout = new GridLayout();
        JFrame framePadre = new JFrame();

        JPanel panelPrincipalIzquierdo = new JPanel();
        JPanel containerPanelSuperiorIzquierdo = new JPanel();
        JPanel panelSuperiorIzquierdo = new JPanel();
        JPanel containerPanelCentralIzquierdo = new JPanel();
        JPanel panelCentralIzquierdo = new JPanel();
        JButton botonInferiorIzquierdo = new JButton("Añadir");

        JPanel panelPrincipalDerecho = new JPanel();
        JPanel containerPanelDerechoLabel = new JPanel();
        JLabel panelDerechoLabel = new JLabel("Titulo App");
        JPanel panelDerechoCuadrado = new JPanel();

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setSize(1200, 800);
        panelPrincipalIzquierdo.setBackground(Color.orange);

        containerPanelSuperiorIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 2 , 120));
        containerPanelSuperiorIzquierdo.setOpaque(false);
        panelSuperiorIzquierdo.setBackground(Color.pink);

        containerPanelCentralIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 2 , 600));
        containerPanelCentralIzquierdo.setOpaque(false);
        panelCentralIzquierdo.setBackground(Color.lightGray);

        botonInferiorIzquierdo.setBackground(Color.darkGray);

        panelPrincipalDerecho.setBackground(Color.blue);
        containerPanelDerechoLabel.setPreferredSize(new Dimension(framePadre.getWidth() / 2 - 60, 40));
        containerPanelDerechoLabel.setOpaque(false);
        panelDerechoCuadrado.setBackground(Color.GREEN);

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.add(panelPrincipalIzquierdo);
        framePadre.add(panelPrincipalDerecho);

        panelPrincipalIzquierdo.add(containerPanelSuperiorIzquierdo);
        panelPrincipalIzquierdo.add(containerPanelCentralIzquierdo);

        containerPanelSuperiorIzquierdo.add(panelSuperiorIzquierdo);
        containerPanelCentralIzquierdo.add(panelCentralIzquierdo);

        panelPrincipalIzquierdo.add(botonInferiorIzquierdo);

        panelPrincipalDerecho.add(containerPanelDerechoLabel);
        panelPrincipalDerecho.add(panelDerechoCuadrado);
        containerPanelDerechoLabel.add(panelDerechoLabel);

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setLayout(disposicionFramePadreGridLayout);

        panelSuperiorIzquierdo.setPreferredSize(new Dimension(framePadre.getSize().width / 2 - 30, framePadre.getSize().height - 100));
        panelCentralIzquierdo.setPreferredSize(new Dimension(framePadre.getSize().width / 2 - 30, framePadre.getSize().height - 100));

        panelDerechoCuadrado.setPreferredSize(new Dimension(framePadre.getSize().width / 2 - 60, framePadre.getSize().height - 200));
        panelPrincipalDerecho.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        framePadre.setVisible(true);
    }
}
