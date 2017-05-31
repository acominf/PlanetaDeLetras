import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class disparo extends Actor
{
    /**
     * Act - do whatever the shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int disparoImage=1;//Determina que imagen va
    int velocidadDisparo=6;// velocidad del disparo
    int position;// direccion
    public disparo(int direction){
        position=direction;
    }
    public void act() 
    {
        // Add your action code here.
        setImage("bala/bala "+disparoImage+".png");//cargamos la imagen
        switch(position){//validacion hacia donde se va ir la bala
            case 0://arriba
                setLocation(getX(),getY()-velocidadDisparo);
            break;
            case 1://abajo
                setLocation(getX(),getY()+velocidadDisparo);
            break;
            case 2://derecha
                setLocation(getX()+velocidadDisparo,getY());
            break;
            case 3://izquierda
                setLocation(getX()-velocidadDisparo,getY());
            break;
        }
        
        Actor roca=getOneObjectAtOffset(0,0,signo.class);
        nave2 boss=(nave2)getOneIntersectingObject(nave2.class);
        if(roca!=null){
            espacio esp=(espacio)getWorld();
            esp.puntos.incrementar();
            esp.crearSignos(1);
            esp.crearEnergia(1);
            getWorld().removeObject(roca);
            if(esp.puntos.obtenerValor()%10==0)//esp variable de tipo espacio, variabele puntos
                esp.ponerJefe();
            esp.removeObject(this);

        }
        else if(boss!=null)//si toco mi bala al jefe
        {
            espacio esp=(espacio)getWorld();
            esp.crearEnergia(1);
            esp.lifeboss.decrementar();//la vida del jefe decremente
            if(esp.lifeboss.obtenerValor()==0)
            {
                esp.removeObject(boss);//quito al jefe
                esp.crearSignos(5);//creo 5 rocas
                esp.vidas.incrementar();//subo una vida a la nave
                esp.removeObject(esp.lifeboss);//quito al jefe
            }
            esp.removeObject(this);
        }
        else
        {
            if((getX()>=getWorld().getWidth()-5)||(getX()<=5)){
            getWorld().removeObject(this);//si la bala se sale la borramos
           }
           else{
               if((getY()>=getWorld().getHeight()-5)||(getY()<=5)){
                   getWorld().removeObject(this);//Si la bala se sale la borramos
                }
                else
                    if(disparoImage<16)//16 total de imagenes validacion
                        disparoImage++;
                        else
                        disparoImage=1;
               }
        }
       
    }
}

