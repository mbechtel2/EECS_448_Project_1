import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to move the date forward, one day at a time.
 * 
 * @author Michael Bechtel
 * @version 1.0
 */
public class dateUp extends ClockMenu
{
    /**
     * Act - do whatever the dateUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        incrementDate();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type dateUp with an initialized image
     * @return : None
     */
    public dateUp()
    {
        setImage("plus.png");
    }
    
    /**
     * @param : (pre) Both a date and a dateUp object already exist
     * @param : (post) Increases the numeric value of the date's day value by 1 
     * @return : None
     */
    public void incrementDate()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        date myDate = worldClock.getDate();
        
        if (Greenfoot.mouseClicked(this))
        {
            myDate.incrementDate();
        }
    }
}
