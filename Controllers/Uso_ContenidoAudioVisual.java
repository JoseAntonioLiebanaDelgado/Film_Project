package Controllers;

import ENUM.Genero;
import ENUM.Pegi;
import Models.Anime;
import Models.Capitulo;
import Models.Pelicula;
import Models.Serie;

import java.util.ArrayList;

/**
 * Creación de la clase Uso_ContenidoAudioVisual.
 */
public class Uso_ContenidoAudioVisual {

    /**
     * Creación del método Main.
     *
     * @param args
     */
    public static void main(String[] args) {

        //Creamos las ArrayList necesarias para el atributo de reparto de cada objeto.
        //E a ser el reparto de cada pelicula en este caso.

        //ArrayList para almacenar reparto (5 actores/actrices) -- 3 peliculas de ESDLA.
        ArrayList<String> repartoESDLA_1_2_3 = new ArrayList<>();
        repartoESDLA_1_2_3.add("Elijah Wood");
        repartoESDLA_1_2_3.add("Sean Astin");
        repartoESDLA_1_2_3.add("Viggo Mortensen");
        repartoESDLA_1_2_3.add("Orlando Bloom");
        repartoESDLA_1_2_3.add("Ian McKellen");

        //ArrayList para almacenar reparto (5 actores/actrices) -- 3 peliculas de ElHobbit.
        ArrayList<String> repartoELHobbit_1_2_3 = new ArrayList<>();
        repartoELHobbit_1_2_3.add("Martin Freeman");
        repartoELHobbit_1_2_3.add("Ian McKellen");
        repartoELHobbit_1_2_3.add("Richard Armitage");
        repartoELHobbit_1_2_3.add("Andy Serkis");
        repartoELHobbit_1_2_3.add("Hugo Weaving");

        //ArrayList para almacenar reparto (5 actores/actrices) -- Gladiator.
        ArrayList<String> repartoGladiator = new ArrayList<>();
        repartoGladiator.add("Russell Crowe");
        repartoGladiator.add("Joaquin Phoenix");
        repartoGladiator.add("Connie Nielsen");
        repartoGladiator.add("Oliver Reed");
        repartoGladiator.add("Richard Harris");

        //ArrayList para almacenar reparto (5 actores/actrices) -- Salvar al soldado Ryan.
        ArrayList<String> repartoSalvarAlSoldadoRyan = new ArrayList<>();
        repartoSalvarAlSoldadoRyan.add("Tom Hanks");
        repartoSalvarAlSoldadoRyan.add("Matt Damon");
        repartoSalvarAlSoldadoRyan.add("Tom Sizemore");
        repartoSalvarAlSoldadoRyan.add("Vin Diesel");
        repartoSalvarAlSoldadoRyan.add("Edward Burns");

        //ArrayList para almacenar reparto (5 actores/actrices) -- Top Gun.
        ArrayList<String> repartoTopGun = new ArrayList<>();
        repartoTopGun.add("Tom Cruise");
        repartoTopGun.add("Val Kilmer");
        repartoTopGun.add("Kelly McGillis");
        repartoTopGun.add("Anthony Edwards");
        repartoTopGun.add("Meg Ryan");

        //ArrayList para almacenar reparto (5 actores/actrices) -- Top Gun Maverick.
        ArrayList<String> repartoTopGunMaverick = new ArrayList<>();
        repartoTopGunMaverick.add("Tom Cruise");
        repartoTopGunMaverick.add("Miles Teller");
        repartoTopGunMaverick.add("Val Kilmer");
        repartoTopGunMaverick.add("Glen Powell");
        repartoTopGunMaverick.add("Jennifer Connelly");


        //Creamos 10 Objetos Pelicula.
        Pelicula LaComunidadDelAnillo = new Pelicula("El señor de los anillos: La comunidad del anillo",
                Genero.AVENTURA_FANTASIA,
                2001,
                "228",
                "Peter Jakson",
                repartoESDLA_1_2_3,
                Pegi.DOCE,
                4);

        Pelicula LasDosTorres = new Pelicula("El señor de los anillos: Las dos torres",
                Genero.AVENTURA_FANTASIA,
                2002,
                "259",
                "Peter Jakson",
                repartoESDLA_1_2_3,
                Pegi.TRECE,
                4);

        Pelicula ELRetornoDelRey = new Pelicula("El señor de los anillos: El retorno del rey",
                Genero.AVENTURA_FANTASIA,
                2003,
                "254",
                "Peter Jakson",
                repartoESDLA_1_2_3,
                Pegi.TRECE,
                4);

        Pelicula UnViajeInesperado = new Pelicula("El Hobbit: Un viaje inesperado",
                Genero.AVENTURA_FANTASIA,
                2012,
                "182",
                "Peter Jakson",
                repartoELHobbit_1_2_3,
                Pegi.SIETE, 4);

        Pelicula LaDesolacionDeSmaug = new Pelicula("El Hobbit: La desolacion de Smaug",
                Genero.AVENTURA_FANTASIA,
                2013,
                "186",
                "Peter Jakson",
                repartoELHobbit_1_2_3,
                Pegi.TRECE,
                4);

        Pelicula LaBatallaDeLosCincoEjercitos = new Pelicula("El Hobbit: La batalla de los cinco ejercitos",
                Genero.AVENTURA_FANTASIA,
                2014,
                "164",
                "Peter Jakson",
                repartoELHobbit_1_2_3,
                Pegi.DIECIOCHO,
                4);

        Pelicula Gladiator = new Pelicula("Gladiator",
                Genero.ACCION,
                2000,
                "155",
                "Ridley Scott",
                repartoGladiator,
                Pegi.TRECE,
                4);

        Pelicula SalvarAlSoldadoRyan = new Pelicula("Salvar al soldado Ryan",
                Genero.BELICO,
                1998,
                "169",
                "Steven Spielberg",
                repartoSalvarAlSoldadoRyan,
                Pegi.TRECE,
                4);

        Pelicula TopGun = new Pelicula("Top Gun",
                Genero.ACCION,
                1986,
                "110",
                "Tony Scott",
                repartoTopGun,
                Pegi.CERO,
                4);

        Pelicula TopGunMaverick = new Pelicula("Top Gun: Maverick",
                Genero.ACCION,
                2022,
                "130",
                "Joseph Kosinski",
                repartoTopGunMaverick,
                Pegi.TRECE,
                4);


        //Hacemos uso de ArrayList para crear una lista de peliculas.
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        //Añadimos 10 peliculas a la lista.
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


//        ----------------------------------------   SERIES   ----------------------------------------

        //Creamos 3 objetos Capitulo. Añadiremos uno en cada objeto Serie.
        Capitulo winterIsComing = new Capitulo("Winter is coming",
                1,
                1,
                "abc",
                "def");

        Capitulo ritosDePaso = new Capitulo("Ritos de paso",
                1,
                1,
                "ghi",
                "jkl");

        Capitulo piloto = new Capitulo("Piloto",
                1,
                1,
                "mno",
                "pqr");


        //Creamos 3 objetos Serie.
        Serie gameOfThrones = new Serie("Juego de tronos",
                Genero.FANTASIA_DRAMA_ACCION_AVENTURA_TERROR,
                2011,
                "4214",
                "David Benioff",
                Pegi.DIECISEIS,
                4,
                73,
                8,
                true,
                winterIsComing);

        Serie vikings = new Serie("Vikingos",
                Genero.ACCION_AVENTURA,
                2013,
                "2684",
                "Michael Hirst",
                Pegi.DIECISEIS,
                4,
                89,
                6,
                true,
                ritosDePaso);

        Serie bigBangTheory = new Serie("Big Bang Theory",
                Genero.COMEDIA,
                2007,
                "8340",
                "Mark Cendrowski",
                Pegi.TRECE,
                4,
                279,
                12,
                true,
                piloto);


        //Hacemos uso de ArrayList para crear una lista de series.
        ArrayList<Serie> listaSeries = new ArrayList<>();
        //Añadimos 3 series a la lista.
        listaSeries.add(gameOfThrones);
        listaSeries.add(vikings);
        listaSeries.add(bigBangTheory);


//       ----------------------------------------    ANIME    ----------------------------------------


        //Creamos 3 objetos Capitulo. Añadiremos uno en cada objeto Anime.
        Capitulo elMiniGokuEsAdorableSoyGohan = new Capitulo("¡El mini-Goku es adorable! Soy Gohan",
                1,
                1,
                "aaa",
                "bbb");

        Capitulo yoSoyLuffyElFuturoReyDeLosPiratas = new Capitulo("Yo soy Luffy, el futuro rey de los piratas",
                1,
                1,
                "aaa",
                "bbb");

        Capitulo vueltaACasa = new Capitulo("Vuelta a casa",
                1,
                1,
                "aaa",
                "bbb");


        //Creamos 3 objetos Serie.
        Anime dragonBallZ = new Anime("Dragon ball Z",
                Genero.ACCION_AVENTURA_COMEDIA_ARTESMARCIALES_FANTASIA,
                1989,
                "6984",
                "Daisuke Nishio",
                Pegi.SIETE,
                4,
                "Toei Animation",
                elMiniGokuEsAdorableSoyGohan);

        Anime onePiece = new Anime("One piece",
                Genero.ACCION_AVENTURA_COMEDIA_ARTESMARCIALES_FANTASIA,
                1997,
                "En emision",
                "Eiichiro Oda",
                Pegi.SIETE,
                4,
                "Toei Animation",
                yoSoyLuffyElFuturoReyDeLosPiratas);

        Anime narutoShippuden = new Anime("YuYuHakusho",
                Genero.FANTASIA,
                2007,
                "11,500",
                "Hayato Date",
                Pegi.DOCE,
                4,
                "Pierrot",
                vueltaACasa);


        //Hacemos uso de ArrayList para crear una lista de Animes.
        ArrayList<Anime> listaAnime = new ArrayList<>();
        //Añadimos 3 Anime a la lista.
        listaAnime.add(dragonBallZ);
        listaAnime.add(onePiece);
        listaAnime.add(narutoShippuden);


    }//Llave cierre Main.
}//LLave cierre programa.


