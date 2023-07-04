package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Clase Padre -- ContenidoAudioVisual -- .
 */
public class ContenidoAudioVisual {

    protected String nombre;
    protected Genero genero;
    protected int anyoLanzamiento;
    protected String duracionMinutos;
    protected String director;

    protected Pegi pegi;
    protected float puntuacion;

    /**
     * Constructor de la clase Padre.
     *
     * @param nombre
     * @param genero
     * @param anyoLanzamiento
     * @param duracionMinutos
     * @param director
     * @param pegi
     * @param puntuacion
     */
    public ContenidoAudioVisual(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos,
                                String director, Pegi pegi, float puntuacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.anyoLanzamiento = anyoLanzamiento;
        this.duracionMinutos = duracionMinutos;
        this.director = director;
        this.pegi = pegi;
        this.puntuacion = puntuacion;
    }

    /**
     * Método getter.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método getter.
     *
     * @return genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Método getter.
     *
     * @return anyoLanzamiento
     */
    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    /**
     * Método getter.
     *
     * @return duracionMinutos
     */
    public String getDuracionMinutos() {
        return duracionMinutos;
    }

    /**
     * Método getter.
     *
     * @return director
     */
    public String getDirector() {
        return director;
    }

    /**
     * Método getter.
     *
     * @return pegi
     */
    public Pegi getPegi() {
        return pegi;
    }

    /**
     * Método getter.
     *
     * @return puntuacion
     */
    public float getPuntuacion() {
        return puntuacion;
    }
}
