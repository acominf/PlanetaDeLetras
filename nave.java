import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int directionShot=2;//variable de direccion a donde va el disparo
    boolean isShot=false;//Bandera que utilizo para validar el key up y key dow
    boolean isEspecial=false;
    public void nave(){
        
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            //Greenfoot.playSound("electricidad.wav");
            setDireccion(UP);
            directionShot=0;
        }
        if(Greenfoot.isKeyDown("down")){
            setDireccion(DOWN);
            directionShot=1;
        }
        if(Greenfoot.isKeyDown("left")){
            setDireccion(LEFT);
            directionShot=3;
        }
        if(Greenfoot.isKeyDown("right")){
            setDireccion(RIGHT);
            directionShot=2;
        }
        setDisparo(directionShot);//hacia donde esta apuntando la  nave finalmente
       
    }
    /*
     * Esta clase es la encargada de manejar  los disparos por medio de la tecla "espacio"
     * y tambien del super poder con la tecla "c".
     */
    public void setDisparo(int direction){
        if(isShot && Greenfoot.isKeyDown("space"))
        {//si esta bandera es verdadera y precione x
            disparo d1= new disparo(direction);//entonces creo una clase de tipo shop y le digo a donde va esa vala
            Greenfoot.playSound("superdisparo.wav");
            getWorld().addObject(d1,getX(),getY());//añado al  espacio el disparo y la pocicion
            isShot=false;//vulvo  la bandera cero
        }
        if(!isShot && !Greenfoot.isKeyDown("space"))
        {//VAlidacion del disparo
            Greenfoot.playSound("superdisparo.wav");
            isShot=true;
        }
        
        if(isEspecial && Greenfoot.isKeyDown("x")){
            
            espacio esp=(espacio)getWorld();
            if(esp.poder.obtenerValor()>0)//Cadavez que tomamos el poder
            {
                bala b1= new bala(direction);
                getWorld().addObject(b1,getX(),getY());
                isEspecial=false;
                esp.poder.decrementar();
            }
        }
        if(!isEspecial && !Greenfoot.isKeyDown("x")){
            isEspecial=true;
        } 
    }
    /*
     * Clase que se encarga de la siper velocidad
     * Si oprimes x la nave se movera con mayor velocidad
     */
    public void setDireccion(int direccion){
        switch(direccion){
            case UP:
            setRotation(270);
            if(Greenfoot.isKeyDown("z")){//si oprime la barra espaciadora acelera
            Greenfoot.playSound("Up.wav");
            setLocation(getX(),getY()-10);//optiene la posicion
        }
        else{
            setLocation(getX(),getY()-1);
        }
            break;
            case DOWN:
            setRotation(90);
             if(Greenfoot.isKeyDown("z")){
             Greenfoot.playSound("gsnipe_zoom.wav");    
            setLocation(getX(),getY()+10);
        }else{
            setLocation(getX(),getY()+1);
        }
            break;
            case LEFT:
            setRotation(180);
             if(Greenfoot.isKeyDown("z")){
             Greenfoot.playSound("gsnipe_zoom.wav");    
            setLocation(getX()-10,getY());
        }else{
            setLocation(getX()-1,getY());
        }
            break;
            case RIGHT:
            setRotation(0);
             if(Greenfoot.isKeyDown("z"))
             {
                 Greenfoot.playSound("Down.wav");    
                 setLocation(getX()+10,getY());
        }else{
            setLocation(getX()+1,getY());
        }
            break;
        }
    }
}
