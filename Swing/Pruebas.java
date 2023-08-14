package Swing;

import ENUM.Genero;
import ENUM.PalabraClave;
import ENUM.Pegi;
import Models.Pelicula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.border.EmptyBorder;

public class Pruebas {

    public static void main(String[] args) {

//---------------------------------------------------------------------------------------------------------------------------------------------------

        JFrame framePadre = new JFrame();
        framePadre.setLayout(new BorderLayout());

        JPanel panelPrincipalIzquierdo = new JPanel();

        JPanel panelSuperiorIzquierdo = new JPanel();

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

        JPanel lineaNegraSeparadora = new JPanel();

        ArrayList<Pelicula> listaDummy = new ArrayList<>();
        ArrayList<String> repartoSalvarAlSoldadoRyan = new ArrayList<>();
        repartoSalvarAlSoldadoRyan.add("Tom Hanks");
        repartoSalvarAlSoldadoRyan.add("Matt Damon");
        repartoSalvarAlSoldadoRyan.add("Tom Sizemore");
        repartoSalvarAlSoldadoRyan.add("Vin Diesel");
        repartoSalvarAlSoldadoRyan.add("Edward Burns");

        Pelicula peli1 = new Pelicula("Soldado",
                Genero.BELICO,
                1998,
                "169",
                "Steven Spielberg",
                repartoSalvarAlSoldadoRyan,
                Pegi.TRECE,
                4);

        Pelicula peli2 = new Pelicula("Gladiator",
                Genero.BELICO,
                1998,
                "200",
                "Steven Spielberg",
                repartoSalvarAlSoldadoRyan,
                Pegi.TRECE,
                4);

        listaDummy.add(peli1);
        listaDummy.add(peli2);

        JPanel panelCreado = crearPanelConLabels(listaDummy);

        JButton botonAñadir = new JButton("Boton 3 - Añadir");
        botonAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicado el Boton 3. Boton inferior del panel izquierdo");
            }
        });

