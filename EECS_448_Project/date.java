import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Keeps track of the date and allows the user to change it
 * 
 * @author Michael Bechtel
 * @version 1.0
 */
public class date extends ClockMenu
{
    public int day = 0;
    public int tempDay = 0;
    public int month = 0;
    public int monthIndex = 0;
    public String[] days = {"Friday","Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
    public String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public int[] daysInAMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    /**
     * Act - do whatever the date wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type date with day and month initialized to 0
     * @return : None
     */
    public date()
    {
        day = 0;
        month = 0;
    }
    
    /**
     * @param : (pre) None
     * @param : (post) Creates a new object of type date with day and month initialized to given parameters
     * @param : (currentDay) The numeric value of the current day
     * @param : (currentMonth) The numeric value of the current month
     * @return : None
     */
    public date(int currentDay, int currentMonth)
    {
        day = currentDay;
        month = currentMonth;
    }
    
    
    /**
     * @param : (pre) A date object already exists
     * @param : (post) The date will have been progressed by one day and the date object's will be updated
     * @return : None
     */
    public void incrementDate()
    {
        if(day == daysInAMonth[monthIndex] - 1 && monthIndex >= 11)
        {
            //do nothing
        }
        else if(day == daysInAMonth[monthIndex] - 1)
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
    
    /**
     * @param : (pre) A date object already exists
     * @param : (post) The date will have been moved back by one day and the date object's will be updated
     * @return : None
     */
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
    
    /**
     * @param : (pre) A date object already exists
     * @param : (post) None
     * @return : The current day's numeric value
     */
    public int getDay()
    {
        return day + 1;
    }
    
    /**
     * @param : (pre) A date object already exists
     * @param : (post) None
     * @return : The current weekday
     */
    public String getDayName()
    {
        return days[tempDay % 7];
    }
    
    /**
     * @param : (pre) A date object already exists
     * @param : (post) None
     * @return : The current month's name
     */
    public String getMonth()
    {
        return months[month];
    }
}
