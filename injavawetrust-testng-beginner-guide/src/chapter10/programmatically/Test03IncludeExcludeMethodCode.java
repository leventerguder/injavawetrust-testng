package chapter10.programmatically;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Test03IncludeExcludeMethodCode {

	public void includeExcludeTest() {
		List<XmlSuite> suites = new ArrayList<>();
		List<XmlClass> classes = new ArrayList<>();
		XmlSuite suite = new XmlSuite();
		suite.setName("Include Exclude Method suite");
		XmlTest test = new XmlTest(suite);
		test.setName("Include Exclude Method test");
		// Test class to be included for test execution
		XmlClass clz = new XmlClass("chapter10.programmatically.Test03IncludeExcludeMethod");
		// Test methods to be included
		XmlInclude methodOne = new XmlInclude("testMethodOne");
		XmlInclude methodTwo = new XmlInclude("testMethodTwo");
		// Creating a list of included methods and adding the methods instances to it
		List<XmlInclude> includes = new ArrayList<>();
		includes.add(methodOne);
		includes.add(methodTwo);
		// Setting the included methods for the class
		clz.setIncludedMethods(includes);
		classes.add(clz);
		test.setXmlClasses(classes);
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
	}

	public static void main(String[] args) {
		Test03IncludeExcludeMethodCode testConfig = new Test03IncludeExcludeMethodCode();
		testConfig.includeExcludeTest();
	}
}
