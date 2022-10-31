import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spark extends Actor
{
    /**
     * Act - do whatever the Spark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act()
    {
        // Add your action code here.
        if(this.isTouching(Hazmat.class)){
            Hazmat hazmat = this.getIntersectingObjects(Hazmat.class).get(0);
            this.damage(hazmat);
        }
    }
    public void interact(){
        
    }
    
    public void damage(Hazmat hazmat){
            Greenfoot.playSound("electricity.wav");
            hazmat.getHP().reduceHP(1);
            push(hazmat);
            
    }
    public void push(Hazmat hazmat){
        if(!hazmat.getIsFacingRight()){
            hazmat.setLocation(hazmat.getX()+80,hazmat.getY());
            //System.out.println("walkright");
        }
        else{
            hazmat.setLocation(hazmat.getX()-80,hazmat.getY());
            //System.out.println("walkleft");
        }
    }
}
