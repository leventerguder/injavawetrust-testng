package chapter03._05.dataprovider;

import org.testng.annotations.Test;

public class Test02DifferentClassDataProvider {

	@Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
	public void testMethod(String data) {
		System.out.println("Data is: " + data);
	}

	/*
	 * TestNG by default looks for the DataProvider method in the same class or in
	 * any of the base classes. But if you want to put your DataProvider method in
	 * another class, you can do so by making it a static method and providing the
	 * name of the class containing it to TestNG.
	 */
}