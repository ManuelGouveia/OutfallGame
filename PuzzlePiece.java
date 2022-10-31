import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PuzzlePiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PuzzlePiece extends Actor implements Damaging, Interactable
{
    /**
     * Act - do whatever the PuzzlePiece wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Light2 light;
    
    public void act()
    {
        // Add your action code here.
        
    }
    public PuzzlePiece(Light2 light){
        this.light = light;
    }
    public void damage(Hazmat hazmat){
        hazmat.getHP().reduceHP(1);
    }
    public void interact(){
        
        Greenfoot.playSound("interact.wav");
        
        if(this.isCorrect()){
            
            this.light.activatePiece(this);
            
            return;
        }
        if(this.isTouching(Hazmat.class)){
            
            Hazmat hazmat = this.getIntersectingObjects(Hazmat.class).get(0);
            this.damage(hazmat);
            //Greenfoot.delay(30);
        }
        
        
    }
    public boolean isCorrect(){
        if(this.getClass().equals(light.getCorrectOrderPieces().get(light.getCounter()).getClass())){
            return true;
        } 
        return false;
 
    }
}
