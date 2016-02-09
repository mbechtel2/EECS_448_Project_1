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
    hourUp hup = new hourUp();
    hourDown hdown = new hourDown();
    minuteUp mup = new minuteUp();
    minuteDown mdown = new minuteDown();
    secondReset rsSec = new secondReset();
    
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
        addObject(hup, 400, 300);
        addObject(hdown, 400, 500);
        addObject(mup, 200, 100);
        addObject(mdown, 400, 100);
        addObject(rsSec, 200, 500);
    }
    
    public Clock getClock()
    {
        return mainClock;
    }
}
