import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Increments the value of the clock's minute variable when clicked
 * 
 * Citation for image used: plus/minus sign:
 * http://worldartsme.com/minus/?order=downloads 
 * 
 * @author Will Teeple
 * @version 1.2
 */
public class minuteUp extends ClockMenu
{
    /**
     * Act - do whatever the minuteUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toggle();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type minuteUp with designated image
     * @return : None
     */
    public minuteUp()
    {
        setImage("plus.png");
    }
    
    /**
     * @param : (pre) Existing Clock and minuteUp objects
     * @param : (post) Increments the value of the clock's minute variable by one
     * @return : None
     */
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            myClock.changeMin(true);
        }
    }
}
