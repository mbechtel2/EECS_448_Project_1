import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
import java.lang.Object;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Main class for the Clock object. Contains methods for displaying and setting the clock and switching between modes.
 * 
 * @file : Clock.java
 * @author : Michael Wang and William Teeple
 * @version : 1.2
 */

//**********************************************************
// Assignment: Clock Project1 Clock.java file
// Account: MichaelWang-6127
//
// Author: Michael Wang (Edited by Will Teeple)
//
// Date: 02/03/2016
//********************************************************* 

public class Clock extends Actor
{
    private int m_hour = 0; //current hour
    private int m_minute = 0; //current minute
    private int m_second = 0; //current second
    public int m_timeUpperBound = 12;//tells if the clock is 24 hours or 12 hour clock
    public boolean m_timeZone = true;//tells if the time is AM or PM
    public long timeNow = 0; //time comparison variable
    public long startTime = System.currentTimeMillis(); //time snapshot
    public String m_timeOfDay = "A.M."; //AM/PM output string
    public boolean clockMode = true;
    public boolean stopwatchMode = false;
    public boolean timerMode = false;
    public boolean startCycle = false;
    public int m_secondsLost = 0;
    
    

    /**
     * Act - do whatever the Clock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      ClockWorld worldClock = (ClockWorld) getWorld();  
        
      if(clockMode)
      {
          this.calculateTime();
      }
      else if(stopwatchMode && startCycle)
      {
          this.calculateTime();
      }
      else if(timerMode && startCycle)
      {
          this.decrementTime();
      }
      
      if (get24Hour() == false && worldClock.displayOn)
        {
            if (m_hour < 10)
            {
                if (m_minute < 10)
                {
                    if (m_second < 10)
                    {
                        setImage(new GreenfootImage("0" + m_hour + " : 0" + m_minute + " : 0" + m_second + " " + m_timeOfDay, worldClock.getFontSize(), null, null));
                    }
                    else
                    {
                        setImage(new GreenfootImage("0" + m_hour + " : 0" + m_minute + " : " + m_second + " " + m_timeOfDay, worldClock.getFontSize(), null, null));
                    }
                }
                else
                {
                    if (m_second < 10)
                    {
                        setImage(new GreenfootImage("0" + m_hour + " : " + m_minute + " : 0" + m_second + " " + m_timeOfDay, worldClock.getFontSize(), null, null));
                    }
                    else
                    {
                        setImage(new GreenfootImage("0" + m_hour + " : " + m_minute + " : " + m_second + " " + m_timeOfDay, worldClock.getFontSize(), null, null));
                    }
                }
            }
            else
            {
                if (m_minute < 10)
                {
                    if (m_second < 10)
                    {
                        setImage(new GreenfootImage(m_hour + " : 0" + m_minute + " : 0" + m_second + " " + m_timeOfDay, worldClock.getFontSize(), null, null));
                    }
                    else
                    {
                        setImage(new GreenfootImage(m_hour + " : 0" + m_minute + " : " + m_second + " " + m_timeOfDay, worldClock.getFontSize(), null, null));
                    }
                }
                else
                {
                    if (m_second < 10)
                    {
                        setImage(new GreenfootImage(m_hour + " : " + m_minute + " : 0" + m_second + " " + m_timeOfDay, worldClock.getFontSize(), null, null));
                    }
                    else
                    {
                        setImage(new GreenfootImage(m_hour + " : " + m_minute + " : " + m_second + " " + m_timeOfDay, worldClock.getFontSize(), null, null));
                    }
                }
            }
      }
      else if (get24Hour() == true && worldClock.displayOn)
      {
          if (m_hour < 10)
          {
              if (m_minute < 10)
              {
                  if (m_second < 10)
                  {
                      setImage(new GreenfootImage("0" + m_hour + " : 0" + m_minute + " : 0" + m_second, worldClock.getFontSize(), null, null));
                  }
                  else
                  {
                      setImage(new GreenfootImage("0" + m_hour + " : 0" + m_minute + " : " + m_second, worldClock.getFontSize(), null, null));
                  }
              }
              else
              {
                  if (m_second < 10)
                  {
                      setImage(new GreenfootImage("0" + m_hour + " : " + m_minute + " : 0" + m_second, worldClock.getFontSize(), null, null));
                  }
                  else
                  {
                      setImage(new GreenfootImage("0" + m_hour + " : " + m_minute + " : " + m_second, worldClock.getFontSize(), null, null));
                  }
              }
          }
          else
          {
              if (m_minute < 10)
              {
                  if (m_second < 10)
                  {
                      setImage(new GreenfootImage(m_hour + " : 0" + m_minute + " : 0" + m_second, worldClock.getFontSize(), null, null));
                  }
                  else
                  {
                      setImage(new GreenfootImage(m_hour + " : 0" + m_minute + " : " + m_second, worldClock.getFontSize(), null, null));
                 }
              }
              else
              {
                  if (m_second < 10)
                  {
                      setImage(new GreenfootImage(m_hour + " : " + m_minute + " : 0" + m_second, worldClock.getFontSize(), null, null));
                  }
                  else
                  {
                      setImage(new GreenfootImage(m_hour + " : " + m_minute + " : " + m_second, worldClock.getFontSize(), null, null));
                  }
              }
          }
      }
      else if (worldClock.displayOn == false)
      {
          setImage(new GreenfootImage("", worldClock.getFontSize(), null, null));
      }
   }    
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------//

    /**
     * Clock constructor, sets time to 12:00:00 AM
     * 
     * @param : (pre) None
     * @param  : (post) Creates a new object of type Clock with default time 12:00:00
     * @return : None
     */
    public Clock() //wjt ; constructor
    {
        setTime(12, 0, 0);
    }
    
