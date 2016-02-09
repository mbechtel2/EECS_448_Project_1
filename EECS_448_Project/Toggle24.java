import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toggle24 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toggle24 extends ClockMenu
{
    /**
     * Act - do whatever the Toggle24 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toggle();
    }    
    
    public Toggle24()
    {
        setImage("12hour.png");
    }
    
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            if (myClock.get24Hour() == true)
            {
                myClock.is24Hour(false);
                setImage("12hour.png");                
            }
            else
            {
                myClock.is24Hour(true);
                setImage("24hour.png");
            }
        }
    }
}
