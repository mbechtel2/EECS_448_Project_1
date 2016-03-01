import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fontDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public fontDown()
    {
        setImage("minus.png");
    }
    
    public void decreaseFont()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        
        if(Greenfoot.mouseClicked(this))
        {
            int temp = worldClock.getFontSize() - 5;
            worldClock.setFontSize(temp);
        }
    }
}
