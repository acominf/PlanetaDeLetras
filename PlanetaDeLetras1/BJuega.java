import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BJuega here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BJuega extends Boton
{
    /**
     * Act - do whatever the BJuega wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
        // Add your action code here.
        if(super.click()){
            Espacio E = new Espacio();
            Greenfoot.setWorld(E);
        }
        
    }   
    }    
}
