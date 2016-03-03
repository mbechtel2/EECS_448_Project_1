import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fontSize here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fontSize extends ClockMenu
{
    public int currentSize = 95; 
    
    /**
     * Act - do whatever the fontSize wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public fontSize()
    { 
        
        setImage(new GreenfootImage("Current font size: " + currentSize, 35, null, null));
    }
    
    public void changeImage(int newSize)
    {
        currentSize = newSize;
        
        setImage(new GreenfootImage("Current font size: " + currentSize, 35, null, null));
    }
}
