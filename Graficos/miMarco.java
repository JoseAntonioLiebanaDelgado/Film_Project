package Graficos;

import javax.swing.*;
import java.awt.*;

public class miMarco extends JFrame {

    /**
     * Constructor de la clase miMarco
     */
    public miMarco(){

        // Establecemos la localizacion de la ventana (Donde queremos que aparezca).
        // setLocation(500, 300);

        // Establecemos el tamaño de la ventana con el metodo setSize y sus corresopndientes parametros.
        // setSize(500, 300);

        // Establecemos la localizacion y el tamaño de la ventana con un solo metodo (setBounds) y
        // sus respectivos parametros.
        setBounds(0,0,550,250);

        // Si no queremos que el usuario redimensiona la ventana utilizaremos el metodo "setResizable",
        // con su respectivo parametro en "false".
        // Con esto la ventana se mantendrá fija, el usuario no podrá no moverla de su sitio, ni cambiarle
        // el tamaño, ni maximizarla con el boton de maximizar.
        // setResizable(false);

        // Para hacer que la ventana se habra a pantalla completa utilizaremos el metodo "setExtendedState"
        // con su parametro correspondiente (frame.MAXIMIZED_BOTH).
        setExtendedState(Frame.MAXIMIZED_BOTH);

        // Si queremos añadir un titulo en la ventana utilizaremos el metodo "setTitle" y pasaremos
        // por parametro entre comillas lo que queramos que aparezca escrito.
        setTitle("Ventana dummy");

    }
}
