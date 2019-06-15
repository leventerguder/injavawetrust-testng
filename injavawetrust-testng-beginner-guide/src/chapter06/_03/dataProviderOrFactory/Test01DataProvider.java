package chapter06._03.dataProviderOrFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test01DataProvider {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class executed");
	}

	@Test(dataProvider = "dataMethod")
	public void testMethod(String param) {
		System.out.println("The parameter value is: " + param);
	}

	@DataProvider
	public Object[][] dataMethod() {
		return new Object[][] { { "one" }, { "two" } };
	}

	/*
	 * DataProvider: A test method that uses DataProvider will be executed a
	 * multiple number of times based on the data provided by the DataProvider. The
	 * test method will be executed using the same instance of the test class to
	 * which the test method belongs.
	 */

	/*
	 * Factory: A factory will execute all the test methods present inside a test
	 * class using a separate instance of the respective class.
	 */

	/*
	 * This example shows a test class that contains a test method, which uses a
	 * DataProvider annotation to provide data for its arguments. As you can see
	 * from the preceding test results the class beforeClass is executed only one
	 * time irrespective of how many times the test method is executed.
	 */
}
