import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Decrements the value of the clock's hour variable when clicked
 * 
 * @author Will Teeple
 * @version 1.2
 */
public class hourDown extends ClockMenu
{
    /**
     * Act - do whatever the hourDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toggle();
    }    
    
    /**
     * @pre : None
     * @post : Creates a new object of type hourDown with designated image
     * @return : None
     */
    public hourDown()
    {
        setImage("minus.png");
    }
    
    /**
     * @pre : Existing Clock and hourDown objects
     * @post : Decrements the clock's hour variable by one
     * @return : None
     */
    public void toggle()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        Clock myClock = worldClock.getClock();
        
        if (Greenfoot.mouseClicked(this))
        {
            myClock.changeHour(false);
        }
    }
    
    /**
     * Citation for image used: plus/minus sign
     * 
     * http://worldartsme.com/minus/?order=downloads      
     */
}
