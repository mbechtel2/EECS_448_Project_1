import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class date extends ClockMenu
{
    public int day = 0;
    public int month = 0;
    public String[] days = {"Friday","Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
    public String[] months = {"January", "February", "March", "April", "June", "July", "August", "September", "October", "November", "December"};
    
    /**
     * Act - do whatever the date wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public date()
    {
        day = 0;
        month = 0;
    }
    
    public date(int currentDay, int currentMonth)
    {
        day = currentDay;
        month = currentMonth;
    }
    
    public void incrementDate()
    {
        day++;
           
        this.setImage(new GreenfootImage("Date: " + this.getDayName() + " " + this.getMonth() + " " + this.getDay(), 35, null, null));
    }
    
    public int getDay()
    {
        return day + 1;
    }
    
    public String getDayName()
    {
        return days[day % 7];
    }
    
    public String getMonth()
    {
        return months[month];
    }
}
