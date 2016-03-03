import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to decrease the font of the numbers displayed.
 * 
 * @author Michael Bechtel
 * @version 1.0
 */
public class fontDown extends ClockMenu
{
    /**
     * Act - do whatever the fontDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        decreaseFont();
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type fontDown with an initialized image
     * @return : None
     */
    public fontDown()
    {
        setImage("minus.png");
    }
    
    /**
     * @param : (pre) A fontDown object already exists
     * @param : (post) Decreases the font size by 5.
     * @return : None
     */
    public void decreaseFont()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        
        if(Greenfoot.mouseClicked(this))
        {
            int temp = worldClock.getFontSize() - 5;
            worldClock.setFontSize(temp);
            
            worldClock.fSize.changeImage(temp);
        }
    }
}
