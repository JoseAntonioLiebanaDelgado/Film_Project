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

        //TODO: Expresiones regulares pasadas a ternarias

        this.titulo = (titulo.equalsIgnoreCase("") || !titulo.matches("^[a-zA-Z0-9]+$")) ? "Titulo erroneo" : titulo;
        this.numero = (numero <= 0) ? 0 : numero;
        this.numeroTemporada = (numeroTemporada <= 0) ? 0 : numeroTemporada;
        this.sinopsis = (sinopsis.equalsIgnoreCase("") || !sinopsis.matches("^[a-zA-Z0-9]+$")) ? "Sinopsis erronea" : sinopsis;
        this.ambientacion = (ambientacion.equalsIgnoreCase("") || !ambientacion.matches("^[a-zA-Z0-9]+$")) ? "Ambientacion erronea" : ambientacion;
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
