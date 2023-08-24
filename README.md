# “VisualVault: Tu Reserva Audiovisual”<br><br>

![logo 1](Images/logo 1.png)
![logo 3](Images/logo 3.png)
![logo 2](Images/logo 2.png)

<br><br>

1. [Que es “VisualVault: Tu Reserva Audiovisual” -- Descripción](#quees)
2. [Como funciona “VisualVault: Tu Reserva Audiovisual” -- Funcionamiento](#comofunciona)
3. [Estado del proyecto](#estado)
4. [Características de la aplicación y demostración](#caracteristicas)
5. [Tecnologías utilizadas](#tecnologias)
6. [Conclusión](#conclusion)
7. [Como surgió la idea](#idea)<br><br>
- - -

## 1. ¿Qué es “VisualVault: Tu Reserva Audiovisual”? -- Descripcion <a name="quees"></a>
VisualVault: Tu Reserva Audiovisual, es una App de escritorio en Java, la cual tiene como finalidad 
almacenar los datos de películas, series y documentales, entre otros contenidos audiovisuales. 
Es una biblioteca para guardar los datos de tus contenidos audiovisuales favoritos.<br><br>
- - -

## 2. ¿Cómo funciona “VisualVault: Tu Reserva Audiovisual”? -- Funcionamiento<a name="comofunciona"></a>
Al iniciar la App, automaticamente se abre una ventana en la que a primera vista se diferencian dos apartados. 
Uno a la izquierda y otro a la derecha.

En el apartado izquierdo hay dos botones, uno para hacer login y otro para las configuraciones, 
a continuación aparecerá una barra de búsqueda, debajo aparecerá nuestra lista de elementos 
y en la parte inferior, un botón para añadir mas elementos a lista. Éste botón nos abrirá otra ventana 
para rellenar la información del nuevo elemento.

En el apartado de la derecha aparecerá el titulo de la App, la información del elemento que esté seleccionado
en la lista del apartado izquierdo y un botón que llevará a un trailer de Youtube.<br><br>
- - -

## 3. Estado del proyecto<a name="estado"></a>
El estado del proyecto está en proceso, ya que se ha empezado este verano. Mi intención de seguir con él y 
conseguir dejar una App totalmente funcional, completa, fácil de usar y sobre todo útil. 

En un futuro próximo, tengo pensado migrar los datos a una API gratis, puesto que ahora mismo la permanencia 
de los datos es local. Y sobre todo, mi intención adaptarla para iOS y Android. <br><br>
- - -

## 4. Características de la aplicación y demostración<a name="caracteristicas"></a>
Al abrir la App, aparece una la [ventana principal](#ventanaprincipal) en la que diferencian dos apartados:
-  [El apartado de la izquierda](#apartadoIzquierdo), ocupa practicamente una cuarta parte de la ventana y está formado por 4 secciones divididas horizontalmente. <br><br>

    - [La primera parte:](#primeraparte) 
      - [Botón de Login](#botonlogin)
      - [Botón de Configuraciones](#botonconfiguraciones) <br><br>
      
    - [Segunda parte:](#segundaparte)
      - [Texto titulo](#textotitulo)
      - [Icono cronómetro](#cronometro) <br><br>
      
    - [Tercera parte:](#terceraparte)
      - [Lista de elementos](#listaelementos) 
      - [Número de duracion de minutos del elemento](#duracion) <br><br>
    
    - [Cuarta Parte:](#cuartaparte)
      - [Botón añadir](#botonañadir) --> [(Abre otra ventana nueva)](#ventananueva) <br><br><br>

-  [El apartado de la derecha](#apartadoDerecho), ocupa practicamente tres cuartas partes de la ventana y está formado por 2 secciones divididas por un recuadro central. <br><br>

    - [La parte exterior del recuadro:](#parteexterior)
      - [Titulo y logo de la App](#tituloylogo) <br><br>

    - [La parte interior del recuadro. La cual también está dividida en dos partes:](#parteinterior) 
      - [Parte izquierda](#parteizquierda)
        - [Campos descriptivos](#camposdescriptivos)
        - [Campos definidos](#camposdefinidos) <br><br>
      - [Parte derecha](#partederecha)
        - [Imagen portada](#imagenportadda)
        - [Botón trailer](#botontrailer)<br><br>
- - -

## 5. Tecnologías utilizadas<a name="tecnologias"></a>
En este proyecto se han utilizado las siguientes tecnologías: 
- Google
- GitHub Desktop 
- IDE: IntelliJ<br>

![TecnologiasUtilizadas](Images/TecnologiasUtilizadas.png)

- - -

## 6. Conclusión<a name="conclusion"></a>
A día de hoy puedo dar una conclusión, pero no final, ya que como comentaba el proyecto no está ni mucho menos acabado. 

Dedicar mi tiempo en este pequeño proyecto ha servido para poder seguir adquiriendo confianza y motivación, 
ya que me he encontrado con nuevos problemas y los he superado.

En resumidas cuentas, mi conclusión actual, es que este proyecto me ha sido beneficioso en todos los aspectos. <br><br>
- - -

## 7. Como surgió la idea<a name="idea"></a>

Esta idea surgió hablando con un amigo, el cual pasa muchas horas viendo series y películas. 
Me dijo que con todas las plataformas que hay, cada vez cuesta más de escoger una película o una serie y 
que al final casi siempre ve las mismas. Le contesté que se hiciese una lista de películas
clasificadas como a él le conviniese y no perdería tanto tiempo.

Entonces pensé que podía crear una biblioteca personal en la que cada usuario pueda añadir 
los nombres y datos de películas o series que le interese, pudiéndose clasificar por carpetas y demás,
de esa manera no se perdería tanto tiempo buscando y viendo portadas de películas que no te interesan. <br><br>
- - -


## Funcionamiento de elementos por partes  <br><br>

- Ventana principal<a name="ventanaprincipal"></a>  <br><br>
![Imagen Ventana Principal](Images/Imagen Ventana Principal.png)<br><br>

    - Apartado izquierdo<a name="apartadoIzquierdo"></a> <br><br>
En el apartado izquierdo hay dos botones, uno para hacer login y otro para las configuraciones, 
a continuación aparecerá una barra de búsqueda, debajo aparecerá nuestra lista de elementos 
y en la parte inferior, un botón para añadir mas elementos a lista. 
Éste botón nos abrirá otra ventana la cual tendrá como función almacenar información de un nuevo 
elemento y una vez añadido, aparecerá en la lista.)<br><br>
![Apartado Izquierdo](Images/Apartado izquierdo.png)<br><br>

        - Primer módulo<a name="primeraparte"></a> <br><br>
        En el primer módulo aparecen los dos botones. <br>
        El del Login y el de las Configuraciones.<br><br>
        ![Modulo 1de4](Images/Modulo 1de4.png)<br><br>
            - Boton de Login<a name="botonlogin"></a><br><br>
              ![Boton login](Images/Boton login.png)<br><br>
            - Boton de Configuraciones<a name="botonconfiguraciones"></a> <br><br>
              ![Boton configuraciones](Images/Boton configuraciones.png)<br><br>

        - Segundo módulo<a name="segundaparte"></a> <br><br>

          En el segundo módulo hay un pequeño apartado con un escrito “Titulo Elemento” y al lado un icono de un cronometro.
          Y justo debajo y haciendo referencia al escrito y al icono, debajo del escrito estarán los nombres de 
          los elementos y justo al lado, debajo del icono del cronómetro se especifíca la duración del elemento en minutos. <br><br>
          ![Modulo 2de4](Images/Modulo 2de4.png)<br><br>

          - Texto titulo<a name="textotitulo"></a><br><br>
          ![Titulo elemento](Images/Titulo elemento.png)<br><br>
          - Icono cronómetro<a name="cronometro"></a> <br><br>
          ![Cronometro](Images/Cronometro.png)<br><br>

        - Tercer módulo<a name="terceraparte"></a><br><br>

          En el tercer módulo, justo debajo del segundo, haciendo referencia al escrito y al icono se sitúan los nombres de los elementos 
          y justo al lado, debajo del icono del cronómetro se especifíca la duración del elemento en minutos. <br><br>
          ![Lista](Images/Lista.png)<br><br>

            - Lista de elementos<a name="listaelementos"></a><br><br>
            ![Lista nombres](Images/Lista nombres.png)<br><br>

            - Número de duracion de minutos del elemento<a name="duracion"></a> <br><br>
            ![Lista minutos](Images/Lista minutos.png)<br><br>

        - Cuarto módulo<a name="cuartaparte"></a> <br><br>
        En el cuarto módulo tenemos unicamente el botón para añadir nuevos elementos a la lista. <br><br>
            - Botón Añadir (Abre otra ventana nueva)<a name="botonañadir"></a> <br><br>
            ![Boton añadir ventana principal](Images/Boton añadir ventana principal.png)<br><br>

    - Apartado derecho<a name="apartadoDerecho"></a> <br><br>

        - Parte exterior<a name="parteexterior"></a> 
            - Titulo y logo de la App<a name="tituloylogo"></a> <br><br>
        
        - Parte interior<a name="parteinterior"></a> 
            - Parte izquierda<a name="parteinterior"></a>
                - Campos descriptivos<a name="camposdescriptivos"></a>
                - Campos definidos<a name="camposdefinidos"></a> <br><br>
              
            - Parte derecha<a name="partederecha"></a>
                - Imagen portada<a name="imagenportada"></a>
                - Botón trailer<a name="botontrailer"></a>
    


    