    /**
     * Clock Constructor, sets time according to input arguments.
     * 
     * @param : (pre) None
     * @param : (post) Creates a new Clock object with the time corresponding to input arguments
     * @return : None
     */
    public Clock(int hours, int minutes, int seconds)
    {
        setTime(hours, minutes, seconds);
    }  

    /**
     * Returns the current time of the clock.
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) None
     * @return : Returns the current time in an array
     */
    public int[] getTime()
    {
        int[] time = {m_hour, m_minute, m_second};
        return time;
    }  

    /**
     * Sets the current time of the clock.
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) Sets the current time of the clock
     * @return : None
     */
    public void setTime(int hours, int minutes, int seconds)//sets the time with user input.
    {
        m_hour = hours;
        m_minute = minutes;
        m_second = seconds;
    }

    /**
     * Sets the clock to either 12- or 24 hour mode.
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) Sets the clock to 24- hour mode if true, 12- hour mode if false
     * @return : None
     */
    public void is24Hour(boolean time)//sets the boundary for 24 hour clock or 12 hour clock. ; wjt return type to void
    {
        if(time == true)
        {
            m_timeUpperBound = 24;
            if(m_timeOfDay == "P.M.")
            {
                if (m_hour != 12)
                {
                    m_hour += 12;
                }
            }    
            else
            {
                if (m_hour == 12)
                {
                    m_hour = 0;
                }
            }            
            m_timeOfDay = "";
            m_timeZone = false;
        }
        else
        {
            if (m_hour > 12)
            {
                m_hour -=12;
                m_timeOfDay = "P.M.";
                m_timeZone = false;
            }
            else if (m_hour == 12)
            {
                m_timeOfDay = "P.M.";
                m_timeZone = false;
            }
            else if (m_hour == 0)
            {
                m_hour = 12;
                m_timeOfDay = "A.M.";
                m_timeZone = true;
            }
            else
            {
                m_timeOfDay = "A.M.";
                m_timeZone = true;
            }
            m_timeUpperBound = 12;
        }
    }

    /**
     * Returns a boolean value corresponding to the current 'mode'
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) None
     * @return : Returns true if the clock is in 24- hour mode, false otherwise
     */
    public boolean get24Hour()
    {
        if (m_timeUpperBound == 12)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Sets the clock to be either AM or PM
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) Sets the clock to AM/PM, AM if true, PM if false
     * @return : None
     */
    public void isAM(boolean AM)//tells the if the time is AM or PM or 12 hour ; wjt change return to void
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

