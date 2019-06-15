package chapter06._02.dataProviderAlongFactory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Test01DataProviderConstructor {

	private int param;

	/*
	 * The DataProvider feature can also be used with the @Factory annotation for
	 * creating tests at runtime. This can be done by declaring the @Factory
	 * annotation on a constructor of a class or on a regular method
	 * 
	 */

	/*
	 * The constructor of the test class is annotated with the @Factory annotation.
	 * This annotation uses a DataProvider method named dataMethod for providing
	 * values to the constructor of the test class.
	 */

	/*
	 * The constructor of this test class takes one argument as integer, which is
	 * assigned to a local variable param. This variable then is used in the two
	 * test methods present in the test class.
	 */
	@Factory(dataProvider = "dataMethod")
	public Test01DataProviderConstructor(int param) {
		this.param = param;
	}

	@DataProvider
	public static Object[][] dataMethod() {
		return new Object[][] { { 0 }, { 1 } };
	}

	@Test
	public void testMethodOne() {
		int opValue = param + 1;
		System.out.println("Test method one output: " + opValue);
	}

	@Test
	public void testMethodTwo() {
		int opValue = param + 2;
		System.out.println("Test method two output: " + opValue);
	}

	/*
	 * The @Factory annotation is applied to the constructor of the test class. This
	 * initializes the test class multiple times depending upon the number of values
	 * provided by the DataProvider method.
	 * 
	 */
}
