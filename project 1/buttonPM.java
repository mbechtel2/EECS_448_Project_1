import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonPM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonPM extends Clock
{
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            isAM(false);
        }
    }    
}
