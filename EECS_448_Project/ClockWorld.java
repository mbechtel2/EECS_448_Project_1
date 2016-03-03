import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;

/**
 * ClockWorld is the world containing the components of the digital clock
 * 
 * @author Will Teeple
 * @version 1.2
 */
public class ClockWorld extends World
{
    Clock mainClock = new Clock();
    Clock tempClock = mainClock.createTempClock();
    Toggle24 toggle = new Toggle24();
    hourUp hup = new hourUp();
    hourDown hdown = new hourDown();
    minuteUp mup = new minuteUp();
    minuteDown mdown = new minuteDown();
    secondReset rsSec = new secondReset();
    stopwatch stp = new stopwatch();
    timer tmr = new timer();
    start srt = new start();
    date dte = new date();
    dateUp dteUp = new dateUp();
    dateDown dteDown = new dateDown();
    display dsp = new display();
    stop pause = new stop();
    clockMode clkMode = new clockMode();
    fontUp fntUp = new fontUp();
    fontDown fntDown = new fontDown();
    modeDisplay mDsp = new modeDisplay();
    fontSize fSize = new fontSize();
    
    public boolean displayOn;
    private int fontSize = 95;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ClockWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1);      
        setBackground(new GreenfootImage("clockFace.png"));
        
        displayOn = true;
        fontSize = 95;
        
        //set default clock message
        if(displayOn)
        {
            mainClock.setImage(new GreenfootImage(mainClock.getTime()[0] + " : 0" + mainClock.getTime()[1] + " : 0" + mainClock.getTime()[2]+ " " + mainClock.getAM(), fontSize, null, null));
            
        }
        else
        {
            mainClock.setImage(new GreenfootImage("", 95, null, null));
        }
        
        //set default date message
        dte.setImage(new GreenfootImage("Date: " + dte.getDayName() + " " + dte.getMonth() + " " + dte.getDay(), 35, null, null));

        //add clock display
        addObject(mainClock, 300, 100);
        
        //add date display
        addObject(dte, 225, 330);
        addObject(dteUp, 470, 330);
        addObject(dteDown, 520, 330);
        
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
        addObject(clkMode, 210, 210);
        addObject(stp, 210, 245);
        addObject(tmr, 210, 285);
        addObject(srt, 360, 220);
        addObject(pause, 360, 265);
        
        //add on/off display button
        addObject(dsp, 525, 30);
        addObject(mDsp, 85, 25);
        
        //add font up and down buttons
        addObject(fntUp, 500, 165);
        addObject(fntDown, 550, 165);
        addObject(fSize, 325, 165);
        
        
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
    
    public date getDate()
    {
        return dte;
    }
    
    public boolean getDisplayOn()
    {
        return displayOn;
    }
    
    public int getFontSize()
    {
        return fontSize;
    }
    
    public void setFontSize(int newSize)
    {
        fontSize = newSize;
    }
    
    public void changeDate()
    {
        dte.incrementDate();
    }
}
