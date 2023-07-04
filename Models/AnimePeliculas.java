package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Creacion de la clase AnimePeliculas que hereda de la clase Anime.
 */
public class AnimePeliculas extends Anime {
    /**
     * Método constructor de la clase AnimePeliculas.
     *
     * @param nombre
     * @param genero
     * @param anyoLanzamiento
     * @param duracionMinutos
     * @param director
     * @param pegi
     * @param puntuacion
     */
    public AnimePeliculas(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
        //TODO: Como heredo los atributos (numeroCapitulos y finalizado)
        int numeroCapitulos;
        boolean finalizado;
    }
}
