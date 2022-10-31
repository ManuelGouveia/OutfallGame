import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Lever here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lever extends Actor 
{
    /**
     * Act - do whatever the Lever wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int pause = 100;
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void playSound(){
        
        Greenfoot.playSound("interact.wav"); //Por algum motivo o interact.mp3 não funciona
    }
    
 
    public void pause()
    {  
        if(pause>0){
            pause--;
        }
        if(pause == 0){
            this.pause = 100;
            return;
        }
}
    

}
