package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Creación de la clase AnimeSeries que hereda de la clase Anime.
 */
public class AnimeSeries extends Anime {

    /**
     * Método constructor de la clase AnimeSeries.
     *
     * @param nombre
     * @param genero
     * @param anyoLanzamiento
     * @param duracionMinutos
     * @param director
     * @param pegi
     * @param puntuacion
     */
    public AnimeSeries(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
        //TODO: Como heredo los atributos (numeroCapitulos y finalizado)
        int numeroCapitulos;
        boolean finalizado;
    }
}
