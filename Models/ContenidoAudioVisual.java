package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Clase Padre -- ContenidoAudioVisual -- .
 */
class ContenidoAudioVisual {

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
    protected ContenidoAudioVisual(String nombre,
                                   Genero genero,
                                   int anyoLanzamiento,
                                   String duracionMinutos,
                                   String director,
                                   Pegi pegi,
                                   float puntuacion) {

        this.genero = genero;
        this.pegi = pegi;

        this.nombre = (nombre.equalsIgnoreCase("") || !nombre.matches("^[a-zA-Z0-9]+$")) ? "Titulo erroneo" : nombre;
        //this.genero = genero;
        this.anyoLanzamiento = (anyoLanzamiento <= 0) ? 0 : anyoLanzamiento;
        this.duracionMinutos = (duracionMinutos.equalsIgnoreCase("") || !duracionMinutos.matches("^[a-zA-Z0-9]+$")) ? "Duracion erronea" : duracionMinutos;
        this.director = (director.equalsIgnoreCase("") || !director.matches("^[a-zA-Z0-9]+$")) ? "Director erroneo" : director;
        //this.pegi = pegi;
        this.puntuacion = (puntuacion < 0) || (puntuacion > 5) ? 0 : puntuacion;
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
