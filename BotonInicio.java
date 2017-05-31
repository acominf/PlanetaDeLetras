import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase se llama al método de su súper clase (Boton) si es clickeado crea un mundo De Nivel 1
 * con tres vidas por defecto.

 */
public class BotonInicio extends Botones
{
    /**
     * Metodo constructor
     */
    
    public BotonInicio()
    {
        super();
    }
    
    /**
     * Act - do whatever the Jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(super.click()){
            Menu M = new Menu();
            Greenfoot.setWorld(M);
            Greenfoot.playSound("blip2.wav");
            
        
        }
        
    }    
}