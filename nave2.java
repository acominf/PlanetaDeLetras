import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.*;
/**
 * Write a description of class nave2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave2 extends Actor
{
    /**
     * Act - do whatever the nave2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int velocidad=4;
    int direccion=1;
    boolean cambia = false;//
      
    public void act() 
    {
        if(getRotation()!=180);
            setRotation(180);
            
       if(getY()>=30&& !cambia)
       {
           direccion =-1;//-1 es hacia arriba
       }
       else
       {
           cambia=true;
       }
       if(getY()<=getWorld().getHeight()-30&&cambia)
       {
           direccion=1;// hacia abajo
       }
       else
       {
           cambia=false;
       }   
           setLocation(getX(),getY()+(velocidad*direccion));
           reglas();
           
           int x=Greenfoot.getRandomNumber(50); //randon para dar tiempo de atacar al jefe
           if(x==25)
           {
               Ataque attack=new Ataque(2);
               getWorld().addObject(attack,getX()-10,getY());
           }
    }
    public void incVelocidad()//nos incrementa la velocidad
    {
        velocidad++;
    }
    private void reglas()
    {
        nave n=(nave)getOneIntersectingObject(nave.class);//cuando intersecte a la nave
        if(n!=null)
        {
            espacio esp=(espacio)getWorld();
            esp.removeObject(n); //remueve el objeto
            esp.addObject(new nave(),50,300);
            esp.vidas.decrementar();//me quita una vida
            if(esp.vidas.obtenerValor()==0)//si la vida es cero termina el juego
            {
                GameOver t=new GameOver();
                getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
                
        }
    }
}

