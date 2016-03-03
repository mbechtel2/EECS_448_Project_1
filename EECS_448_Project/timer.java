import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to change the mode to Timer mode.
 * 
 * @author Michael Bechtel
 * @version 1.0
 */
public class timer extends ClockMenu
{
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeMode();
    }  
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type timer with an initialized image
     * @return : None
     */
    public timer()
    {
        setImage("timer.png");
    }
    
    /**
     * @param : (pre) Both a Clock and a timer object already exist
     * @param : (post) Changes the mode of the program to that of a timer.
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
            worldClock.mDsp.changeImage("Timer");
            
            myClock.m_timeUpperBound = 24;
            myClock.clockMode = false;
            myClock.stopwatchMode = false;
            myClock.timerMode = true;
            myClock.startCycle = false;
            myClock.setTime(0,0,0);
        }
    }
}
