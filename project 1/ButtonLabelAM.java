import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonLabelAM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonLabelAM extends Actor
{
    /**
     * Act - do whatever the ButtonLabelAM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ButtonLabelAM()
    {
        GreenfootImage AMLabel = new GreenfootImage (30, 30);
        AMLabel.drawString("A.M.", 5, 10);
        setImage(AMLabel);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
