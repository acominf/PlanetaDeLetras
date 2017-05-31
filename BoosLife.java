import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/*import java.awt.Color;
import java.awt.Font;
*/
import java.util.*;


/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoosLife extends Actor
{
    /**
     * Act - do whatever the Tablero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;//declaramos una imagen
    int cont;
    String mensaje;
    int x,y;
    int height;
    int contenedor;
   //Constructor 
    public BoosLife(int c, int x, int y, int height)//vida iniciar, xy, tamaño
    {
        cont=c;
        contenedor=c;
        imagen = new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
       // imagen.setFont(new Font("Verdana",Font.BOLD,24));
        this.x=x;
        this .y=y;
        this.height=height;
        dibuja();
    }
   
   public void dibuja()
   {
    imagen.clear();//limpia la imagen
    imagen.setColor(new Color(200,200,0,255));
    imagen.drawRect(x,y,contenedor,height);//nos pinta el contorno de la figura
    imagen.fillRect(x,y,cont,height);//nos llena la figura
    imagen.setColor(new Color(255,255,255,255));
    imagen.drawString(String.valueOf(cont),25,19);//Parseo a cadena
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

