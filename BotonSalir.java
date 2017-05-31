import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonJuega here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonSalir extends Botones
{
    public BotonSalir()
    {
        super();
    }
    /**
     * Act - do whatever the BotonJuega wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    if(super.click())
        {
           
            Greenfoot.playSound("blip2.wav");
            System.exit(1);
            
        }
        
    }
}
