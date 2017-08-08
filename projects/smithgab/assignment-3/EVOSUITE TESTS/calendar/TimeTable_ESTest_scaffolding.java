/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 08 05:18:55 GMT 2017
 */

package calendar;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TimeTable_ESTest_scaffolding {

  @org.junit.Rule 
  public org.junit.rules.Timeout globalTimeout = new org.junit.rules.Timeout(4000); 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "calendar.TimeTable"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.8"); 
            java.lang.System.setProperty("java.home", "C:\\Program Files\\Java\\jdk1.8.0_131\\jre"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\gabes\\Documents\\School\\CS 362\\HW 3 resources\\working (evosuite POM)\\Calendar"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\gabes\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("awt.toolkit", "sun.awt.windows.WToolkit"); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("file.separator", "\\"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.Win32GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.awt.windows.WPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "C:\\Users\\gabes\\.m2\\repository\\org\\evosuite\\evosuite-master\\1.0.1\\evosuite-master-1.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\evosuite\\evosuite-standalone-runtime\\1.0.1\\evosuite-standalone-runtime-1.0.1-tests.jar;C:\\Users\\gabes\\.m2\\repository\\org\\evosuite\\evosuite-client\\1.0.1\\evosuite-client-1.0.1-tests.jar;C:\\Users\\gabes\\.m2\\repository\\org\\evosuite\\evosuite-runtime\\1.0.1\\evosuite-runtime-1.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\hsqldb\\hsqldb\\2.3.2\\hsqldb-2.3.2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\springframework\\spring-orm\\4.1.6.RELEASE\\spring-orm-4.1.6.RELEASE.jar;C:\\Users\\gabes\\.m2\\repository\\org\\springframework\\spring-beans\\4.1.6.RELEASE\\spring-beans-4.1.6.RELEASE.jar;C:\\Users\\gabes\\.m2\\repository\\org\\springframework\\spring-core\\4.1.6.RELEASE\\spring-core-4.1.6.RELEASE.jar;C:\\Users\\gabes\\.m2\\repository\\commons-logging\\commons-logging\\1.2\\commons-logging-1.2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\springframework\\spring-jdbc\\4.1.6.RELEASE\\spring-jdbc-4.1.6.RELEASE.jar;C:\\Users\\gabes\\.m2\\repository\\org\\springframework\\spring-tx\\4.1.6.RELEASE\\spring-tx-4.1.6.RELEASE.jar;C:\\Users\\gabes\\.m2\\repository\\org\\springframework\\spring-context\\4.1.6.RELEASE\\spring-context-4.1.6.RELEASE.jar;C:\\Users\\gabes\\.m2\\repository\\org\\springframework\\spring-aop\\4.1.6.RELEASE\\spring-aop-4.1.6.RELEASE.jar;C:\\Users\\gabes\\.m2\\repository\\aopalliance\\aopalliance\\1.0\\aopalliance-1.0.jar;C:\\Users\\gabes\\.m2\\repository\\org\\springframework\\spring-expression\\4.1.6.RELEASE\\spring-expression-4.1.6.RELEASE.jar;C:\\Users\\gabes\\.m2\\repository\\junit\\junit\\4.12\\junit-4.12.jar;C:\\Users\\gabes\\.m2\\repository\\org\\hamcrest\\hamcrest-core\\1.3\\hamcrest-core-1.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\mockito\\mockito-all\\2.0.2-beta\\mockito-all-2.0.2-beta.jar;C:\\Users\\gabes\\.m2\\repository\\org\\slf4j\\slf4j-api\\1.7.12\\slf4j-api-1.7.12.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-all\\5.0.4\\asm-all-5.0.4.jar;C:\\Users\\gabes\\.m2\\repository\\javax\\xml\\bind\\jaxb-api\\2.2.12\\jaxb-api-2.2.12.jar;C:\\Users\\gabes\\.m2\\repository\\net\\sf\\opencsv\\opencsv\\2.3\\opencsv-2.3.jar;C:\\Users\\gabes\\.m2\\repository\\dk\\brics\\automaton\\automaton\\1.11-8\\automaton-1.11-8.jar;C:\\Users\\gabes\\.m2\\repository\\ch\\qos\\logback\\logback-classic\\1.1.3\\logback-classic-1.1.3.jar;C:\\Users\\gabes\\.m2\\repository\\ch\\qos\\logback\\logback-core\\1.1.3\\logback-core-1.1.3.jar;C:\\Users\\gabes\\.m2\\repository\\com\\googlecode\\gentyref\\gentyref\\1.2.0\\gentyref-1.2.0.jar;C:\\Users\\gabes\\.m2\\repository\\net\\sf\\jgrapht\\jgrapht\\0.8.3\\jgrapht-0.8.3.jar;C:\\Users\\gabes\\.m2\\repository\\com\\panayotis\\JavaPlot\\0.4.0\\JavaPlot-0.4.0.jar;C:\\Users\\gabes\\.m2\\repository\\com\\thoughtworks\\xstream\\xstream\\1.4.8\\xstream-1.4.8.jar;C:\\Users\\gabes\\.m2\\repository\\xmlpull\\xmlpull\\1.1.3.1\\xmlpull-1.1.3.1.jar;C:\\Users\\gabes\\.m2\\repository\\xpp3\\xpp3_min\\1.1.4c\\xpp3_min-1.1.4c.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\commons\\commons-lang3\\3.3.2\\commons-lang3-3.3.2.jar;C:\\Users\\gabes\\.m2\\repository\\commons-io\\commons-io\\2.4\\commons-io-2.4.jar;C:\\Users\\gabes\\.m2\\repository\\commons-cli\\commons-cli\\1.3.1\\commons-cli-1.3.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\kohsuke\\graphviz-api\\1.1\\graphviz-api-1.1.jar;C:\\Users\\gabes\\.m2\\repository\\oro\\oro\\2.0.8\\oro-2.0.8.jar;C:\\Users\\gabes\\.m2\\repository\\org\\jboss\\spec\\javax\\servlet\\jboss-servlet-api_3.1_spec\\1.0.0.Final\\jboss-servlet-api_3.1_spec-1.0.0.Final.jar;C:\\Users\\gabes\\.m2\\repository\\javax\\inject\\javax.inject\\1\\javax.inject-1.jar;C:\\Users\\gabes\\.m2\\repository\\javax\\enterprise\\cdi-api\\1.2\\cdi-api-1.2.jar;C:\\Users\\gabes\\.m2\\repository\\javax\\el\\javax.el-api\\3.0.0\\javax.el-api-3.0.0.jar;C:\\Users\\gabes\\.m2\\repository\\javax\\interceptor\\javax.interceptor-api\\1.2\\javax.interceptor-api-1.2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\hibernate\\hibernate-entitymanager\\4.3.10.Final\\hibernate-entitymanager-4.3.10.Final.jar;C:\\Users\\gabes\\.m2\\repository\\org\\jboss\\logging\\jboss-logging\\3.1.3.GA\\jboss-logging-3.1.3.GA.jar;C:\\Users\\gabes\\.m2\\repository\\org\\jboss\\logging\\jboss-logging-annotations\\1.2.0.Beta1\\jboss-logging-annotations-1.2.0.Beta1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\hibernate\\hibernate-core\\4.3.10.Final\\hibernate-core-4.3.10.Final.jar;C:\\Users\\gabes\\.m2\\repository\\antlr\\antlr\\2.7.7\\antlr-2.7.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\jboss\\jandex\\1.1.0.Final\\jandex-1.1.0.Final.jar;C:\\Users\\gabes\\.m2\\repository\\dom4j\\dom4j\\1.6.1\\dom4j-1.6.1.jar;C:\\Users\\gabes\\.m2\\repository\\xml-apis\\xml-apis\\1.0.b2\\xml-apis-1.0.b2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\hibernate\\common\\hibernate-commons-annotations\\4.0.5.Final\\hibernate-commons-annotations-4.0.5.Final.jar;C:\\Users\\gabes\\.m2\\repository\\org\\hibernate\\javax\\persistence\\hibernate-jpa-2.1-api\\1.0.0.Final\\hibernate-jpa-2.1-api-1.0.0.Final.jar;C:\\Users\\gabes\\.m2\\repository\\org\\jboss\\spec\\javax\\transaction\\jboss-transaction-api_1.2_spec\\1.0.0.Final\\jboss-transaction-api_1.2_spec-1.0.0.Final.jar;C:\\Users\\gabes\\.m2\\repository\\org\\javassist\\javassist\\3.18.1-GA\\javassist-3.18.1-GA.jar;C:\\Users\\gabes\\Documents\\School\\CS 362\\HW 3 resources\\working (evosuite POM)\\Calendar\\target\\classes;C:\\Users\\gabes\\.m2\\repository\\net\\sourceforge\\cobertura\\cobertura\\2.1.1\\cobertura-2.1.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm\\5.0.1\\asm-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-tree\\5.0.1\\asm-tree-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-commons\\5.0.1\\asm-commons-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-util\\5.0.1\\asm-util-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-analysis\\5.0.1\\asm-analysis-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\oro\\oro\\2.0.8\\oro-2.0.8.jar;C:\\Users\\gabes\\.m2\\repository\\jaxen\\jaxen\\1.1.4\\jaxen-1.1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\ant\\ant\\1.8.3\\ant-1.8.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\ant\\ant-launcher\\1.8.3\\ant-launcher-1.8.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\ant\\ant-junit\\1.8.3\\ant-junit-1.8.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\mortbay\\jetty\\servlet-api-2.5\\6.1.14\\servlet-api-2.5-6.1.14.jar;C:\\Users\\gabes\\.m2\\repository\\org\\mortbay\\jetty\\jetty\\6.1.14\\jetty-6.1.14.jar;C:\\Users\\gabes\\.m2\\repository\\org\\mortbay\\jetty\\jetty-util\\6.1.14\\jetty-util-6.1.14.jar;C:\\Users\\gabes\\.m2\\repository\\org\\slf4j\\slf4j-api\\1.7.5\\slf4j-api-1.7.5.jar;C:\\Users\\gabes\\.m2\\repository\\ch\\qos\\logback\\logback-classic\\1.0.13\\logback-classic-1.0.13.jar;C:\\Users\\gabes\\.m2\\repository\\ch\\qos\\logback\\logback-core\\1.0.13\\logback-core-1.0.13.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\commons\\commons-lang3\\3.3.2\\commons-lang3-3.3.2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\mojo\\findbugs-maven-plugin\\3.0.4\\findbugs-maven-plugin-3.0.4.jar;C:\\Users\\gabes\\.m2\\repository\\com\\google\\code\\findbugs\\findbugs\\3.0.1\\findbugs-3.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\net\\jcip\\jcip-annotations\\1.0\\jcip-annotations-1.0.jar;C:\\Users\\gabes\\.m2\\repository\\com\\google\\code\\findbugs\\jsr305\\2.0.1\\jsr305-2.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\com\\google\\code\\findbugs\\bcel-findbugs\\6.0\\bcel-findbugs-6.0.jar;C:\\Users\\gabes\\.m2\\repository\\com\\google\\code\\findbugs\\jFormatString\\2.0.1\\jFormatString-2.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\dom4j\\dom4j\\1.6.1\\dom4j-1.6.1.jar;C:\\Users\\gabes\\.m2\\repository\\xml-apis\\xml-apis\\1.0.b2\\xml-apis-1.0.b2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-debug-all\\5.0.2\\asm-debug-all-5.0.2.jar;C:\\Users\\gabes\\.m2\\repository\\commons-lang\\commons-lang\\2.6\\commons-lang-2.6.jar;C:\\Users\\gabes\\.m2\\repository\\com\\apple\\AppleJavaExtensions\\1.4\\AppleJavaExtensions-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy\\2.4.7\\groovy-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy-ant\\2.4.7\\groovy-ant-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\ant\\ant-antlr\\1.9.4\\ant-antlr-1.9.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy-groovydoc\\2.4.7\\groovy-groovydoc-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy-templates\\2.4.7\\groovy-templates-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy-xml\\2.4.7\\groovy-xml-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\reporting\\maven-reporting-impl\\2.1\\maven-reporting-impl-2.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-project\\2.0.10\\maven-project-2.0.10.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-settings\\2.0.10\\maven-settings-2.0.10.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-profile\\2.0.10\\maven-profile-2.0.10.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-plugin-registry\\2.0.10\\maven-plugin-registry-2.0.10.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-interpolation\\1.1\\plexus-interpolation-1.1.jar;C:\\Users\\gabes\\.m2\\repository\\commons-validator\\commons-validator\\1.2.0\\commons-validator-1.2.0.jar;C:\\Users\\gabes\\.m2\\repository\\commons-beanutils\\commons-beanutils\\1.7.0\\commons-beanutils-1.7.0.jar;C:\\Users\\gabes\\.m2\\repository\\commons-digester\\commons-digester\\1.6\\commons-digester-1.6.jar;C:\\Users\\gabes\\.m2\\repository\\commons-logging\\commons-logging\\1.0.4\\commons-logging-1.0.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\reporting\\maven-reporting-api\\3.0\\maven-reporting-api-3.0.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-plugin-api\\2.0\\maven-plugin-api-2.0.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-plugin-descriptor\\2.2.1\\maven-plugin-descriptor-2.2.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-artifact\\2.2.1\\maven-artifact-2.2.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-core\\1.4\\doxia-core-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-logging-api\\1.4\\doxia-logging-api-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-component-annotations\\1.5.5\\plexus-component-annotations-1.5.5.jar;C:\\Users\\gabes\\.m2\\repository\\xerces\\xercesImpl\\2.9.1\\xercesImpl-2.9.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\httpcomponents\\httpclient\\4.0.2\\httpclient-4.0.2.jar;C:\\Users\\gabes\\.m2\\repository\\commons-codec\\commons-codec\\1.3\\commons-codec-1.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\httpcomponents\\httpcore\\4.0.1\\httpcore-4.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-sink-api\\1.4\\doxia-sink-api-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-decoration-model\\1.4\\doxia-decoration-model-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-site-renderer\\1.4\\doxia-site-renderer-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-module-xhtml\\1.4\\doxia-module-xhtml-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-module-fml\\1.4\\doxia-module-fml-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-i18n\\1.0-beta-7\\plexus-i18n-1.0-beta-7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-velocity\\1.1.7\\plexus-velocity-1.1.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\velocity\\velocity\\1.5\\velocity-1.5.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\velocity\\velocity-tools\\2.0\\velocity-tools-2.0.jar;C:\\Users\\gabes\\.m2\\repository\\commons-chain\\commons-chain\\1.1\\commons-chain-1.1.jar;C:\\Users\\gabes\\.m2\\repository\\sslext\\sslext\\1.2-0\\sslext-1.2-0.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\struts\\struts-core\\1.3.8\\struts-core-1.3.8.jar;C:\\Users\\gabes\\.m2\\repository\\antlr\\antlr\\2.7.2\\antlr-2.7.2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\struts\\struts-taglib\\1.3.8\\struts-taglib-1.3.8.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\struts\\struts-tiles\\1.3.8\\struts-tiles-1.3.8.jar;C:\\Users\\gabes\\.m2\\repository\\commons-collections\\commons-collections\\3.2.1\\commons-collections-3.2.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\shared\\maven-doxia-tools\\1.2.1\\maven-doxia-tools-1.2.1.jar;C:\\Users\\gabes\\.m2\\repository\\commons-io\\commons-io\\1.4\\commons-io-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-artifact-manager\\2.0.6\\maven-artifact-manager-2.0.6.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-repository-metadata\\2.0.6\\maven-repository-metadata-2.0.6.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\wagon\\wagon-provider-api\\1.0-beta-2\\wagon-provider-api-1.0-beta-2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-model\\2.0.6\\maven-model-2.0.6.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-container-default\\1.0-alpha-9\\plexus-container-default-1.0-alpha-9.jar;C:\\Users\\gabes\\.m2\\repository\\classworlds\\classworlds\\1.1-alpha-2\\classworlds-1.1-alpha-2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-resources\\1.0-alpha-7\\plexus-resources-1.0-alpha-7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-utils\\1.5.6\\plexus-utils-1.5.6.jar;C:\\Users\\gabes\\.m2\\repository\\org\\sonatype\\plexus\\plexus-build-api\\0.0.7\\plexus-build-api-0.0.7.jar;C:\\Users\\gabes\\Documents\\School\\CS 362\\HW 3 resources\\working (evosuite POM)\\Calendar\\target\\classes;C:\\Users\\gabes\\.m2\\repository\\net\\sourceforge\\cobertura\\cobertura\\2.1.1\\cobertura-2.1.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm\\5.0.1\\asm-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-tree\\5.0.1\\asm-tree-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-commons\\5.0.1\\asm-commons-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-util\\5.0.1\\asm-util-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-analysis\\5.0.1\\asm-analysis-5.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\oro\\oro\\2.0.8\\oro-2.0.8.jar;C:\\Users\\gabes\\.m2\\repository\\jaxen\\jaxen\\1.1.4\\jaxen-1.1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\ant\\ant\\1.8.3\\ant-1.8.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\ant\\ant-launcher\\1.8.3\\ant-launcher-1.8.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\ant\\ant-junit\\1.8.3\\ant-junit-1.8.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\mortbay\\jetty\\servlet-api-2.5\\6.1.14\\servlet-api-2.5-6.1.14.jar;C:\\Users\\gabes\\.m2\\repository\\org\\mortbay\\jetty\\jetty\\6.1.14\\jetty-6.1.14.jar;C:\\Users\\gabes\\.m2\\repository\\org\\mortbay\\jetty\\jetty-util\\6.1.14\\jetty-util-6.1.14.jar;C:\\Users\\gabes\\.m2\\repository\\org\\slf4j\\slf4j-api\\1.7.5\\slf4j-api-1.7.5.jar;C:\\Users\\gabes\\.m2\\repository\\ch\\qos\\logback\\logback-classic\\1.0.13\\logback-classic-1.0.13.jar;C:\\Users\\gabes\\.m2\\repository\\ch\\qos\\logback\\logback-core\\1.0.13\\logback-core-1.0.13.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\commons\\commons-lang3\\3.3.2\\commons-lang3-3.3.2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\mojo\\findbugs-maven-plugin\\3.0.4\\findbugs-maven-plugin-3.0.4.jar;C:\\Users\\gabes\\.m2\\repository\\com\\google\\code\\findbugs\\findbugs\\3.0.1\\findbugs-3.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\net\\jcip\\jcip-annotations\\1.0\\jcip-annotations-1.0.jar;C:\\Users\\gabes\\.m2\\repository\\com\\google\\code\\findbugs\\jsr305\\2.0.1\\jsr305-2.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\com\\google\\code\\findbugs\\bcel-findbugs\\6.0\\bcel-findbugs-6.0.jar;C:\\Users\\gabes\\.m2\\repository\\com\\google\\code\\findbugs\\jFormatString\\2.0.1\\jFormatString-2.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\dom4j\\dom4j\\1.6.1\\dom4j-1.6.1.jar;C:\\Users\\gabes\\.m2\\repository\\xml-apis\\xml-apis\\1.0.b2\\xml-apis-1.0.b2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\ow2\\asm\\asm-debug-all\\5.0.2\\asm-debug-all-5.0.2.jar;C:\\Users\\gabes\\.m2\\repository\\commons-lang\\commons-lang\\2.6\\commons-lang-2.6.jar;C:\\Users\\gabes\\.m2\\repository\\com\\apple\\AppleJavaExtensions\\1.4\\AppleJavaExtensions-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy\\2.4.7\\groovy-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy-ant\\2.4.7\\groovy-ant-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\ant\\ant-antlr\\1.9.4\\ant-antlr-1.9.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy-groovydoc\\2.4.7\\groovy-groovydoc-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy-templates\\2.4.7\\groovy-templates-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\groovy\\groovy-xml\\2.4.7\\groovy-xml-2.4.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\reporting\\maven-reporting-impl\\2.1\\maven-reporting-impl-2.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-project\\2.0.10\\maven-project-2.0.10.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-settings\\2.0.10\\maven-settings-2.0.10.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-profile\\2.0.10\\maven-profile-2.0.10.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-plugin-registry\\2.0.10\\maven-plugin-registry-2.0.10.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-interpolation\\1.1\\plexus-interpolation-1.1.jar;C:\\Users\\gabes\\.m2\\repository\\commons-validator\\commons-validator\\1.2.0\\commons-validator-1.2.0.jar;C:\\Users\\gabes\\.m2\\repository\\commons-beanutils\\commons-beanutils\\1.7.0\\commons-beanutils-1.7.0.jar;C:\\Users\\gabes\\.m2\\repository\\commons-digester\\commons-digester\\1.6\\commons-digester-1.6.jar;C:\\Users\\gabes\\.m2\\repository\\commons-logging\\commons-logging\\1.0.4\\commons-logging-1.0.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\reporting\\maven-reporting-api\\3.0\\maven-reporting-api-3.0.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-plugin-api\\2.0\\maven-plugin-api-2.0.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-plugin-descriptor\\2.2.1\\maven-plugin-descriptor-2.2.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-artifact\\2.2.1\\maven-artifact-2.2.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-core\\1.4\\doxia-core-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-logging-api\\1.4\\doxia-logging-api-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-component-annotations\\1.5.5\\plexus-component-annotations-1.5.5.jar;C:\\Users\\gabes\\.m2\\repository\\xerces\\xercesImpl\\2.9.1\\xercesImpl-2.9.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\httpcomponents\\httpclient\\4.0.2\\httpclient-4.0.2.jar;C:\\Users\\gabes\\.m2\\repository\\commons-codec\\commons-codec\\1.3\\commons-codec-1.3.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\httpcomponents\\httpcore\\4.0.1\\httpcore-4.0.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-sink-api\\1.4\\doxia-sink-api-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-decoration-model\\1.4\\doxia-decoration-model-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-site-renderer\\1.4\\doxia-site-renderer-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-module-xhtml\\1.4\\doxia-module-xhtml-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\doxia\\doxia-module-fml\\1.4\\doxia-module-fml-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-i18n\\1.0-beta-7\\plexus-i18n-1.0-beta-7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-velocity\\1.1.7\\plexus-velocity-1.1.7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\velocity\\velocity\\1.5\\velocity-1.5.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\velocity\\velocity-tools\\2.0\\velocity-tools-2.0.jar;C:\\Users\\gabes\\.m2\\repository\\commons-chain\\commons-chain\\1.1\\commons-chain-1.1.jar;C:\\Users\\gabes\\.m2\\repository\\sslext\\sslext\\1.2-0\\sslext-1.2-0.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\struts\\struts-core\\1.3.8\\struts-core-1.3.8.jar;C:\\Users\\gabes\\.m2\\repository\\antlr\\antlr\\2.7.2\\antlr-2.7.2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\struts\\struts-taglib\\1.3.8\\struts-taglib-1.3.8.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\struts\\struts-tiles\\1.3.8\\struts-tiles-1.3.8.jar;C:\\Users\\gabes\\.m2\\repository\\commons-collections\\commons-collections\\3.2.1\\commons-collections-3.2.1.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\shared\\maven-doxia-tools\\1.2.1\\maven-doxia-tools-1.2.1.jar;C:\\Users\\gabes\\.m2\\repository\\commons-io\\commons-io\\1.4\\commons-io-1.4.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-artifact-manager\\2.0.6\\maven-artifact-manager-2.0.6.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-repository-metadata\\2.0.6\\maven-repository-metadata-2.0.6.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\wagon\\wagon-provider-api\\1.0-beta-2\\wagon-provider-api-1.0-beta-2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\apache\\maven\\maven-model\\2.0.6\\maven-model-2.0.6.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-container-default\\1.0-alpha-9\\plexus-container-default-1.0-alpha-9.jar;C:\\Users\\gabes\\.m2\\repository\\classworlds\\classworlds\\1.1-alpha-2\\classworlds-1.1-alpha-2.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-resources\\1.0-alpha-7\\plexus-resources-1.0-alpha-7.jar;C:\\Users\\gabes\\.m2\\repository\\org\\codehaus\\plexus\\plexus-utils\\1.5.6\\plexus-utils-1.5.6.jar;C:\\Users\\gabes\\.m2\\repository\\org\\sonatype\\plexus\\plexus-build-api\\0.0.7\\plexus-build-api-0.0.7.jar"); 
    java.lang.System.setProperty("java.class.version", "52.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "C:\\Program Files\\Java\\jdk1.8.0_131\\jre\\lib\\endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "C:\\Program Files\\Java\\jdk1.8.0_131\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.8.0_131-b11"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.8.0_131"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.8"); 
    java.lang.System.setProperty("java.vm.version", "25.131-b11"); 
    java.lang.System.setProperty("line.separator", "\r\n"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.name", "Windows 10"); 
    java.lang.System.setProperty("os.version", "10.0"); 
    java.lang.System.setProperty("path.separator", ";"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\gabes"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "gabes"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
      }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TimeTable_ESTest_scaffolding.class.getClassLoader() ,
      "calendar.TimeTable",
      "calendar.CalendarUtil",
      "calendar.Appt",
      "calendar.CalDay",
      "calendar.DateOutOfRangeException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TimeTable_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "calendar.Appt",
      "calendar.CalendarUtil",
      "calendar.DateOutOfRangeException"
    );
  }
}
