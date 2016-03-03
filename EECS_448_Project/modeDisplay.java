import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class modeDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class modeDisplay extends ClockMenu
{
    /**
     * Act - do whatever the modeDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public modeDisplay()
    {
        setImage(new GreenfootImage("Clock", 35, null, null));
    }
    
    public void changeImage(String newMode)
    {
        setImage(new GreenfootImage(newMode, 35, null, null));
    }
}
