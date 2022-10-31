import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victory extends Níveis
{

    /**
     * Constructor for objects of class Victory.
     * 
     */
    public Victory()
    {
        setBackground("victory.png");
        prepare();
    }
    
    private void prepare()
    {
        Main_Menu_Button main_Menu = new Main_Menu_Button();
        addObject(main_Menu,494,750);
    }
}
