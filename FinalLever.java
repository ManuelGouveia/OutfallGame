import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalLever here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalLever extends Lever implements Interactable
{
    /**
     * Act - do whatever the FinalLever wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Boolean isLeverOn;
    private FinalLever2 lever2;
    private Light1 light1;
    public FinalLever(Light1 light1, FinalLever2 lever2){
        this.isLeverOn = false;
        this.light1 = light1;
        this.lever2 = lever2;
    }
    public void act()
    {
        // Add your action code here.
        turnOn();
    }
    public void interact(){
        this.playSound();
        if(!this.isLeverOn){
            this.setImage(new GreenfootImage("lever2.png"));
        }
        if(this.isLeverOn){
            this.setImage(new GreenfootImage("lever1.png"));
        }
        this.isLeverOn = !this.isLeverOn;
        
    }
    public Boolean isLeverOn(){
        return this.isLeverOn;
    }
    public void turnOn(){
        if(this.isLeverOn() && this.lever2.isLeverOn()){
            this.light1.setImage(new GreenfootImage("lighton.png"));
            this.light1.setState(true);
        /*} else {
            this.light1.setImage(new GreenfootImage("lightoff.png"));
            this.light1.setStateFalse();
        */
        }
    }
}
