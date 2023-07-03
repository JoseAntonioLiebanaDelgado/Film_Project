package Graficos;
import javax.swing.*;

public class CrearMarcos {
    public static void main(String[] args) {

    // Instanciamos un objeto de tipo miMarco al que llamamos marco1.
    miMarco marco1 = new miMarco();

    // Utilizamos el metodo "setVisible" y le pasamos por parametro (true), asi la linea
    // del marco se podra ver, ya que por defecto es invisible.
    marco1.setVisible(true);

    // Siempre tenemos que decir que pasara cuando cerremos la ventana. En este caso,
    // cerraremos el programa con la funcion "setDefaultCloseOperation", y el parametro
    // (JFrame.EXIT_ON_CLOSE). Cuando se cierre la ventana, el programa acaba.
    // --> "setDefaultCloseOperation" lo que hace es pedir un parametro de tipo entero.
    // --> EXIT_ON_CLOSE es una constante de clase. Cierra la app como accion por defecto.
    marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //TODO: Se podria haber echo "marco1.setVisible(true);" y "marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); en el constructor. Como?


    }
}
