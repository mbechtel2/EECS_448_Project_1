import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonLabelPM here.
 * Labels the button as PM
 * @author Michael Wang 
 * @version 02/10/2016
 */
public class ButtonLabelPM extends Actor
{
    /**
     * Act - do whatever the ButtonLabelPM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     /**
     @param pre - none
    @param post - constructs a instance of a button label
    @return - none
    */
    public ButtonLabelPM()
    {
        GreenfootImage PMLabel = new GreenfootImage (30, 30);
        PMLabel.drawString("P.M.", 5, 10);
        setImage(PMLabel);
    }
    /**
    @param pre - none
    @parampost - runs as the world is running
    @return - none
    */
    public void act() 
    {
        // Add your action code here.
    }    
}