//---

        JPanel panelPrincipalDerecho = new JPanel();

        GridLayout disposicionPanelCuadradoDerechoInfoGeneral = new GridLayout();
        JPanel panelCuadradoDerechoInfoGeneral = new JPanel();

        // Creamos un EmptyBorder con padding de 10 píxeles en todos los lados
        EmptyBorder paddingPanelCuadradoDerechoInfoGeneral = new EmptyBorder(10, 10, 10, 10);
        // Aplicar el padding al panelDerechoCuadrado
        panelCuadradoDerechoInfoGeneral.setBorder(paddingPanelCuadradoDerechoInfoGeneral);

        GridLayout disposicionPanelInfoIzquierdoDelPanelPrincipalDerecho = new GridLayout(8, 2);
        JPanel panelInfoIzquierdoDelPanelCuadradoGeneral = new JPanel();

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


        // ImageIcon para la imagen de la estrella vacía
        ImageIcon imagenEstrellaVacia = new ImageIcon("EstrellaVacia.png");
        Image imagenOriginalEstrellaVacia = imagenEstrellaVacia.getImage();
        Image rawImagenRedimensionadaEstrellaVacia = imagenOriginalEstrellaVacia.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
        ImageIcon estrellaImagenFinal = new ImageIcon(rawImagenRedimensionadaEstrellaVacia);

        // Crear botones con la imagen EstrellaVacia.png
        JButton estrella1 = new JButton(estrellaImagenFinal);
        JButton estrella2 = new JButton(estrellaImagenFinal);
        JButton estrella3 = new JButton(estrellaImagenFinal);
        JButton estrella4 = new JButton(estrellaImagenFinal);
        JButton estrella5 = new JButton(estrellaImagenFinal);

        ArrayList<JButton> listaBotones = new ArrayList<>();

        listaBotones.add(estrella1);
        listaBotones.add(estrella2);
        listaBotones.add(estrella3);
        listaBotones.add(estrella4);
        listaBotones.add(estrella5);

        ArrayList<Boolean> estrellasPintadas = new ArrayList<>();
        estrellasPintadas.add(false);
        estrellasPintadas.add(false);
        estrellasPintadas.add(false);
        estrellasPintadas.add(false);
        estrellasPintadas.add(false);

        estrella1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int indiceBoton = 0;

                // 1 PARTE:
                // Comprobamos que no hay estrellas siguientes encendidas despues de la 1
                boolean estrellaSiguienteEncendida = comprobarSiListaBoolEsTrue(estrellasPintadas, indiceBoton);

                //Desmarcamos todas las posiciones despues de la primera (Las pone en false)
                desmarcarPosicionesPosteriores(indiceBoton, estrellasPintadas);

                // 2 PARTE:
                // El boton tiene 3 casuisticas :
                //----- -El boton esta desmarcado y hay que pintarlo
                //----- -El boton esta marcado pero tiene botones superiores marcados, por ejemplo tener 2 estrellas marcadas y pulsar la 1 de nuevo
                //----- -El boton este marcado el solo
                if (!estrellasPintadas.get(indiceBoton)) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else if (estrellaSiguienteEncendida) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                }
            }
        });

        estrella2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int indiceBoton = 1;

                // 1 PARTE:
                // Comprobamos que no hay estrellas siguientes encendidas despues de la 2
                boolean estrellaSiguienteEncendida = comprobarSiListaBoolEsTrue(estrellasPintadas, indiceBoton);

                //Desmarcamos todas las posiciones despues de la segunda (Las pone en false)
                desmarcarPosicionesPosteriores(indiceBoton, estrellasPintadas);

                // 2 PARTE:
                // El boton tiene 3 casuisticas :
                //----- -El boton esta desmarcado y hay que pintarlo
                //----- -El boton esta marcado pero tiene botones superiores marcados, por ejemplo tener 2 estrellas marcadas y pulsar la 1 de nuevo
                //----- -El boton este marcado el solo
                if (!estrellasPintadas.get(indiceBoton)) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else if (estrellaSiguienteEncendida) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                }
            }
        });

        estrella3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int indiceBoton = 2;

                // 1 PARTE:
                // Comprobamos que no hay estrellas siguientes encendidas despues de la 3
                boolean estrellaSiguienteEncendida = comprobarSiListaBoolEsTrue(estrellasPintadas, indiceBoton);

                //Desmarcamos todas las posiciones despues de la tercera (Las pone en false)
                desmarcarPosicionesPosteriores(indiceBoton, estrellasPintadas);

                // 2 PARTE:
                // El boton tiene 3 casuisticas :
                //----- -El boton esta desmarcado y hay que pintarlo
                //----- -El boton esta marcado pero tiene botones superiores marcados, por ejemplo tener 2 estrellas marcadas y pulsar la 1 de nuevo
                //----- -El boton este marcado el solo
                if (!estrellasPintadas.get(indiceBoton)) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else if (estrellaSiguienteEncendida) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                }
            }
        });

        estrella4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int indiceBoton = 3;

                // 1 PARTE:
                // Comprobamos que no hay estrellas siguientes encendidas despues de la 4
                boolean estrellaSiguienteEncendida = comprobarSiListaBoolEsTrue(estrellasPintadas, indiceBoton);

                //Desmarcamos todas las posiciones despues de la cuarta (Las pone en false)
                desmarcarPosicionesPosteriores(indiceBoton, estrellasPintadas);

                // 2 PARTE:
                // El boton tiene 3 casuisticas :
                //----- -El boton esta desmarcado y hay que pintarlo
                //----- -El boton esta marcado pero tiene botones superiores marcados, por ejemplo tener 2 estrellas marcadas y pulsar la 1 de nuevo
                //----- -El boton este marcado el solo
                if (!estrellasPintadas.get(indiceBoton)) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else if (estrellaSiguienteEncendida) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                }
            }
        });

        estrella5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int indiceBoton = 4;

                // 1 PARTE:
                // Comprobamos que no hay estrellas siguientes encendidas despues de la 5
                boolean estrellaSiguienteEncendida = comprobarSiListaBoolEsTrue(estrellasPintadas, indiceBoton);

                //Desmarcamos todas las posiciones despues de la quinta (Las pone en false)
                desmarcarPosicionesPosteriores(indiceBoton, estrellasPintadas);

                // 2 PARTE:
                // El boton tiene 3 casuisticas :
                //----- -El boton esta desmarcado y hay que pintarlo
                //----- -El boton esta marcado pero tiene botones superiores marcados, por ejemplo tener 2 estrellas marcadas y pulsar la 1 de nuevo
                //----- -El boton este marcado el solo
                if (!estrellasPintadas.get(indiceBoton)) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else if (estrellaSiguienteEncendida) {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                    pintarEstrellas(listaBotones, indiceBoton, estrellasPintadas);

                } else {
                    despintarEstrellas(listaBotones, estrellaImagenFinal, estrellasPintadas);
                }
            }
        });


        JPanel panelInfoDerecho = new JPanel();

        JPanel containerPanelDerechoLabel = new JPanel();

        JLabel labelPanelDerecho = new JLabel("Titulo App");

        JPanel panelInfoDerechoImagen = new JPanel();
        panelInfoDerechoImagen.setLayout(new BorderLayout());

        ImageIcon imagenPortada = new ImageIcon("Gladiator.jpg");
        JLabel etiquetaImagenPortada = new JLabel(imagenPortada);

        GridBagConstraints posImagenPanelDerecho = new GridBagConstraints();
        posImagenPanelDerecho.gridx = 0;
        posImagenPanelDerecho.gridy = 1;
        posImagenPanelDerecho.anchor = GridBagConstraints.CENTER;
        posImagenPanelDerecho.insets = new Insets(60, 10, 10, 10);

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

        JButton botonTrailer = new JButton("Boton 4 - Trailer");
        botonTrailer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has clicado el Boton 4. Boton del trailer");
            }
        });

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setSize(1200, 800);

        // Ajustamos el tamaño de los paneles principales en función del porcentaje del framePadre
        int frameWidth = 1200;
        int frameHeight = 800;
        int panelIzquierdoWidth = frameWidth / 4 + 100; // 25% del ancho del frame + 100 px
        int panelDerechoWidth = frameWidth - panelIzquierdoWidth;

        // El constructor de Dimension toma dos argumentos, que representan el ancho y la altura del tamaño deseado para el componente (panel).
        panelPrincipalIzquierdo.setPreferredSize(new Dimension(panelIzquierdoWidth, frameHeight));

        panelSuperiorIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 3 - 50, 120));

        botonIzquierdoPanelSuperiorIzquierdo.setPreferredSize(new Dimension(50, 50));

        botonDerechoPanelSuperiorIzquierdo.setPreferredSize(new Dimension(50, 50));

        panelCentralIzquierdo.setPreferredSize(new Dimension(framePadre.getWidth() / 4 + 75, 600));

        panelSuperiorCentralIzquierdo.setPreferredSize(new Dimension(350, 60));

        EmptyBorder paddingTituloElemento = new EmptyBorder(15, 0, 0, 100);
        labelPanelSuperiorCentralIzquierdo.setBorder(paddingTituloElemento);

        lineaNegraSeparadora.setPreferredSize(new Dimension(350, 5));

        botonAñadir.setPreferredSize(new Dimension(framePadre.getWidth() / 3 - 50, 50));

