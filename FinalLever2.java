import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalLever2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalLever2 extends Lever implements Interactable
{
    /**
     * Act - do whatever the FinalLever2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Boolean isLeverOn;
    
    public FinalLever2(){
        this.isLeverOn = false;
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

}
