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
    public int tempDay = 0;
    public int month = 0;
    public int monthIndex = 0;
    public String[] days = {"Friday","Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
    public String[] months = {"January", "February", "March", "April", "June", "July", "August", "September", "October", "November", "December"};
    public int[] daysInAMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
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
        if(day == daysInAMonth[monthIndex] - 1)
        {
            monthIndex++;
            month++;
            day = 0;
            tempDay++;
        }
        else
        {
            day++;
            tempDay++;
        }
        
        this.setImage(new GreenfootImage("Date: " + this.getDayName() + " " + this.getMonth() + " " + this.getDay(), 35, null, null));
    }
    
    public void decrementDate()
    {
        if(day > 0 && tempDay > 0)
        {
            day--;
            tempDay--;
        }
        else if(tempDay > 0)
        {
            tempDay--;
            monthIndex--;
            month--;
            day = daysInAMonth[month] - 1;
        }        
        this.setImage(new GreenfootImage("Date: " + this.getDayName() + " " + this.getMonth() + " " + this.getDay(), 35, null, null));
    }
    
    public int getDay()
    {
        return day + 1;
    }
    
    public String getDayName()
    {
        return days[tempDay % 7];
    }
    
    public String getMonth()
    {
        return months[month];
    }
}
