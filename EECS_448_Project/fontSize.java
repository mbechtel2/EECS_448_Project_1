import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to display the current font size of the clock to the user.
 * 
 * @author Michael Bechtel
 * @version 1.1
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
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type fontSize with image initialzed to "Current Font Size: 95"
     * @return : None
     */
    public fontSize()
    { 
        setImage(new GreenfootImage("Current font size: " + currentSize, 35, null, null));
    }
    
    /**
     * @param: (newSize) Integer that will become the new font size
     * @param : (pre) A fontSize object already exists
     * @param : (post) The Clock's font size will change to match the parameter
     * @return : None
     */
    public void changeImage(int newSize)
    {
        currentSize = newSize;
        
        setImage(new GreenfootImage("Current font size: " + currentSize, 35, null, null));
    }
}
