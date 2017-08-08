package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
	    	//current month/year/date is today
			//get todays date
	    	Calendar rightnow = Calendar.getInstance();
	    	//current month/year/date is today

	    	int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
			GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		 CalDay calday= new CalDay(today);
			// assertions
		 assertTrue(calday.isValid());

		 
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
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
		 
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		// listAppts.add(appt);
	 calday.addAppt(appt);
		  startHour=13;
		  startMinute=30;
		  startDay=10;
		  startMonth=4;
		  startYear=2017;
		  title="Birthday Party";
		  description="This is my birthday party.";
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
	 
	 @Test
	  public void test03()  throws Throwable  {
		 
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
		 
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		listAppts.add(appt);
	 calday.addAppt(appt);
		  startHour=13;
		  startMinute=30;
		  startDay=10;
		  startMonth=4;
		  startYear=2017;
		  title="Birthday Party";
		  description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		  appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	 calday.addAppt(appt);
	 calday.iterator();

	 }
	 
	 
	 @Test
	  public void test04()  throws Throwable  {
		 CalDay calday= new CalDay();
		 calday.iterator();
	 }
	 
	 
	 @Test
	  public void test05()  throws Throwable  {
		 
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
		 
		 calday.isValid();
		 
		 int startHour=20;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		listAppts.add(appt);
	 calday.addAppt(appt);
		  startHour=13;
		  startMinute=30;
		  startDay=10;
		  startMonth=4;
		  startYear=2017;
		  title="Birthday Party";
		  description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		  appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	 calday.addAppt(appt);
	 calday.iterator();
	 
	 }
	 
	 
	 @Test
	  public void test06()  throws Throwable  {
		 
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
		 
	
		 
		 int startHour=7;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		listAppts.add(appt);
	 calday.addAppt(appt);
		  startHour=8;
		  startMinute=30;
		  startDay=10;
		  startMonth=4;
		  startYear=2017;
		  title="Birthday Party";
		  description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		  appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	 calday.addAppt(appt);
	 calday.getSizeAppts();
	 
	 }
//add more unit tests as you needed	
}
