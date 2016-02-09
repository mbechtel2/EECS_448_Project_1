import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
import java.lang.Object;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Write a description of class Clock here.
 * 
 * @file : Clock.java
 * @author : William Teeple
 * @version : 1.1
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
    private int m_hour = 0;
    private int m_minute = 0;
    private int m_second = 0;
    public int m_timeUpperBound = 12;//tells if the clock is 24 hours or 12 hour clock
    public boolean m_timeZone = true;//tells if the time is AM or PM
    public long timeNow = 0;
    public long startTime = System.currentTimeMillis();
    public String m_timeOfDay = "A.M.";

    /**
     * Act - do whatever the Clock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.calculateTime();
                
        if (get24Hour() == false)
        {
            setImage(new GreenfootImage(m_hour + " : " + m_minute + " : " + m_second + " " + m_timeOfDay, 70, null, null));
        }
        else
        {
            setImage(new GreenfootImage(m_hour + " : " + m_minute + " : " + m_second, 70, null, null));
        }
    }    
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------//

    public Clock() //wjt ; constructor
    {
        setTime(12, 0, 0);
    }
    
    public int[] getTime()
    {
        int[] time = {m_hour, m_minute, m_second};
        return time;
    }
    
    public Clock(int hours, int minutes, int seconds)
    {
        setTime(hours, minutes, seconds);
    }  
   
    public void setTime(int hours, int minutes, int seconds)//sets the time with user input.
    {
        m_hour = hours;
        m_minute = minutes;
        m_second = seconds;
    }

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
    
    public String getAM()
    {
        return m_timeOfDay;
    }
    
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
    
    public void resetSec()
    {
        m_second = 0;
        startTime = System.currentTimeMillis();
    }
    
    /*Clock Display for Console
    public void displayClock()//prints out the time of the clock
    {
        if(m_timeUpperBound == 24)
        {
            System.out.println(m_hour + ":" + m_minute + ":" + m_second);
        }
        else
        {
            System.out.println(m_hour + ":" + m_minute + ":" + m_second + " " + m_timeOfDay);
        }
    }
    */
   
    public void calculateTime()//this calculates the time for the clock
    {
        timeNow = System.currentTimeMillis() - startTime;//This grabs the system clock time in milliseconds
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
    /* Code for Command Line Testing
    public void initMenu() //wjt ; console menu for method testing
    {
        String h, m, s, input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your new clock!");

        do {
            System.out.println("\nSelect 12 hour or 24 hour clock format.");
            System.out.println("1. 12 hour");
            System.out.println("2. 24 hour");
            System.out.print("Your choice: ");
            input = scanner.nextLine();

            if (Integer.parseInt(input) == 1)
            {
                is24Hour(false);
            }
            else if (Integer.parseInt(input) == 2)
            {
                is24Hour(true);
            }
            else
            {
                System.out.println("Invalid selection, please choose again.");
            }
        } while (Integer.parseInt(input) != 1 && Integer.parseInt(input) != 2);

        if (m_timeUpperBound == 24)
        {
            System.out.println("\nLet's set the time.");
            do {
                System.out.print("Hours: ");
                h = scanner.nextLine();
                if (Integer.parseInt(h) < 0 || Integer.parseInt(h) > 23)
                {
                    System.out.println("Invalid selection, please choose again.");
                }
            } while (Integer.parseInt(h) < 0 || Integer.parseInt(h) > 23);
        }
        else //if 12
        {
            do {
                do {
                    System.out.println("\nA.M. or P.M.?");
                    System.out.println("1. A.M.");
                    System.out.println("2. P.M.");
                    System.out.print("Your choice: ");
                    input = scanner.nextLine();
                    if (Integer.parseInt(input) != 1 && Integer.parseInt(input) != 2)
                    {
                        System.out.println("Invalid selection, please choose again.");
                    }
                } while (Integer.parseInt(input) != 1 && Integer.parseInt(input) != 2);
                if (Integer.parseInt(input) == 1)
                {
                    isAM(true);
                }
                else
                {
                    isAM(false);
                }

                System.out.println("\nLet's set the time.");
                System.out.print("Hours: ");
                h = scanner.nextLine();
                if (Integer.parseInt(h) < 1 || Integer.parseInt(h) > 12)
                {
                    System.out.println("Invalid selection, please choose again.");
                }
            } while (Integer.parseInt(h) < 1 || Integer.parseInt(h) > 12);
        }

        do {
            System.out.print("Minutes: ");
            m = scanner.nextLine();
            if (Integer.parseInt(m) < 0 || Integer.parseInt(m) > 60)
            {
                System.out.println("Invalid selection, please choose again.");
            }
        } while (Integer.parseInt(m) < 0 || Integer.parseInt(m) > 60);

        do {
            System.out.print("Seconds: ");
            s = scanner.nextLine();
            if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > 60)
            {
                System.out.println("Invalid selection, please choose again.");
            }
        } while (Integer.parseInt(s) < 0 || Integer.parseInt(s) > 60);

        setTime(Integer.parseInt(h), Integer.parseInt(m), Integer.parseInt(s));

        System.out.println("\nEverything looks good! Your clock will now begin.\n");
    }
    */
}

