import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LongWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongWallVertical extends Wall
{
    private GreenfootImage imageLongWallVertical;
    /**
     * Act - do whatever the LongWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    
    public LongWallVertical(){
        imageLongWallVertical = getImage();
        int larguraAtual = imageLongWallVertical.getWidth();
        int alturaAtual = imageLongWallVertical.getHeight();
        imageLongWallVertical.scale(larguraAtual, alturaAtual*4);
        
    }
    
    
}
