package UserFrame;

import ENUM.Genero;
import ENUM.Pegi;
import Models.Pelicula;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class VentanaInfo {
    public static void main(String[] args) {
        /*SwingUtilities.invokeLater(() ->
        { createAndShowGUI(); }); Esto se encarga de garantizar que la creación y la presentación de la interfaz gráfica
        (ventanas, botones, etc..), se realice correctamente dentro del contexto de la arquitectura de Swing.*/
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    ArrayList<String> x = new ArrayList<>();
    Pelicula peli = new Pelicula("El señor de los anillos: La comunidad del anillo",
            Genero.ACCION,
            2001,
            "226",
            "Peter Jakson",
            x,
            Pegi.DOCE,
            4);

    public static void createAndShowGUI() {

        JFrame frame = new JFrame("Añadir Informacion");

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        /* Utilizamos el método setBorder para establecer un margen o borde alrededor del panelPrincipal.
         A continuación llamamos a la clase BorderFactory para poder utilizar el método createEmptyBorder
         que se encarga de dar el margen por los 4 lados.*/
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        // Creamos un nuevo panelCentral en el cual utilizaremos GridLayout para crear una cuadrícula.
        JPanel panelCentral = new JPanel(new GridLayout(7, 2));

        //Creamos Jlabels, JTextFields y JRadioButtons.
        JLabel nombreLabel = new JLabel("Nombre");
        JTextField nombreTextField = new JTextField();

        JLabel generoLabel = new JLabel("Genero");
        JPanel generoPanel = new JPanel(new GridLayout(4, 2));
        ButtonGroup generoButtonGroup = new ButtonGroup();
        JRadioButton generoAccionButton = new JRadioButton("Accion");
        JRadioButton generoAventuraButton = new JRadioButton("Aventura");
        JRadioButton generoFantasiaButton = new JRadioButton("Fantasia");
        JRadioButton generoComediaButton = new JRadioButton("Comedia");
        JRadioButton generoTerrorButton = new JRadioButton("Terror");
        JRadioButton generoApocalipsisButton = new JRadioButton("Apocalipsis");
        JRadioButton generoDramaButton = new JRadioButton("Drama");
        JRadioButton generoRomanceButton = new JRadioButton("Romance");
        JRadioButton generoBelicoButton = new JRadioButton("Belico");
        JRadioButton generoMusicalButton = new JRadioButton("Musical");
        JRadioButton generoHistoricoButton = new JRadioButton("Historico");
        JRadioButton generoInfantilButton = new JRadioButton("Infantil");

        JLabel lanzamientoLabel = new JLabel("Año de lanzamiento (Numerico)");
        JTextField lanzamientoTextField = new JTextField();
        JLabel duracionLabel = new JLabel("Duracion minutos");
        JTextField duracionTextField = new JTextField();
        JLabel directorLabel = new JLabel("Director");
        JTextField directorTextField = new JTextField();
        JLabel repartoLabel = new JLabel("Reparto");
        JTextField repartoTextField = new JTextField();

        JLabel pegiLabel = new JLabel("Pegi");
        JPanel pegiPanel = new JPanel(new GridLayout(1, 6));
        // ButtonGroup crea un grupo de botones de opción en el cual solo puede seleccionarse un botón a la vez.
        ButtonGroup pegiButtonGroup = new ButtonGroup();
//        // Creamos un Array de String dóndo guardaremos los "valores" de cada boton.
//        String[] pegiTexts = {"0", "+3", "+7", "+12", "+16", "+18"};
        JRadioButton pegi0Button = new JRadioButton("0");
        JRadioButton pegi3Button = new JRadioButton("+3");
        JRadioButton pegi7Button = new JRadioButton("+7");
        JRadioButton pegi12Button = new JRadioButton("+12");
        JRadioButton pegi16Button = new JRadioButton("+16");
        JRadioButton pegi18Button = new JRadioButton("+18");


        //Creamos el botón de añadir
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton botonAnadir = new JButton("Añadir");
        botonAnadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String userNombre = nombreTextField.getText();
                Genero userGenero = Genero.ACCION;
                String userRawAnyoLanzamiento = lanzamientoTextField.getText();
                int userFinalAynoLanzamiento = validarLanzamiento(userRawAnyoLanzamiento);
                String userDuracionMinutos = duracionTextField.getText();
                String userDirector = directorTextField.getText();
                String userRawReparto = repartoTextField.getText();

                ArrayList<String> userFinalReparto = new ArrayList<>();
                userFinalReparto.add(userRawReparto);

                Pegi userPegi = Pegi.CERO;
                if (generoAccionButton.isSelected()) {
                    userGenero = Genero.ACCION;
                } else if (generoAventuraButton.isSelected()) {
                    userGenero = Genero.AVENTURA;
                } else if (generoFantasiaButton.isSelected()) {
                    userGenero = Genero.FANTASIA;
                } else if (generoComediaButton.isSelected()) {
                    userGenero = Genero.COMEDIA;
                } else if (generoTerrorButton.isSelected()) {
                    userGenero = Genero.TERROR;
                } else if (generoApocalipsisButton.isSelected()) {
                    userGenero = Genero.APOCALIPSIS;
                } else if (generoDramaButton.isSelected()) {
                    userGenero = Genero.DRAMA;
                } else if (generoRomanceButton.isSelected()) {
                    userGenero = Genero.ROMANCE;
                } else if (generoBelicoButton.isSelected()) {
                    userGenero = Genero.BELICO;
                } else if (generoMusicalButton.isSelected()) {
                    userGenero = Genero.MUSICAL;
                } else if (generoHistoricoButton.isSelected()) {
                    userGenero = Genero.HISTORICO;
                } else if (generoInfantilButton.isSelected()) {
                    userGenero = Genero.INFANTIL;
                } else {
                    System.out.println("Entra else -- NULL");
                }

                if (pegi0Button.isSelected()) {
                    userPegi = Pegi.CERO;
                } else if (pegi3Button.isSelected()) {
                    userPegi = Pegi.TRES;
                } else if (pegi7Button.isSelected()) {
                    userPegi = Pegi.SIETE;
                } else if (pegi12Button.isSelected()) {
                    userPegi = Pegi.DOCE;
                } else if (pegi16Button.isSelected()) {
                    userPegi = Pegi.DIECISEIS;
                } else if (pegi18Button.isSelected()) {
                    userPegi = Pegi.DIECIOCHO;
                } else {
                    System.out.println("Entra else -- NULL");
                }

                Pelicula peliculaUser = new Pelicula(userNombre, userGenero, userFinalAynoLanzamiento, userDuracionMinutos, userDirector, userFinalReparto, userPegi, 0);
                System.out.println(peliculaUser);

                pasarInfoPeliculaDeVentanaInfoAVentanaPrincipal(peliculaUser);
            }
        });

        botonAnadir.setPreferredSize(new Dimension(botonAnadir.getPreferredSize().width, botonAnadir.getPreferredSize().height * 2));

