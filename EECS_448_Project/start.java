import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to start the stopwatch and timer.
 * 
 * @author Michael Bechtel, Shane Chu
 * @version 1.1
 */
public class start extends ClockMenu
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        begin();
    } 
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type start with an initialized image
     * @return : None
     */
    public start()
    {
        setImage("start.png");
    }
    
    /**
     * @param : (pre) Both a Clock and a start object already exist
     * @param : (post) Will tell the world to start the stopwatch or timer.
     * @return : None
     */
    public void begin()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
                myClock.startCycle = true;
        }
    }
}
