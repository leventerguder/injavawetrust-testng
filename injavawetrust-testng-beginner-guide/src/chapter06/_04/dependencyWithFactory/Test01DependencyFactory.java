package chapter06._04.dependencyWithFactory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

@Test
public class Test01DependencyFactory {

	@Factory
	public Object[] factoryMethod() {
		return new Object[] { new Test01Dependency(1), new Test01Dependency(2) };
	}

	/*
	 * This example shows a test class that contains dependency test methods, where
	 * one test method depends on another test method. As you can see from the
	 * previous test results both the instances of testMethodTwo were executed
	 * before any instance of testMethodOne. This is the default behavior of a
	 * factory implementation in TestNG, it will execute all the instances of the
	 * dependent test methods before the actual test method. Unfortunately, this
	 * behavior may not fulfill our testing needs sometimes. To execute the test
	 * methods in sequential order for each instance we need to use a testng XML
	 * configuration file.
	 */

	// Which of the following attributes has to be used to order the execution tests
	// by instance in a factory class?
	// answer : group-by-instances
}
