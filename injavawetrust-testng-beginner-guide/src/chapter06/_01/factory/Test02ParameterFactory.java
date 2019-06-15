package chapter06._01.factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

@Test
public class Test02ParameterFactory {

	@Factory
	public Object[] paramFactory() {
		return new Object[] { new Test02Parameter(0), new Test02Parameter(1) };
	}

	/*
	 * One of the main advantages of using the factory methods is that you can pass
	 * parameters to test classes while initializing them. These parameters can then
	 * be used across all the test methods present in the said classes.
	 */

	// The class defines a factory method inside it. This factory method returns an
	// array of the Object class containing two objects of Test02Parameter
	// class. Select the previous factory test class in Eclipse and run it as a
	// TestNG test.
}