//---

        panelPrincipalDerecho.setPreferredSize(new Dimension(panelDerechoWidth, frameHeight - 1500));
        panelPrincipalDerecho.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));

//        labelPanelDerecho.setPreferredSize(new Dimension(0,0));

        containerPanelDerechoLabel.setPreferredSize(new Dimension(framePadre.getWidth() / 2 - 60, 30));

        panelCuadradoDerechoInfoGeneral.setLayout((disposicionPanelCuadradoDerechoInfoGeneral));
        panelCuadradoDerechoInfoGeneral.setPreferredSize(new Dimension(framePadre.getSize().width / 2 + 100, framePadre.getSize().height - 150));

        panelInfoIzquierdoDelPanelCuadradoGeneral.setLayout(disposicionPanelInfoIzquierdoDelPanelPrincipalDerecho);

        estrella1.setPreferredSize(new Dimension(20, 10));
        estrella2.setPreferredSize(new Dimension(20, 10));
        estrella3.setPreferredSize(new Dimension(20, 10));
        estrella4.setPreferredSize(new Dimension(20, 10));
        estrella5.setPreferredSize(new Dimension(20, 10));

//---------------------------------------------------------------------------------------------------------------------------------------------------

        panelSuperiorIzquierdo.setOpaque(true);
        panelCentralIzquierdo.setOpaque(true);
        panelSuperiorCentralIzquierdo.setOpaque(true);
        botonAñadir.setOpaque(true);
        botonAñadir.setBorderPainted(false);

