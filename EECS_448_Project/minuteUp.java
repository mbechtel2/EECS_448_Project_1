import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class minuteUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public minuteUp()
    {
        setImage("plus.png");
    }
    
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
