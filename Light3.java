import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Light3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Light3 extends Light
{
    /**
     * Act - do whatever the Light3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean state;
    public void act()
    {
        // Add your action code here.
    }
    public Light3(){
        this.state = false;
    }
    public Light3(boolean value){
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