//---

        containerPanelDerechoLabel.setOpaque(false);
        containerPanelInfoIzquierdoPanelInterno16.setOpaque(false); // Establecer el fondo como transparente
        panelInfoIzquierdoPanelInterno16.setOpaque(false); // Configurar el fondo del contenedor como transparente

        estrella1.setBorderPainted(false);
        estrella2.setBorderPainted(false);
        estrella3.setBorderPainted(false);
        estrella4.setBorderPainted(false);
        estrella5.setBorderPainted(false);

//---------------------------------------------------------------------------------------------------------------------------------------------------

        panelPrincipalIzquierdo.setBackground(Color.darkGray);

        panelSuperiorIzquierdo.setBackground(Color.decode("#117A65"));
        botonIzquierdoPanelSuperiorIzquierdo.setBackground(Color.darkGray);
        botonDerechoPanelSuperiorIzquierdo.setBackground(Color.darkGray);

        panelCentralIzquierdo.setBackground(Color.darkGray);
        panelSuperiorCentralIzquierdo.setBackground(Color.decode("#117A65"));
        labelPanelSuperiorCentralIzquierdo.setBackground(Color.darkGray);

        lineaNegraSeparadora.setBackground(Color.darkGray);

        botonAñadir.setBackground(Color.decode("#117A65"));

//---

        panelPrincipalDerecho.setBackground(Color.darkGray);

        labelPanelDerecho.setForeground(Color.decode("#117A65"));

        panelCuadradoDerechoInfoGeneral.setBackground(Color.darkGray);

        panelInfoIzquierdoDelPanelCuadradoGeneral.setBackground(Color.decode("#117A65"));

        containerPanelInfoIzquierdoPanelInterno1.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno2.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno3.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno4.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno5.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno6.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno7.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno8.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno9.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno10.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno11.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno12.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno13.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno14.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno15.setBackground(Color.decode("#117A65"));
        containerPanelInfoIzquierdoPanelInterno16.setBackground(Color.decode("#117A65"));

        estrella1.setBackground(Color.CYAN);
        estrella2.setBackground(Color.CYAN);
        estrella3.setBackground(Color.CYAN);
        estrella4.setBackground(Color.CYAN);
        estrella5.setBackground(Color.CYAN);

        panelInfoDerecho.setBackground(Color.decode("#117A65"));

        panelInfoDerechoImagen.setBackground(Color.decode("#117A65"));

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.add(panelPrincipalIzquierdo, BorderLayout.WEST);

        panelPrincipalIzquierdo.add(panelSuperiorIzquierdo);
        panelSuperiorIzquierdo.add(botonIzquierdoPanelSuperiorIzquierdo);
        panelSuperiorIzquierdo.add(Box.createRigidArea(new Dimension(150, 110))); // Espacio entre los botones
        panelSuperiorIzquierdo.add(botonDerechoPanelSuperiorIzquierdo);

        panelPrincipalIzquierdo.add(panelCentralIzquierdo);
        panelCentralIzquierdo.add(panelSuperiorCentralIzquierdo);
        panelSuperiorCentralIzquierdo.add(labelPanelSuperiorCentralIzquierdo);
        panelSuperiorCentralIzquierdo.add(etiquetaImagenReloj);

        panelCentralIzquierdo.add(lineaNegraSeparadora);
        panelCentralIzquierdo.add(panelCreado);

        panelPrincipalIzquierdo.add(botonAñadir);

