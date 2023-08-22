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

        //Creamos Jlabels y JTextFields
        JLabel nombreLabel = new JLabel("Nombre");
        JTextField nombreTextField = new JTextField();
        JLabel generoLabel = new JLabel("Genero");
        JTextField generoTextField = new JTextField();
        JLabel lanzamientoLabel = new JLabel("Anyo de Lanzamiento");
        JTextField lanzamientoTextField = new JTextField();
        JLabel duracionLabel = new JLabel("Duracion Minutos");
        JTextField duracionTextField = new JTextField();
        JLabel directorLabel = new JLabel("Director");
        JTextField directorTextField = new JTextField();
        JLabel repartoLabel = new JLabel("Reparto");
        JTextField repartoTextField = new JTextField();
        JPanel pegiPanel = new JPanel(new GridLayout(1, 6));
        JLabel pegiLabel = new JLabel("Pegi");

        // Creamos un Array de String dóndo guardaremos los "valores" de cada botón.
        String[] pegiTexts = {"0", "+3", "+7", "+12", "+16", "+18"};

        JRadioButton pegiButton0 = new JRadioButton("0");
        JRadioButton pegiButton3 = new JRadioButton("+3");
        JRadioButton pegiButton7 = new JRadioButton("+7");
        JRadioButton pegiButton12 = new JRadioButton("+12");
        JRadioButton pegiButton16 = new JRadioButton("+16");
        JRadioButton pegiButton18 = new JRadioButton("+18");

        // ButtonGroup crea un grupo de botones de opción en el cual solo puede seleccionarse un botón a la vez.
        ButtonGroup pegiButtonGroup = new ButtonGroup();

        //Creamos el botón de añadir
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton botonAnadir = new JButton("Add");
        botonAnadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

//                System.out.println(nombreTextField.getText());
//                System.out.println(generoTextField.getText());
//                System.out.println(lanzamientoTextField.getText());
//                System.out.println(duracionTextField.getText());
//                System.out.println(directorTextField.getText());
//                System.out.println(repartoTextField.getText());

                String nombre = nombreTextField.getText();
                String genero = generoTextField.getText();
                String lanzamiento = lanzamientoTextField.getText();
                String duracion = duracionTextField.getText();
                String director = directorTextField.getText();
                String reparto = repartoTextField.getText();

                System.out.println("Nombre: " + nombre);
                System.out.println("Genero: " + genero);
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

        JLabel[] labels = new JLabel[]{nombreLabel, generoLabel, lanzamientoLabel, duracionLabel, directorLabel, repartoLabel, pegiLabel};
        JTextField[] textFields = new JTextField[]{nombreTextField, generoTextField, lanzamientoTextField, duracionTextField, directorTextField, repartoTextField};
        JRadioButton[] jRadioButtons = new JRadioButton[]{pegiButton0, pegiButton3, pegiButton7, pegiButton12, pegiButton16, pegiButton18};

        for (JLabel label : labels) {
            label.setForeground(colorLabelTextFieldC1FFEA);
        }

        for (JTextField textField : textFields) {
            textField.setBackground(colorLabelTextFieldC1FFEA);
        }

        panelPrincipal.setBackground(Color.decode("#117A65"));
        panelCentral.setBackground(Color.decode("#117A65"));

        pegiPanel.setBackground(Color.decode("#117A65"));

        for (JRadioButton jRadioButton : jRadioButtons) {
            jRadioButton.setForeground(colorLabelTextFieldC1FFEA);
        }

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
        panelCentral.add(generoTextField);
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
        frame.setSize(800, 500);
        frame.setVisible(true);
    }
}
