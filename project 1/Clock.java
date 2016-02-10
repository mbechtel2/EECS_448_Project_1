import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
import java.lang.Object;
/**
 * Write a description of class Clock here.
 * 
 *functioning clock class with all the methods
 *
 * @author Michael Wang 
 * @version0 02/10/2016
 */
public class Clock extends Actor
{
  int m_hour = 12;
  int m_minute = 0;
  int m_second = 0;
  int m_timeUpperBound = 0;//tells if the clock is 24 hours or 12 hour clock
  boolean m_timeZone = true;//tells if the time is AM or PM
  long timeNow = 0;
  long timeLater = 0;
  String m_timeOfDay = "A.M.";
  String time = "";
  long startTime = System.currentTimeMillis();
  int mSec = 0;
  
     /**
     * Act - do whatever the Clock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /**
     * 
     
    public Clock()
    {
        GreenfootImage clock = new GreenfootImage (time, 10, null, null);
        GreenfootImage clockImage = new GreenfootImage(clock.getWidth()+12, 24);
        //clockImage.setColor(new Color(196, 196, 0));
        //clockImage.fill();
        //clockImage.setColor(new Color(0, 0, 196));
        //clockImage.fillRect(3, 3, clockImage.getWidth()-6, 30);
        //clockImage.drawImage(clock, 6, 6);
        //clock.drawString(time, 5, 10);
        //setImage(time);
    }*/
    //pre - none
    //post - runs as the world is running
    //return - none
   public void act() 
    {
        // Add your action code here.
       this.calculateTime();
       
       this.displayClock();
        
        
    }
    //pre - ints for hour, minute, and second
    //post - sets the corresponding member variables
    //return - none
    public void setTime(int hours, int minutes, int seconds)//sets the time with user input.
  {
      m_hour = hours;
      m_minute = minutes;
      m_second = seconds;
  }
  //pre - none
    //post - adds a minute to m_minute and includes case for wrap around time
    //return - none
  public void addMin()
  {
       m_minute = m_minute + 1;
           if(m_minute == 60)
           {
               m_minute = 0;
           }
  }
  //pre - none
    //post - subtracts a minute to m_minute and includes case for wrap around time
    //return - none
  public void minusMin()
  {
      m_minute = m_minute - 1;
            if(m_minute == -1)
            {
                m_minute = 59;
            }
  }
  //pre - none
    //post - adds an hour to m_hour and includes case for wrap around time
    //return - none
  public void addHr()
  {
        m_hour = m_hour + 1; 
        
        if(m_timeUpperBound == 24)
            {
                if(m_hour == 24)
                {
                 m_hour = 0;
                }
            }
            else
            {
                if(m_hour == 13)
                {
                    m_hour = 1;
                }
            }
  }
  //pre - none
    //post - subtracts an hour to m_hour and includes case for wrap around time
    //return - none
  public void minusHr()
  {
        m_hour = m_hour - 1;
        
        if(m_timeUpperBound == 24)
            {
                if(m_hour == -1)
                {
                 m_hour = 23;
                }
            }
            else
            {
                if(m_hour == 0)
                {
                    m_hour = 12;
                }
            }
  }
  //pre - none
    //post - sets the clock to 24 hour mode
    //return - none
  public void hour24()
  {
      is24Hour(true);
      if(m_timeOfDay == "A.M.")
      {
          if(m_hour == 12)
          {
              m_hour = 0;
          }
      }
      else if(m_timeOfDay == "P.M.")
      {
          m_hour = ((m_hour % 12) + 12);
      }
  }
  //pre - none
    //post - sets the clock to 12 hour mode
    //return - none
  public void hour12()
  {
      is24Hour(false);
      if(m_timeOfDay == "A.M.")
      {
          if(m_hour == 0)
          {
              m_hour = 12;
          }
      }
      else if(m_timeOfDay == "P.M.")
      {
          m_hour = (m_hour % 12);
      }
  }
  //pre - boolean for time being 12 or 24 hour mode
    //post - sets the m_timeUpperBound corresponding to the hour mode
    //return - none
  public void is24Hour(boolean time)//sets the boundary for 24 hour clock or 12 hour clock.
  {
    if(time == true)
    {
      m_timeUpperBound = 24;
    }
    else
    {
      m_timeUpperBound = 12;
    }
  }
  //pre - boolean for the time of day
    //post - sets the time of day to AM if true and PM if false
    //return - none
  public void isAM(boolean AM)//tells the if the time is AM or PM or 12 hour
  {
    if(AM == true)
    {
     m_timeZone = true;
     m_timeOfDay = "A.M.";
    }
    else
    {
     m_timeZone = false;    
     m_timeOfDay = "P.M.";
    }
  }
  //pre - none
    //post - displays the clock based on the time of day and hour mode of the clock
    //return - none
  public void displayClock()//prints out the time of the clock
  {
     if(m_timeUpperBound == 24)
     {
        //System.out.println(m_hour + ":" + m_minute + ":" + m_second );
        //time = (m_hour + ":" + m_minute + ":" + m_second );
        setImage(new GreenfootImage(m_hour + ":" + m_minute + ":" + m_second + "         ", 30, null, null)); 
     }
     else
     {
       //System.out.println(m_hour + ":" + m_minute + ":" + m_second + " " + m_timeOfDay);
       //time = (m_hour + ":" + m_minute + ":" + m_second + " " + m_timeOfDay);
       setImage(new GreenfootImage(m_hour + ":" + m_minute + ":" + m_second + " " + m_timeOfDay, 30, null, null)); 
     }
  }
  //pre - none
    //post - calculates the time of the clock
    //return - none
  public void calculateTime()//this calculates the time for the clock
  {
      timeNow = System.currentTimeMillis();//This grabs the system clock time in milliseconds
      timeLater = (System.currentTimeMillis()+1000);
      /*while(timeNow != timeLater)//This delays the process by one second
      {
        timeNow = System.currentTimeMillis();
      }
      m_second += 1;
      */
     /*
      if(timeNow > 1000)
      {
          timeNow = System.currentTimeMillis();
          timeLater = (System.currentTimeMillis()+1000);
          m_second += 1;
      }
      */
      if(timeNow > 1000)
      {
          timeNow = System.currentTimeMillis();
          timeLater = (System.currentTimeMillis()+1000);
          mSec += 1;
      }
      
      if(mSec == 1000)
      {
          mSec = 0;
          m_second += 1;
      }
      if(m_second == 60)
      {
        m_second = 0;
        m_minute += 1;
        if(m_minute == 60)
        {
            m_minute = 0;
            m_hour +=1;
            if(m_timeUpperBound == 24)
            {
                if(((m_hour == 24) && (m_minute == 0) && (m_second == 0)))//helps for the wrap around time
                {
                 m_hour = 0;
                }
            }
            else
            {
                if(m_timeZone == true)
                {
                    if(((m_hour == 12) && (m_minute == 0) && (m_second == 0)))//helps for the wrap around time zone
                    {
                        m_timeZone = false; 
                        m_timeOfDay = "P.M.";
                    }
                    else if(((m_hour == 13) && (m_minute == 0) && (m_second == 0)))//helps for the wrap around time
                    {
                     m_hour = 1;    
                    }
                }
                else
                {
                    if(((m_hour == 12) && (m_minute == 0) && (m_second == 0)))//helps for the wrap around time zone
                    {
                        m_timeZone = true;  
                        m_timeOfDay = "A.M.";
                    }
                    else if(!((m_hour == 13) && (m_minute == 0) && (m_second == 0)))//helps for the wrap around time
                    {
                     m_hour = 1;
                    }
                }
            }
        }
      }
  }
}
