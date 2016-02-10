import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonPM here.
 changes the time of day from AM to PM
 * 
* @author Michael Wang 
 * @version 02/10/2016
 */
public class buttonPM extends Clock
{
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
            clock1.isAM(false);
        }
    }    
}
