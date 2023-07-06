package Models;

import ENUM.Genero;
import ENUM.Pegi;

/**
 * Creamos la clase Serie que hereda de ContenidoAudioVisual.
 */
public class Serie extends ContenidoAudioVisual {
    protected int numeroCapitulos;
    protected int numeroTemporadas;
    protected boolean finalizado;
    protected Capitulo capitulo;

    /**
     * Metodo constructor de la clase Serie.
     *
     * @param nombre
     * @param genero
     * @param anyoLanzamiento
     * @param duracionMinutos
     * @param director
     * @param pegi
     * @param puntuacion
     */
    public Serie(String nombre,
                 Genero genero,
                 int anyoLanzamiento,
                 String duracionMinutos,
                 String director,
                 Pegi pegi,
                 float puntuacion,
                 int numeroCapitulos,
                 int numeroTemporadas,
                 boolean finalizado,
                 Capitulo capitulo) {

        // "Super" llama al constructor de la clase Padre (ContenidoAudioVisual).
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);

        this.numeroCapitulos = numeroCapitulos;
        this.numeroTemporadas = numeroTemporadas;
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
     * @return numeroTemporadas
     */
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    /**
     * Método getter.
     *
     * @return finalizado
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * Método getter.
     *
     * @return capitulo
     */
    public Capitulo getCapitulo() {
        return capitulo;
    }
}
