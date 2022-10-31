import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nível0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nível0 extends Níveis
{
    
    /**
     * Constructor for objects of class Nível0.
     * 
     */

   public Nível0(){
        this(false,false,false, 2 ,2);
    }
    public Nível0(boolean light1b ,boolean light2b ,boolean light3b,int hp1,int hp2)

    {
        // Mudar background para metal
        super(light1b,light2b,light3b,hp1,hp2);
        //Criar o mundo
        prepare();
    }
    

    /**
     * Coloca os objetos no mundo
     */
    private void prepare()
    {
        Greenfoot.delay(5);
        LongWallHorizontal longWallHorizontal = new LongWallHorizontal();
        addObject(longWallHorizontal,500,127);
        longWallHorizontal.setLocation(495,127);
        
        
        HP hp1 = new HP(getHP1());
        HP hp2 = new HP(getHP2());
        addObject(hp1, 914, 80);
        addObject(hp2,914,180);
        HazmatP2 hazmatP2 = new HazmatP2(hp2);
        addObject(hazmatP2,700,500);
        HazmatP1 hazmatP1 = new HazmatP1(hp1);
        addObject(hazmatP1,320,500);
        Door_1 door_1 = new Door_1();
        addObject(door_1,70,500);
        Door_2 door_2 = new Door_2();
        addObject(door_2,500,730);
        Door_3 door_3 = new Door_3();
        addObject(door_3,930,500);
        Light1 light1 = new Light1(getLight1b());
        addObject(light1,375,40);
        Light2 light2 = new Light2(getLight2b());
        addObject(light2,500,40);
        Light3 light3 = new Light3(getLight3b());
        addObject(light3,625,40);
        Final_Door finalDoor = new Final_Door(light1,light2,light3);
        addObject(finalDoor,500,230);
        
        
    }
    
    
    
}
    

