import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door_2 extends Door
{
    /**
     * Act - do whatever the Door_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void interact(){
        super.interact();
         if(getWorld() instanceof Nível0){
            Nível0 currentWorld = (Nível0) getWorld();
            Nível2 newWorld = new Nível2(currentWorld.getLight1b(),currentWorld.getLight2b(),currentWorld.getLight3b(),currentWorld.getHP1(),currentWorld.getHP2() );
            Greenfoot.setWorld(newWorld);
            Greenfoot.delay(60);
        }
    }
}
