package Models;

import ENUM.Genero;
import ENUM.Pegi;

public class ContenidoAudioVisual {

    protected String nombre;
    protected Genero genero;
    protected int anyoLanzamiento;
    protected String duracionMinutos;
    protected String director;
    protected Pegi pegi;
    protected float puntuacion;

    public ContenidoAudioVisual(String nombre, Genero genero, int anyoLanzamiento, String duracionMinutos,
                                String director, Pegi pegi, float puntuacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.anyoLanzamiento = anyoLanzamiento;
        this.duracionMinutos = duracionMinutos;
        this.director = director;
        this.pegi = pegi;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public String getDuracionMinutos() {
        return duracionMinutos;
    }

    public String getDirector() {
        return director;
    }

    public Pegi getPegi() {
        return pegi;
    }

    public float getPuntuacion() {
        return puntuacion;
    }
}
