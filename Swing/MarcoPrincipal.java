package Swing;

import com.sun.jdi.OpaqueFrameException;

import javax.swing.*;
import java.awt.*;

public class MarcoPrincipal {
    public static void main(String[] args) {

        //-------------------------------------------------------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------------------------------------------------------

        //Creacion de Variables

        JFrame framePadre = new JFrame("Titulo Marco");
        JPanel panelPrincipalIzquierdo = new JPanel();
        JPanel panelPrincipalDerecho = new JPanel();
        JLabel tituloDelPanelDerechoLabel = new JLabel("Nombre App");
        GridLayout disposicionFramePadreGridLayout = new GridLayout();
        JPanel cuadroDelPanelPrincipalDerecho = new JPanel();
        GridLayout disposicionPanelPrincipalDerecho = new GridLayout(2 ,1);

        //-------------------------------------------------------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------------------------------------------------------

        //Configuraciones

        panelPrincipalIzquierdo.setBackground(Color.BLUE);
        panelPrincipalDerecho.setBackground(Color.ORANGE);
        tituloDelPanelDerechoLabel.setOpaque(true);
        tituloDelPanelDerechoLabel.setBackground(Color.GREEN);
        cuadroDelPanelPrincipalDerecho.setBackground(Color.darkGray);

        tituloDelPanelDerechoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        framePadre.setSize(1500, 1000);

        //-------------------------------------------------------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------------------------------------------------------

        //Añadir objetos a la vista

        framePadre.add(panelPrincipalIzquierdo);
        framePadre.add(panelPrincipalDerecho);
        panelPrincipalDerecho.add(tituloDelPanelDerechoLabel);
        panelPrincipalDerecho.add(cuadroDelPanelPrincipalDerecho);

        //-------------------------------------------------------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------------------------------------------------------

        //Aplicar disposiciones (Lyouts)

        framePadre.setLayout(disposicionFramePadreGridLayout);
        panelPrincipalDerecho.setLayout(disposicionPanelPrincipalDerecho);


        //-------------------------------------------------------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------------------------------------------------------

        //Visivilidad

        framePadre.setVisible(true);

        //-------------------------------------------------------------------------------------------------------------------------------
    }
}
