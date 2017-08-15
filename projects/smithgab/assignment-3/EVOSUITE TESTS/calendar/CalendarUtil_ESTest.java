/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 08 05:24:04 GMT 2017
 */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import calendar.CalendarUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CalendarUtil_ESTest extends CalendarUtil_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[7];
      CalendarUtil.DaysInMonth = intArray0;
      int int0 = CalendarUtil.NumDaysInMonth(0, 0);
      assertEquals(0, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[3] = (-754);
      CalendarUtil.DaysInMonth = intArray0;
      int int0 = CalendarUtil.NumDaysInMonth(1182, 3);
      assertEquals((-754), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear((-600));
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        CalendarUtil.NumDaysInMonth(29, (-434));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -434
         //
         assertThrownBy("calendar.CalendarUtil", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      int int0 = CalendarUtil.NumDaysInMonth(0, 0);
      assertEquals(31, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      CalendarUtil calendarUtil0 = new CalendarUtil();
      assertEquals(1, CalendarUtil.FEBRUARY);
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = CalendarUtil.NumDaysInMonth(2384, 1);
      assertEquals(29, int0);
  }

  @Test
  public void test07()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear((-3893));
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear(2384);
      assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear(100);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = CalendarUtil.IsLeapYear(0);
      assertTrue(boolean0);
  }
}