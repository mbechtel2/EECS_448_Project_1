import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to increase the font of the displayed numbers.
 * 
 * @author Michael Bechtel
 * @version 1.0
 */
public class fontUp extends ClockMenu
{
    /**
     * Act - do whatever the fontUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        increaseFont();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type fontUp with an initialized image
     * @return : None
     */
    public fontUp()
    {
        setImage("plus.png");
    }
    
    /**
     * @param : (pre) A fontUp object already exists
     * @param : (post) Increases the font size by 5.
     * @return : None
     */
    public void increaseFont()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        
        if(Greenfoot.mouseClicked(this))
        {
            int temp = worldClock.getFontSize() + 5;
            worldClock.setFontSize(temp);
            worldClock.fSize.changeImage(temp);
        }
    }
}
