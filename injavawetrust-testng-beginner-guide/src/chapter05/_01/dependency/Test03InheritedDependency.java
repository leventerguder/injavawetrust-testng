package chapter05._01.dependency;

import org.testng.annotations.Test;

public class Test03InheritedDependency extends Test01SimpleDependency {

	@Test(dependsOnMethods = { "testOne" })
	public void testThree() {
		System.out.println("Test three method in Inherited test");
	}

	@Test
	public void testFour() {
		System.out.println("Test four method in Inherited test");
	}
}
