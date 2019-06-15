package chapter04._06.groupsofgroup;

import org.testng.annotations.Test;

public class Test01GroupOfGroup {

	/*
	 * TestNG allows users to create groups out of existing groups and then use them
	 * during the creation of the test suite. You can create new groups by including
	 * and excluding certain groups and then use them.
	 */

	/*
	 * Let's create a sample test program and learn how to create group of groups
	 * called MetaGroups.
	 */

	@Test(groups = { "include-test-one" })
	public void testMethodOne() {
		System.out.println("Test method one");
	}

	@Test(groups = { "include-test-two" })
	public void testMethodTwo() {
		System.out.println("Test method two");
	}

	@Test(groups = { "include-test-three" })
	public void testMethodThree() {
		System.out.println("Test method two");
	}

	@Test(groups = { "test-one-exclude" })
	public void testMethodFour() {
		System.out.println("Test method four");
	}

	@Test(groups = { "test-two-exclude" })
	public void testMethodFive() {
		System.out.println("Test method five");
	}
}
