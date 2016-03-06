import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to display the current mode to the user
 * 
 * @author Michael Bechtel
 * @version 1.0
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
     
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type modeDisplay with an image initialzed to "Clock"
     * @return : None
     */
    public modeDisplay()
    {
        setImage(new GreenfootImage("Clock", 35, null, null));
    }
    
    /**
     * @param : (newMode) String that the object's image will change two
     * @param : (pre) Both clock and modeDisplay objects exist
     * @param : (post) Changes this object's string image to match the parameter string
     * @return : None
     */
    public void changeImage(String newMode)
    {
        setImage(new GreenfootImage(newMode, 35, null, null));
    }
}
