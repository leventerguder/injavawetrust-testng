package chapter10.programmatically;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Test05DependencyCode {

	public void dependencyTest() {
		List<XmlSuite> suites = new ArrayList<>();
		List<XmlClass> classes = new ArrayList<>();
		XmlSuite suite = new XmlSuite();
		suite.setName("Dependency suite");
		XmlTest test = new XmlTest(suite);
		test.setName("Dependency test");
		XmlClass clz = new XmlClass("chapter10.programmatically.Test05Dependency");
		classes.add(clz);
		test.setXmlClasses(classes);
		
		// Defining an xml dependency where "group-one" depends on "group-two"
		test.addXmlDependencyGroup("group-one", "group-two");
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
	}

	public static void main(String[] args) {
		Test05DependencyCode testConfig = new Test05DependencyCode();
		testConfig.dependencyTest();
	}
}
