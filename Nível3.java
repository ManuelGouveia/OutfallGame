import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nível3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nível3 extends Níveis
{

    /**
     * Constructor for objects of class Nível3.
     * 
     */
    
   public Nível3(){
        this(false,false,false, 2 ,2);
    }
    public Nível3(boolean light1b ,boolean light2b ,boolean light3b,int hp1,int hp2)

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
        addObject(door_0,70,500);
        LongWallHorizontal longWallHorizontal = new LongWallHorizontal();
        addObject(longWallHorizontal,500,127);
        LongWallVerticalThin longWallVerticalThin = new LongWallVerticalThin();
        addObject(longWallVerticalThin,500,180);
        HP hp1 = new HP(getHP1());
        HP hp2 = new HP(getHP2());
        addObject(hp1, 914, 80);
        addObject(hp2,914,180);
        HazmatP2 hazmatP2 = new HazmatP2(hp2);
        addObject(hazmatP2,98,610);
        HazmatP1 hazmatP1 = new HazmatP1(hp1);
        addObject(hazmatP1,98,400);
        Light3 light3 = new Light3(getLight3b());
        addObject(light3,500,500);
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        addObject(panel1, 500, 50);
        addObject(panel2, 500, 150);
        addObject(panel3, 300, 150);
        addObject(panel4, 700, 150);

        PanelText panelText = new PanelText("1");
        addObject(panelText,360,150);
        PanelText panelText1 = new PanelText("+");
        addObject(panelText1,560,150);
        PanelText panelText2 = new PanelText("3");
        addObject(panelText2,560,50);
        PanelText panelText3 = new PanelText("2");
        addObject(panelText3,760,150);

        
        SelectButton button = new SelectButton(panelText, panelText3, panelText2, panelText1, light3);
        addObject(button,287,339);
       
        confirmationButton confirmationButton = new confirmationButton(button);
        addObject(confirmationButton,757,339);
    }
   
}
    