//---

        framePadre.add(panelPrincipalDerecho, BorderLayout.CENTER);

        panelPrincipalDerecho.add(containerPanelDerechoLabel);
        containerPanelDerechoLabel.add(labelPanelDerecho);

        panelPrincipalDerecho.add(panelCuadradoDerechoInfoGeneral);
        panelCuadradoDerechoInfoGeneral.add(panelInfoIzquierdoDelPanelCuadradoGeneral);

        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno1);
        containerPanelInfoIzquierdoPanelInterno1.add(panelInfoIzquierdoLabelInterna1);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno2);
        containerPanelInfoIzquierdoPanelInterno2.add(panelInfoIzquierdoLabelInterna2);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno3);
        containerPanelInfoIzquierdoPanelInterno3.add(panelInfoIzquierdoLabelInterna3);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno4);
        containerPanelInfoIzquierdoPanelInterno4.add(panelInfoIzquierdoLabelInterna4);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno5);
        containerPanelInfoIzquierdoPanelInterno5.add(panelInfoIzquierdoLabelInterna5);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno6);
        containerPanelInfoIzquierdoPanelInterno6.add(panelInfoIzquierdoLabelInterna6);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno7);
        containerPanelInfoIzquierdoPanelInterno7.add(panelInfoIzquierdoLabelInterna7);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno8);
        containerPanelInfoIzquierdoPanelInterno8.add(panelInfoIzquierdoLabelInterna8);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno9);
        containerPanelInfoIzquierdoPanelInterno9.add(panelInfoIzquierdoLabelInterna9);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno10);
        containerPanelInfoIzquierdoPanelInterno10.add(panelInfoIzquierdoLabelInterna10);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno11);
        containerPanelInfoIzquierdoPanelInterno11.add(panelInfoIzquierdoLabelInterna11);

        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno12);
        containerPanelInfoIzquierdoPanelInterno12.add(panelInfoIzquierdoPanelInterno12);

        panelInfoIzquierdoPanelInterno12.add(actorLabel1);
        panelInfoIzquierdoPanelInterno12.add(actorLabel2);
        panelInfoIzquierdoPanelInterno12.add(actorLabel3);
        panelInfoIzquierdoPanelInterno12.add(actorLabel4);

        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno13);
        containerPanelInfoIzquierdoPanelInterno13.add(panelInfoIzquierdoLabelInterna13);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno14);
        containerPanelInfoIzquierdoPanelInterno14.add(panelInfoIzquierdoLabelInterna14);
        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno15);
        containerPanelInfoIzquierdoPanelInterno15.add(panelInfoIzquierdoLabelInterna15);

        panelInfoIzquierdoDelPanelCuadradoGeneral.add(containerPanelInfoIzquierdoPanelInterno16);
        containerPanelInfoIzquierdoPanelInterno16.add(panelInfoIzquierdoPanelInterno16);

        panelInfoIzquierdoPanelInterno16.add(estrella1);
        panelInfoIzquierdoPanelInterno16.add(estrella2);
        panelInfoIzquierdoPanelInterno16.add(estrella3);
        panelInfoIzquierdoPanelInterno16.add(estrella4);
        panelInfoIzquierdoPanelInterno16.add(estrella5);

        panelCuadradoDerechoInfoGeneral.add(panelInfoDerecho);
        panelInfoDerecho.add(panelInfoDerechoImagen);

        panelInfoDerechoImagen.add(etiquetaImagenPortada, BorderLayout.CENTER);

        panelCuadradoDerechoInfoGeneral.add(botonTrailer);
        panelInfoDerechoImagen.add(botonTrailer, BorderLayout.SOUTH);

