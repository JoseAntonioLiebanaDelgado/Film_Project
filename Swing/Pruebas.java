package Swing;

import Models.Pelicula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.EmptyBorder;


public class Pruebas {

    public static void main(String[] args) {

//---------------------------------------------------------------------------------------------------------------------------------------------------

        JFrame framePadre = new JFrame();
        framePadre.setLayout(new BorderLayout());

        JPanel panelPrincipalIzquierdo = new JPanel();

        JPanel panelSuperiorIzquierdo = new JPanel();
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


        JPanel panelCentralIzquierdo = new JPanel();
        JPanel panelSuperiorCentralIzquierdo = new JPanel();
        JLabel labelPanelSuperiorCentralIzquierdo = new JLabel("Titulo Elemento");

        JPanel lineaNegraSeparadora = new JPanel();

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

        EmptyBorder paddingTituloElemento = new EmptyBorder(15, 0, 0, 100);
        labelPanelSuperiorCentralIzquierdo.setBorder(paddingTituloElemento);

        ImageIcon imagenReloj = new ImageIcon("crono.png");
        JLabel etiquetaImagenReloj = new JLabel(imagenReloj);

        // Redimensionar la imagen a la mitad
        Image imagenOriginalReloj = imagenReloj.getImage();
        int nuevoAnchoImagenReloj = imagenOriginalReloj.getWidth(null) / 4 - 100;
        int nuevoAltoImagenReloj = imagenOriginalReloj.getHeight(null) / 4 - 100;
        Image imagenRawRedimensionadaReloj = imagenOriginalReloj.getScaledInstance(nuevoAnchoImagenReloj, nuevoAltoImagenReloj, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaReloj = new ImageIcon(imagenRawRedimensionadaReloj);
        // Actualizar la etiqueta de la imagen con el nuevo ImageIcon
        etiquetaImagenReloj.setIcon(imagenRedimensionadaReloj);

        EmptyBorder paddingImagenReloj = new EmptyBorder(8, 0, 0, 0);
        etiquetaImagenReloj.setBorder(paddingImagenReloj);


        GridLayout disposicionPanelDerechoCuadrado = new GridLayout();
        JPanel panelDerechoCuadrado = new JPanel();


        // Creamos un EmptyBorder con padding de 10 píxeles en todos los lados
        EmptyBorder paddingPanelDerechoCuadrado = new EmptyBorder(10, 10, 10, 10);
        // Aplicar el padding al panelDerechoCuadrado
        panelDerechoCuadrado.setBorder(paddingPanelDerechoCuadrado);


        JButton botonTrailer = new JButton("Boton 4 - Trailer");
        botonTrailer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicado el Boton 4. Boton del trailer");
            }
        });


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


        JPanel panelInfoIzquierdoPanelInterno12 = new JPanel();
        panelInfoIzquierdoPanelInterno12.setLayout(new BoxLayout(panelInfoIzquierdoPanelInterno12, BoxLayout.Y_AXIS));
        JLabel actorLabel1 = new JLabel("Russer Crowe");
        JLabel actorLabel2 = new JLabel("Joaquin Phoenix");
        JLabel actorLabel3 = new JLabel("Actor 3");
        JLabel actorLabel4 = new JLabel("Actor 4");


        JLabel panelInfoIzquierdoLabelInterna13 = new JLabel("Pegi:");
        JLabel panelInfoIzquierdoLabelInterna14 = new JLabel("Mayores de 18");
        JLabel panelInfoIzquierdoLabelInterna15 = new JLabel("Puntuacion:");


        JPanel panelInfoIzquierdoPanelInterno16 = new JPanel();
        panelInfoIzquierdoPanelInterno16.setLayout(new BoxLayout(panelInfoIzquierdoPanelInterno16, BoxLayout.X_AXIS));

        ImageIcon imagenEstrella1 = new ImageIcon("EstrellaVacia.png");
        // Redimensionar la imagen
        Image imagenOriginalEstrella1 = imagenEstrella1.getImage();
        Image rawImagenRedimensionadaEstrella1 = imagenOriginalEstrella1.getScaledInstance(10, 10, Image.SCALE_SMOOTH);

        //Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaEstrella1 = new ImageIcon(rawImagenRedimensionadaEstrella1);
        JButton estrella1 = new JButton(imagenRedimensionadaEstrella1);
        estrella1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Has pulsado la estrella 1");
            }
        });

        ImageIcon imagenEstrella2 = new ImageIcon("EstrellaVacia.png");
        // Redimensionar la imagen
        Image imagenOriginalEstrella2 = imagenEstrella2.getImage();
        Image rawImagenRedimensionadaEstrella2 = imagenOriginalEstrella2.getScaledInstance(10, 10, Image.SCALE_SMOOTH);

        //Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaEstrella2 = new ImageIcon(rawImagenRedimensionadaEstrella2);
        JButton estrella2 = new JButton(imagenRedimensionadaEstrella2);
        estrella2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Has pulsado la estrella 2");
            }
        });

        ImageIcon imagenEstrella3 = new ImageIcon("EstrellaVacia.png");
        // Redimensionar la imagen
        Image imagenOriginalEstrella3 = imagenEstrella3.getImage();
        Image rawImagenRedimensionadaEstrella3 = imagenOriginalEstrella3.getScaledInstance(10, 10, Image.SCALE_SMOOTH);

        //Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaEstrella3 = new ImageIcon(rawImagenRedimensionadaEstrella3);
        JButton estrella3 = new JButton(imagenRedimensionadaEstrella3);
        estrella3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Has pulsado la estrella 3");
            }
        });

        ImageIcon imagenEstrella4 = new ImageIcon("EstrellaVacia.png");
        // Redimensionar la imagen
        Image imagenOriginalEstrella4 = imagenEstrella1.getImage();
        Image rawImagenRedimensionadaEstrella4 = imagenOriginalEstrella4.getScaledInstance(10, 10, Image.SCALE_SMOOTH);

        //Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaEstrella4 = new ImageIcon(rawImagenRedimensionadaEstrella4);
        JButton estrella4 = new JButton(imagenRedimensionadaEstrella4);
        estrella4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Has pulsado la estrella 4");
            }
        });

        ImageIcon imagenEstrella5 = new ImageIcon("EstrellaVacia.png");
        // Redimensionar la imagen
        Image imagenOriginalEstrella5 = imagenEstrella5.getImage();
        Image rawImagenRedimensionadaEstrella5 = imagenOriginalEstrella5.getScaledInstance(10, 10, Image.SCALE_SMOOTH);

        //Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaEstrella5 = new ImageIcon(rawImagenRedimensionadaEstrella5);
        JButton estrella5 = new JButton(imagenRedimensionadaEstrella5);
        estrella5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Has pulsado la estrella 5");
            }
        });


        JPanel panelInfoDerecho = new JPanel();

        JPanel panelInfoDerechoImagen = new JPanel();
        panelInfoDerechoImagen.setLayout(new BorderLayout());

        ImageIcon imagenPortada = new ImageIcon("Gladiator.jpg");
        JLabel etiquetaImagenPortada = new JLabel(imagenPortada);


        GridBagConstraints posImagenPanelDerecho = new GridBagConstraints();
        posImagenPanelDerecho.gridx = 0;
        posImagenPanelDerecho.gridy = 1;
        posImagenPanelDerecho.anchor = GridBagConstraints.CENTER;
        posImagenPanelDerecho.insets = new Insets(60, 10, 10, 10);

        panelInfoDerechoImagen.add(etiquetaImagenPortada, BorderLayout.CENTER);


        // Redimensionar la imagen a la mitad
        Image imagenOriginalPortada = imagenPortada.getImage();
        int nuevoAncho = imagenOriginalPortada.getWidth(null) / 2 + 50;
        int nuevoAlto = imagenOriginalPortada.getHeight(null) / 2 + 50;
        Image imagenRedimensionada = imagenOriginalPortada.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaIcon = new ImageIcon(imagenRedimensionada);

        // Actualizar la etiqueta de la imagen con el nuevo ImageIcon
        etiquetaImagenPortada.setIcon(imagenRedimensionadaIcon);

        EmptyBorder paddingEncimaImagen = new EmptyBorder(75, 0, 0, 0);
        etiquetaImagenPortada.setBorder(paddingEncimaImagen);


