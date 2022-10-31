import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nível 0.
 * 
 * @Manuel Figueira Pestana de Gouveia 
 * @1 
 */
public class Níveis extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private boolean light1b;
    private boolean light2b;
    private boolean light3b;
    private int hp1;
    private int hp2;
    public Níveis(){
        this(false,false,false,2,2);
    }
    public Níveis(boolean light1b ,boolean light2b ,boolean light3b, int hp1, int hp2)

    {
        // Mudar background para metal
        super(1000, 800, 1); 
        setPaintOrder(Curtain.class);
        setBackground("metal_tiles.png");
        this.light1b = light1b;
        this.light2b = light2b;
        this.light3b = light3b;
        this.hp1 = hp1;
        this.hp2 = hp2;
        addObject(new Curtain(null), getWidth()/2, getHeight()/2);
        
        
        
        
    }
   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

       
       
    }
    public boolean getLight1b(){
        return this.light1b;
    }
    
    public boolean getLight2b(){
        return this.light2b;
    }
    
    public boolean getLight3b(){
        return this.light3b;
    }
    
    public int getHP1(){
        return this.hp1;
    }
    
    public int getHP2(){
        return this.hp2;
    }
    
    
   
    }
