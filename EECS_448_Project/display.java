import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public display()
    {
        setImage("display.png");
    }
    
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
