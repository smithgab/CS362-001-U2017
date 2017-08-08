package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 
		 
		 int startHour=-13;
		 int startMinute=-30;
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
		 appt.toString();
	// assertions
		 assertTrue(!appt.getValid());
		 assertEquals(-13, appt.getStartHour());
		 assertEquals(-30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=13;
		 int startMinute=-30;
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
	// assertions
		 assertTrue(!appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(-30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
	 // @Test
	  // public void test04()  throws Throwable  {
		 // int startHour= 15;
		 // int startMinute=30;
		 // int startDay=10;
		 // int startMonth=4;
		 // int startYear=2017;
		 // String title="Birthday Party";
		 // String description="This is my birthday party.";
		 // Construct a new Appointment object with the initial data	 
		 // Appt appt = new Appt(startHour,
		          // startMinute ,
		          // startDay ,
		          // startMonth ,
		          // startYear ,
		          // title,
		         // description);
		 
		 // appt.setStartHour(4);						//Set values after the initial setup
		 // appt.setStartMinute(25);
		 // appt.setStartDay(15);
		 // appt.setStartMonth(7);
		 // appt.setStartYear(2017);
		 // appt.setTitle("Title1");
		 // appt.setDescription("Description of the day");
	// assertions
		 // assertTrue(!appt.getValid());
		 // assertEquals(15, appt.getStartHour());
		 // assertEquals(30, appt.getStartMinute());
		 // assertEquals(10, appt.getStartDay());
		 // assertEquals(4, appt.getStartMonth());
		 // assertEquals(2017, appt.getStartYear());
		 // assertEquals("Title1", appt.getTitle());
		 // assertEquals("Description of the day", appt.getDescription());         		
	 // }	 
	 
	 // @Test
	  // public void test05()  throws Throwable  {
		 // int startHour= 12;
		 // int startMinute=30;
		 // int startDay=10;
		 // int startMonth=4;
		 // int startYear=2017;
		 // String title="Birthday Party";
		 // String description="This is my birthday party.";
		 // Construct a new Appointment object with the initial data	 
		 // Appt appt = new Appt(startHour,
		          // startMinute ,
		          // startDay ,
		          // startMonth ,
		          // startYear ,
		          // title,
		         // description);
		 // appt.getRecurBy();						//Hitting recurrence calls
		 // appt.getRecurNumber();
		 // appt.getRecurDays();
	// assertions
		 // assertTrue(!appt.getValid());
		 // assertEquals(12, appt.getStartHour());
		 // assertEquals(30, appt.getStartMinute());
		 // assertEquals(10, appt.getStartDay());
		 // assertEquals(04, appt.getStartMonth());
		 // assertEquals(2017, appt.getStartYear());
		 // assertEquals("Birthday Party", appt.getTitle());
		 // assertEquals("This is my birthday party.", appt.getDescription());         		
	 // }	 
	
	 // @Test
	  // public void test06()  throws Throwable  {
		 // int startHour= 12;
		 // int startMinute=30;
		 // int startDay=10;
		 // int startMonth=4;
		 // int startYear=2017;
		 // String title=null;					//Set to Null
		 // String description=null;			//Set to Null
		 // Construct a new Appointment object with the initial data	 
		 // Appt appt = new Appt(startHour,
		          // startMinute ,
		          // startDay ,
		          // startMonth ,
		          // startYear ,
		          // title,
		         // description);

	// assertions
		 // assertTrue(!appt.getValid());
		 // assertEquals(12, appt.getStartHour());
		 // assertEquals(30, appt.getStartMinute());
		 // assertEquals(10, appt.getStartDay());
		 // assertEquals(04, appt.getStartMonth());
		 // assertEquals(2017, appt.getStartYear());
		 // assertEquals("", appt.getTitle());
		 // assertEquals("", appt.getDescription());    
	 // }
	 
	 @Test
	  public void test07()  throws Throwable  {
		 int startHour= 25;							//Hit start hour outside
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title=null;					//Set to Null
		 String description=null;			//Set to Null
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

	// assertions
		 assertTrue(!appt.getValid());
		 assertEquals(25, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());    
	 }

	 @Test
	  public void test08()  throws Throwable  {
		 int startHour= 25;							//Hit start hour outside AND
		 int startMinute=-20;						//Hit start minute outside
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title=null;					//Set to Null
		 String description=null;			//Set to Null
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

	// assertions
		 assertTrue(!appt.getValid());
		 assertEquals(25, appt.getStartHour());
		 assertEquals(-20, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());    
	 }

	 // @Test
	  // public void test09()  throws Throwable  {
		 // int startHour= 14;							//Hit proper start hour
		 // int startMinute=20;						//Hit proper start minute
		 // int startDay=-4;							//Hit IMPROPER DAY
		 // int startMonth=4;
		 // int startYear=2017;
		 // String title=null;					//Set to Null
		 // String description=null;			//Set to Null
		 // Construct a new Appointment object with the initial data	 
		 // Appt appt = new Appt(startHour,
		          // startMinute ,
		          // startDay ,
		          // startMonth ,
		          // startYear ,
		          // title,
		         // description);

	// assertions
		 // assertTrue(!appt.getValid());
		 // assertEquals(14, appt.getStartHour());
		 // assertEquals(20, appt.getStartMinute());
		 // assertEquals(10, appt.getStartDay());
		 // assertEquals(04, appt.getStartMonth());
		 // assertEquals(2017, appt.getStartYear());
		 // assertEquals("", appt.getTitle());
		 // assertEquals("", appt.getDescription());    
	 // }
	 
	 
}
