import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Toggles the clock between 12- and 24- hour modes
 * 
 * @author Will Teeple, Shane Chu, Michael Bechtel
 * @version 1.4
 */
public class Toggle24 extends ClockMenu
{
    /**
     * Act - do whatever the Toggle24 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toggle();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type Toggle24 with designated image
     * @return : None
     */
    public Toggle24()
    {
        setImage("12hour.png");
    }
    
    /**
     * @param : (pre) Existing Clock and Toggle24 objects
     * @param : (pre) Switches the clock between 12- and 24- hour modes and alternates images
     * @return : None
     */
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this) && myClock.clockMode)
        {
            if (myClock.get24Hour() == true)
            {
                myClock.is24Hour(false);
                setImage("12hour.png");                
            }
            else
            {
                myClock.is24Hour(true);
                setImage("24hour.png");
            }
        }
    }
}
