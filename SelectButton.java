import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectButton extends Button implements Interactable
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ArrayList<Exercise> exercises;
    private PanelText leftNumber;
    private PanelText rightNumber;
    private PanelText result;
    private PanelText operation;
    private Light3 light;
    private boolean state;
    
    private int counter;
    
    public SelectButton(PanelText leftNumber, PanelText rightNumber, PanelText result, PanelText operation, Light3 light){
        this.exercises = new ArrayList<>();
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.result = result;
        this.operation = operation;
        this.light = light;
        
        this.addExercise("1","3","4");
        this.setExercise(this.exercises.get(0));
        this.addExercise("5","1","5");
        this.addExercise("5","2","3");
        this.addExercise("9","3","3");
        
        
    }
    
    public void interact(){
        Greenfoot.playSound("interact.wav");
        if(this.operation.toString().equals(" ")){
            this.operation.setText("X");
            
        }
        /*else if(this.operation.toString().equals("X")){
            this.operation.setText("+");
            
        }*/
        else if(this.operation.toString().equals("+")){
            this.operation.setText("-");
            
        }
        else if(this.operation.toString().equals("-")){
            this.operation.setText("X");
            
        }
        else if(this.operation.toString().equals("X")){
            this.operation.setText("/");
            
        }
        else if(this.operation.toString().equals("/")){
            this.operation.setText("+");
            
        }
        /*if(this.isCorrect()){
            this.nextExercise();
        }*/
        //Greenfoot.delay(30);
        
    }
    public void nextExercise(){
        if(this.counter < this.exercises.size()-1){
            this.counter ++;
            this.setExercise(this.exercises.get(counter));
        }
        else {
            this.complete();
        }
    }
    public void setExercise(String leftNumber, String rightNumber, String result, String operation){
        this.leftNumber.setText(leftNumber);
        this.rightNumber.setText(rightNumber);
        this.result.setText(result);
        this.operation.setText(operation);
    }
    public void setExercise(Exercise exercise){
        this.leftNumber.setText(exercise.getLeftNumber());
        this.rightNumber.setText(exercise.getRightNumber());
        this.result.setText(exercise.getResult());
        this.operation.setText(" ");
        
    }
    public boolean isCorrect(){
        if(this.operation.toString().equals("X")){
            return Integer.valueOf(this.rightNumber.toString()) * Integer.valueOf(this.leftNumber.toString()) == Integer.valueOf(this.result.toString());
        }
        if(this.operation.toString().equals("+")){
            return Integer.valueOf(this.rightNumber.toString()) + Integer.valueOf(this.leftNumber.toString()) == Integer.valueOf(this.result.toString());
        }
        if(this.operation.toString().equals("-")){
            return Integer.valueOf(this.leftNumber.toString()) - Integer.valueOf(this.rightNumber.toString()) == Integer.valueOf(this.result.toString());
        }
        if(this.operation.toString().equals("/")){
            return Integer.valueOf(this.leftNumber.toString()) / Integer.valueOf(this.rightNumber.toString()) == Integer.valueOf(this.result.toString());
        }
        return false;
    }
    public void addExercise(String leftNumber, String rightNumber, String result){
        this.exercises.add(new Exercise(leftNumber, rightNumber, result));
    }
    
    public void complete(){
        this.light.setImage(new GreenfootImage("lighton.png"));
        this.light.setState(true);
    }
    

    
}
