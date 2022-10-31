import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HazmatP1 extends Hazmat
{

    public void act()
    {
        moveCharacterP1(); 
        

    }
    
    /**
     * Construtor do Player 1
     * carrega os HP da run atual
     * Enche os lugares do array com diferentes imagens do actor em movimento
     */
    public HazmatP1(HP hp){
        super(hp);
        Images = new GreenfootImage [10];
        this.initializeImages();
    }
    public void initializeImages(){
        Images[0] = new GreenfootImage("hazmatp1rightidle.png");
        Images[1] = new GreenfootImage("hazmatp1rightwalk1.png");
        Images[2] = new GreenfootImage("hazmatp1rightwalk2.png");
        Images[3] = new GreenfootImage("hazmatp1rightwalk3.png");
        Images[4] = new GreenfootImage("hazmatp1rightwalk4.png");
        Images[5] = new GreenfootImage("hazmatp1leftidle.png");
        Images[6] = new GreenfootImage("hazmatp1leftwalk1.png");
        Images[7] = new GreenfootImage("hazmatp1leftwalk2.png");
        Images[8] = new GreenfootImage("hazmatp1leftwalk3.png");
        Images[9] = new GreenfootImage("hazmatp1leftwalk4.png");
    }
    
    /**
     * Detecta a tecla(W,A,S,D) pressionada e detecta o boolean que permite ou bloqueia o movimento para a respetiva direção.
    */
    
    public void moveCharacterP1(){
        detectKeyPress = false;
        
      if (Greenfoot.isKeyDown("S") && canMoveDown()){
            walkDown();
      }
      
      
      
      if (Greenfoot.isKeyDown("W") && canMoveUp()){
            walkUp();
      }
      
      
      
      if (Greenfoot.isKeyDown("A") && canMoveLeft()){
            walkLeft();
      }
      
      
      
      if (Greenfoot.isKeyDown("D") && canMoveRight()){
            walkRight();
      }
      
      if(Greenfoot.isKeyDown("Space" ) && !this.interactionKeyHolding){
          this.interact();
          this.interactionKeyHolding = true;
          
      }
      if(!Greenfoot.isKeyDown("Space")){
              this.interactionKeyHolding = false;
          }
      
      
      if (!(detectKeyPress))
        {
            notWalk();
        }
            refresh();

    }
  }    
       
                

        
       

