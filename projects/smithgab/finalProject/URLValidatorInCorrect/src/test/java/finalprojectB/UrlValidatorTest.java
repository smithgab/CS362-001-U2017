/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;
import java.io.Serializable;
import java.util.regex.Pattern;

import finalprojectB.RegexValidator;
import finalprojectB.UrlValidator;

import java.util.regex.Matcher;




/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   
	   
   }
   
   
   public void testValidator248() {
      RegexValidator regex = new RegexValidator(new String[] {"localhost", ".*\\.my-testing"});
       UrlValidator validator = new UrlValidator(regex, 0); 

       assertTrue("classtest URL should validate",
               validator.isValid("http://classtest/test/index.html"));
       

       // Reseeding validator with new options
       validator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);
       

       assertTrue("machinename URL should validate",
             validator.isValid("http://machinename/test/index.html"));
       
   }
   
   
   
   public void testManualTest1()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid("htp://www.amazn.co"));
	   
   }
   
   
   public void testManualTest2()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid(null));
	   
   }
   
   
   
   public void testManualTest3()
   {
	      RegexValidator regex = new RegexValidator(new String[] {"localhost", ".*\\.my-testing"});
	       UrlValidator urlVal = new UrlValidator(regex, 0); 
	     System.out.println(urlVal.isValid(""));
	   
   }
   

   
   public void testYourFirstPartition()
   {
	   
   }
   
   public void testYourSecondPartition(){
	   
   }
   
   
   public void testIsValid()
   {
	   for(int i = 0;i<10000;i++)
	   {
		   
	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
	   
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   Object[] testUrlParts = {new ResultPair("ftp://", true), new ResultPair("go.com", true), new ResultPair(":65535", true), new ResultPair("/$23", true), new ResultPair("", true)};
   Object[] testUrlParts1 = {new ResultPair("ftp://", true), new ResultPair("go.com", true), new ResultPair(":65535", true), new ResultPair("", false), new ResultPair("?action=edit&mode=up", true)};
   int[] testPartsIndex = {0, 0, 0, 0, 0};
}
