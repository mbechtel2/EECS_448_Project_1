import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttons here.
 * changes the time of day from PM to AM
 * @author Michael Wang 
 * @version 02/10/2016
 */
public class buttonAM extends Clock
{
    /**
     * Act - do whatever the buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     //pre - none
    //post - runs as the world is running
    //return - none
       public void act() 
    {
        // Add your action code here.
        MyWorld clocks = (MyWorld) getWorld();
        Clock clock1 = clocks.getClock();
        if(Greenfoot.mouseClicked(this))
        {
            clock1.isAM(true);
        }
    }    
}
