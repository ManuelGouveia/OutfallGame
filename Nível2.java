import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nível2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nível2 extends Níveis
{

    /**
     * Constructor for objects of class Nível2.
     * 
     */
   
    public Nível2(){
        this(false,false,false, 2 ,2);
    }
    public Nível2(boolean light1b ,boolean light2b ,boolean light3b,int hp1,int hp2)

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
        Door_0 door_0 = new Door_0();
        addObject(door_0,500,91);
        LongWallHorizontal longWallHorizontal = new LongWallHorizontal();
        addObject(longWallHorizontal,500,127);
        HP hp1 = new HP(getHP1());
        HP hp2 = new HP(getHP2());
        addObject(hp1, 914, 80);
        addObject(hp2,914,180);
        HazmatP2 hazmatP2 = new HazmatP2(hp2);
        addObject(hazmatP2,650,350);
        HazmatP1 hazmatP1 = new HazmatP1(hp1);
        addObject(hazmatP1,300,350);
        Light2 light2 = new Light2(getLight2b());
        addObject(light2,500,40);
        
        PuzzleCircuit puzzlecircuit = new PuzzleCircuit();
        addObject(puzzlecircuit, 130, 127);

        PuzzlePiece1 puzzlePiece1 = new PuzzlePiece1(light2);
        addObject(puzzlePiece1,104,508);
        PuzzlePiece2 puzzlePiece2 = new PuzzlePiece2(light2);
        addObject(puzzlePiece2,333,510);
        PuzzlePiece3 puzzlePiece3 = new PuzzlePiece3(light2);
        addObject(puzzlePiece3,574,504);
        PuzzlePiece4 puzzlePiece4 = new PuzzlePiece4(light2);
        addObject(puzzlePiece4,822,504);
        puzzlePiece1.setLocation(272,700);
        puzzlePiece3.setLocation(293,496);
        puzzlePiece2.setLocation(649,528);
        puzzlePiece4.setLocation(613,670);
        PuzzleTip puzzleTip = new PuzzleTip("1      3");
        addObject(puzzleTip,140,70);
        PuzzleTip puzzleTip2 = new PuzzleTip("2      4");
        addObject(puzzleTip2,140,180);


        Door_0 door_02 = new Door_0();
        addObject(door_02,500,180);
        
        
    }
    
}
    

