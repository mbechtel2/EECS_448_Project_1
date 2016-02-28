import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ClockWorld is the world containing the components of the digital clock
 * 
 * @author Will Teeple
 * @version 1.2
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
    stopwatch stp = new stopwatch();
    timer tmr = new timer();
    start srt = new start();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ClockWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1);      
        setBackground(new GreenfootImage("clockFace.png"));
        
        //set default clock message
        mainClock.setImage(new GreenfootImage(mainClock.getTime()[0] + " : 0" + mainClock.getTime()[1] + " : 0" + mainClock.getTime()[2]+ " " + mainClock.getAM(), 95, null, null));

        //add clock display
        addObject(mainClock, 300, 100);
        
        //add 12/24 hour toggle button
        addObject(toggle, 70, 248);
        
        //add hour set buttons
        addObject(hup, 470, 245);
        addObject(hdown, 470, 285);
        addObject(new hourLabel(), 470, 215);
        
        //add minute set buttons
        addObject(mup, 520, 245);
        addObject(mdown, 520, 285);
        addObject(new minLabel(), 520, 215);
        
        //add second reset button
        addObject(rsSec, 570, 255);
        addObject(new secLabel(), 570, 215);
        
        //add timer, stopwatch, and start buttons
        addObject(stp, 210, 225);
        addObject(tmr, 350, 225);
        addObject(srt, 280, 270);
    }
    
    /** 
     * @param : (pre) Existing Clock object
     * @param : (post) None
     * @return : Returns the main Clock object in the world
     */
    public Clock getClock()
    {
        return mainClock;
    }
}
