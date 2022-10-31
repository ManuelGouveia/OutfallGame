import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class Hazmat extends Actor
{
    private HP hP; //vida do player
    protected boolean interactionKeyHolding;
    protected final int ALPHA = 5; //constante velocidade do movimento
    private int counter; //contador para animação de movimento
    private int index; // indice para percorrer um array
    protected GreenfootImage [] Images; //array de imagens
    private boolean detectWalk; //booleano que detecta se o actor está a andar ou não
    private boolean facingRight; //booleano que detecta se o actor está a olhar para esquerda ou direita
    protected boolean detectKeyPress; //booleano que detecta se uma tecla foi pressionada
   
    public void act()
    {
        this.gameOver();
       
    
    }
    
    
    public Hazmat(HP hp)
    {
        this.interactionKeyHolding = false;
        this.hP = hp;
    }
    
    
    public void walkDown(){ //movimenta o actor para baixo
     
     if(facingRight){  //anda olhando para a direita
      walkCycleRight();
      setLocation (getX(), getY()+ALPHA); 
      detectKeyPress = true;
     }else{  //anda olhando para a esquerda
      walkCycleLeft();
      setLocation (getX(), getY()+ALPHA);
      detectKeyPress = true;
     }    
    }
     
    public boolean canMoveDown(){ //verifica se o actor não tem obstáculos em baixo
       boolean moveDown=true;
       int imageWidth=getImage().getWidth();
       int imageHeight=getImage().getHeight();
       if (getOneObjectAtOffset(imageWidth/ -2, imageHeight/ 2+3, Wall.class) !=null && getOneObjectAtOffset(imageWidth/ 2, imageHeight/ 2+3, Wall.class) != null){
           moveDown=false;
       }
       return moveDown;
    }
   
    public void walkUp(){ //movimenta o actor para cima
    
    if(facingRight){
     walkCycleRight();
     setLocation (getX(), getY()-ALPHA);
     detectKeyPress = true;
    }else{
     walkCycleLeft();
     setLocation (getX(), getY()-ALPHA);
     detectKeyPress = true;
    }    
   }
   
   public boolean canMoveUp(){ //verifica se o actor não tem obstáculos em cima
       boolean moveUp=true;
       int imageWidth=getImage().getWidth();
       int imageHeight=getImage().getHeight();
       if (getOneObjectAtOffset(imageWidth/ -2 , imageHeight/ -2 - 3, Wall.class) !=null && getOneObjectAtOffset(imageWidth/ 2, imageHeight/ -2-3, Wall.class) != null){
           moveUp=false;
       }
       return moveUp;
   }
   
   public void walkLeft(){ //movimenta o actor para a esquerda
     
     
        walkCycleLeft();
        setLocation (getX()-ALPHA, getY());
        detectKeyPress = true;
        
     
   } 
   public boolean canMoveLeft(){ //verifica se o actor não tem obstáculos na esquerda
       boolean moveLeft=true;
       int imageWidth=getImage().getWidth();
       int imageHeight=getImage().getHeight();
       if (getOneObjectAtOffset(imageWidth/ -2-3, imageHeight/ -2, Wall.class) !=null && getOneObjectAtOffset(imageWidth/ -2-3, imageHeight/ 2, Wall.class) != null){
           moveLeft=false;
       }
       return moveLeft;
   }
   
   public void walkRight(){ //movimenta o actor para a direita
    
    
     walkCycleRight();
     setLocation (getX()+ALPHA, getY());
     detectKeyPress = true;
    
       
    }
   
   public boolean canMoveRight(){ //verifica se o actor não tem obstáculos na direita
       boolean moveRight=true;
       int imageWidth=getImage().getWidth();
       int imageHeight=getImage().getHeight();
       if (getOneObjectAtOffset(imageWidth/ 2+3, imageHeight/ -2, Wall.class) !=null && getOneObjectAtOffset(imageWidth/ 2+3, imageHeight/ 2, Wall.class) != null){
           moveRight=false;
       }
       return moveRight;
   }
   
   /**   
    * Método que ocorre quando o actor não está em movimento.
    * Se não, fica parado a olhar para a direção respetiva
   */
   public void notWalk(){
        detectWalk=false;
        if (facingRight){
            setImage(Images[0]);
        }else{
            setImage(Images[5]);
        }
   }
   
   /**
    * Percorre a parte do array de imagens que tem o actor a andar para a direita.
   */
   public void walkCycleRight(){
        int delay = 10; //aumenta o intervalo de tempo entre mudança da imagens
        detectWalk = true;
        this.facingRight = true;
        counter ++;
        if(counter < 1 * delay)
        {
            setImage(Images[1]);
        }
        else if(counter < 2 * delay)
        {
            setImage(Images[2]);
        }
        else if(counter < 3 * delay)
        {
            setImage(Images[3]);
        }
        else if (counter < 4 * delay)
        {
            setImage(Images[4]);
        }else if(counter < 5 * delay)
        {
            counter = 1;
            return;
        }
      }
   
   /**
    * Percorre a parte do array de imagens que tem o actor a andar para a esquerda.
   */
   public void walkCycleLeft(){
        int delay = 10; //aumenta o intervalo de tempo entre mudança da imagens
        detectWalk = true;
        this.facingRight = false;
        counter ++;
        if(counter < 1 * delay)
        {
            setImage(Images[6]);
        }
        else if(counter < 2 * delay)
        {
            setImage(Images[7]);
        }
        else if(counter < 3 * delay)
        {
            setImage(Images[8]);
        }
        else if (counter < 4 * delay)
        {
            setImage(Images[9]);
        }
        else if(counter < 5 * delay)
        {
            counter = 1;
            return;
        }
        
   }
     
   public Boolean getDetectKeyPress(){
          return this.detectKeyPress;
   }
      
      public void interact(){
        if(this.isTouching(Interactable.class)){
              Interactable interactable = this.getIntersectingObjects(Interactable.class).get(0);
              interactable.interact();
        }
        
        
    }
    
    public HP getHP(){
        
        return this.hP;
    }
    
    public void gameOver(){
        if(this.hP.getHP()== 0){
            
            Greenfoot.setWorld(new Game_Over());
        }
    }
    public void refresh(){
        
        this.gameOver();
    }
    public boolean getIsFacingRight(){
        return this.facingRight;
    }
    
}
