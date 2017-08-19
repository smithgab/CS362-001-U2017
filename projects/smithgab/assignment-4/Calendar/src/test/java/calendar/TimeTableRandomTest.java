package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {
		 
		long startTime = Calendar.getInstance().getTimeInMillis(); //Initializing calendar time
	 	long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


	 	for(int i = 0; elapsed < TestTimeout; i++)
	 	{
	 
	 		TimeTable table = new TimeTable();		//create time table object
	 		Random random = new Random();		//random 
			
			GregorianCalendar calendarTest = new GregorianCalendar();
			CalDay day = new CalDay(calendarTest);

	 		Appt appt = new Appt(1, 2, 3, 4, 5, "TESTADD", "TESTADD"); //initialize Appt object

	 		
	 		for(int y = 0; y < NUM_TESTS; y++)
	 		{
	 			

	 			for(int z = 0; z < 3; z++)		//inner for loop
	 			{                                //had a hard time with this class keeping randomization local for simplicity
	 			appt.setStartMinute(random.nextInt(100)-10); //set appointment values with those inside and outside 
	 			appt.setStartHour(random.nextInt(100)-5); 
	 			appt.setStartDay(random.nextInt(100)-10);
	 			appt.setStartMonth(random.nextInt(100)-5);

	 				day.addAppt(appt);
	 			}
	 	
				//had a hard time with this class keeping randomization local for simplicity
	 			appt.setStartMinute(random.nextInt(100)-10); //set appointment values with those inside and outside 
	 			appt.setStartHour(random.nextInt(100)-5); 
	 			appt.setStartDay(random.nextInt(100)-10);
	 			appt.setStartMonth(random.nextInt(100)-5);

	 			table.deleteAppt(day.appts, appt);
				table.deleteAppt(null, null);
	 		}

	 		table.deleteAppt(null, null);

	 		 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((i%10000)==0 && i!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
	 	}
	 
		 
	 }
	 
/*
	 @Test
	  public void randomtest1()  throws Throwable  {
		 
		long startTime = Calendar.getInstance().getTimeInMillis();
	 	long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


	 	for(int i = 0; elapsed < TestTimeout; i++)
	 	{
			
	        LinkedList<Appt> appts = new LinkedList<Appt>();
	 
	 		TimeTable table = new TimeTable();
	 		Random random = new Random();
			
			GregorianCalendar calendarTest = new GregorianCalendar();
			CalDay day = new CalDay(calendarTest);

	 		Appt appt = new Appt(1, 2, 3, 4, 5, "TESTADD", "TESTADD");

	 		
	 		for(int j = 0; j < NUM_TESTS; j++)
	 		{
	 			

	 			for(int k = 0; k < 15; k++)
	 			{
				//had a hard time with this class keeping randomization local for simplicity
	 			appt.setStartMinute(random.nextInt(100)-10); //set appointment values with those inside and outside 
	 			appt.setStartHour(random.nextInt(100)-5); 
	 			appt.setStartDay(random.nextInt(100)-10);
	 			appt.setStartMonth(random.nextInt(100)-5);
				
				day.getApptRange(appts, day-3, day);
				
	 				day.addAppt(appt);
	 			}
	 	
				//had a hard time with this class keeping randomization local for simplicity
	 			appt.setStartMinute(random.nextInt(100)-10); //set appointment values with those inside and outside 
	 			appt.setStartHour(random.nextInt(100)-5); 
	 			appt.setStartDay(random.nextInt(100)-10);
	 			appt.setStartMonth(random.nextInt(100)-5);

	 			table.deleteAppt(day.appts, appt);
				table.deleteAppt(null, null);
	 		}

	 		appt.setStartMinute(1);
	 		appt.setStartHour(2);
	 		appt.setStartDay(3);
			appt.setStartMonth(4);
			



	 		Appt appt1 = new Appt(1, 2, 3, 4, 5, "TESTADD", "TESTADD");
	 		
	 		GregorianCalendar calendarTest1 = new GregorianCalendar();
			CalDay day1 = new CalDay(calendarTest1);

			day1.addAppt(appt);

			table.deleteAppt(day1.appts, appt1);
	 		table.deleteAppt(null, null);

	 		 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((i%10000)==0 && i!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
	 	}
	 
		 
	 }
*/		 
}

