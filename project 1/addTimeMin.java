import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class addTime here.
 * allows the user to increment the minute of the clock
 * @author Michael Wang 
 * @version 02/10/2016
 */
public class addTimeMin extends Clock
{
    /**
     * Act - do whatever the addTime wants to do. This method is called whenever
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
          clock1.addMin();
        }
    }    
}
