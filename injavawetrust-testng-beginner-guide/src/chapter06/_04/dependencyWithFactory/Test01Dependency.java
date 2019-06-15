package chapter06._04.dependencyWithFactory;

import org.testng.annotations.Test;

public class Test01Dependency {

	private int param;

	public Test01Dependency(int param) {
		this.param = param;
	}

	@Test(dependsOnMethods = { "testMethodTwo" })
	public void testMethodOne() {
		System.out.println("Test method one with param values: " + this.param);
	}

	@Test
	public void testMethodTwo() {
		System.out.println("Test method two with param values: " + this.param);
	}

	/*
	 * This class contains two test methods testMethodOne and testMethodTwo, where
	 * testMethodOne depends on testMethodTwo. The constructor of the class takes
	 * one argument as integer, and sets its value to an internal variable named
	 * param. Both of the test methods print their method name along with the param
	 * variable value to console when executed.
	 */
}
