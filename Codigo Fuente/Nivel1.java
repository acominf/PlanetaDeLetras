import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Estas clases agregan los Objetos del juego basados en ciertos tiempos para cada Objeto, todo esto
 * implementado con los Métodos de su súper clase (Mar) también valida si el Objeto destruyo a su
 * enemigo para pasar al siguiente nivel. En caso de terminar el Tercer el juego esta clase te regresa al   
 * menú principal del juego.
 * 
 */
public class Nivel1 extends espacio
{

    /**
     * Constructor for objects of class Nivel1.
     * @param vidas se le pasa el numero de vidas actuales al nivel
     * @param score se le pasa la puntuacion actual al jugador
     */
    public Nivel1(int vidas,int score)
    {
        super(vidas,score);
    }
    
    @Override
    public void act()
    {
        if(super.timeAddEnemigo(1) && !super.getAmbiente()){
            super.addEnemigo();
            super.addEnemigo();
        }
        
        if(super.timeAddAliado(7) && !super.getAmbiente()){
            super.addAliado();// agrega aliado
        }
        
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addPunto();
        }
        
        if(super.timerAddNube(10) && !super.getAmbiente()){
            super.addNube();
            
        }
        
        if(super.timeAddFinal(70) && !super.getAmbiente()){
            super.addLiderEnemigo(250);
            super.setAmbiente(true);
        }
        
        if(super.getEnemigoFinal() == 1 ){
            super.addTexto("Nivel 2",35,getWidth() / 2, getHeight() / 2);
            Greenfoot.delay(200);
            espacio m = new Nivel2(super.getVidasJugador(),super.getScoreJugador());
            Greenfoot.setWorld(m);
        }
        super.terminaJuego();
        super.scroll();
    }
}
