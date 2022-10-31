import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Main_Menu_Button extends Menu_Buttons
{
    private GreenfootImage imagem;
    
    public void act()
    {
        mouseOver();
        goMainMenu();
    }
    

    public void mouseOver() //override
    {
        imagem = getImage();
        if(Greenfoot.mouseMoved(this)){
            imagem.setTransparency(255);
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            imagem.setTransparency(55);
        }
            
            
    }
    
    
    public void goMainMenu()
    {
        if (Greenfoot.mousePressed(this)){
            Greenfoot.playSound("interact.wav");
            Greenfoot.setWorld(new MainMenu()); //muda para mainmenu
        }
    }
}
