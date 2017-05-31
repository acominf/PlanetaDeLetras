import greenfoot.*;

public class Botones extends Actor
{
    /**
     * Metodo Constructor
     */
    public Botones()
    {
    }
    
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         // Add your action code here.
    }
    
    /**
     * Este metodo checa si clickea en la imagen de este Objeto
     * en caso de que sea clickeado con el mouse retorna true
     * de lo contrario un false
     */
    public boolean click()
    {
        if(Greenfoot.mouseClicked(this)){
            return true;
        }
        else{
            return false;
        }
    }
}