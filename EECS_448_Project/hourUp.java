import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Increments the value of the clock's hour variable when clicked
 * 
 * @author Will Teeple
 * @version 1.2
 */
public class hourUp extends ClockMenu
{
    /**
     * Act - do whatever the hourUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
        toggle();
    }    
    
    /**
     * @pre : None
     * @post : Creates a new onject of type hourUp with designated image
     * @return : None
     */
    public hourUp()
    {
        setImage("plus.png");
    }
    
    /**
     * @pre : Existing Clock and hourUp objects
     * @post : Increments the clock's hour variable by one
     * @return : None
     */
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            myClock.changeHour(true);
        }
    }
}
