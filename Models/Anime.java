package Models;

import ENUM.Genero;
import ENUM.Pegi;

public class Anime extends ContenidoAudioVisual {
    protected int numeroCapitulos;
    protected boolean finalizado;

    public Anime(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
    }
}
