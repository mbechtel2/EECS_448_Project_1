import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dateUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public dateUp()
    {
        setImage("plus_grey.png");
    }
    
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
