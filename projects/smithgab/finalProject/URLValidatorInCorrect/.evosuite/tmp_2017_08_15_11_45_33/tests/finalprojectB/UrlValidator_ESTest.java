/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 15 18:49:03 GMT 2017
 */

package finalprojectB;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import finalprojectB.RegexValidator;
import finalprojectB.UrlValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UrlValidator_ESTest extends UrlValidator_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
  }

  @Test
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[4];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, (-1501L));
      // Undeclared exception!
      try { 
        urlValidator0.countToken("", "q,KoAq$q~$RL");
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(4L);
      // Undeclared exception!
      try { 
        urlValidator0.countToken(")(aM", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("finalprojectB.UrlValidator", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(10L);
      boolean boolean0 = urlValidator0.isValidPath("");
      assertTrue(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("an");
      UrlValidator urlValidator0 = new UrlValidator(regexValidator0, 533L);
      // Undeclared exception!
      try { 
        urlValidator0.isValidAuthority("2M<QD50j(V*<Hvv X");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         assertThrownBy("java.util.regex.Matcher", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "net";
      stringArray0[2] = "/";
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, 4L);
      boolean boolean0 = urlValidator0.isValidScheme("net");
      assertTrue(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(533L);
      boolean boolean0 = urlValidator0.isValidScheme("an");
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      boolean boolean0 = urlValidator0.isValidScheme("an");
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(4L);
      boolean boolean0 = urlValidator0.isValidScheme(")(aM");
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      boolean boolean0 = urlValidator0.isValidScheme((String) null);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, 4L);
      boolean boolean0 = urlValidator0.isValidQuery((String) null);
      assertTrue(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(533L);
      boolean boolean0 = urlValidator0.isValidQuery(">^RQ]27{a+R&<PpjKI");
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, 4L);
      boolean boolean0 = urlValidator0.isValidPath("");
      assertTrue(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, 2206L);
      boolean boolean0 = urlValidator0.isValidPath("i4'cV]j>GlmiF");
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[4];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, (-1501L));
      boolean boolean0 = urlValidator0.isValidAuthority((String) null);
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(10L);
      boolean boolean0 = urlValidator0.isValid("");
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(614L);
      boolean boolean0 = urlValidator0.isValid((String) null);
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[2];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      // Undeclared exception!
      try { 
        urlValidator0.isValid("https");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         assertThrownBy("java.util.regex.Matcher", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[9];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, 0L);
      // Undeclared exception!
      try { 
        urlValidator0.isValidScheme("net");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      String[] stringArray0 = new String[1];
      boolean boolean0 = urlValidator0.isValidFragment(stringArray0[0]);
      assertTrue(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("an", true);
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, regexValidator0, 0L);
      assertEquals(2L, UrlValidator.ALLOW_2_SLASHES);
  }

  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[3];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      int int0 = urlValidator0.countToken("q", "q");
      assertEquals(1, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(533L);
      boolean boolean0 = urlValidator0.isValidFragment("e$wxd}p");
      assertFalse(boolean0);
  }
}