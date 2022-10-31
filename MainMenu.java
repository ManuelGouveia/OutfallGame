import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends Níveis
{
    
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {
        setBackground("menuinicial2.png");
        
        prepare();
        Greenfoot.start();
    }
    
    
    public void prepare()
    {
        Play_Button playbutton = new Play_Button();
        addObject(playbutton, 508, 335);
        
        Quit_Button quit_Button = new Quit_Button();
        addObject(quit_Button,508,474);
        
    }
}
