import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala extends Actor
{
    /**
     * Act - do whatever the shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int shotImage=1;
    int speedShot=6;
    int position;
    public bala(int direction){
        position=direction;
    }
    public void act() 
    {
        // Add your action code here.
        setImage("bala/bala "+shotImage+".png");
        switch(position){//Direccionamiento de nuestra bola o poder
            case 0://Arriba
                if(getRotation()!=270)
                    setRotation(270);
            break;
            case 1://bajar
                if(getRotation()!=90)
                    setRotation(90);
            break;
            case 2://derecha
                if(getRotation()!=0)
                    setRotation(0);
            break;
            case 3://izquierda
                if(getRotation()!=180)
                    setRotation(180);
            break;
        }
        List<Object> rocas=getObjectsInRange(200, Object.class);//nos trae una lista de objetos getObjectsInRange
        Iterator it=rocas.iterator();//para recorrer la lista
        if(it.hasNext())//si hay halgo en la lista
      {
           signo r=(signo)it.next();
            if(r!=null)
            {
                turnTowards(r.getX(),r.getY());
            }
        }
        move(4);                
        Actor signo=getOneObjectAtOffset(0,0,signo.class);
        if(signo!=null){
            espacio esp=(espacio)getWorld();
            getWorld().removeObject(signo);
            esp.puntos.incrementar();
            esp.crearSignos(1);
            getWorld().removeObject(this);
        }
        else
        {
            if((getX()>=getWorld().getWidth()-5)||(getX()<=5)){
            getWorld().removeObject(this);
        }
        else{
            if((getY()>=getWorld().getHeight()-5)||(getY()<=5)){
                getWorld().removeObject(this);
            }
            else
                if(shotImage<16)
                shotImage++;
                else
                shotImage=1;
            }
        }
        
       
    }
}
