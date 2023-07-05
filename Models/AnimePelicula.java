package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Creacion de la clase AnimePeliculas que hereda de la clase Anime.
 */
public class AnimePelicula extends Anime {
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
    public AnimePelicula(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion, String estudio, Capitulo capitulo) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion, estudio, capitulo);

        this.capitulo = capitulo;
    }
}
