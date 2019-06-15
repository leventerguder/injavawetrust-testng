package chapter05._02.dependentgroup;

import org.testng.annotations.Test;

public class Test02DifferentClassDependency {

	@Test(dependsOnGroups = { "test-group-different", "same-class" })
	public void testOne() {
		System.out.println("Different class test method one");
	}

	@Test(groups = { "same-class" })
	public void testTwo() {
		System.out.println("Test02DifferentClassDependency#testTwo ");
	}

	@Test(groups = { "same-class" })
	public void testThree() {
		System.out.println("Test02DifferentClassDependency#testThree ");
	}

	/*
	 * The preceding test class contains three test methods which print a message
	 * onto the console when executed. Two of the test methods belong to group named
	 * same- class whereas the third method, named testOne, depends on the groups
	 * named test-group and same-class. The group test-group refers to the test that
	 * belongs to the earlier created class named SimpleGroupTest.
	 */
}

class GroupingForDifferentClassDependency {
	@Test(groups = { "test-group-different" })
	public void testMethodOne() {
		System.out.println("GroupingForDifferentClassDependency#testMethodOne ");
	}

	@Test
	public void testMethodTwo() {
		System.out.println("GroupingForDifferentClassDependency#testMethodTwo ");
	}

	@Test(groups = { "test-group-different" })
	public void testMethodThree() {
		System.out.println("GroupingForDifferentClassDependency#testMethodThree ");
	}
}
