/**
 *		@file:		Main.java
 *		@author:	Austin Bailey
 *		@date:		2/4/2016
 * 
 */
package version0;
import java.util.Scanner;
public class Main 
{
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		boolean is12hr;		//this boolean determines if the clock outputs in 12 or 24 hr, 12 for true, 24 for false
//		boolean initialSeen=false;//When reading input from user, will determine if the user has seen the prompt for the first time or not
		boolean isAM;
		boolean exit = false;//determines if we should exit loop
		int choice;
		int min, hr, sec;
		pln("Welcome to the clock!\nplease interact with the clock by pressing a number and hitting enter");
		while(!exit)
		{
			pln("Would you like the clock to display in 12 or 24 hour mode?\n1)12hr\n2)24hr");
			choice = myScanner.nextInt();//TODO fix so that it takes any input in as a string, then converts to int to prevent errors
			if(choice==1)
			{
				is12hr=true;
				exit=true;
			}
			else if(choice==2)
			{
				is12hr=false;
				exit=true;
			}
			else
			{
				pln("Please enter only the number 1 or 2 and nothing else");
				exit=false;
			}
		}
		exit=false;
		if(is12hr)
		{
			while(!exit)
			{
				pln("Would you like to set the clock to \n1)a.m. or \n2)p.m.")
				choice = myScanner.nextInt();
				if(choice==1)
				{
					isAM=true;
					exit=true;
				}
				else if(choice==2)
				{
					isAM=false;
					exit=false;
				}
				else
				{
					pln("Please enter only the number 1 or 2 and nothing else");
					exit=true;
				}
			}	
		}
		TimeTriple myTimeTriple = new TimeTriple;
		myTimeTriple=setTime();
		clock myClock = new Clock;
		myClock.setTime(myTimeTriple.m_hr,myTimeTriple.m_min,myTimeTriple.m_sec);
		myClock.is24Hour(!is12hr);
		if(is12hr)
		{
			myClock.isAM(isAM);
		}
		else
		{
			if(myClock.m_hour<=12)
			{
				myClock.isAM(true);
			}
			else
			{
				myClock.isAM(false);
			}
		}
		quit= false
		while(!quit)//Now that the clock is set, the menu handles the rest of the interaction
		{
			printMenu();
			choice=myScanner.nextInt();
			if(choice==1)
			{
				myTimeTriple=setTime();
				myClock.setTime(myTimeTriple.m_hr,myTimeTriple.m_min,myTimeTriple.m_sec);
				myClock.is24Hour(!is12hr);
				if(is12hr)
				{
					myClock.isAM(isAM);
				}
				else
				{
					if(myClock.m_hour<=12)
					{
						myClock.isAM(true);
					}
					else
					{
						myClock.isAM(false);
					}
				}
			}
			else if(choice==2)
			{
				pln("For how many hours would you like to run the clock?");
				int hrRun = myScanner.nextInt();
				pln("For how many minutes would you like to run the clock?");
				int minRun = myScanner.nextInt();
				pln("For how many seconds would you like to run the clock?");
				int secRun = myScanner.nextInt();
				int initHr = myClock.m_hour;
				int initMin = myClock.m_minute;
				int initSec = myClock.m_second;
				quit=false;
				while(!quit)
				{
					myClock.calculateTime();
					myClock.displayClock();
					if(initHr+hrRun>=myClock.m_hour)
					{
						if(initMin+minRun>=myClock.m_minute)
						{
							if(initSec+secRun>=myClock.m_second)
							{
								quit=true;
							}
						}
					}
				}
			}
			else if(choice==3)
			{
				while(true)
				{
					myClock.calculateTime();
					myClock.displayClock();
				}
			}
			else if(choice==4)
			{
				if(myClock.m_timeUpperBound==24)
				{
					myClock.m_timeUpperBound=12;
				}
				else
				{
					myClock.m_timeUpperBound=24;
				}
			}
			else if(choice==5)
			{
				quit=true;
			}
			else
			{
				pln("Sorry, we did not understand you input, please input a 1,2,3,4 or 5");
			}
		}
	}
	public static TimeTriple setTime()//sets the time and returns a triple used to set the clock
	{
		boolean exit = false;
		int sec=0;
		int min=0;
		int hr=0;
		int choice;
		while(!exit)
		{
			pln("At what second would you like to set the clock?");
			choice = myScanner.nextInt();//TODO fix so it takes and converts string input
			if(choice>=0&&choice<=59)
			{
				sec = choice;
				exit = true;
			}
			else
			{
				pln("Please input a number betwn 0 and 59");
			}
		}
		exit=false;
		while(!exit)
		{
			pln("At what minute would you like to set the clock?");
			choice = myScanner.nextInt();//TODO fix so takes and converts string input
			if(choice>=0&&choice<=59)
			{
				min=choice;
				exit=true;
			}
			else
			{
				pln("Please input a number between 0 and 59");
			}
		}
		exit=false;
		while(!exit)
		{
			pln("At what hr would you like to set the clock?");
			choice = myScanner.nextInt();//TODO fix so takes and converts string input
			if(choice>=0&&choice<=23)
			{
				hr=choice;
				exit=true;
			}
			else
			{
				pln("Please input a between 0 and 23");
			}
		}
		TimeTriple myTimeTriple = new TimeTriple(hr,min,sec);
		return myTimeTriple;
		
		
	}
	public static void printMenu()//prints menu to save time
	{
		pln("\n\n1)reset clock\n2)run clock for specified amount of time\n3)run clock indefinately\n4)Switch between 12 and 24 hr\n5)Quit");
	}
	public static void pln(String s)//time-saving method
	{
		System.out.println(s);
	}
}
