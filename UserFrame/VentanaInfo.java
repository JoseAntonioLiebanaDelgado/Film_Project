package UserFrame;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInfo {
    public static void main(String[] args) {
        /*SwingUtilities.invokeLater(() ->
        { createAndShowGUI(); }); Esto se encarga de garantizar que la creación y la presentación de la interfaz gráfica
        (ventanas, botones, etc..), se realice correctamente dentro del contexto de la arquitectura de Swing.*/
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    public static void createAndShowGUI() {

        JFrame frame = new JFrame("Add information");

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

//        JLabel generoLabel = new JLabel("Genero");
//        JTextField generoTextField = new JTextField();

        JLabel generoLabel = new JLabel("Genero");
        JPanel generoPanel = new JPanel(new GridLayout(4, 2));

        ButtonGroup generoButtonGroup = new ButtonGroup();

        JRadioButton generoButton1 = new JRadioButton("Accion");
        JRadioButton generoButton2 = new JRadioButton("Aventura");
        JRadioButton generoButton3 = new JRadioButton("Fantasia");
        JRadioButton generoButton4 = new JRadioButton("Comedia");
        JRadioButton generoButton5 = new JRadioButton("Terror");
        JRadioButton generoButton6 = new JRadioButton("Apocalipsis");
        JRadioButton generoButton7 = new JRadioButton("Drama");
        JRadioButton generoButton8 = new JRadioButton("Romance");
        JRadioButton generoButton9 = new JRadioButton("Belico");
        JRadioButton generoButton10 = new JRadioButton("Musical");
        JRadioButton generoButton11 = new JRadioButton("Historico");
        JRadioButton generoButton12 = new JRadioButton("Infantil");


        JLabel lanzamientoLabel = new JLabel("Anyo de Lanzamiento");
        JTextField lanzamientoTextField = new JTextField();
        JLabel duracionLabel = new JLabel("Duracion Minutos");
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

        JRadioButton pegiButton0 = new JRadioButton("0");
        JRadioButton pegiButton3 = new JRadioButton("+3");
        JRadioButton pegiButton7 = new JRadioButton("+7");
        JRadioButton pegiButton12 = new JRadioButton("+12");
        JRadioButton pegiButton16 = new JRadioButton("+16");
        JRadioButton pegiButton18 = new JRadioButton("+18");


        //Creamos el botón de añadir
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton botonAnadir = new JButton("Add");
        botonAnadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String nombre = nombreTextField.getText();
//                String genero = generoTextField.getText();
                String lanzamiento = lanzamientoTextField.getText();
                String duracion = duracionTextField.getText();
                String director = directorTextField.getText();
                String reparto = repartoTextField.getText();

                System.out.println("Nombre: " + nombre);
//                System.out.println("Genero: " + genero);
                System.out.println("Anyo de Lanzamiento: " + lanzamiento);
                System.out.println("Duracion: " + duracion);
                System.out.println("Director: " + director);
                System.out.println("Reparto: " + reparto);

                if (pegiButton0.isSelected()) {
                    System.out.println(pegiButton0.getText());
                } else if (pegiButton3.isSelected()) {
                    System.out.println(pegiButton3.getText());
                } else if (pegiButton7.isSelected()) {
                    System.out.println(pegiButton7.getText());
                } else if (pegiButton12.isSelected()) {
                    System.out.println(pegiButton12.getText());
                } else if (pegiButton16.isSelected()) {
                    System.out.println(pegiButton16.getText());
                } else if (pegiButton18.isSelected()) {
                    System.out.println(pegiButton18.getText());
                } else {
                    System.out.println("Entra else -- NULL");
                }

            }
        });

        botonAnadir.setPreferredSize(new Dimension(botonAnadir.getPreferredSize().width, botonAnadir.getPreferredSize().height * 2));

// -------

        Color colorLabelTextFieldC1FFEA = Color.decode("#C1FFEA");

        panelPrincipal.setBackground(Color.decode("#117A65"));
        panelCentral.setBackground(Color.decode("#117A65"));

        JLabel[] labels = new JLabel[]{nombreLabel, generoLabel, lanzamientoLabel, duracionLabel, directorLabel, repartoLabel, pegiLabel};
        JTextField[] textFields = new JTextField[]{nombreTextField, lanzamientoTextField, duracionTextField, directorTextField, repartoTextField};
        JRadioButton[] jRadioButtonsGenero = new JRadioButton[]{generoButton1, generoButton2, generoButton3, generoButton4, generoButton5, generoButton6, generoButton7, generoButton8, generoButton9, generoButton10, generoButton11, generoButton12};
        JRadioButton[] jRadioButtonsPegi = new JRadioButton[]{pegiButton0, pegiButton3, pegiButton7, pegiButton12, pegiButton16, pegiButton18};

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

        generoPanel.add(generoButton1);
        generoPanel.add(generoButton2);
        generoPanel.add(generoButton3);
        generoPanel.add(generoButton4);
        generoPanel.add(generoButton5);
        generoPanel.add(generoButton6);
        generoPanel.add(generoButton7);
        generoPanel.add(generoButton8);
        generoPanel.add(generoButton9);
        generoPanel.add(generoButton10);
        generoPanel.add(generoButton11);
        generoPanel.add(generoButton12);


        generoButtonGroup.add(generoButton1);
        generoButtonGroup.add(generoButton2);
        generoButtonGroup.add(generoButton3);
        generoButtonGroup.add(generoButton4);
        generoButtonGroup.add(generoButton5);
        generoButtonGroup.add(generoButton6);
        generoButtonGroup.add(generoButton7);
        generoButtonGroup.add(generoButton8);
        generoButtonGroup.add(generoButton9);
        generoButtonGroup.add(generoButton10);
        generoButtonGroup.add(generoButton11);
        generoButtonGroup.add(generoButton12);


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

        pegiPanel.add(pegiButton0);
        pegiPanel.add(pegiButton3);
        pegiPanel.add(pegiButton7);
        pegiPanel.add(pegiButton12);
        pegiPanel.add(pegiButton16);
        pegiPanel.add(pegiButton18);

        pegiButtonGroup.add(pegiButton0);
        pegiButtonGroup.add(pegiButton3);
        pegiButtonGroup.add(pegiButton7);
        pegiButtonGroup.add(pegiButton12);
        pegiButtonGroup.add(pegiButton16);
        pegiButtonGroup.add(pegiButton18);

        buttonPanel.add(botonAnadir, BorderLayout.CENTER);

// -------

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);

        generoButton1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton8.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton9.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton10.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton11.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        generoButton12.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        frame.setVisible(true);
    }
}
