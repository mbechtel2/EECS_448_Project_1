import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to change the current mode to Clock mode.
 * 
 * @author Michael Bechtel, Shane Chu
 * @version 1.1
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
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type clockMode with an initialized image
     * @return : None
     */
    public clockMode()
    {
        setImage("clock.png");
    }
    
    /**
     * @param : (pre) Both a Clock and a clockMode object already exists
     * @param : (post) Changes the mode of the program to that of a clock.
     * @return : None
     */
    public void changeMode()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            worldClock.mDsp.changeImage("Clock");
            
            myClock.resetClock(worldClock.tempClock);
            myClock.clockMode = true;
            myClock.stopwatchMode = false;
            myClock.timerMode = false;
            myClock.startCycle = true;
        }
    }
}
