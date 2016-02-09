import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Resets the second count to zero when clicked
 * 
 * @author Will Teeple
 * @version 1.2
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
     * @pre : None
     * @post : Creates a new object of type secondReset with designated image
     * @return : None
     */
    public secondReset()
    {
        setImage("reset.png");
    }
    
    /**
     * @pre : Existing Clock and secondReset objects
     * @post : Resets the second count to zero
     * @return : None
     */
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            myClock.resetSec();
        }
    }
}
