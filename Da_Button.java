import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Da_Button extends Menu_Buttons
{
    private GreenfootSound outFallTheme = new GreenfootSound("outfalltheme.wav");
    
    public void act()
    {
        mouseOver();
        startLevel();
    }

    public void startLevel(){
        
        if (Greenfoot.mousePressed(this)){
            Greenfoot.playSound("interact.wav");
            Greenfoot.setWorld(new Nível0()); //muda para nivel0 fresco
        }
    }
}
