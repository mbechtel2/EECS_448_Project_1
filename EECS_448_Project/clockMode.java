import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clockMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockMode extends ClockMenu
{
    /**
     * Act - do whatever the clockMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeMode();
    }    
    
    public clockMode()
    {
        setImage("clock.png");
    }
    
    public void changeMode()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            myClock.m_timeUpperBound = 24;
            myClock.clockMode = true;
            myClock.stopwatchMode = false;
            myClock.timerMode = false;
            myClock.startCycle = true;
            myClock.setTime(0,0,0);
        }
    }
}
