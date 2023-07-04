package Models;

import ENUM.Genero;
import ENUM.Pegi;

public class AnimePelicula extends Anime {
    public AnimePelicula(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos, String director, Pegi pegi, float puntuacion) {
        super(nombre, genero, anyoLanzamiento, duracionMinutos, director, pegi, puntuacion);
        //TODO: Como heredo los atributos (numeroCapitulos y finalizado)
        int numeroCapitulos;
        boolean finalizado;
    }
}
