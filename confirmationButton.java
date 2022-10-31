import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class confirmationButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class confirmationButton extends Button implements Interactable, Damaging
{
    /**
     * Act - do whatever the confirmationButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private SelectButton selection;
    public confirmationButton(SelectButton button){
        this.selection = button;
    }
    public void interact(){
        Greenfoot.playSound("interact.wav");
        if(this.selection.isCorrect()){
            this.selection.nextExercise();
        }
        else{
            if(this.isTouching(Hazmat.class)){
            
            Hazmat hazmat = this.getIntersectingObjects(Hazmat.class).get(0);
            this.damage(hazmat);
            //Greenfoot.delay(30);
            }
        }
    }
    public void damage(Hazmat hazmat){
        hazmat.getHP().reduceHP(1);
    }
}
