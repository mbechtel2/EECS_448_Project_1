import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Decrements the value of the clock's minute variable when clicked
 * 
 * Citation for image used: plus/minus sign: 
 * http://worldartsme.com/minus/?order=downloads
 * 
 * @author Will Teeple
 * @version 1.2
 */
public class minuteDown extends ClockMenu
{
    /**
     * Act - do whatever the minuteDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toggle();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type minuteDown with designated image
     * @return : None
     */
    public minuteDown()
    {
        setImage("minus.png");
    }
    
    /**
     * @param : (pre) Existing Clock and minuteDown objects
     * @param : (post)Decrements the value of the clock's minute variable by one
     * @return : None
     */
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            myClock.changeMin(false);
        }
    }
}
