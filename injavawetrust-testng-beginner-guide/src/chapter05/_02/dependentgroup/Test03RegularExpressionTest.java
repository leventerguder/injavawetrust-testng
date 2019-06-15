package chapter05._02.dependentgroup;

import org.testng.annotations.Test;

public class Test03RegularExpressionTest {

	@Test(dependsOnGroups = { "starts-with.*" })
	public void regularExpMethod() {
		System.out.println("Dependent method");
	}

	@Test(groups = { "starts-with-one" })
	public void startsWithMethodOne() {
		System.out.println("Starts with method one");
	}

	@Test(groups = { "starts-with-two" })
	public void startsWithMethodTwo() {
		System.out.println("Starts with method two");
	}

	/*
	 * The preceding test class contains three test methods which print a message
	 * onto the console when executed. Two of the test methods belong to different
	 * groups named starts-with-one and starts-with-two, respectively, whereas the
	 * third method named regularExpMethod depends on all the groups whose names
	 * start with the text starts-with.
	 */
}
