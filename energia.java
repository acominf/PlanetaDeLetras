import greenfoot.*;

/**
 * Write a description of class energia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class energia extends Actor
{
    /**
     * Act - do whatever the energia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        espacio esp=(espacio)getWorld();
        Actor act=getOneIntersectingObject(nave.class);//Cuando la nave tome el poder 
        if(act!=null)
        {
            for(int i=1;i<=10;i++)//incrementa el poder mediante el metodo  solo 1s disparos
                 esp.poder.incrementar();
                 getWorld().removeObject(this);
                 Greenfoot.playSound("Poder.wav");
        }
        
    }    
}
