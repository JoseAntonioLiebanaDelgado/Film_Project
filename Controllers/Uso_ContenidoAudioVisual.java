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


        //Procedemos a la creacion de objetos, creamos 10 objetos con todos sus atributos correspondientes.
        //Todos los atributos excepto el de reparto son heredados de la clase padre (ContenidoAudioVisual).
        //El atributo de reparto se ha creado en la clase Pelicula.
        Pelicula LaComunidadDelAnillo = new Pelicula("El señor de los anillos: La comunidad del anillo", Genero.AVENTURA_FANTASIA, 2001, "228", "Peter Jakson", repartoESDLA_1_2_3, Pegi.DOCE, 4);
        Pelicula LasDosTorres = new Pelicula("El señor de los anillos: Las dos torres", Genero.AVENTURA_FANTASIA, 2002, "259", "Peter Jakson", repartoESDLA_1_2_3, Pegi.TRECE, 4);
        Pelicula ELRetornoDelRey = new Pelicula("El señor de los anillos: El retorno del rey", Genero.AVENTURA_FANTASIA, 2003, "254", "Peter Jakson", repartoESDLA_1_2_3, Pegi.TRECE, 4);
        Pelicula UnViajeInesperado = new Pelicula("El Hobbit: Un viaje inesperado", Genero.AVENTURA_FANTASIA, 2012, "182", "Peter Jakson", repartoELHobbit_1_2_3, Pegi.SIETE, 4);
        Pelicula LaDesolacionDeSmaug = new Pelicula("El Hobbit: La desolacion de Smaug", Genero.AVENTURA_FANTASIA, 2013, "186", "Peter Jakson", repartoELHobbit_1_2_3, Pegi.TRECE, 4);
        Pelicula LaBatallaDeLosCincoEjercitos = new Pelicula("El Hobbit: La batalla de los cinco ejercitos", Genero.AVENTURA_FANTASIA, 2014, "164", "Peter Jakson", repartoELHobbit_1_2_3, Pegi.DIECIOCHO, 4);
        Pelicula Gladiator = new Pelicula("Gladiator", Genero.ACCION, 2000, "155", "Ridley Scott", repartoGladiator, Pegi.TRECE, 4);
        Pelicula SalvarAlSoldadoRyan = new Pelicula("Salvar al soldado Ryan", Genero.BELICO, 1998, "169", "Steven Spielberg", repartoSalvarAlSoldadoRyan, Pegi.TRECE, 4);
        Pelicula TopGun = new Pelicula("Top Gun", Genero.ACCION, 1986, "110", "Tony Scott", repartoTopGun, Pegi.CERO, 4);
        Pelicula TopGunMaverick = new Pelicula("Top Gun: Maverick", Genero.ACCION, 2022, "130", "Joseph Kosinski", repartoTopGunMaverick, Pegi.TRECE, 4);


        //Hacemos uso de ArrayList para crear una lista de peliculas.
        //Hacemos esto porque queremos imprimirlas mas tarde a traves de una funcion.
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

        //Creamos la cabecera de la funcion y le pasamos por parametro el ArrayList (listaPeliculas).
        System.out.println("\nLISTA PELICULAS:");
        imprimirListaPeliculasForeach(listaPeliculas);


//        ----------------------------------------   PASAMOS A LAS SERIES   ----------------------------------------


        //TODO: Insertar los atributos creados en la clase (Serie). --> Los que no han sido heredados <-- .

        Serie GameOfThrones = new Serie("Juego de tronos", Genero.FANTASIA_DRAMA_ACCION_AVENTURA_TERROR, 2011, "4214", "David Benioff", Pegi.DIECISEIS, 4);
        Serie Vikings = new Serie("Vikingos", Genero.ACCION_AVENTURA, 2013, "2684", "Michael Hirst", Pegi.DIECISEIS, 4);
        Serie BigBangTheory = new Serie("Big Bang Theory", Genero.COMEDIA, 2007, "8340", "Mark Cendrowski", Pegi.TRECE, 4);

        ArrayList<Serie> listaSeries = new ArrayList<>();

        //Añadimos 3 series a la lista.
        listaSeries.add(GameOfThrones);
        listaSeries.add(Vikings);
        listaSeries.add(BigBangTheory);

        //Creamos la cabecera de la funcion y le pasamos por parametro el ArrayList (listaSeries).
        System.out.println("\nLISTA SERIES:");
        imprimirListaSeriesForeach(listaSeries);


//        ----------------------------------------    PASAMOS A LOS CAPITULOS    ----------------------------------------


        //TODO: Insertar los atributos creados en la clase (Capitulo). --> Los que no han sido heredados <-- .

        Capitulo E10_T04_LosNinos = new Capitulo("Los niños", Genero.FANTASIA_DRAMA_ACCION_AVENTURA_TERROR, 2014, "54", "David Benioff", Pegi.DIECISEIS, 4);
        Capitulo E19_T06_ElsenorDa = new Capitulo("El Señor da..", Genero.ACCION_AVENTURA, 2020, "44", "Michael Hirst", Pegi.DIECISEIS, 4);
        Capitulo E17_T01_FactorMandarina = new Capitulo("Factor Mandarina", Genero.COMEDIA, 2008, "20", "Mark Cendrowski", Pegi.TRECE, 4);

        ArrayList<Capitulo> listaCapitulos = new ArrayList<>();

        //Añadimos 3 series a la lista.
        listaCapitulos.add(E10_T04_LosNinos);
        listaCapitulos.add(E19_T06_ElsenorDa);
        listaCapitulos.add(E17_T01_FactorMandarina);

        //Creamos la cabecera de la funcion y le pasamos por parametro el ArrayList (listaCapitulos).
        System.out.println("\nLISTA CAPITULOS:");
        imprimirListaCapitulosForeach(listaCapitulos);


