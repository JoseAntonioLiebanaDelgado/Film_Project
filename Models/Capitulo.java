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


        //TODO: Expresion regular

        if (titulo.equalsIgnoreCase("") || (!titulo.matches("^[a-zA-Z0-9]+$"))) {
            this.titulo = "Titulo erroneo";
        } else {
            this.titulo = titulo;
        }


//       this.numero = numero;

//        int numEntero = 4;
//        String numCadena= String.valueOf(numEntero);
//
//        String numCadena= Integer.toString(numEntero);


        if (numero <= 0) {

        }


//       this.numeroTemporada = numeroTemporada;


        if (sinopsis.equalsIgnoreCase("") || (!sinopsis.matches("^[a-zA-Z0-9]+$"))) {
            this.sinopsis = "Sinopsis erroneo";
        } else {
            this.sinopsis = sinopsis;
        }


        if ((ambientacion.equalsIgnoreCase("")) || (!ambientacion.matches("^[a-zA-Z0-9]+$"))) {
            this.ambientacion = "Ambientacion erronea";
        } else {
            this.ambientacion = ambientacion;
        }
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
