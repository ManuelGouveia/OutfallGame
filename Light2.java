import greenfoot.*;
import java.util.ArrayList;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Light2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Light2 extends Light
{
    /**
     * Act - do whatever the Light2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ArrayList <PuzzlePiece> correctOrderPieces;
    private ArrayList <PuzzlePiece> activatedPieces;
    private boolean state;
    private int counter;
    
    public Light2(){
        this.correctOrderPieces = new ArrayList<>();
        this.activatedPieces = new ArrayList<>();
        this.counter = 0;
        this.setCorrectOrder();
        this.state = false;
    }
     public Light2(boolean value){
        this();
        setImage(value);
        setState(value);
        
    }
    public void act()
    {
        // Add your action code here.
    }
    public void setCorrectOrder(){
        
        this.correctOrderPieces.add(new PuzzlePiece1(this));
        this.correctOrderPieces.add(new PuzzlePiece2(this));
        this.correctOrderPieces.add(new PuzzlePiece3(this));
        this.correctOrderPieces.add(new PuzzlePiece4(this));
    }
    public int getCounter(){
        return this.counter;
    }
    public ArrayList<PuzzlePiece> getCorrectOrderPieces(){
        return this.correctOrderPieces;
    }
    public void activatePiece(PuzzlePiece piece){
        if(counter < 3){
            this.activatedPieces.add(piece);
            counter ++;
            return;
        }
        if(counter == 3){
            this.setImage(new GreenfootImage("lighton.png"));
            this.state = true;
        }
    }
    public boolean getState(){
        return this.state;
    }
    public void setImage(boolean state){
        if(state){
            this.setImage(new GreenfootImage("lighton.png"));
            
        }
        if(!state){
            this.setImage(new GreenfootImage("lightoff.png"));
        }
    }
    public void setState(boolean value){
        this.state = value;
    }
}