        return; //wjt
    }

    /**
     * Returns a boolean value corresponding to either AM or PM
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) None
     * @return : Returns true if the clock is set to AM, false otherwise
     */
    public String getAM()
    {
        return m_timeOfDay;
    }

    /**
     * Increments or decrements the hour depending on the input argument
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) Changes the clock hour, increments if argument is true, decrements if argument is false
     * @return : None
     */
    public void changeHour(boolean up)
    {
        if (up == true)
        {
            if (get24Hour() == true)
            {
                if (m_hour < 23)
                {
                    m_hour += 1;
                }
                else
                {
                    m_hour = 0;
                }
            }
            else
            {
                if (m_hour < 12)
                {
                    if (m_hour == 11)
                    {
                        m_hour += 1;
                        isAM(!m_timeZone);
                    }
                    else 
                    {
                        m_hour += 1;
                    }
                }
                else
                {
                    m_hour = 1;                    
                }
            }
        }
        else
        {
            if (get24Hour() == true)
            {
                if (m_hour > 0)
                {
                    m_hour -= 1;
                }
                else
                {
                    m_hour = 23;
                }
            }
            else
            {
                if (m_hour > 1 && m_hour != 12)
                {
                    m_hour -= 1;
                }
                else if (m_hour == 12)
                {
                    m_hour -= 1;
                    isAM(!m_timeZone);
                }
                else
                {
                    m_hour = 12;
                }
            }
        }

        return;
    }

    /**
     * Increments or decrements the minute depending on the input argument
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) Changes the clock minute, increments if argument is true, decrements if argument is false
     * @return : None
     */
    public void changeMin(boolean up)
    {
        if (up == true)
        {
            if (m_minute < 59)
            {
                m_minute += 1;
            }
            else
            {
                m_minute = 0;
                changeHour(true);
            }
        }
        else
        {
            if (m_minute > 0)
            {
                m_minute -= 1;
            }
            else
            {
                m_minute = 59;
                changeHour(false);
            }
        }

        return;
    }

    /**
     * Resets the second count to zero
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) Resets the value of the clock's second variable to zero
     * @return : None
     */
    public void resetSec()
    {
        m_second = 0;
        startTime = System.currentTimeMillis();
    }

    /**
     * Updates the time of the clock appropriately, incrementing minutes/hours when necessary
     * 
     * @param : (pre) Existing Clock object
     * @param : (post) Increments the second variable every 1000 ms, and updates all other time variables as necessary
     * @return : None
     */
    public void calculateTime()//this calculates the time for the clock
    {
        timeNow = System.currentTimeMillis() - startTime; //time passed since last snapshot
        
        if (timeNow >= 1000)
        {
            timeNow = 0;
            startTime = System.currentTimeMillis();
            m_second += 1;
        }

        /*
        while(timeNow != timeLater)//This delays the process by one second
        {
        timeNow = System.currentTimeMillis();
        }
         */

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
                        }
                        else if(!((m_hour == 13) && (m_minute == 0) && (m_second == 0)))//helps for the wrap around time
                        {
                            m_hour = 1;
                        }
                    }
                }
            }
        }

        this.isAM(m_timeZone);
    }
    
    public int getTotalSeconds()
    {
        int hours = m_hour * 3600;
        int minutes = m_minute * 60;
        int seconds = hours + minutes + m_second;
        
        return seconds;
    }
    
    public void decrementTime()
    {
        timeNow = System.currentTimeMillis() - startTime; //time passed since last snapshot
        
        if (timeNow >= 100 && m_hour >= 0)
        {
            timeNow = 0;
            startTime = System.currentTimeMillis();
            m_second -= 1;
        }
        else if(m_hour < 0)
        {
            m_hour = 0;
            m_minute = 0;
            m_second = 0;
        }

        /*
        while(timeNow != timeLater)//This delays the process by one second
        {
        timeNow = System.currentTimeMillis();
        }
         */
        if(m_second < 0)
        {
            m_second = 59;
            m_minute -= 1;

            if(m_minute < 0)
            {
                m_minute = 59;
                m_hour -=1;

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
                        }
                        else if(!((m_hour == 13) && (m_minute == 0) && (m_second == 0)))//helps for the wrap around time
                        {
                            m_hour = 1;
                        }
                    }
                }
            }
        }

        this.isAM(m_timeZone);
    }
}

