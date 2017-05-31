import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class signo extends Actor
{
    /**
     * Act - do whatever the roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);//velocidad de la roca
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn(Greenfoot.getRandomNumber(90-45));
        }
        }
        if(getY()>=m.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn(Greenfoot.getRandomNumber(90-45));
        }
        }
        //Validamos  Roca  //Si clase roca choca con nave
        Actor nave=getOneObjectAtOffset(0, 0, nave.class);//Actor hereda todas las caracteristicas
        if(nave!=null){//Si chca
           espacio esp=(espacio)getWorld();//
           getWorld().removeObject(nave);//como choco que la remueve
           Greenfoot.playSound("Explocion.wav");
           esp.vidas.decrementar();
           getWorld().addObject(new nave(),50,300);
           if(esp.vidas.obtenerValor()==0){//Mandamos llamar los metodos y utilizamos una condicion
             GameOver t=new GameOver();
             getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));//Es para que el letrero salga  en medio
           }
           esp.crearSignos(1);
           getWorld().removeObject(this);
        }
    }    
}

