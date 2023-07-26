package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;


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

        GridLayout disposicionPanelDerechoCuadrado = new GridLayout();
        JPanel panelDerechoCuadrado = new JPanel();

        // Creamos un EmptyBorder con padding de 10 píxeles en todos los lados
        EmptyBorder paddingPanelDerechoCuadrado = new EmptyBorder(20, 20, 20, 20);
        // Aplicar el padding al panelDerechoCuadrado
        panelDerechoCuadrado.setBorder(paddingPanelDerechoCuadrado);


        GridLayout disposicionPanelInfoIzquierdo = new GridLayout(8, 2);
        JPanel panelInfoIzquierdo = new JPanel();

        JPanel containerPanelInfoIzquierdoPanelInterno1 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno1.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt1 = new GridBagConstraints();
        posLabInt1.gridx = 0;
        posLabInt1.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno2 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno2.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt2 = new GridBagConstraints();
        posLabInt2.gridx = 0;
        posLabInt2.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno3 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno3.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt3 = new GridBagConstraints();
        posLabInt3.gridx = 0;
        posLabInt3.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno4 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno4.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt4 = new GridBagConstraints();
        posLabInt4.gridx = 0;
        posLabInt4.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno5 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno5.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt5 = new GridBagConstraints();
        posLabInt5.gridx = 0;
        posLabInt5.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno6 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno6.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt6 = new GridBagConstraints();
        posLabInt6.gridx = 0;
        posLabInt6.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno7 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno7.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt7 = new GridBagConstraints();
        posLabInt7.gridx = 0;
        posLabInt7.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno8 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno8.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt8 = new GridBagConstraints();
        posLabInt8.gridx = 0;
        posLabInt8.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno9 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno9.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt9 = new GridBagConstraints();
        posLabInt9.gridx = 0;
        posLabInt9.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno10 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno10.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt10 = new GridBagConstraints();
        posLabInt10.gridx = 0;
        posLabInt10.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno11 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno11.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt11 = new GridBagConstraints();
        posLabInt11.gridx = 0;
        posLabInt11.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno12 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno12.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt12 = new GridBagConstraints();
        posLabInt12.gridx = 0;
        posLabInt12.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno13 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno13.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt13 = new GridBagConstraints();
        posLabInt13.gridx = 0;
        posLabInt13.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno14 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno14.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt14 = new GridBagConstraints();
        posLabInt14.gridx = 0;
        posLabInt14.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno15 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno15.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt15 = new GridBagConstraints();
        posLabInt15.gridx = 0;
        posLabInt15.gridy = 0;
        JPanel containerPanelInfoIzquierdoPanelInterno16 = new JPanel();
        containerPanelInfoIzquierdoPanelInterno16.setLayout(new GridBagLayout());
        GridBagConstraints posLabInt16 = new GridBagConstraints();
        posLabInt16.gridx = 0;
        posLabInt16.gridy = 0;

        JLabel panelInfoIzquierdoLabelInterna1 = new JLabel("Titulo:");
        JLabel panelInfoIzquierdoLabelInterna2 = new JLabel("Gladiator");
        JLabel panelInfoIzquierdoLabelInterna3 = new JLabel("Genero:");
        JLabel panelInfoIzquierdoLabelInterna4 = new JLabel("Accion");
        JLabel panelInfoIzquierdoLabelInterna5 = new JLabel("Año");
        JLabel panelInfoIzquierdoLabelInterna6 = new JLabel("1999");
        JLabel panelInfoIzquierdoLabelInterna7 = new JLabel("Duracion:");
        JLabel panelInfoIzquierdoLabelInterna8 = new JLabel("120:42");
        JLabel panelInfoIzquierdoLabelInterna9 = new JLabel("Director:");
        JLabel panelInfoIzquierdoLabelInterna10 = new JLabel("Ridley Scott");
        JLabel panelInfoIzquierdoLabelInterna11 = new JLabel("Actores Principales:");
        JLabel panelInfoIzquierdoLabelInterna12 = new JLabel("Russel Crowe, Joaquin Phoenix, ...... ....., ........ .....");
        JLabel panelInfoIzquierdoLabelInterna13 = new JLabel("Pegi:");
        JLabel panelInfoIzquierdoLabelInterna14 = new JLabel("Mayores de 18");
        JLabel panelInfoIzquierdoLabelInterna15 = new JLabel("Puntuacion:");
        JLabel panelInfoIzquierdoLabelInterna16 = new JLabel("...");


        JPanel panelInfoDerecho = new JPanel();

        JPanel panelInfoDerechoImagen = new JPanel();
        panelInfoDerechoImagen.setLayout(new GridBagLayout());

        ImageIcon imagenPortada = new ImageIcon("Gladiator.jpg");
        JLabel etiquetaImagenPortada = new JLabel(imagenPortada);


        GridBagConstraints posImagenPanelDerecho = new GridBagConstraints();
        posImagenPanelDerecho.gridx = 0;
        posImagenPanelDerecho.gridy = 1;
        posImagenPanelDerecho.anchor = GridBagConstraints.CENTER;
        posImagenPanelDerecho.insets = new Insets(60, 10, 10, 10);

        panelInfoDerechoImagen.add(etiquetaImagenPortada, posImagenPanelDerecho);

        // Redimensionar la imagen a la mitad
        Image imagenOriginal = imagenPortada.getImage();
        int nuevoAncho = imagenOriginal.getWidth(null) / 2 + 50;
        int nuevoAlto = imagenOriginal.getHeight(null) / 2 + 50;
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaIcon = new ImageIcon(imagenRedimensionada);

        // Actualizar la etiqueta de la imagen con el nuevo ImageIcon
        etiquetaImagenPortada.setIcon(imagenRedimensionadaIcon);

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setSize(1200, 800);
        panelPrincipalIzquierdo.setBackground(Color.orange);

        panelSuperiorIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 2 - 30, 120));
        panelSuperiorIzquierdo.setOpaque(true);

        botonIzquierdoPanelSuperiorIzquierdo.setPreferredSize(new Dimension(50, 50));
        botonIzquierdoPanelSuperiorIzquierdo.setBackground(Color.blue);

        botonDerechoPanelSuperiorIzquierdo.setPreferredSize(new Dimension(50, 50));
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

        panelInfoIzquierdo.setBackground(Color.red);

        containerPanelInfoIzquierdoPanelInterno1.setBackground(Color.green);
        containerPanelInfoIzquierdoPanelInterno2.setBackground(Color.red);
        containerPanelInfoIzquierdoPanelInterno3.setBackground(Color.magenta);
        containerPanelInfoIzquierdoPanelInterno4.setBackground(Color.lightGray);
        containerPanelInfoIzquierdoPanelInterno5.setBackground(Color.red);
        containerPanelInfoIzquierdoPanelInterno6.setBackground(Color.darkGray);
        containerPanelInfoIzquierdoPanelInterno7.setBackground(Color.magenta);
        containerPanelInfoIzquierdoPanelInterno8.setBackground(Color.cyan);
        containerPanelInfoIzquierdoPanelInterno9.setBackground(Color.pink);
        containerPanelInfoIzquierdoPanelInterno10.setBackground(Color.green);
        containerPanelInfoIzquierdoPanelInterno11.setBackground(Color.gray);
        containerPanelInfoIzquierdoPanelInterno12.setBackground(Color.orange);
        containerPanelInfoIzquierdoPanelInterno13.setBackground(Color.red);
        containerPanelInfoIzquierdoPanelInterno14.setBackground(Color.blue);
        containerPanelInfoIzquierdoPanelInterno15.setBackground(Color.magenta);
        containerPanelInfoIzquierdoPanelInterno16.setBackground(Color.green);

        panelInfoIzquierdoLabelInterna1.setBackground(Color.white); // Hacer visible

        panelInfoDerecho.setBackground(Color.yellow);
        panelInfoDerechoImagen.setBackground(Color.lightGray);

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

        panelDerechoCuadrado.add(panelInfoIzquierdo);

        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno1);
        containerPanelInfoIzquierdoPanelInterno1.add(panelInfoIzquierdoLabelInterna1);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno2);
        containerPanelInfoIzquierdoPanelInterno2.add(panelInfoIzquierdoLabelInterna2);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno3);
        containerPanelInfoIzquierdoPanelInterno3.add(panelInfoIzquierdoLabelInterna3);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno4);
        containerPanelInfoIzquierdoPanelInterno4.add(panelInfoIzquierdoLabelInterna4);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno5);
        containerPanelInfoIzquierdoPanelInterno5.add(panelInfoIzquierdoLabelInterna5);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno6);
        containerPanelInfoIzquierdoPanelInterno6.add(panelInfoIzquierdoLabelInterna6);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno7);
        containerPanelInfoIzquierdoPanelInterno7.add(panelInfoIzquierdoLabelInterna7);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno8);
        containerPanelInfoIzquierdoPanelInterno8.add(panelInfoIzquierdoLabelInterna8);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno9);
        containerPanelInfoIzquierdoPanelInterno9.add(panelInfoIzquierdoLabelInterna9);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno10);
        containerPanelInfoIzquierdoPanelInterno10.add(panelInfoIzquierdoLabelInterna10);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno11);
        containerPanelInfoIzquierdoPanelInterno11.add(panelInfoIzquierdoLabelInterna11);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno12);
        containerPanelInfoIzquierdoPanelInterno12.add(panelInfoIzquierdoLabelInterna12);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno13);
        containerPanelInfoIzquierdoPanelInterno13.add(panelInfoIzquierdoLabelInterna13);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno14);
        containerPanelInfoIzquierdoPanelInterno14.add(panelInfoIzquierdoLabelInterna14);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno15);
        containerPanelInfoIzquierdoPanelInterno15.add(panelInfoIzquierdoLabelInterna15);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno16);
        containerPanelInfoIzquierdoPanelInterno16.add(panelInfoIzquierdoLabelInterna16);


        panelDerechoCuadrado.add(panelInfoDerecho);
        panelInfoDerecho.add(panelInfoDerechoImagen);

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setLayout(disposicionFramePadreGridLayout);
        panelDerechoCuadrado.setLayout((disposicionPanelDerechoCuadrado));
        panelInfoIzquierdo.setLayout(disposicionPanelInfoIzquierdo);

        panelCentralIzquierdo.setPreferredSize(new Dimension(framePadre.getSize().width / 2 - 30, framePadre.getSize().height - 200));

        panelDerechoCuadrado.setPreferredSize(new Dimension(framePadre.getSize().width / 2 - 60, framePadre.getSize().height - 200));
        panelPrincipalDerecho.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        framePadre.setVisible(true);
    }
}
