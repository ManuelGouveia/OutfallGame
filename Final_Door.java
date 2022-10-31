import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Final_Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final_Door extends Door
{
    /**
     * Act - do whatever the Final_Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Light1 light1;
    private Light2 light2;
    private Light3 light3;
    public void act()
    {
        // Add your action code here.
    }
    public Final_Door(Light1 light1, Light2 light2,Light3 light3){
        this.light1 = light1;
        this.light2 = light2;
        this.light3 = light3;
    }
    public void interact(){
        super.interact();
        if(light1.getState() && light2.getState() && light3.getState()){
            Greenfoot.setWorld(new Victory());
        }else{
            Greenfoot.playSound("accessdenied.wav");
        }
    }
}
