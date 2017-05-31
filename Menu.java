
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World

{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        //creamos El contorno del Menu
		super(800, 600, 1);
		
		//Creamos el boton de jugar
        BotonJuega Bj= new BotonJuega();
        addObject(Bj,150,100);
        //Creamos nuestro boton de inicio
        BotonAyuda Ba= new BotonAyuda();
        addObject(Ba,400,100);//Posicion en y,x
        //Creamos nuestro boton de inicio
        BotonSalir Bs= new BotonSalir();
        addObject(Bs,650,100);//Posicion en y,x
        
    }
}
