package chapter04._01.grouping;

import org.testng.annotations.Test;

public class Test01Grouping {
	@Test(groups = { "test-group" })
	public void testMethodOne() {
		System.out.println("Test method one belonging to group.");
	}

	@Test
	public void testMethodTwo() {
		System.out.println("Test method two not belonging to group.");
	}

	@Test(groups = { "test-group" })
	public void testMethodThree() {
		System.out.println("Test method three belonging to group.");
	}

	// Running a TestNG group
	// We can run test methods belonging to a certain group in mainly two ways:
	// - Through Eclipse
	// - Using the testng XML file
}