//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setSize(1200, 800);
        panelPrincipalIzquierdo.setBackground(Color.orange);

        panelSuperiorIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 2, 120));
        panelSuperiorIzquierdo.setOpaque(true);

        panelSuperiorCentralIzquierdo.setPreferredSize(new Dimension(350, 60));


        panelCentralIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 4 + 75, 600));
        panelCentralIzquierdo.setOpaque(true);
        panelCentralIzquierdo.setBackground(Color.white);

        botonIzquierdoPanelSuperiorIzquierdo.setPreferredSize(new Dimension(50, 50));
        botonIzquierdoPanelSuperiorIzquierdo.setBackground(Color.blue);

        botonDerechoPanelSuperiorIzquierdo.setPreferredSize(new Dimension(50, 50));
        botonDerechoPanelSuperiorIzquierdo.setBackground(Color.blue);

        panelSuperiorCentralIzquierdo.setBackground(Color.GREEN);
        panelSuperiorCentralIzquierdo.setOpaque(true);
        labelPanelSuperiorCentralIzquierdo.setBackground(Color.red);

        lineaNegraSeparadora.setBackground(Color.BLACK);
        lineaNegraSeparadora.setPreferredSize(new Dimension(350, 5));


        botonInferiorIzquierdo.setOpaque(true);
