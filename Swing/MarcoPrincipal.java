package Swing;

import javax.swing.*;
import java.awt.*;

public class MarcoPrincipal {
    public static void main(String[] args) {

        //Creamos un objeto de tipo JFrame
        JFrame miJFrame = new JFrame("Dummy Title");

        //Creamos dos paneles
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        //Añadimos colores a los panelesd
        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.ORANGE);

        //Añadimos paneles al frame
        miJFrame.add(panel1);
        miJFrame.add(panel2);

        //Layout = Disposicion //Set = Asignar //Get = Coger //Grid = Tablero-Cuadricula
        miJFrame.setLayout(new GridLayout());

        //Asignamos tamaño al frame
        miJFrame.setSize(1500, 1000);

        //Hacemos que el Frame sea visible
        miJFrame.setVisible(true);

        //Visualizamos tamaño de cada panel por consola
        System.out.println("Panel 1" + panel1.getSize());
        System.out.println("Panel 2" + panel2.getSize());
    }
}


// Marcar apartados de ambas partes
// 1 la de la derecha