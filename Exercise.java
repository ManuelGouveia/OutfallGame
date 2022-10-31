import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exercise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exercise extends Actor
{
    /**
     * Act - do whatever the Exercise wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String leftNumber;
    private String rightNumber;
    private String result;
    
    public Exercise(String leftNumber, String rightNumber, String result){
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.result = result;
    }
    public void act()
    {
        // Add your action code here.
    }
    public String getLeftNumber(){
        return this.leftNumber;
    }
    public String getRightNumber(){
        return this.rightNumber;
    }
    public String getResult(){
        return this.result;
    }
}
