package Swing;

import javax.swing.*;
import java.awt.*;

public class Pruebas {
    public static void main(String[] args) {

//---------------------------------------------------------------------------------------------------------------------------------------------------

        GridLayout disposicionFramePadreGridLayout = new GridLayout();
        JFrame framePadre = new JFrame();

        JPanel panelPrincipalIzquierdo = new JPanel();

        JPanel containerPanelSuperiorIzquierdo = new JPanel();
        JPanel panelSuperiorIzquierdo = new JPanel();

        JPanel containerPanelCentralIzquierdo = new JPanel();
        GridLayout disposicionPanelCentralIzquierdoGridLayout = new GridLayout(4, 2);
        JPanel panelCentralIzquierdo = new JPanel(disposicionPanelCentralIzquierdoGridLayout);

        JPanel containerLabel1de8 = new JPanel();
        JLabel label1de8 = new JLabel("Frodo");
        JPanel containerLabel2de8 = new JPanel();
        JLabel label2de8 = new JLabel("Sam");
        JPanel containerLabel3de8 = new JPanel();
        JLabel label3de8 = new JLabel("Pippin");
        JPanel containerLabel4de8 = new JPanel();
        JLabel label4de8 = new JLabel("Merry");
        JPanel containerLabel5de8 = new JPanel();
        JLabel label5de8 = new JLabel("Gandalf");
        JPanel containerLabel6de8 = new JPanel();
        JLabel label6de8 = new JLabel("Aragorn");
        JPanel containerLabel7de8 = new JPanel();
        JLabel label7de8 = new JLabel("Legolas");
        JPanel containerLabel8de8 = new JPanel();
        JLabel label8de8 = new JLabel("Gimli");

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

        containerLabel1de8.setBackground(Color.GREEN);
        label1de8.setBackground(Color.MAGENTA);
        containerLabel2de8.setBackground(Color.blue);
        label2de8.setBackground(Color.MAGENTA);
        containerLabel3de8.setBackground(Color.yellow);
        label3de8.setBackground(Color.MAGENTA);
        containerLabel4de8.setBackground(Color.white);
        label4de8.setBackground(Color.MAGENTA);
        containerLabel5de8.setBackground(Color.red);
        label5de8.setBackground(Color.MAGENTA);
        containerLabel6de8.setBackground(Color.cyan);
        label6de8.setBackground(Color.MAGENTA);
        containerLabel7de8.setBackground(Color.magenta);
        label7de8.setBackground(Color.MAGENTA);
        containerLabel8de8.setBackground(Color.lightGray);
        label8de8.setBackground(Color.MAGENTA);

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

        containerLabel1de8.add(label1de8);
        containerLabel2de8.add(label2de8);
        containerLabel3de8.add(label3de8);
        containerLabel4de8.add(label4de8);
        containerLabel5de8.add(label5de8);
        containerLabel6de8.add(label6de8);
        containerLabel7de8.add(label7de8);
        containerLabel8de8.add(label8de8);

        panelCentralIzquierdo.add(containerLabel1de8);
        panelCentralIzquierdo.add(containerLabel2de8);
        panelCentralIzquierdo.add(containerLabel3de8);
        panelCentralIzquierdo.add(containerLabel4de8);
        panelCentralIzquierdo.add(containerLabel5de8);
        panelCentralIzquierdo.add(containerLabel6de8);
        panelCentralIzquierdo.add(containerLabel7de8);
        panelCentralIzquierdo.add(containerLabel8de8);

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
