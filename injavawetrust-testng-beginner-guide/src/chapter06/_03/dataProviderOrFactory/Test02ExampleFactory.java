package chapter06._03.dataProviderOrFactory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

@Test
public class Test02ExampleFactory {

	@Factory
	public Object[] factoryMethod() {
		return new Object[] { new Test02FactoryTest("one"), new Test02FactoryTest("two") };
	}

	/*
	 * This test class shows a factory class. As you can see from the previous test
	 * results, the beforeClass method is executed before each execution of
	 * testMethod. This shows that factory implementation executes the test method
	 * for each individual instance of the test class. As we saw earlier
	 * DataProvider executes the test method (testMethod) for a single instance of
	 * the test class.
	 */

}
