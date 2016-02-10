import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonLabelAM here.
 * Labels the button as AM
 * @author Michael Wang 
 * @version 02/10/2016
 */
public class ButtonLabelAM extends Actor
{
    /**
     * Act - do whatever the ButtonLabelAM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     //pre - none
    //post - constructs an instance of a button label
    //return - none
    public ButtonLabelAM()
    {
        GreenfootImage AMLabel = new GreenfootImage (30, 30);
        AMLabel.drawString("A.M.", 5, 10);
        setImage(AMLabel);
    }
    //pre - none
    //post - runs as the world is running
    //return - none
    public void act() 
    {
        // Add your action code here.
    }    
}
