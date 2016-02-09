import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class minuteDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class minuteDown extends ClockMenu
{
    /**
     * Act - do whatever the minuteDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        toggle();
    }    
    
    public minuteDown()
    {
        setImage("24hour.png");
    }
    
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