//        botonInferiorIzquierdo.setContentAreaFilled(true);
        botonInferiorIzquierdo.setBorderPainted(false);
//        botonInferiorIzquierdo.setFocusPainted(false);
        botonInferiorIzquierdo.setBackground(Color.blue);
//        botonInferiorIzquierdo.setForeground(Color.blue); // Color texto

        panelPrincipalDerecho.setBackground(Color.blue);
        containerPanelDerechoLabel.setPreferredSize(new Dimension(framePadre.getWidth() / 2 - 60, 30));
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

        estrella1.setBackground(Color.CYAN);
        estrella2.setBackground(Color.CYAN);
        estrella3.setBackground(Color.CYAN);
        estrella4.setBackground(Color.CYAN);
        estrella5.setBackground(Color.CYAN);


        panelInfoDerecho.setBackground(Color.yellow);
        panelInfoDerechoImagen.setBackground(Color.lightGray);


        botonTrailer.setPreferredSize(new Dimension(70, 30));

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.add(panelPrincipalIzquierdo, BorderLayout.WEST);
        framePadre.add(panelPrincipalDerecho, BorderLayout.CENTER);

        panelPrincipalIzquierdo.add(panelSuperiorIzquierdo);

//        panelSuperiorIzquierdo.add(Box.createHorizontalGlue()); // Espacio para centrar los botones
        panelSuperiorIzquierdo.add(botonIzquierdoPanelSuperiorIzquierdo);
        panelSuperiorIzquierdo.add(Box.createRigidArea(new Dimension(150, 110))); // Espacio entre los botones
        panelSuperiorIzquierdo.add(botonDerechoPanelSuperiorIzquierdo);
