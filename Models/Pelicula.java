package Models;

import ENUM.Genero;
import ENUM.Pegi;

import java.util.ArrayList;

public class Pelicula {

    //Hacemos los atributos protected para que puedan ser tratados como un atributo propio en las clases hijas.
    protected String nombre;
    protected Genero genero;
    protected int anyoLanzamiento;
    protected String duracion;
    protected String director;
    protected ArrayList<String> reparto;
    protected Pegi pegi;
    protected float puntuacion; //Con rango de 0 a 5


    public Pelicula(String nombre, Genero genero, int anyoLanzamiento, String duracion, String director, ArrayList<String> reparto, Pegi pegi, float puntuacion) {
        this.nombre = nombre; //el 2 nombre es el que entra por parametro
        this.genero = genero;
        this.anyoLanzamiento = anyoLanzamiento;
        this.duracion = duracion;
        this.director = director;
        this.reparto = reparto;
        this.pegi = pegi;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero.toString();
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getReparto() {
        return reparto;
    }

    public String getPegi() {
        return pegi.toString();
    }

    public float getPuntuacion() {
        return puntuacion;
    }
}
