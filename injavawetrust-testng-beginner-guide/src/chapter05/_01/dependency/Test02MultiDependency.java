package chapter05._01.dependency;

import org.testng.annotations.Test;

public class Test02MultiDependency {

	@Test(dependsOnMethods = { "testTwo", "testThree" })
	public void testOne() {
		System.out.println("Test method one");
	}

	@Test
	public void testTwo() {
		System.out.println("Test method two");
	}

	@Test
	public void testThree() {
		System.out.println("Test method three");
	}

	/*
	 * By looking at the console message we can see that methods testTwo and
	 * testThree got executed before testOne.
	 */
}
