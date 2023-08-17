package UserFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaRellenarInformacion extends JFrame {

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

    public VentanaRellenarInformacion() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        ventanaEmergente.add(nombre);
        ventanaEmergente.add(genero);
        ventanaEmergente.add(anyoLanzamiento);
        ventanaEmergente.add(duracionMinutos);
        ventanaEmergente.add(director);
        ventanaEmergente.add(a0RadioButton);
        ventanaEmergente.add(a3RadioButton);
        ventanaEmergente.add(a7RadioButton);
        ventanaEmergente.add(a12RadioButton);
        ventanaEmergente.add(a16RadioButton);
        ventanaEmergente.add(a18RadioButton);
        ventanaEmergente.add(reparto1);
        ventanaEmergente.add(reparto2);
        ventanaEmergente.add(reparto4);
        ventanaEmergente.add(textField1);
        ventanaEmergente.add(textField2);
    }

    public static void main(String[] args) {

        VentanaRellenarInformacion objVentana = new VentanaRellenarInformacion();
        objVentana.setContentPane(objVentana.ventanaEmergente);
        objVentana.setTitle("Ventana Informacion");
        objVentana.setSize(700, 600);
        objVentana.setVisible(true);
        objVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




