// -------

        Color colorLabelTextFieldC1FFEA = Color.decode("#C1FFEA");

        panelPrincipal.setBackground(Color.decode("#117A65"));
        panelCentral.setBackground(Color.decode("#117A65"));

        JLabel[] labels = new JLabel[]{nombreLabel, generoLabel, lanzamientoLabel, duracionLabel, directorLabel, repartoLabel, pegiLabel};
        JTextField[] textFields = new JTextField[]{nombreTextField, lanzamientoTextField, duracionTextField, directorTextField, repartoTextField};
        JRadioButton[] jRadioButtonsGenero = new JRadioButton[]{generoAccionButton, generoAventuraButton, generoFantasiaButton, generoComediaButton, generoTerrorButton, generoApocalipsisButton, generoDramaButton, generoRomanceButton, generoBelicoButton, generoMusicalButton, generoHistoricoButton, generoInfantilButton};
        JRadioButton[] jRadioButtonsPegi = new JRadioButton[]{pegi0Button, pegi3Button, pegi7Button, pegi12Button, pegi16Button, pegi18Button};

        for (JLabel label : labels) {
            label.setForeground(colorLabelTextFieldC1FFEA);
        }

        for (JTextField textField : textFields) {
            textField.setBackground(colorLabelTextFieldC1FFEA);
        }

        for (JRadioButton jRadioButton : jRadioButtonsGenero) {
            jRadioButton.setForeground(colorLabelTextFieldC1FFEA);
        }

        for (JRadioButton jRadioButton : jRadioButtonsPegi) {
            jRadioButton.setForeground(colorLabelTextFieldC1FFEA);
        }

        generoPanel.setBackground(Color.decode("#117A65"));
        pegiPanel.setBackground(Color.decode("#117A65"));

        botonAnadir.setUI(new BasicButtonUI());
        botonAnadir.setBackground(Color.decode("#C1FFEA"));

        botonAnadir.setForeground(Color.decode("#117A65"));

