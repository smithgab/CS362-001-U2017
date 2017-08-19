package calendar;


import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;


import static org.junit.Assert.*;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	
	
	    public static int RandomNum(Random random){
        
    	int n = random.nextInt(50) + -5;// get a random number between 50 and -5
        return n ; // return random number generated
        }
   /**
	
    /**
     * Returns a random integer specific to this test. Will return number between 200 and -100.
     */	
    public static int RandomNumYear(Random random){
    
    	int n = random.nextInt(3000) + 999;// get a random number between 2050 and 999
    	
    	int r = n % 20; //seed remainder to determine randomly whether to choose from pool
    	
    	if(r<15) { //set at 15 to ensure approximately 75% of tests come from legitimate years
    		
    		int d = random.nextInt(9) + 0; //picks a random point in the array of valid year input variables
    		int[] tempArray=new int [10];
    		tempArray[0] = 2008;
    		tempArray[1] = 2009;
    		tempArray[2] = 2010;
    		tempArray[3] = 2011;
    		tempArray[4] = 2012;
    		tempArray[5] = 2013;
    		tempArray[6] = 2014;
    		tempArray[7] = 2015;
    		tempArray[8] = 2016;
    		tempArray[9] = 2017;
    		
    		n = tempArray[d]; 
    	}
    	
        return n ; // return random number generated
        }
	
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
		@Test
	 	public void randomTest0()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 
		 System.out.println("Start testing...");
		 
		 try{ 
				for (int iteration = 0; elapsed < TestTimeout; iteration++) {
					long randomseed =System.currentTimeMillis(); //10
					Random random = new Random(randomseed);
		 
			 TimeTable t=new TimeTable();
	
	
				LinkedList<Appt> listAppts = new LinkedList<Appt>();

		    	//current month/year/date is today
				//get todays date
		    	Calendar rightnow = Calendar.getInstance();
		    	//current month/year/date is today
		    

		    	int thisMonth = rightnow.get(Calendar.MONTH)+1;
				int thisYear = rightnow.get(Calendar.YEAR);
				int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
				GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
			 CalDay calday= new CalDay(today);
				
				 int startHour=RandomNum(random);
				 int startMinute=RandomNum(random);
				 int startDay=RandomNum(random);
				 int startMonth=RandomNum(random);
				 int startYear=RandomNumYear(random);
	        String title="Birthday Party";
	        String description="This is my birthday party.";
	        // Create a valid appointment!
	        Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
	        /** Collection of all of the appointments for the calendar day */	
	        LinkedList<Appt> appts = new LinkedList<Appt>();
	        appts.add(appt);
	
	        
	        for (int i = 0; i < NUM_TESTS; i++) {
	        
						// listAppts.add(appt);
				   	 calday.addAppt(appt);
				   		  startHour=RandomNum(random);
				   		  startMinute=RandomNum(random);
				   		  startDay=RandomNum(random);
				   		  startMonth=RandomNum(random);
				   		  startYear=RandomNumYear(random);
				   		  title=ValuesGenerator.getString(random);
				   		  description=ValuesGenerator.getString(random);
				   		 //Construct a new Appointment object with the initial data	 
				   		  appt = new Appt(startHour,
				   		          startMinute ,
				   		          startDay ,
				   		          startMonth ,
				   		          startYear ,
				   		          title,
				   		         description);
				   	 calday.addAppt(appt);
				   	 calday.toString();
					 
	   	 
	        }
	        
					elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
		        if((iteration%10000)==0 && iteration!=0 )
		              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		        
				}
				}catch(NullPointerException e){
					
				}

			System.out.println("Done testing...");	 
		 } 

	 @Test
	  public void randomtest1()  throws Throwable  {
		 
		long startTime = Calendar.getInstance().getTimeInMillis();
	 	long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

	 	

	 	for(int i = 0; elapsed < TestTimeout; i++)		//repeat tests until time runs out
	 	{
	 		Random random = new Random();

			GregorianCalendar calendarTest = new GregorianCalendar();
			CalDay day = new CalDay(calendarTest);

	 		
	 		Appt appt = new Appt(1, 2, 3, 4, 5, "TESTADD", "TESTADD");
	 		Appt appt0 = new Appt(5, 23, 5, 5, 5, "ControlTEST", "CONTROLTest"); //control add appointment to ensure a legitimate appointment each week

	 		for(int j = 0; j < NUM_TESTS; j++) //repeat tests 100 times and then reseed random
	 		{
				
				//had a hard time with this class keeping randomization local for simplicity
	 			appt.setStartMinute(random.nextInt(100)-10); //set appointment values with those inside and outside 
	 			appt.setStartHour(random.nextInt(100)-5); 
	 			appt.setStartDay(random.nextInt(100)-10);
	 			appt.setStartMonth(random.nextInt(100)-5);

	 			day.addAppt(appt);		//adding appointments to the day
	 			day.addAppt(appt0);
	 		}

	 		 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((i%10000)==0 && i!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
	 	}

		 
	 }

	
}
