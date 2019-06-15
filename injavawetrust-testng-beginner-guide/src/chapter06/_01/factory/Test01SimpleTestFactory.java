package chapter06._01.factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

@Test
public class Test01SimpleTestFactory {

	@Factory
	public Object[] factoryMethod() {
		return new Object[] { new Test01Simple(), new Test01Simple() };

	}

	// It's mandatory that a factory method should return an array of Object class
	// (Object []) as mentioned in the preceding code snippet.

	// the test method from the Test01SimpleTestFactory class was executed two
	// times.
}
