import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class addTimeHr here.
 * allows the user to increment the hour of the clock
 * @author Michael Wang 
 * @version 02/10/2016
 */
public class addTimeHr extends Clock
{
    /**
     * Act - do whatever the addTimeHr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     /**
      @param pre - none
    @param post - runs as the world is running
    @return - none
    */
    public void act() 
    {
        // Add your action code here.
        MyWorld clocks = (MyWorld) getWorld();
        Clock clock1 = clocks.getClock();
        if(Greenfoot.mouseClicked(this))
        {
            clock1.addHr();
        }   
    }
}
