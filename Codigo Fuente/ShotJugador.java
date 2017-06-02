import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Esta clase es usada para cuando el enemigo dispara se crea un Objeto de este tipo que se mueve de
 * la parte inferior a la superior.
 * 
 */
public class ShotJugador extends Shot
{   
    /**
     * metodo constructor
     * @param direction es un entero que asigna la direccion de diparo.
     */
     //int shotImage=1;
   
    public ShotJugador(int direction)
    {
        super(direction);
    }
    
    /**
     * Act - do whatever the ShotJugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.mueveShot();
        int i;
        //setImage("bala/bala "+shotImage+".png");
        Actor Enemigo = getOneObjectAtOffset(0,0,Enemigo.class);
        if(Enemigo != null){
            espacio m = (espacio)getWorld();
            incrementScore();
            for(i = 1; i <= 5 ;i++ ){
                setImage("Explosion" +i+ ".png");
            }
            getWorld().removeObject(Enemigo);
            getWorld().removeObject(this);
            Greenfoot.playSound("explosion.wav");
            
            
        }
        else{
            super.eliminaObjetoBorde();
        }
        
        
           
            /*    if(shotImage<16)
                shotImage++;
                else
                shotImage=1;*/
    }
    
    
    /**
     * Incrementa la puntuacion del jugador cuando destruye un enemigo
     */
    public void incrementScore()
    {
        World mundo = getWorld();
        espacio myWorld = (espacio)mundo;
        myWorld.getJugador().incrementDesctruccion();
        int x = myWorld.getJugador().getScore();
        myWorld.getScoreCounter().setValue(x);
        //myWorld.getWormsEaten().setValue(super.getWormsEaten());
    }
}
