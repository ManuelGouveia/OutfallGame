import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play_Button extends Menu_Buttons
{
    
    public void act()
    {
        mouseOver();
        startGame();
    }
    
    public void startGame(){
        if (Greenfoot.mousePressed(this)){
            Greenfoot.playSound("interact.wav");
            Greenfoot.setWorld(new Story()); //muda para story
        }
    }
}
