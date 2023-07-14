package Swing;

import com.sun.jdi.OpaqueFrameException;

import javax.swing.*;
import java.awt.*;

public class MarcoPrincipal {
    public static void main(String[] args) {


        GridLayout disposicionFramePadreGridLayout = new GridLayout();

        JFrame framePadre = new JFrame();
        JPanel panelPrincipalIzquierdo = new JPanel();
        JPanel panelPrincipalDerecho = new JPanel();


        JLabel b1 = new JLabel("Boton 1");
        JPanel b2 = new JPanel();
        b2.setBackground(Color.GREEN);
        panelPrincipalIzquierdo.setBackground(Color.orange);
        panelPrincipalDerecho.setBackground(Color.blue);
        framePadre.setSize(1500, 1000);

        panelPrincipalDerecho.setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;

        gc.gridx = 0;
        gc.gridy = 0;
        panelPrincipalDerecho.add(b1, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        panelPrincipalDerecho.add(b2, gc);

        framePadre.add(panelPrincipalIzquierdo);
        framePadre.add(panelPrincipalDerecho);

        framePadre.setLayout(disposicionFramePadreGridLayout);
        framePadre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        framePadre.setVisible(true);

    }
}
