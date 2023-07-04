package Controllers;

import ENUM.Genero;
import ENUM.Pegi;
import Models.Pelicula;

import java.util.ArrayList;

public class Uso_ContenidoAudioVisual {
    public static void main(String[] args) {

        //Creamos las ArrayList necesarias para el atributo de reparto de cada objeto.
        //E a ser el reparto de cada pelicula en este caso.

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
        Pelicula TopGun = new Pelicula("Top Gun", Genero.ACCION, 1986, "110", "Tony Scott", repartoTopGun, Pegi.CERO,4);
        Pelicula TopGunMaverick = new Pelicula("Top Gun: Maverick", Genero.ACCION, 2022, "130", "Joseph Kosinski", repartoTopGunMaverick, Pegi.TRECE, 4);


        //Hacemos uso de ArrayList para crear una lista de peliculas.
        //Hacemos esto porque queremos imprimirlas mas tarde a traves de una funcion.
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

        //Añadimos 10 peliculas a la lista
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
        imprimirListaPeliculasForeach(listaPeliculas);

    } //Llave cierre Main

    /**
     * Creamos la función que imprimirá la lista de peliculas con cada uno de sus atributos, haciendo uso de ArrayList y un bucle for-each.
     * @param lista
     */
    public static void imprimirListaPeliculasForeach(ArrayList<Pelicula> lista){
        lista.forEach(peli -> {
            System.out.println("Título: " + peli.getNombre() + ". Genero: " + peli.getGenero() + ". Anyo de lanzamiento: " + peli.getAnyoLanzamiento() +
                    ". Duracion: " + peli.getDuracionMinutos() + " minutos. Director: " + peli.getDirector() +
                    ". Reparto: " + peli.getReparto() + ". Pegi: " + peli.getPegi() + ". Puntuacion: " + peli.getPuntuacion() + ".");
        });
    }

} //LLave cierre programa


