import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to turn the display on and off
 * 
 * @author Michael Bechtel
 * @version 1.0
 */
public class display extends ClockMenu
{
    /**
     * Act - do whatever the display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeDisplay();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type display with an initialized image
     * @return : None
     */
    public display()
    {
        setImage("display.png");
    }
    
    /**
     * @param : (pre) Both a Clock and a display object already exist
     * @param : (post) The display will be turned off if already on, or on if already off
     * @return : None
     */
    public void changeDisplay()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        
        if(Greenfoot.mouseClicked(this))
        {
            if(worldClock.getDisplayOn() == true)
            {
                worldClock.displayOn = false;
            }
            else
            {
                worldClock.displayOn = true;
            }
        }
    }
}
