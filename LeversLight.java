import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeversLight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeversLight extends Light
{
    /**
     * Act - do whatever the LeversLight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private FinalLever lever1, lever2;
    public void act()
    {
        // Add your action code here.
        turnOn();
    }
    public LeversLight(FinalLever lever1, FinalLever lever2){
        this.lever1 = lever1;
        this.lever2 = lever2;
    }
    public void turnOn(){
        if(this.lever1.isLeverOn() && this.lever2.isLeverOn()){
            this.setImage(new GreenfootImage("lighton.png"));
        } else {
            this.setImage(new GreenfootImage("lightoff.png"));
        }
    }
}
