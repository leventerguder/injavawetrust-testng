package chapter05._02.dependentgroup;

import org.testng.annotations.Test;

public class Test01SimpleGroupDependency {

	@Test(dependsOnGroups = { "test-group-simple" })
	public void groupTestOne() {
		System.out.println("Group Test method one");
	}

	@Test(groups = { "test-group-simple" })
	public void groupTestTwo() {
		System.out.println("Group test method two");
	}

	@Test(groups = { "test-group-simple" })
	public void groupTestThree() {
		System.out.println("Group Test method three");
	}

	/*
	 * The preceding test class contains three test methods which print a message
	 * onto the console when executed. Two of the test methods belong to a group
	 * named test group whereas the third method named groupTestOne depends on the
	 * group test group.
	 */
}
