package Models;

import ENUM.Genero;
import ENUM.Pegi;

public class Serie extends ContenidoAudioVisual {
    protected int numeroCapitulos;
    protected int numeroTemporadas;
    protected boolean finalizado;


    public Serie(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
        this.numeroCapitulos = numeroCapitulos;

        this.finalizado = finalizado;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }
    public boolean isFinalizado() {
        return finalizado;
    }
}
