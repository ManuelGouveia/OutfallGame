import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Over extends Níveis
{

    /**
     * Constructor for objects of class Game_Over.
     * 
     */
    public Game_Over()
    {
        setBackground("gameover.png");
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Main_Menu_Button main_Menu = new Main_Menu_Button();
        addObject(main_Menu,500,550);
        Retry_Button retry_Button = new Retry_Button();
        addObject(retry_Button,500,340);
    }
}