// -------

        frame.add(panelPrincipal);

        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        panelPrincipal.add(buttonPanel, BorderLayout.SOUTH);

        panelCentral.add(nombreLabel);
        panelCentral.add(nombreTextField);
        panelCentral.add(generoLabel);

        panelCentral.add(generoPanel);

        generoPanel.add(generoAccionButton);
        generoPanel.add(generoAventuraButton);
        generoPanel.add(generoFantasiaButton);
        generoPanel.add(generoComediaButton);
        generoPanel.add(generoTerrorButton);
        generoPanel.add(generoApocalipsisButton);
        generoPanel.add(generoDramaButton);
        generoPanel.add(generoRomanceButton);
        generoPanel.add(generoBelicoButton);
        generoPanel.add(generoMusicalButton);
        generoPanel.add(generoHistoricoButton);
        generoPanel.add(generoInfantilButton);

        generoButtonGroup.add(generoAccionButton);
        generoButtonGroup.add(generoAventuraButton);
        generoButtonGroup.add(generoFantasiaButton);
        generoButtonGroup.add(generoComediaButton);
        generoButtonGroup.add(generoTerrorButton);
        generoButtonGroup.add(generoApocalipsisButton);
        generoButtonGroup.add(generoDramaButton);
        generoButtonGroup.add(generoRomanceButton);
        generoButtonGroup.add(generoBelicoButton);
        generoButtonGroup.add(generoMusicalButton);
        generoButtonGroup.add(generoHistoricoButton);
        generoButtonGroup.add(generoInfantilButton);

        panelCentral.add(lanzamientoLabel);
        panelCentral.add(lanzamientoTextField);
        panelCentral.add(duracionLabel);
        panelCentral.add(duracionTextField);
        panelCentral.add(directorLabel);
        panelCentral.add(directorTextField);
        panelCentral.add(repartoLabel);
        panelCentral.add(repartoTextField);
        panelCentral.add(pegiLabel);

        panelCentral.add(pegiPanel);

        pegiPanel.add(pegi0Button);
        pegiPanel.add(pegi3Button);
        pegiPanel.add(pegi7Button);
        pegiPanel.add(pegi12Button);
        pegiPanel.add(pegi16Button);
        pegiPanel.add(pegi18Button);

        pegiButtonGroup.add(pegi0Button);
        pegiButtonGroup.add(pegi3Button);
        pegiButtonGroup.add(pegi7Button);
        pegiButtonGroup.add(pegi12Button);
        pegiButtonGroup.add(pegi16Button);
        pegiButtonGroup.add(pegi18Button);

        buttonPanel.add(botonAnadir, BorderLayout.CENTER);

// -------

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);

        generoAccionButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoAventuraButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoFantasiaButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoComediaButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoTerrorButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoApocalipsisButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoDramaButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoRomanceButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoBelicoButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoMusicalButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoHistoricoButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoInfantilButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.setVisible(true);
    }

    private static int validarLanzamiento(String texto) {

        //trim = Borrar espacios en blanco

        if (texto.trim().isEmpty()) {
            return 1800;
        } else {
            for (char c : texto.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return 1800; // Valor por defecto
                }
            }
            return Integer.parseInt(texto);
        }
    }

    public static Pelicula pasarInfoPeliculaDeVentanaInfoAVentanaPrincipal(Pelicula objetoPelicula){
        return objetoPelicula;
    }

}

















