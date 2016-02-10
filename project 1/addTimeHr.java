import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class addTimeHr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class addTimeHr extends Clock
{
    /**
     * Act - do whatever the addTimeHr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        MyWorld clocks = (MyWorld) getWorld();
        Clock clock1 = clocks.getClock();
        if(Greenfoot.mouseClicked(this))
        {
            clock1.addHr();
        }   
    }
}