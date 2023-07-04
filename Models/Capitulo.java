package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Creamos la clase Capitulo que hereda de ContenidoAudioVisual.
 */
public class Capitulo extends ContenidoAudioVisual {
    protected String nombreSerie;
    protected int numeroCapitulo;
    protected int numeroTemporada;
    protected String sinopsis;
    protected String ambientacion;

    /**
     * Constructor de la clase Capitulo.
     *
     * @param nombre
     * @param genero
     * @param anyoLanzamiento
     * @param duracionMinutos
     * @param director
     * @param pegi
     * @param puntuacion
     */
    public Capitulo(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
    }

    /**
     * Método getter.
     *
     * @return nombreSerie
     */
    public String getNombreSerie() {
        return nombreSerie;
    }

    /**
     * Método getter.
     *
     * @return numeroCapitulo
     */
    public int getNumeroCapitulo() {
        return numeroCapitulo;
    }

    /**
     * Método getter.
     *
     * @return numeroTemporada
     */
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    /**
     * Método getter.
     *
     * @return sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * Método getter.
     *
     * @return ambientacion
     */
    public String getAmbientacion() {
        return ambientacion;
    }
}
