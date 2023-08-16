package UserFrame;

import Swing.Pruebas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ventanaRellenarInformacion extends JFrame {

    private JPanel ventanaEmergente;
    private JTextField nombre;
    private JTextField genero;
    private JTextField anyoLanzamiento;
    private JTextField duracionMinutos;
    private JTextField director;
    private JButton addButton;
    private JRadioButton a0RadioButton;
    private JRadioButton a3RadioButton;
    private JRadioButton a7RadioButton;
    private JRadioButton a12RadioButton;
    private JRadioButton a16RadioButton;
    private JRadioButton a18RadioButton;
    private JTextField reparto1;
    private JTextField reparto2;
    private JTextField reparto4;
    private JTextField textField1;
    private JTextField textField2;


    public ventanaRellenarInformacion() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("A");
            }
        });


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ventanaRellenarInformacion ventanaEmergente = new ventanaRellenarInformacion();
                ventanaEmergente.setTitle("Anadir informacion");
                ventanaEmergente.setSize(700, 450);
                ventanaEmergente.setVisible(true);
                ventanaEmergente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
}




















