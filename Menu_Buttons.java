import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu_Buttons extends Actor
{
    private GreenfootImage imagem;
    
    public void act()
    {
       mouseOver();
    }
    
    /**
     * Regista se o rato está em cima do butão. 
     * Se não, o butão é invisível, se sim, o butão fica opaco.
     */
    
    public void mouseOver()
    {
        imagem = getImage();
        if(Greenfoot.mouseMoved(this)){
            imagem.setTransparency(255); //butão opaco
             
        }
        
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            imagem.setTransparency(0); //butão transparente
            
        }
            
            
        }
    }

