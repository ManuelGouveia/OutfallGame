import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeverDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeverDown extends Lever implements Interactable
{
    /**
     * Act - do whatever the LeverDown wants to do. This method is called whenever
     * the 'Ac
     *t' or 'Run' button gets pressed in the environment.
     */
    private int spark1X, spark1Y, spark2X, spark2Y;
    private SparkSmall spark1, spark2;
    private Boolean isLeverOn;
    public LeverDown(SparkSmall spark1, SparkSmall spark2){
        this.spark1 = spark1;
        this.spark2 = spark2;
        this.isLeverOn = true;
        this.spark1X = spark1.getX();
        this.spark1Y = spark1.getY();
        this.spark2X = spark2.getX();
        this.spark2Y = spark2.getY();
        
    }
    public void act()
    {
        // Add your action code here.
    }
    public void interact(){
        this.playSound();
        if(isLeverOn){
            getWorld().removeObject(this.spark2);
            getWorld().addObject(this.spark1, spark1X, spark1Y);
            this.setImage(new GreenfootImage("lever2.png"));
        
        }
        else if(!isLeverOn){
            getWorld().removeObject(this.spark1);
            getWorld().addObject(this.spark2, spark2X, spark2Y);
            this.setImage(new GreenfootImage("lever1.png"));
        }
        this.isLeverOn = !this.isLeverOn;
    }
    
}
