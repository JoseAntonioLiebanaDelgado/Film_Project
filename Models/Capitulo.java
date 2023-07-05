package Models;

/**
 * Creamos la clase Capitulo que hereda de ContenidoAudioVisual.
 */
public class Capitulo {
    protected String titulo;
    protected int numero;
    protected int numeroTemporada;
    protected String sinopsis;
    protected String ambientacion;

    /**
     * Constructor de la clase Capitulo.
     */
    public Capitulo(String titulo,
                    int numero,
                    int numeroTemporada,
                    String sinopsis,
                    String ambientacion) {

        this.titulo = titulo;
        this.numero = numero;
        this.numeroTemporada = numeroTemporada;
        this.sinopsis = sinopsis;
        this.ambientacion = ambientacion;
    }

    /**
     * Método getter.
     *
     * @return nombreSerie
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método getter.
     *
     * @return numeroCapitulo
     */
    public int getNumero() {
        return numero;
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
