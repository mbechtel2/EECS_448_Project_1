import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * instantiates and instance of the world the clock runs in
 * @author Michael Wang 
 * @version 02/10/2016
 */
public class MyWorld extends World
{
    Clock clock1 = new Clock();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
     /**
     @param pre - none
    @param post - runs the world similar to a main
    @return - none
    */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //buttonAM bLabelAM = new buttonAM();
        //buttonPM bLabelPM = new buttonPM();
        
        addObject(new buttonAM(), 400, 200);
        addObject(new buttonPM(), 500, 200);
        
        addObject(new ButtonLabelAM(), 400, 170);
        addObject(new ButtonLabelPM(), 500, 170);
        
        
        addObject(clock1, 200, 200);
        
        addObject(new minusTimeMin(), 180, 250);
        addObject(new addTimeMin(), 180, 150);
        addObject(new minusTimeHr(), 150, 250);
        addObject(new addTimeHr(), 150, 150);
        addObject(new button12(), 400, 100);
        addObject(new button24(), 500, 100);
    }
    /**
    @param pre - none
    @param post - none
    @return - clock1 instance
    */
    public Clock getClock()
  {
      return (clock1);
  }
}
