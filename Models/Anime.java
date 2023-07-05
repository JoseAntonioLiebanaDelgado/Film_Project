package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Creación de la clase Anime, que hereda de ContenidoAudioVisual.
 */
public class Anime extends ContenidoAudioVisual {
    protected int numeroCapitulos;
    protected String estudio;
    protected boolean finalizado;

    /**
     * Método constructor de la clase Anime.
     *
     * @param nombre
     * @param genero
     * @param anyoLanzamiento
     * @param duracionMinutos
     * @param director
     * @param pegi
     * @param puntuacion
     */
    public Anime(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
    }
}