//---------------------------------------------------------------------------------------------------------------------------------------------------

        framePadre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        framePadre.pack(); // Esto sirve para ajustar el tamaño del frame para que se adapte al contenido
        framePadre.setVisible(true);
    }

    private static JPanel crearPanelConLabels(ArrayList<Pelicula> lista) {

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(350, 510));
        panel1.setBackground(Color.decode("#117A65"));

        for (int i = 0; i < lista.size(); i++) {

            JLabel labelTitulo = new JLabel(lista.get(i).getNombre());
            labelTitulo.setPreferredSize(new Dimension(160, 40));
            labelTitulo.setBackground(Color.decode("#117A65"));
//            labelTitulo.setForeground(Color.decode("#909497"));
            labelTitulo.setOpaque(true);

            panel1.add(labelTitulo);

            JLabel labelDuracion = new JLabel(lista.get(i).getDuracionMinutos());
            labelDuracion.setPreferredSize(new Dimension(160, 40));
            labelDuracion.setBackground(Color.decode("#117A65"));
            labelDuracion.setOpaque(true);

            panel1.add(labelDuracion);
        }
        return panel1;
    }

    private static void pintarEstrellas(ArrayList<JButton> listaBotones, int indiceBoton, ArrayList<Boolean> listaBool) {

        ImageIcon imagenEstrellaPintada = new ImageIcon("EstrellaPintada.png");
        Image imagenOriginalEstrellaPintada = imagenEstrellaPintada.getImage();
        Image rawImagenRedimensionadaEstrellaPintada = imagenOriginalEstrellaPintada.getScaledInstance(12, 12, Image.SCALE_SMOOTH);
        ImageIcon imagenRedimensionadaEstrellaPintada = new ImageIcon(rawImagenRedimensionadaEstrellaPintada);

        // Pinta solo las estrellas hasta el índice especificado
        for (int i = 0; i <= indiceBoton; i++) {
            listaBotones.get(i).setIcon(imagenRedimensionadaEstrellaPintada);
            listaBool.set(i, true);
        }
    }

    private static void despintarEstrellas(ArrayList<JButton> listaBotones, ImageIcon imagen, ArrayList<Boolean> listaEstados) {

        for (int i = 0; i < listaBotones.size(); i++) {
            listaBotones.get(i).setIcon(imagen);
            listaEstados.set(i, false);
        }
    }

    private static Boolean comprobarSiListaBoolEsTrue(ArrayList<Boolean> listaBool, int index) {
        for (int i = index + 1; i < listaBool.size(); i++) {
            if (listaBool.get(i)) {
                return true;
            }
        }
        return false;
    }

    private static void desmarcarPosicionesPosteriores(int indice, ArrayList<Boolean> listaBool) {
        for (int i = indice + 1; i < listaBool.size(); i++) {
            listaBool.set(i, false);
        }
    }

    public static void imprimirEstadoEstrellas(ArrayList<JButton> listaBotones, ArrayList<Boolean> estrellasPintadas, PalabraClave palabraClave) {

        System.out.println("Estado de las estrellas " + palabraClave.toString().toLowerCase() + " de pulsar:");

        for (int i = 0; i < listaBotones.size(); i++) {
            boolean estado = estrellasPintadas.get(i);
            System.out.println("Botón " + (i + 1) + ": " + estado);
        }
        System.out.println("---");
    }
}









