import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dateDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public dateDown()
    {
        setImage("minus.png");
    }
    
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
