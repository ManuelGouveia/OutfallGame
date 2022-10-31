import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HazmatP2 extends Hazmat
{
    
    public void act()
    {
        moveCharacterP2();
        
    }
    
    /**
     * Construtor do Player 1
     * carrega os HP da run atual
     * Enche os lugares do array com diferentes imagens do actor em movimento
     */
    public HazmatP2(HP hp){
        super(hp);
        Images = new GreenfootImage [10];
        this.initializeImages();
    }
    public void initializeImages(){
        Images[0] = new GreenfootImage("hazmatp2rightidle.png");
        Images[1] = new GreenfootImage("hazmatp2rightwalk1.png");
        Images[2] = new GreenfootImage("hazmatp2rightwalk2.png");
        Images[3] = new GreenfootImage("hazmatp2rightwalk3.png");
        Images[4] = new GreenfootImage("hazmatp2rightwalk4.png");
        Images[5] = new GreenfootImage("hazmatp2leftidle.png");
        Images[6] = new GreenfootImage("hazmatp2leftwalk1.png");
        Images[7] = new GreenfootImage("hazmatp2leftwalk2.png");
        Images[8] = new GreenfootImage("hazmatp2leftwalk3.png");
        Images[9] = new GreenfootImage("hazmatp2leftwalk4.png");
    }
    /**
     * Detecta a tecla(↑,←,↓,→) pressionada e detecta o boolean que permite ou bloqueia o movimento para a respetiva direção.
    */
    public void moveCharacterP2(){
        detectKeyPress = false;
        if (Greenfoot.isKeyDown("Down") && canMoveDown()){
            walkDown();
      }
      
      
      
      if (Greenfoot.isKeyDown("Up") && canMoveUp()){
            walkUp();
      }
      
      
      
      if (Greenfoot.isKeyDown("Left") && canMoveLeft()){
            walkLeft();
      }
      
      
      
      if (Greenfoot.isKeyDown("Right") && canMoveRight()){
            walkRight();
      }
      
      if(Greenfoot.isKeyDown("Enter") && !this.interactionKeyHolding){
          this.interact();
          this.interactionKeyHolding = true;
        }
       
        if(!Greenfoot.isKeyDown("Enter")){
            this.interactionKeyHolding = false;
        }
      if (!(detectKeyPress))
        {
            notWalk();
        }
        refresh();
        
        
    }
    
    
   
}
