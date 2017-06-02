import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es responsable de mostrar la imagen de menú principal y agregar los botones que
 * contiene el menú, los cuales son: El botón jugar, Ayuda, Créditos y Salir.
 * 
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        creaBotones();
        prepare();
    }
    
    /**
     * agrega los objetos (botones) que tiene el menu por defecto.
     * jugar - ayuda - record - salir
     */
    private void prepare()
    {

    }
    
    /**
     * crea los botones del menu
     */
    private void  creaBotones()
    {
        Jugar jugar = new Jugar();
        Ayuda ayuda = new Ayuda();
        Creditos record = new Creditos();
        Salir salir = new Salir();
        int x = getWidth() / 2;
        
        addObject(jugar,150,100);
        addObject(ayuda,400,100);
        //addObject(record,x,280);
        addObject(salir,650,100);
    }
}