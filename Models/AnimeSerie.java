package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Creación de la clase AnimeSeries que hereda de la clase Anime.
 */
public class AnimeSerie extends Anime {

    int numeroCapitulos;
    boolean finalizado;
    Capitulo capitulo;

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
    public AnimeSerie(String nombre,
                      Genero genero,
                      int anyoLanzamiento,
                      String duracionMinutos,
                      String director,
                      Pegi pegi,
                      float puntuacion,
                      String estudio,
                      int numeroCapitulos,
                      boolean finalizado,
                      Capitulo capitulo) {

        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion, estudio);

        this.numeroCapitulos = numeroCapitulos;
        this.finalizado = finalizado;
        this.capitulo = capitulo;
    }

    /**
     * Método getter.
     *
     * @return numeroCapitulos
     */
    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    /**
     * Método getter.
     *
     * @return finalizado
     */
    public boolean isFinalizado() {
        return finalizado;
    }
}
