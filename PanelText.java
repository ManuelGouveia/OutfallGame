import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PanelText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PanelText extends Actor
{
    /**
     * Act - do whatever the PanelText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    private String text;
    public PanelText(String text){
        this.setText(text);
    }
    
    public void setText(String text){
        this.text = text;
        this.img = new GreenfootImage(150,50);
        this.img.setColor(Color.GREEN);
        Font font = new Font(true,false, 50);
        this.img.setFont(font);
        this.img.drawString(text,2, 40);
        setImage(img);
    }
    public String toString(){
        return this.text;
    }
}
