package chapter03._03.testannotation;

import org.testng.annotations.Test;

public class Test02Enabled {

	@Test(enabled = true)
	public void testMethodOne() {
		System.out.println("Test method one.");
	}

	@Test(enabled = false)
	public void testMethodTwo() {
		System.out.println("Test method two.");
	}

	@Test
	public void testMethodThree() {
		System.out.println("Test method three.");
	}

	// Disabling a test can be achieved in TestNG by setting the enable attribute of
	// the Test annotation to false.
	// The method with attribute enabled value as false was ignored from test
	// execution. By default the attribute value of enabled is true
}
