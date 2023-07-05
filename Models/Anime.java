package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Creación de la clase Anime, que hereda de ContenidoAudioVisual.
 */
public class Anime extends ContenidoAudioVisual {
    protected String estudio;

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
    public Anime(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion, String estudio, Capitulo capitulo) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);

        //Asignar
        this.estudio = estudio;
    }

    /**
     * Método getter.
     *
     * @return estudio
     */
    public String getEstudio() {
        return estudio;
    }
}
