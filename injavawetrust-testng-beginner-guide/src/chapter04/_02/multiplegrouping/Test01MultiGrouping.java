package chapter04._02.multiplegrouping;

import org.testng.annotations.Test;

public class Test01MultiGrouping {

	@Test(groups = { "group-one" })
	public void testMethodOne() {
		System.out.println("Test method one belonging to group.");
	}

	@Test(groups = { "group-one", "group-two" })
	public void testMethodTwo() {
		System.out.println("Test method two belonging to both group.");
	}

	@Test(groups = { "group-two" })
	public void testMethodThree() {
		System.out.println("Test method three belonging to group.");
	}

	/*
	 * The preceding class contains three test methods. Two of the test methods
	 * belong to one group each, where as one of the methods belongs to two groups,
	 * group-one and group-two respectively.
	 */

	/*
	 * TestNG allows a test method to belong to multiple groups. There is no limit
	 * on number of groups that a test may belong to.
	 */
}
