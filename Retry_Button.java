import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Retry_Button extends Menu_Buttons
{
    private GreenfootImage imagem;
    
    public void act()
    {
        mouseOver();
        startLevel();
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
        
    public void startLevel(){
        if (Greenfoot.mousePressed(this)){
            Greenfoot.playSound("interact.wav");
            Greenfoot.setWorld(new Nível0()); //muda para nivel0 fresco
        }
    }
}
