import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonLabelPM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonLabelPM extends Actor
{
    /**
     * Act - do whatever the ButtonLabelPM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ButtonLabelPM()
    {
        GreenfootImage PMLabel = new GreenfootImage (30, 30);
        PMLabel.drawString("P.M.", 5, 10);
        setImage(PMLabel);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
