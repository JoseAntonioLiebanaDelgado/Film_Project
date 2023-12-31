package Models;

import ENUM.Genero;
import ENUM.Pegi;

import java.util.ArrayList;

/**
 * Creación de la clase Película.
 */
public class Pelicula extends ContenidoAudioVisual {
    protected ArrayList<String> reparto;

    /**
     * Creación del método constructor de la clase Película.
     * Heredamos todos los atributos de la clase padre (ContenidoAudioVisual), menos el de "reparto",
     * al cuál daremos valor en la clase Uso_ContenidoAudioVisual.
     *
     * @param nombre
     * @param genero
     * @param anyoLanzamiento
     * @param duracionMinutos
     * @param director
     * @param reparto
     * @param pegi
     * @param puntuacion
     */
    public Pelicula(String nombre,
                    Genero genero,
                    int anyoLanzamiento,
                    String duracionMinutos,
                    String director,
                    ArrayList<String> reparto,
                    Pegi pegi,
                    float puntuacion) {

        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);

        ArrayList<String> repartoErroneo = new ArrayList<>() {
            {
                add("Elijah Wood");
            }
        };
        this.reparto = (reparto.isEmpty()) ? repartoErroneo : reparto;
    }


    public Pelicula() {
        super("Titulo vacio", Genero.ACCION, 0, "0", "Director vacio", Pegi.DOCE, 0);

        ArrayList<String> repartoDummy = new ArrayList<>();

        this.reparto = repartoDummy;
    }



    /**
     * Método getter que nos permitirá acceder a éste valor o atributo.
     *
     * @return reparto.
     */
    public ArrayList<String> getReparto() {
        return reparto;
    }
}
