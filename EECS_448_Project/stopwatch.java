import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to change the mode to Stopwatch mode.
 * 
 * @author Michael Bechtel, Shane Chu
 * @version 1.1
 */
public class stopwatch extends ClockMenu
{
    /**
     * Act - do whatever the stopwatch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeMode();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type stopwatch with an initialized image
     * @return : None
     */
    public stopwatch()
    {
        setImage("stopwatch.png");
    }
    
    /**
     * @param : (pre) Both a Clock and a stopwatch object already exist
     * @param : (post) Changes the mode of the program to that of a stopwatch.
     * @return : None
     */
    public void changeMode()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            if(myClock.clockMode)
            {
                worldClock.tempClock = myClock.createTempClock();
            }
            worldClock.mDsp.changeImage("Stopwatch");
            
            myClock.m_timeUpperBound = 24;
            myClock.clockMode = false;
            myClock.stopwatchMode = true;
            myClock.timerMode = false;
            myClock.startCycle = false;
            myClock.setTime(0,0,0);
        }
    }
}
