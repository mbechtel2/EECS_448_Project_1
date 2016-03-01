import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public stop()
    {
        setImage("stop.png");
    }
    
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
