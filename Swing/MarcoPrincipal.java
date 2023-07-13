package Swing;

import com.sun.jdi.OpaqueFrameException;

import javax.swing.*;
import java.awt.*;

public class MarcoPrincipal {
    public static void main(String[] args) {

        //-------------------------------------------------------------------------------------------------------------------------------
        //Creacion de Variables

        JFrame miJFrame = new JFrame("Dummy Title");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel tituloLabel = new JLabel("Dummy Title");
        GridLayout miJFrameGridLayout = new GridLayout();
        //-------------------------------------------------------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------------------------------------------------------
        //Configuraciones

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.ORANGE);
        tituloLabel.setOpaque(true);
        tituloLabel.setBackground(Color.GREEN);
        tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        miJFrame.setSize(1500, 1000);

        //-------------------------------------------------------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------------------------------------------------------
        //Añadir objetos a la vista

        miJFrame.add(panel1);
        miJFrame.add(panel2);
        panel2.add(tituloLabel);
        //-------------------------------------------------------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------------------------------------------------------
        //Aplicar disposiciones (Lyouts)

        miJFrame.setLayout(miJFrameGridLayout);

        

        //Hacemos que el Frame sea visible
        miJFrame.setVisible(true);



    }
}
