import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Light1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Light1 extends Light
{
    /**
     * Act - do whatever the Light1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean state;
    public void act()
    {
    }
    public Light1(){
        this.state = false;
    }
    public Light1(boolean value){
        setState(value);
        setImage(value);
    }
    public void setImage(boolean state){
        if(state){
            this.setImage(new GreenfootImage("lighton.png"));
            
        }
        if(!state){
            this.setImage(new GreenfootImage("lightoff.png"));
        }
    }
  
    public boolean getState(){
        return this.state;
    }
    public void setState(boolean value){
        this.state = value;
    }
}
