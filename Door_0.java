import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door_0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door_0 extends Door
{
    /**
     * Act - do whatever the Door_0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void interact(){
        super.interact();
        if(getWorld() instanceof Nível1){
            boolean light1b = getWorld().getObjects(Light1.class).get(0).getState();
            Nível1 currentWorld = (Nível1) getWorld();
            int hp1 = getWorld().getObjects(HazmatP1.class).get(0).getHP().getHP();
            int hp2 = getWorld().getObjects(HazmatP2.class).get(0).getHP().getHP();
            Nível0 newWorld = new Nível0(light1b,currentWorld.getLight2b(),currentWorld.getLight3b(),hp1,hp2);
            Greenfoot.setWorld(newWorld);
        }
        if(getWorld() instanceof Nível2){
            boolean light2b = getWorld().getObjects(Light2.class).get(0).getState();
            Nível2 currentWorld = (Nível2) getWorld();
            int hp1 = getWorld().getObjects(HazmatP1.class).get(0).getHP().getHP();
            int hp2 = getWorld().getObjects(HazmatP2.class).get(0).getHP().getHP();
            Nível0 newWorld = new Nível0(currentWorld.getLight1b(),light2b,currentWorld.getLight3b(),hp1,hp2);
            Greenfoot.setWorld(newWorld);
        }
        if(getWorld() instanceof Nível3){
            boolean light3b = getWorld().getObjects(Light3.class).get(0).getState();
            Nível3 currentWorld = (Nível3) getWorld();
            int hp1 = getWorld().getObjects(HazmatP1.class).get(0).getHP().getHP();
            int hp2 = getWorld().getObjects(HazmatP2.class).get(0).getHP().getHP();
            Nível0 newWorld = new Nível0(currentWorld.getLight1b(),currentWorld.getLight2b(),light3b,hp1,hp2);
            Greenfoot.setWorld(newWorld);
        }
    }
}
