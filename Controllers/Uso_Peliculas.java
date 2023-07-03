package Controllers;

import ENUM.Genero;
import ENUM.Pegi;
import Models.Film;

import java.util.ArrayList;

public class Uso_Peliculas {
    public static void main(String[] args) {

        //ArrayList para almacenar reparto (5 actores/actrices) -- 3 peliculas de ESDLA
        ArrayList<String> repartoESDLA_1_2_3 = new ArrayList<>();
        repartoESDLA_1_2_3.add("Elijah Wood");
        repartoESDLA_1_2_3.add("Sean Astin");
        repartoESDLA_1_2_3.add("Viggo Mortensen");
        repartoESDLA_1_2_3.add("Orlando Bloom");
        repartoESDLA_1_2_3.add("Ian McKellen");

        //ArrayList para almacenar reparto (5 actores/actrices) -- 3 peliculas de ElHobbit
        ArrayList<String> repartoELHobbit_1_2_3 = new ArrayList<>();
        repartoELHobbit_1_2_3.add("Martin Freeman");
        repartoELHobbit_1_2_3.add("Ian McKellen");
        repartoELHobbit_1_2_3.add("Richard Armitage");
        repartoELHobbit_1_2_3.add("Andy Serkis");
        repartoELHobbit_1_2_3.add("Hugo Weaving");

        //ArrayList para almacenar reparto (5 actores/actrices) -- Gladiator
        ArrayList<String> repartoGladiator = new ArrayList<>();
        repartoGladiator.add("Russell Crowe");
        repartoGladiator.add("Joaquin Phoenix");
        repartoGladiator.add("Connie Nielsen");
        repartoGladiator.add("Oliver Reed");
        repartoGladiator.add("Richard Harris");

        //ArrayList para almacenar reparto (5 actores/actrices) -- Salvar al soldado Ryan
        ArrayList<String> repartoSalvarAlSoldadoRyan = new ArrayList<>();
        repartoSalvarAlSoldadoRyan.add("Tom Hanks");
        repartoSalvarAlSoldadoRyan.add("Matt Damon");
        repartoSalvarAlSoldadoRyan.add("Tom Sizemore");
        repartoSalvarAlSoldadoRyan.add("Vin Diesel");
        repartoSalvarAlSoldadoRyan.add("Edward Burns");

        //ArrayList para almacenar reparto (5 actores/actrices) -- Top Gun
        ArrayList<String> repartoTopGun = new ArrayList<>();
        repartoTopGun.add("Tom Cruise");
        repartoTopGun.add("Val Kilmer");
        repartoTopGun.add("Kelly McGillis");
        repartoTopGun.add("Anthony Edwards");
        repartoTopGun.add("Meg Ryan");

        //ArrayList para almacenar reparto (5 actores/actrices) -- Top Gun Maverick
        ArrayList<String> repartoTopGunMaverick = new ArrayList<>();
        repartoTopGunMaverick.add("Tom Cruise");
        repartoTopGunMaverick.add("Miles Teller");
        repartoTopGunMaverick.add("Val Kilmer");
        repartoTopGunMaverick.add("Glen Powell");
        repartoTopGunMaverick.add("Jennifer Connelly");


        Film LaComunidadDelAnillo = new Film("El señor de los anillos: La comunidad del anillo", Genero.AVENTURAFANTASIA, 2001, "228", "Peter Jakson", repartoESDLA_1_2_3, Pegi.DOCE, 4);
        Film LasDosTorres = new Film("El señor de los anillos: Las dos torres", Genero.AVENTURAFANTASIA, 2002, "259", "Peter Jakson", repartoESDLA_1_2_3, Pegi.TRECE, 4);
        Film ELRetornoDelRey = new Film("El señor de los anillos: El retorno del rey", Genero.AVENTURAFANTASIA, 2003, "254", "Peter Jakson", repartoESDLA_1_2_3, Pegi.TRECE, 4);
        Film UnViajeInesperado = new Film("El Hobbit: Un viaje inesperado", Genero.AVENTURAFANTASIA, 2012, "182", "Peter Jakson", repartoELHobbit_1_2_3, Pegi.SIETE, 4);
        Film LaDesolacionDeSmaug = new Film("El Hobbit: La desolacion de Smaug", Genero.AVENTURAFANTASIA, 2013, "186", "Peter Jakson", repartoELHobbit_1_2_3, Pegi.TRECE, 4);
        Film LaBatallaDeLosCincoEjercitos = new Film("El Hobbit: La batalla de los cinco ejercitos", Genero.AVENTURAFANTASIA, 2014, "164", "Peter Jakson", repartoELHobbit_1_2_3, Pegi.DIECIOCHO, 4);
        Film Gladiator = new Film("Gladiator", Genero.ACCION, 2000, "155", "Ridley Scott", repartoGladiator, Pegi.TRECE, 4);
        Film SalvarAlSoldadoRyan = new Film("Salvar al soldado Ryan", Genero.BELICO, 1998, "169", "Steven Spielberg", repartoSalvarAlSoldadoRyan, Pegi.TRECE, 4);
        Film TopGun = new Film("Top Gun", Genero.ACCION, 1986, "110", "Tony Scott", repartoTopGun, Pegi.CERO,4);
        Film TopGunMaverick = new Film("Top Gun: Maverick", Genero.ACCION, 2022, "130", "Joseph Kosinski", repartoTopGunMaverick, Pegi.TRECE, 4);


        System.out.println("El titulo de la pelicula es " + LaComunidadDelAnillo.getNombre() + ", la fecha de lanzamiento fue en el año " + LaComunidadDelAnillo.getAnyoLanzamiento() + ", 5 " +
                "de los actores que aparecen en esta pelicula son " + repartoESDLA_1_2_3 + ". Esta pelicula es recomendada para mayores de " + Pegi.TRECE + " años y es del genero de " + Genero.FANTASIA + ".");



        ArrayList<Film> listaPeliculas = new ArrayList<>();
//        listaPeliculas = bibliotecaInicial();

        listaPeliculas.add(LaComunidadDelAnillo);
        listaPeliculas.add(LasDosTorres);
        listaPeliculas.add(ELRetornoDelRey);
        listaPeliculas.add(UnViajeInesperado);
        listaPeliculas.add(LaDesolacionDeSmaug);
        listaPeliculas.add(LaBatallaDeLosCincoEjercitos);
        listaPeliculas.add(Gladiator);
        listaPeliculas.add(SalvarAlSoldadoRyan);
        listaPeliculas.add(TopGun);
        listaPeliculas.add(TopGunMaverick);


        for (int i = 0; i < listaPeliculas.size(); i++) {
            // Obtenemos las películas en la posición i de la lista utilizando el método get(i).
            // La película se asigna a la variable llamada pelicula de tipo Film.
            Film pelicula = listaPeliculas.get(i);
            System.out.println("Título: " + pelicula.getNombre() + ". Anyo de lanzamiento: " + pelicula.getAnyoLanzamiento() +
                    ". Duracion: " + pelicula.getDuracion() + " minutos. Director: " + pelicula.getDirector() +
                    ". Reparto: " + pelicula.getReparto() + ". Puntuacion: " + pelicula.getPuntuacion());
        }
    }

//    private static ArrayList<Film> bibliotecaInicial() {
//        return
//    }


}



















