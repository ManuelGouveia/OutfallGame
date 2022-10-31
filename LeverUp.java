import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeverUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeverUp extends Lever implements Interactable
{
    /**
     * Act - do whatever the LeverUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int bigSparkX;
    private int bigSparkY;
    private SparkBig bigSpark;
    private Boolean isLeverOn;
    public LeverUp(SparkBig bigSpark){
        this.bigSpark = bigSpark;
        this.bigSparkX = bigSpark.getX();
        this.bigSparkY = bigSpark.getY();
        this.isLeverOn = true;
    }
    public void act()
    {
        // Add your action code here.
    }
    public void interact(){
        this.playSound();
        if(isLeverOn){
            getWorld().removeObject(this.bigSpark);
            this.setImage(new GreenfootImage("lever2.png"));
        }
        else if(!isLeverOn){
            getWorld().addObject(this.bigSpark, this.bigSparkX, this.bigSparkY);
            this.setImage(new GreenfootImage("lever1.png"));
        }
        this.isLeverOn = !this.isLeverOn;
        
    }
}