//        panelSuperiorIzquierdo.add(Box.createHorizontalGlue()); // Espacio para centrar los botones

        panelPrincipalIzquierdo.add(panelCentralIzquierdo);
        panelCentralIzquierdo.add(panelSuperiorCentralIzquierdo);
        panelSuperiorCentralIzquierdo.add(labelPanelSuperiorCentralIzquierdo);
        panelSuperiorCentralIzquierdo.add(etiquetaImagenReloj);

        panelCentralIzquierdo.add(lineaNegraSeparadora);

        JPanel panelCreado = crearPanel(2);
        panelCentralIzquierdo.add(panelCreado);

        panelPrincipalIzquierdo.add(botonInferiorIzquierdo);
        botonInferiorIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 3 - 25, 40));


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
        containerPanelInfoIzquierdoPanelInterno12.add(panelInfoIzquierdoPanelInterno12);

        panelInfoIzquierdoPanelInterno12.add(actorLabel1);
        panelInfoIzquierdoPanelInterno12.add(actorLabel2);
        panelInfoIzquierdoPanelInterno12.add(actorLabel3);
        panelInfoIzquierdoPanelInterno12.add(actorLabel4);

        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno13);
        containerPanelInfoIzquierdoPanelInterno13.add(panelInfoIzquierdoLabelInterna13);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno14);
        containerPanelInfoIzquierdoPanelInterno14.add(panelInfoIzquierdoLabelInterna14);
        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno15);
        containerPanelInfoIzquierdoPanelInterno15.add(panelInfoIzquierdoLabelInterna15);

        panelInfoIzquierdo.add(containerPanelInfoIzquierdoPanelInterno16);
        containerPanelInfoIzquierdoPanelInterno16.add(panelInfoIzquierdoPanelInterno16);
        containerPanelInfoIzquierdoPanelInterno16.setOpaque(false); // Establecer el fondo como transparente
        panelInfoIzquierdoPanelInterno16.setOpaque(false); // Configurar el fondo del contenedor como transparente
        panelInfoIzquierdoPanelInterno16.add(estrella1);
        panelInfoIzquierdoPanelInterno16.add(estrella2);
        panelInfoIzquierdoPanelInterno16.add(estrella3);
        panelInfoIzquierdoPanelInterno16.add(estrella4);
        panelInfoIzquierdoPanelInterno16.add(estrella5);

        estrella1.setPreferredSize(new Dimension(20, 10));
        estrella2.setPreferredSize(new Dimension(20, 10));
        estrella3.setPreferredSize(new Dimension(20, 10));
        estrella4.setPreferredSize(new Dimension(20, 10));
        estrella5.setPreferredSize(new Dimension(20, 10));


        // Configuramos los botones de estrella para que no muestren ningún borde
        estrella1.setBorderPainted(false);
        estrella2.setBorderPainted(false);
        estrella3.setBorderPainted(false);
        estrella4.setBorderPainted(false);
        estrella5.setBorderPainted(false);


        panelDerechoCuadrado.add(panelInfoDerecho);
        panelInfoDerecho.add(panelInfoDerechoImagen);
        panelDerechoCuadrado.add(botonTrailer);
        panelInfoDerechoImagen.add(botonTrailer, BorderLayout.SOUTH);


//---------------------------------------------------------------------------------------------------------------------------------------------------

        // Ajustamos el tamaño de los paneles principales en función del porcentaje del framePadre
        int frameWidth = 1200;
        int frameHeight = 800;
        int panelIzquierdoWidth = frameWidth / 4 + 100; // 25% del ancho del frame + 100 px
        int panelDerechoWidth = frameWidth - panelIzquierdoWidth;

//      El constructor de Dimension toma dos argumentos, que representan el ancho y la altura del tamaño deseado para el componente (panel).
        panelPrincipalIzquierdo.setPreferredSize(new Dimension(panelIzquierdoWidth, frameHeight));
        panelPrincipalDerecho.setPreferredSize(new Dimension(panelDerechoWidth, frameHeight));


        panelDerechoCuadrado.setLayout((disposicionPanelDerechoCuadrado));
        panelInfoIzquierdo.setLayout(disposicionPanelInfoIzquierdo);


        panelDerechoCuadrado.setPreferredSize(new Dimension(framePadre.getSize().width / 2 + 100, framePadre.getSize().height - 150));
        panelPrincipalDerecho.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));


//---------------------------------------------------------------------------------------------------------------------------------------------------


        framePadre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        framePadre.pack(); // Esto sirve para ajustar el tamaño del frame para que se adapte al contenido

        framePadre.setVisible(true);
    }

    private static JPanel crearPanel(int numeroPaneles) {

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(350, 524));
        panel1.setBackground(Color.blue);

        JLabel label1 = new JLabel("Nombre Peli 1");
        label1.setPreferredSize(new Dimension(160, 40));
        label1.setBackground(Color.RED);
        label1.setOpaque(true);
        JLabel label2 = new JLabel("Duracion Peli 1");
        label2.setPreferredSize(new Dimension(160, 40));
        label2.setBackground(Color.green);
        label2.setOpaque(true);

        panel1.add(label1);
        panel1.add(label2);

        return panel1;
    }
}




