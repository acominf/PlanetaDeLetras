import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Animado extends Actor
{
    //Declaracion de los metodos utilizados para el fondo animado
    private GreenfootImage[] imagenes = new GreenfootImage[8];
    private int jeda=20, num=0,deltax=10;//jeda velocidad de fondo
    
    /*
     * Metodo para agregar al mundo las imagenes de fondo
     */public void addedToWorld(World Latar)
    {
        for(int i=0; i<imagenes.length; i++)
        {
            imagenes[i]=new GreenfootImage("Fondo 1"+ i +".png");
        }
        setImage(imagenes[0]);
    }

    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /*
         * Ciclo para darle la animacion al fondo
         */
        if(jeda==0)
        jeda=20;//velocidad del fondo
        if(jeda==1){
            setImage(imagenes[num]);
            num++;
            if(num>=imagenes.length)
            num=1;
           //setLocation(getX()+deltax,getY());
           // if(getX()>getWorld().getWidth()+400)
           // setLocation(-400,getY());
        }
        if(jeda>0)
        jeda--;
    } //fin del ciclo de animacion del fondo
    ////////////////////////////////////
}

