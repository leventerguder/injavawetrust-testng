package chapter03._05.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test01SameClassDataProvider {

	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod() {
		return new Object[][] { { "data one" }, { "data two" } };
	}

	@Test(dataProvider = "data-provider")
	public void testMethod(String data) {
		System.out.println("Data is: " + data);
	}

	/*
	 * One of the important features provided by TestNG is the DataProvider feature.
	 * It helps the user to write data-driven tests, that means same test method can
	 * be run multiple times with different datasets. DataProvider is the second way
	 * of passing parameters to test methods. It helps in providing complex
	 * parameters to the test methods as it is not possible to do this from XML.
	 */

	/*
	 * To use the DataProvider feature in your tests you have to declare a method
	 * annotated by DataProvider and then use the said method in the test method
	 * using the dataProvider attribute in the Test annotation.
	 */
}
