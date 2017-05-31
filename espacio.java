import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class espacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class espacio extends World
{

    /**
     * Constructor for objects of class espacio.
     * 
     */
    private Background img0, img1;
    private boolean ambiente;
    private SimpleTimer timer;
    
    public vidas objLife;
    Tablero puntos;
    Tablero vidas;
    Tablero poder;//
    BoosLife lifeboss;
    
   
    
    //constructor de objetos
    public espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);//tamaño de la pantalla
        
        
        
        img0 = new Background();
        addObject(img0,getWidth()/2,getHeight()/2);
        
        img1 = new Background();
        addObject(img1,getWidth()/2,0 - getHeight()/2);
        
         Fondo fondo= new Fondo();
        addObject(fondo, 600, 300);
        
        setPaintOrder(GameOver.class,Tablero.class,signo.class,nave.class);//Da el orden en que se añaden las clases
        //Creando el objeto nave
        nave n1=new nave();
        addObject(n1,50,300);
       
        ////////////////////////
       
        crearSignos(4);
        objLife=new vidas();
        puntos=new Tablero(0,"Puntaje: ");//inicializamos la variable punto
        vidas=new Tablero(3,"Vidas: ");
        poder=new Tablero(0,"Especial: ");
        addObject(puntos,150,85);
        addObject(vidas,350,85);
        addObject(poder,550,85);
        crearEnergia(1);
        
       
        
       
    }
    public void crearSignos(int numero){
        for(int i=0;i<numero;i++){
            signo s=new signo();//estamos creando el enemigo signo
            int x=Greenfoot.getRandomNumber(getWidth());//limites en x
            int y=Greenfoot.getRandomNumber(getHeight());//limite en ancho de la pantalla
            addObject(s,x,y);
        }
    }
    
    public void crearEnergia(int numero){// es una imagen que tiene el  poder especial
        for(int i=0;i<numero;i++){
            energia e=new energia();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            int ener=Greenfoot.getRandomNumber(5);
            if(ener==4)
                addObject(e,x,y);
        }

    }
    public void ponerJefe()
    {
        List<Object> rocas=getObjects(Object.class);//Nos trae todo los tipo roca para que quede el boos y l el jefe
        Iterator i=rocas.iterator();
        while(i.hasNext())
        {
            signo s=(signo)i.next();
            removeObject(s);
        }
            nave2 boss =new nave2();
            addObject(boss,getWidth()-80,(getHeight()/2)+20);//agregamos al jefe
            lifeboss=new BoosLife(100,0,0,20);
           // addObject(lifeboss,750.85);
    }
     public void scroll()
    {
        img0.scroll(); 
        img1.scroll();
    }

    /**
     * cuando la instancia es false esta en la parte inicial del nivel
     * cuando esta en true esta en la parte del enemigo final
     * @return  es el indicador de el mundo  
     */
    public boolean getAmbiente()
    {
        return ambiente;
    }
    
    /**
     * Metodo usado para cambiar el estado del ambiente
     */
    public void setAmbiente(boolean ambiente)
    {
        this.ambiente = ambiente;
    }

}








