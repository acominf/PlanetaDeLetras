# PlanetaDeLetras

![En construcción](https://github.com/acominf/PlanetaDeLetras/blob/master/PlanetaDeLetras1/images/Menu.png)

### Objetivo del juego/aplicación
El objetivo del juego/aplicación es conseguir la mas alta cantdad de puntos en cierto tiempo esquivando los signs de admiracion y 
destryendo naves y atrapando letras 

### Descripción del juego/aplicación
Es un juego didactico para que el niño aprenda las bocales se trata de ir matando a los enemigos para ir acumulando puntos

### Clases principales y sus características
1. Espacio
* Esta clase es, la súper clase de los Niveles 1, 2 y 3. En esta se crean las instancias que tendrán cada nivel, y los métodos que se usan en los tres niveles. Las instancias utilizadas son tiempo para agregar enemigo, aliado, nube radiactiva, bonus, etc. Dentro de esta misma se crea el jugador por lo que las subclases (niveles) lo contengan todas. Algunos de los métodos dentro de esta clase son para agregar los Objetos al mundo y validar los tiempos de los Objetos. También se agregan dos Objetos para simular el Scroll y llaman a su método de movimiento. 

2. Game Over
* Esta clase tiene la responsabilidad de mostrar una imagen indicando al jugador si ha perdido en el juego y después dentro de ella misma llama al menú para regresar a las opciones de menú del juego.


3. Boton
* Esta es una clase padre para todo los Botones de Jugar, Ayuda, Creditos y Salir esta clase solo tiene un método que su tarea es validar si se clickea en dichos Objetos. Regresa un true indicando que se ha seleccionado el botón.


4. Nave
* Esta clase tiene la responsabilidad de representar a los objetos que interactúan como jugadores en el juego tanto jugador controlado como los enemigos que son la computadora. En esta clase se encuentra la instancia de disparo que es heredada a las subclases de Nave, Enemigo y LiderEnemigo.

5. Shot
* Esta clase tiene dos instancias que es la velocidad de disparo y la dirección estas instancias se inicializan en su método constructor. Tiene cuatro métodos que son utilizados por su sus subclases.

### Diagrama de clases
![Diagrama](https://lh3.googleusercontent.com/-k71G8Nzx7Xs/WTHRmssqRjI/AAAAAAAACL8/dAcTh_sp5LwT2ZmCgUs-bxsX6akxXD_pACL0B/w530-d-h356-p-rw/Diagrama%2Bde%2Bclases.png)

### Autor(es)
El autor(es) del proyecto son:
- Alonso Gonzales Juan Carlos (@biciadicto)
- Govea Celestino Jose Sebastian (@ayserz119)

### Materia(s)
- Programación Orientada a Objetos

### Semestre
- 2016-2017/II

### Universidad Autónoma de San Luis Potosí, 2017

### Markdown
El contenido de esta página está escrito en un lenguaje de marcado sencillo llamado _Markdown_. **Para modificar el contenido de esta página se tiene que editar el archivo README.md del repositorio**. Para más detalles consulta la página de [Markdown para GitHub](https://guides.github.com/features/mastering-markdown/).

### Temas de Jekyll
El estilo y presentación de esta página utiliza el tema de Jekyll seleccionado en la configuración del repositorio. El nombre de este tema está almacenado en el archivo de configuración `_config.yml`. Para más información acerca de los temas de Jekyll soportados por GitHub [haz click en este enlace](https://pages.github.com/themes/).
