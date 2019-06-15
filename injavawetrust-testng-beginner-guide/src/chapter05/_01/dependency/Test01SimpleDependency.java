package chapter05._01.dependency;

import org.testng.annotations.Test;

public class Test01SimpleDependency {

	@Test(dependsOnMethods = { "testTwo" })
	public void testOne() {
		System.out.println("Test method one");
	}

	@Test
	public void testTwo() {
		System.out.println("Test method two");
	}

	/*
	 * In the above test result you can see the message Test method two printed
	 * before the Test method one message. This shows that the testOne method got
	 * executed after testTwo as it depends on testTwo.
	 */

	/*
	 * The dependency on a test method is configured for a test by providing the
	 * dependent test method name to the attribute dependsOnMethods while using the
	 * Test annotation,
	 */
}
