import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
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
        
        //Clock clock1 = new Clock();
        addObject(new Clock(), 200, 200);
        
        
    }
}
