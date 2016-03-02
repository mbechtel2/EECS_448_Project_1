import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to move the date back, one day at a time
 * 
 * @author Michael Bechtel
 * @version 1.0
 */
public class dateDown extends ClockMenu
{
    /**
     * Act - do whatever the dateDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeDate();
    }   
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type dateDown with an initialized image
     * @return : None
     */
    public dateDown()
    {
        setImage("minus.png");
    }
    
    /**
     * @param : (pre) There exists both a date and a dateDown object
     * @param : (post) The date's day value with be decreased by 1
     * @return : None
     */
    public void changeDate()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        date myDate = worldClock.getDate();
        
        if (Greenfoot.mouseClicked(this))
        {
            myDate.decrementDate();
        }
    }
}
