import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.util.*;
//import java.awt.Font;
//import java.awt.Color;


/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    String mensaje;
    
    public GameOver()
    {
        
        imagen=new GreenfootImage(400,300);
        imagen.setColor(new Color(250,100,0,255));
       // imagen.setFont(new Font("Verdana",Font.PLAIN,34));
        imagen.drawString("Las tres vidas se Terminaron",0,30);
        Greenfoot.playSound("hasperdido.wav");
        setImage(imagen);
        Greenfoot.stop();
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
