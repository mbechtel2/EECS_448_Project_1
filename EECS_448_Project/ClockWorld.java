import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClockWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockWorld extends World
{
    Clock mainClock = new Clock();
    Toggle24 toggle = new Toggle24();
    hourUp up = new hourUp();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ClockWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);         
        
        
        mainClock.setImage(new GreenfootImage(mainClock.getTime()[0] + " : " + mainClock.getTime()[1] + " : " + mainClock.getTime()[2]+ " " + mainClock.getAM(), 70, null, null));
        toggle.setImage("12hour.png");
        addObject(mainClock, 300, 200);
        addObject(toggle, 200, 300);
        addObject(up, 400, 300);
    }
    
    public Clock getClock()
    {
        return mainClock;
    }
}
