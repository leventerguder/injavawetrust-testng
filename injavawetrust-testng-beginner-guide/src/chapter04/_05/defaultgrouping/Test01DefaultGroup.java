package chapter04._05.defaultgrouping;

import org.testng.annotations.Test;

// Sometimes we may need to assign a default group to a set of test methods that belong to
// a class. This can be achieved by using the @Test annotation at class level and defining the
// default group in the said @Test annotation.

@Test(groups = { "default-group" })
public class Test01DefaultGroup {

	public void testMethodOne() {
		System.out.println("Test method one.");
	}

	public void testMethodTwo() {
		System.out.println("Test method two.");
	}

	@Test(groups = { "test-group" })
	public void testMethodThree() {
		System.out.println("Test method three.");
	}

	/*
	 * The preceding class contains three methods that print a message onto console
	 * when executed. All of the methods are considered as test methods by the use
	 * of the @Test annotation on the class. All of the methods belong to the group
	 * default-group by mentioning the group name at the class level. One of the
	 * test methods also belong to the group test-group, this is done by using the
	 * 
	 * @Test annotation at the method level as shown in the preceding code
	 */

	/*
	 * TestNG executed all the test methods of the class when the default-group
	 * tests were executed in the first test. Whereas,in the second test, only one
	 * method that belongs to the group test-group was executed. This feature helps
	 * in assigning a default group to a set of tests. This has to be used carefully
	 * as the use of the @Test annotation at class level enables all the public
	 * methods of the class to be considered as test methods.
	 *
	 */
}