//        ----------------------------------------       PASAMOS AL ANIME        ----------------------------------------


        //TODO: Insertar los atributos creados en la clase (Anime). --> Los que no han sido heredados <-- .

        Anime DragonBallZ = new Anime("Dragon ball Z", Genero.ACCION_AVENTURA_COMEDIA_ARTESMARCIALES_FANTASIA, 1989, "6984", "Daisuke Nishio", Pegi.SIETE, 4);
        Anime OnePiece = new Anime("One piece", Genero.ACCION_AVENTURA_COMEDIA_ARTESMARCIALES_FANTASIA, 1997, "Null", "Eiichiro Oda", Pegi.SIETE, 4);
        Anime YuYuHakusho = new Anime("YuYuHakusho", Genero.FANTASIA, 1990, "2240", "Yoshihiro Togashi", Pegi.SIETE, 4);

        ArrayList<Anime> listaAnime = new ArrayList<>();

        //Añadimos 3 Anime a la lista.
        listaAnime.add(DragonBallZ);
        listaAnime.add(OnePiece);
        listaAnime.add(YuYuHakusho);

        //Creamos la cabecera de la funcion y le pasamos por parametro el ArrayList (listaAnime).
        System.out.println("\nLISTA ANIME:");
        imprimirListaAnimesForeach(listaAnime);


//        ----------------------------------------    PASAMOS AL ANIME PELIS     ----------------------------------------
//        ----------------------------------------    PASAMOS AL ANIME SERIES    ----------------------------------------


    } //Llave cierre Main.


    /**
     * Creamos la función que imprimirá la lista de peliculas con cada uno de sus atributos, haciendo uso de ArrayList y un bucle for-each.
     *
     * @param lista
     */
    public static void imprimirListaPeliculasForeach(ArrayList<Pelicula> lista) {
        lista.forEach(peli -> {
            System.out.println("Título: " + peli.getNombre() + ". Genero: " + peli.getGenero() + ". Anyo de lanzamiento: " + peli.getAnyoLanzamiento() +
                    ". Duracion: " + peli.getDuracionMinutos() + " minutos. Director: " + peli.getDirector() +
                    ". Reparto: " + peli.getReparto() + ". Pegi: " + peli.getPegi() + ". Puntuacion: " + peli.getPuntuacion() + ".");
        });
    }

    /**
     * Creamos la función que imprimirá la lista de series con cada uno de sus atributos, haciendo uso de ArrayList y un bucle for-each.
     * FALTAN POR AÑADIR LOS ATRIBUTOS QUE HEMOS CREADO EN LA CLASE SERIE (LOS QUE NO HAN SIDO HEREDADOS).
     *
     * @param lista
     */
    public static void imprimirListaSeriesForeach(ArrayList<Serie> lista) {
        lista.forEach(serie -> {
            System.out.println("Título: " + serie.getNombre() + ". Genero: " + serie.getGenero() + ". Anyo de lanzamiento: " + serie.getAnyoLanzamiento() +
                    ". Duracion: " + serie.getDuracionMinutos() + " minutos. Director: " + serie.getDirector() +
                    ". Pegi: " + serie.getPegi() + ". Puntuacion: " + serie.getPuntuacion() + ".");
        });
    }

    /**
     * Creamos la función que imprimirá la lista de series con cada uno de sus atributos, haciendo uso de ArrayList y un bucle for-each.
     * FALTAN POR AÑADIR LOS ATRIBUTOS QUE HEMOS CREADO EN LA CLASE CAPITULO (LOS QUE NO HAN SIDO HEREDADOS).
     *
     * @param lista
     */
    private static void imprimirListaCapitulosForeach(ArrayList<Capitulo> lista) {
        lista.forEach(cap -> {
            System.out.println("Título: " + cap.getNombre() + ". Genero: " + cap.getGenero() + ". Anyo de lanzamiento: " + cap.getAnyoLanzamiento() +
                    ". Duracion: " + cap.getDuracionMinutos() + " minutos. Director: " + cap.getDirector() +
                    ". Pegi: " + cap.getPegi() + ". Puntuacion: " + cap.getPuntuacion() + ".");
        });
    }

    /**
     * Creamos la función que imprimirá la lista de series con cada uno de sus atributos, haciendo uso de ArrayList y un bucle for-each.
     * FALTAN POR AÑADIR LOS ATRIBUTOS QUE HEMOS CREADO EN LA CLASE CAPITULO (LOS QUE NO HAN SIDO HEREDADOS).
     *
     * @param lista
     */
    private static void imprimirListaAnimesForeach(ArrayList<Anime> lista) {
        lista.forEach(anime -> {
            System.out.println("Título: " + anime.getNombre() + ". anime: " + anime.getGenero() + ". Anyo de lanzamiento: " + anime.getAnyoLanzamiento() +
                    ". Duracion: " + anime.getDuracionMinutos() + " minutos. Director: " + anime.getDirector() +
                    ". Pegi: " + anime.getPegi() + ". Puntuacion: " + anime.getPuntuacion() + ".");
        });
    }

} //LLave cierre programa.


