package ENUM;

public enum Pegi {

    CERO("Pelicula apta para todos los publicos"),
    TRES("Pelicula apta para mayores de 3 años"),
    SIETE("Pelicula apta para mayores de 7 años"),
    DOCE("Pelicula apta para mayores de 12 años"),
    TRECE("Pelicula apta para mayores de 13 años"),
    DIECISEIS("Pelicula apta para mayores de 16 años"),
    DIECIOCHO("Pelicula apta para mayores de 18 años");

    private String nombre;

    /**
     * Constructor de la clase Pegi.
     * @param nombre
     */
    Pegi(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter.
     * @return
     */
    public String getNombre() {
        return nombre;
    }
}
