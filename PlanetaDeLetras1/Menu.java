import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World

{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        super(1000, 600, 1);
        BJuega Bj= new BJuega();
        addObject(Bj,750,100);
    }
}
