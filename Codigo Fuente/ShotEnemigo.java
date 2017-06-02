import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**Esta clase es usada para cuando el enemigo dispara se crea un Objeto de este tipo que se mueve de
 * la parte superior a la inferior.
 * 
 */
public class ShotEnemigo extends Shot
{
    
    /**
     * Contructor
     * @param direction es un entero que asigna la direccion de disparo
     */
    public ShotEnemigo(int direction)
    {
        super(direction);
    }
    
    
    /**
     * Act - do whatever the ShotEnemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.mueveShot();
        Actor Avion = getOneObjectAtOffset(0,0,Avion.class);
        if(Avion!= null)
        {
            espacio m = (espacio)getWorld();
            getWorld().removeObject(Avion);
            getWorld().removeObject(this);
            Greenfoot.playSound("Explosion1.wav");
        }
        else
        {
            super.eliminaObjetoBorde();
        }
    } 
    
    
}
