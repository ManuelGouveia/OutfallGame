import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Quit_Button extends Menu_Buttons
{
    /**
     * Act - do whatever the Quit_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mouseOver();
        quitGame();
    }
    
    public void quitGame(){
        if (Greenfoot.mousePressed(this)){
            Greenfoot.playSound("interact.wav");
            System.exit(0); //fecha o jogo
        }
    }
}
