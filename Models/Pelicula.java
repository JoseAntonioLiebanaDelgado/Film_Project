package Models;

import ENUM.Genero;
import ENUM.Pegi;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudioVisual {
    public ArrayList<String> reparto;

    public Pelicula(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, ArrayList<String> repartoESDLA_1_2_3, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
        this.reparto = reparto;

    }

    public ArrayList<String> getReparto() {
        return reparto;
    }
}
