import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nível1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nível1 extends Níveis
{

    /**
     * Constructor for objects of class Nível1.
     * 
     */
    public Nível1(){
        this(false,false,false, 2 ,2);
    }
    public Nível1(boolean light1b ,boolean light2b ,boolean light3b,int hp1,int hp2)

    {
        // Mudar background para metal
        super(light1b,light2b,light3b,hp1,hp2);
        //Criar o mundo
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Greenfoot.delay(5);
        LongWallHorizontal longWallHorizontal = new LongWallHorizontal();
        addObject(longWallHorizontal,500,127);
        LongWallHorizontalThin longWallHorizontalThin = new LongWallHorizontalThin();
        addObject(longWallHorizontalThin,372,532);
        HP hp1 = new HP(getHP1());
        HP hp2 = new HP(getHP2());
        addObject(hp1, 914, 80);
        addObject(hp2,914,180);
        HazmatP2 hazmatP2 = new HazmatP2(hp2);
        addObject(hazmatP2,912,610);
        HazmatP1 hazmatP1 = new HazmatP1(hp1);
        addObject(hazmatP1,912,400);
        //LeversLight light1 = new LeversLight();
        //addObject(light1,500,40);
        Door_0 door_0 = new Door_0();
        addObject(door_0,930,500);
        Gateway gateway1 = new Gateway();
        Gateway gateway2 = new Gateway();
        Gateway gateway3 = new Gateway();
        Gateway gateway4 = new Gateway();
        Gateway gateway5 = new Gateway();
        Gateway gateway6 = new Gateway();
        Gateway gateway7 = new Gateway();
        Gateway gateway8 = new Gateway();
        addObject(gateway1,665,800);
        addObject(gateway2,665,565);
        addObject(gateway3,665,240);
        addObject(gateway4,665,485);
        addObject(gateway5,265,800);
        addObject(gateway6,265,565);
        addObject(gateway7,265,240);
        addObject(gateway8,265,485);
        SparkSmall sparksmall1 = new SparkSmall();
        SparkSmall sparksmall2 = new SparkSmall();
        addObject(sparksmall1, 665, 680);
        addObject(sparksmall2, 265, 680);
        SparkBig sparkbig = new SparkBig();
        addObject(sparkbig,450,350);
        LeverUp leverUp = new LeverUp(sparkbig);
        addObject(leverUp,895,300);

        LeverDown leverDown = new LeverDown(sparksmall1, sparksmall2);
        addObject(leverDown,909,691);
        
        Light1 light1 = new Light1(getLight1b());
        
        addObject(light1,486,44);
        FinalLever2 finalLever2 = new FinalLever2();
        addObject(finalLever2,73,645);
        FinalLever finalLever = new FinalLever(light1,finalLever2);
        addObject(finalLever,66,332);
        
        //removeObject(light1);
        
    }
   
    
}
    

