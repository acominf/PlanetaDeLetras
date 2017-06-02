import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Portada extends World
{
    private espacio juego;
    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Portada()
    {    
        // creamos nuestra portada de inicio
         super(800, 600, 1);
         //Agregamos el fondo animado
         addObject(new Animado(),400,(int)(0.5*getHeight()));
         //Funcion para el sonido
         GreenfootSound sound = new GreenfootSound("JonGalacticus.wav");
         sound.play();
         setBackground("Fondo 1.png");
         
         //juego= new espacio();
         prepare();
         
         
         //Creamos nuestro boton de inicio
         BotonInicio Bi= new BotonInicio();
         addObject(Bi,730,520);//Posicion en y,x
         
         
          

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
     public void act()
    {
        if(Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld( juego); 
            
            
        }
    }
}