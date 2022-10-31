import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PuzzleTip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PuzzleTip extends Actor
{
    /**
     * Act - do whatever the PuzzleTip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public PuzzleTip(String text){
        GreenfootImage img = new GreenfootImage(150,50);
        img.setColor(Color.GREEN);
        Font font = new Font(true,false, 50);
        img.setFont(font);
        img.drawString(text,2, 40);
        setImage(img);
    }
    
    
    
}
