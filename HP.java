import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HP extends Actor
{
    /**
     * Act - do whatever the HP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int hP;
    public HP(int hp){
        this.hP = hp;
        this.switchImage();
    }
    public HP(){
        this(2);
    }
    public void act()
    {
        // Add your action code here.
    }
    public int getHP(){
        return this.hP;
    }
    
    public void switchImage(){
        if(this.hP == 2){
            this.setImage(new GreenfootImage("heart1.png"));

        } else if (this.hP ==1) {
            this.setImage(new GreenfootImage("heart2.png"));
        } else {
            this.setImage(new GreenfootImage("heart3.png"));
            Greenfoot.playSound("deathsound.wav");
        }
    }
    public void reduceHP(int amount){
        
        if(this.hP <= 0){
            return;
        }
        if(this.hP - amount < 0){
            this.hP = 0;
        } else {
            this.hP -= amount;
            Greenfoot.playSound("hurtsfx.wav");
        }
        this.switchImage();
        //Greenfoot.delay(5);
    }
}
