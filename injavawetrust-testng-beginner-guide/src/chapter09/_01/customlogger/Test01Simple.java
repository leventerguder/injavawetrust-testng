package chapter09._01.customlogger;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01Simple {

	/*
	 * We created a custom logger class which implements the ITestListener interface
	 * and attached itself to the TestNG test suite as a listener. Methods of this
	 * listener class are invoked by TestNG as and when certain conditions are met
	 * in the execution, for example, test started, test failure, test success, and
	 * so on. Multiple listeners can be implemented and added to the test suite
	 * execution, TestNG will invoke all the listeners that are attached to the test
	 * suite. Logging listeners are mainly used when we need to see the continuous
	 * status of the test execution when the tests are getting executed.
	 */

	@Test
	public void testMethodOne() {
		Assert.assertTrue(true);
	}

	@Test
	public void testMethodTwo() {
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "testMethodTwo" })
	public void testMethodThree() {
		Assert.assertTrue(true);
	}
}