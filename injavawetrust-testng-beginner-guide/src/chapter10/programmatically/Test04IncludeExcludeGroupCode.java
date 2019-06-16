package chapter10.programmatically;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Test04IncludeExcludeGroupCode {

	public void includeExcludeTest() {
		List<XmlSuite> suites = new ArrayList<>();
		List<XmlClass> classes = new ArrayList<>();
		XmlSuite suite = new XmlSuite();
		suite.setName("Include Exclude Group suite");
		XmlTest test = new XmlTest(suite);
		test.setName("Include Exclude Group test");
		XmlClass clz = new XmlClass("chapter10.programmatically.Test04IncludeExcludeGroup");
		classes.add(clz);
		test.setXmlClasses(classes);
		// Including and excluding groups
		test.addIncludedGroup("group-one");
		test.addExcludedGroup("group-two");
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
	}

	public static void main(String[] args) {
		Test04IncludeExcludeGroupCode testConfig = new Test04IncludeExcludeGroupCode();
		testConfig.includeExcludeTest();
	}
}
