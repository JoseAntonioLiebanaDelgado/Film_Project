package Models;

import ENUM.Genero;
import ENUM.Pegi;

public class Serie extends ContenidoAudioVisual {
    private int numeroCapitulos;
    private boolean finalizado;

    public Serie(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
        this.numeroCapitulos = numeroCapitulos;
        this.finalizado = finalizado;
    }
}
