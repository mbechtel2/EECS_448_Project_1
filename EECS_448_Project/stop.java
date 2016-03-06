import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to pause the stopwatch or timer.
 * 
 * @author Michael Bechtel, Shane Chu
 * @version 1.1
 */
public class stop extends ClockMenu
{
    /**
     * Act - do whatever the stop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        stopClock();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type stop with an initialized image
     * @return : None
     */
    public stop()
    {
        setImage("stop.png");
    }
    
    /**
     * @param : (pre) Both a Clock and a stop object already exist.
     * @param : (post) Pauses the stopwatch or timer.
     * @return : None
     */
    public void stopClock()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
                myClock.startCycle = false;
        }
    }
}
