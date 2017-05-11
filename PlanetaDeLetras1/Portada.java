import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portada extends World
{
    private Espacio juego;
    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Portada()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1000, 600, 1);
             setBackground("Fondo1.png");
         juego=new Espacio();
         prepare();
         
         
         
         Inicio Bi= new Inicio();
         addObject(Bi,900,550);//Posicion en y,x

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
     public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(juego); 
            
        }
    }
}