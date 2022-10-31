import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LongWallHorizontalThin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongWallHorizontalThin extends Wall
{
    private GreenfootImage imageLongWall;
    /**
     * Act - do whatever the LongWallHorizontalThin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    
    public LongWallHorizontalThin(){
        imageLongWall = getImage();
        int larguraAtual = imageLongWall.getWidth();
        int alturaAtual = imageLongWall.getHeight();
        imageLongWall.scale(larguraAtual*7/2, alturaAtual/2);
        
    }
    
    
}
