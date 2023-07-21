package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pruebas {
    public static void main(String[] args) {

//---------------------------------------------------------------------------------------------------------------------------------------------------

        GridLayout disposicionFramePadreGridLayout = new GridLayout();
        JFrame framePadre = new JFrame();

        JPanel panelPrincipalIzquierdo = new JPanel();

        JPanel panelSuperiorIzquierdo = new JPanel();
        BoxLayout disposicionPanelSuperiorIzquierdoBoxLayout = new BoxLayout(panelSuperiorIzquierdo, BoxLayout.X_AXIS);
        panelSuperiorIzquierdo.setBackground(Color.RED);


        ImageIcon imagenBoton1 = new ImageIcon("people-icon-design-avatar-icon-person-icons-people-icons-are-set-in-trendy-flat-style-user-icon-set-vector.jpg");
        // Redimensionar la imagen
        Image imagenOriginalBoton1 = imagenBoton1.getImage();
        Image imagenRedimensionadaBoton1 = imagenOriginalBoton1.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaIconB1 = new ImageIcon(imagenRedimensionadaBoton1);
        JButton botonIzquierdoPanelSuperiorIzquierdo = new JButton(imagenRedimensionadaIconB1);
        botonIzquierdoPanelSuperiorIzquierdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicado el Boton 1. Boton superior izquierdo del panel de la izquierdo");
            }
        });


        ImageIcon imagenBoton2 = new ImageIcon("263100.png");
        // Redimensionar la imagen
        Image imagenOriginalBoton2 = imagenBoton2.getImage();
        Image imagenRedimensionadaBoton2 = imagenOriginalBoton2.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaIconB2 = new ImageIcon(imagenRedimensionadaBoton2);
        JButton botonDerechoPanelSuperiorIzquierdo = new JButton(imagenRedimensionadaIconB2);
        botonDerechoPanelSuperiorIzquierdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicado el Boton 2. Boton superior derecho del panel de la izquierda");
            }
        });




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


        JButton botonInferiorIzquierdo = new JButton("Boton 3");
        botonInferiorIzquierdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicado el Boton 3. Boton inferior del panel izquierdo");
            }
        });


        JPanel panelPrincipalDerecho = new JPanel();

        JPanel containerPanelDerechoLabel = new JPanel();
        JLabel panelDerechoLabel = new JLabel("Titulo App");

        JPanel panelDerechoCuadrado = new JPanel();

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setSize(1200, 800);
        panelPrincipalIzquierdo.setBackground(Color.orange);

        panelSuperiorIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 2 - 30, 120));
        panelSuperiorIzquierdo.setOpaque(true);

        botonIzquierdoPanelSuperiorIzquierdo.setPreferredSize(new Dimension(50,50));
        botonIzquierdoPanelSuperiorIzquierdo.setBackground(Color.blue);

        botonDerechoPanelSuperiorIzquierdo.setPreferredSize(new Dimension(50,50));
        botonDerechoPanelSuperiorIzquierdo.setBackground(Color.blue);

        containerPanelCentralIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 2, 600));
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

        botonInferiorIzquierdo.setOpaque(true);
//        botonInferiorIzquierdo.setContentAreaFilled(true);
        botonInferiorIzquierdo.setBorderPainted(false);
//        botonInferiorIzquierdo.setFocusPainted(false);
        botonInferiorIzquierdo.setBackground(Color.blue);
//        botonInferiorIzquierdo.setForeground(Color.blue); // Color texto

        panelPrincipalDerecho.setBackground(Color.blue);
        containerPanelDerechoLabel.setPreferredSize(new Dimension(framePadre.getWidth() / 2 - 60, 40));
        containerPanelDerechoLabel.setOpaque(false);
        panelDerechoCuadrado.setBackground(Color.GREEN);

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.add(panelPrincipalIzquierdo);
        framePadre.add(panelPrincipalDerecho);

        panelPrincipalIzquierdo.add(panelSuperiorIzquierdo);

        panelSuperiorIzquierdo.add(Box.createHorizontalGlue()); // Espacio para centrar los botones
        panelSuperiorIzquierdo.add(botonIzquierdoPanelSuperiorIzquierdo);
        panelSuperiorIzquierdo.add(Box.createRigidArea(new Dimension(225, 110))); // Espacio entre los botones
        panelSuperiorIzquierdo.add(botonDerechoPanelSuperiorIzquierdo);
        panelSuperiorIzquierdo.add(Box.createHorizontalGlue()); // Espacio para centrar los botones

        panelPrincipalIzquierdo.add(containerPanelCentralIzquierdo);
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

        label1de8.setPreferredSize(new Dimension(285, 150));
        label1de8.setVerticalAlignment(JLabel.CENTER);
        label1de8.setHorizontalAlignment(JLabel.CENTER);

        label2de8.setPreferredSize(new Dimension(285, 150));
        label2de8.setVerticalAlignment(JLabel.CENTER);
        label2de8.setHorizontalAlignment(JLabel.CENTER);

        label3de8.setPreferredSize(new Dimension(285, 150));
        label3de8.setVerticalAlignment(JLabel.CENTER);
        label3de8.setHorizontalAlignment(JLabel.CENTER);

        label4de8.setPreferredSize(new Dimension(285, 150));
        label4de8.setVerticalAlignment(JLabel.CENTER);
        label4de8.setHorizontalAlignment(JLabel.CENTER);

        label5de8.setPreferredSize(new Dimension(285, 150));
        label5de8.setVerticalAlignment(JLabel.CENTER);
        label5de8.setHorizontalAlignment(JLabel.CENTER);

        label6de8.setPreferredSize(new Dimension(285, 150));
        label6de8.setVerticalAlignment(JLabel.CENTER);
        label6de8.setHorizontalAlignment(JLabel.CENTER);

        label7de8.setPreferredSize(new Dimension(285, 150));
        label7de8.setVerticalAlignment(JLabel.CENTER);
        label7de8.setHorizontalAlignment(JLabel.CENTER);

        label8de8.setPreferredSize(new Dimension(285, 150));
        label8de8.setVerticalAlignment(JLabel.CENTER);
        label8de8.setHorizontalAlignment(JLabel.CENTER);


        panelPrincipalIzquierdo.add(botonInferiorIzquierdo);
        botonInferiorIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 2 - 30, 20));


        panelPrincipalDerecho.add(containerPanelDerechoLabel);
        panelPrincipalDerecho.add(panelDerechoCuadrado);
        containerPanelDerechoLabel.add(panelDerechoLabel);

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setLayout(disposicionFramePadreGridLayout);

        panelCentralIzquierdo.setPreferredSize(new Dimension(framePadre.getSize().width / 2 - 30, framePadre.getSize().height - 200));

        panelDerechoCuadrado.setPreferredSize(new Dimension(framePadre.getSize().width / 2 - 60, framePadre.getSize().height - 200));
        panelPrincipalDerecho.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        framePadre.setVisible(true);
    }
}
