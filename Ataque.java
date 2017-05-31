import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Ataque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ataque extends Actor
{
    int direccion ;
    
    public Ataque(int dir){
       
        direccion=dir;
        if(dir==1)
        turn(0);
        else
        turn(180);
    }
    public void act() 
    {
        move(4);
        nave nav=(nave)getOneObjectAtOffset(0,0,nave.class);
        if(nav!=null)
        {
            espacio esp=(espacio)getWorld();
            getWorld().removeObject(nav);
            esp.vidas.decrementar();
           getWorld().addObject(new nave(),50,300);
           if(esp.vidas.obtenerValor()==0)
           {//Mandamos llamar los metodos y utilizamos una condicion
             GameOver t=new GameOver();
             getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));//Es para que el letrero salga  en medio
            }
            getWorld().removeObject(this);
        }
          else
        {
            if((getX()>=getWorld().getWidth()-5)||(getX()<=5))
           {
            getWorld().removeObject(this);//si la bala se sale la borramos
           }
            
        }
    }
}    
    
        