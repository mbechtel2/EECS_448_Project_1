import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button24 here.
 * changes the button to 24 hour mode from 12 hour mode
 * @author Michael Wang 
 * @version 02/10/2016
 */
public class button24 extends Clock
{
    /**
     * Act - do whatever the button24 wants to do. This method is called whenever
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
            clock1.hour24();
        }
    }    
}
