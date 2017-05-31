import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es usada para el scroll del juego la cual tiene una imagen que es centrada tanto en x como
 * en y del área de juego. La imagen es usada como un Objeto que se mueve de la parte superior a la
 * parte inferior de la pantalla. Para hacer la simulación del scroll en el Mundo se agregan dos Objetos
 * de este tipo, una imagen es centrada y la segunda imagen esta por la parte superior del área del
 * juego (esta no es visible por primera vez) y entonces estas dos imágenes se mueven una detrás de
 * otra.
 * 
 */
public class Background extends Actor

{
    private Background img0, img1;
    private SimpleTimer timer;
    /**
     * Metodo constructor
     */
    public Background()
    {
         //super(1000, 600, 1);
        
        
    }
    
    /**
     * 
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    /**
     * En el metodo se mueve la imagen con respecto a las cordenadas en Y
     */
    public void scroll()
    {
       if(getY() > 3 * getImage().getHeight() / 2){
            setLocation(getX() ,0 - (250 - 2));
        }
        setLocation(getX(),getY() + 2);
    }
}