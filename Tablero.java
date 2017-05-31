import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/*import java.awt.Color;
import java.awt.Font;*/
import java.util.*;


/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero extends Actor
{
    /**
     * Act - do whatever the Tablero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;//declaramos una imagen
    int cont;
    String mensaje;
    
    public Tablero(int c,String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
      //  imagen.setFont(new Font("Verdana",Font.BOLD,24));
        dibuja();
    }
   
   public void dibuja()
   {
    imagen.clear();//limpia la imagen
    imagen.drawString(mensaje+cont,20,20);//pimntamos el mensaje
    setImage(imagen);   //pone la imgen
   }
   
    public void incrementar()//suma los puntos
   {
       cont++;
       dibuja();
    }
   public void decrementar()//baja los puntos
   {
       cont--;
       dibuja();
   }
   public int obtenerValor()//cuantas vidas nos quedan
   {
       return cont;
   }
    public void act() 
    {
        // Add your action code here.
    }    
}

