/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 08 05:24:18 GMT 2017
 */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.DateOutOfRangeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DateOutOfRangeException_ESTest extends DateOutOfRangeException_ESTest_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      DateOutOfRangeException dateOutOfRangeException0 = new DateOutOfRangeException("u<FQ:7s%");
  }

  @Test
  public void test1()  throws Throwable  {
      DateOutOfRangeException dateOutOfRangeException0 = new DateOutOfRangeException();
  }
}
