import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fontUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public fontUp()
    {
        setImage("plus.png");
    }
    
    public void increaseFont()
    {
        ClockWorld worldClock = (ClockWorld) getWorld();
        
        if(Greenfoot.mouseClicked(this))
        {
            int temp = worldClock.getFontSize() + 5;
            worldClock.setFontSize(temp);
        }
    }
}
