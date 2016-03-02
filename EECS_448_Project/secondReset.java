import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Resets the second count to zero when clicked
 * 
 * Update: Resets the hours and minutes to zero for the stopwatch
 * 
 * Citation for image used: reset button:
 * http://optimus5.com/index.php?page=search/images&search=restart+button&type=images
 * 
 * @author Will Teeple, Michael Bechtel
 * @version 1.3
 */
public class secondReset extends ClockMenu
{
    /**
     * Act - do whatever the secondReset wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toggle();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type secondReset with designated image
     * @return : None
     */
    public secondReset()
    {
        setImage("reset.png");
    }
    
    /**
     * @param : (pre) Existing Clock and secondReset objects
     * @param : (post) Resets the second count to zero
     * @return : None
     */
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            if(myClock.stopwatchMode == true)
            {
                myClock.resetSec();
                myClock.resetMin();
                myClock.resetHour();
                //myClock.startCycle = false;
            }
            else
            {
                myClock.resetSec();
            }
        }
    }
}
