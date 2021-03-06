import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es usada para agregar un objeto nube la cual se mueve de la parte superior hacia la parte
 * inferior. Si pasa de la parte inferior la se elimina este objeto.
 * 
 */
public class Signo extends Obstaculo
{
    /**
     * Metodo Constructor
     */
    public Signo()
    {
        super();
    }
    
    /**
     * Act - do whatever the Nube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.mueve();
        eliminaObjeto();
    }    
        
    /**
     * @return  regresa true si se elemino el objeto si el jugador lo toca
     */
    private boolean eliminaObjetoTouching()
    {
       Actor Avion = getOneObjectAtOffset(0,0,Avion.class);
       if(Avion!= null){
            return true;
       }
       else{
           return false;
       }
    }
    
    /**
     * Elimina el objeto en los dos casos.
     */
    private void eliminaObjeto()
    {
       if(eliminaObjetoTouching()){ 
           espacio m = (espacio)getWorld();
           getWorld().removeObject(this);
       }
       else{
           super.eliminaObjetoBorde();
       }
    }
    
}
