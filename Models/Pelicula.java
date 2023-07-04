package Models;

import ENUM.Genero;
import ENUM.Pegi;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudioVisual {
    private ArrayList<String> reparto;

    public Pelicula(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
        this.reparto = reparto;
    }
}
