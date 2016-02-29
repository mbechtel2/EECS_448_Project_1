import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stopwatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public stopwatch()
    {
        setImage("stopwatch.png");
    }
    
    public void changeMode()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            myClock.m_timeUpperBound = 24;
            myClock.clockMode = false;
            myClock.stopwatchMode = true;
            myClock.timerMode = false;
            myClock.startCycle = false;
            myClock.setTime(0,0,0);
        }
    }
}
