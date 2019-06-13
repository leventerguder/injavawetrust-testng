package chapter03._02.inheritance;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test01Inheritance extends BaseClass {

	@BeforeClass
	public void beforeChildClass() {
		System.out.println("Child Before Class method");
	}

	@AfterClass
	public void afterChildClass() {
		System.out.println("Child After Class method");
	}

	@BeforeMethod
	public void beforeChildMethod() {
		System.out.println("Child Before method");
	}

	@AfterMethod
	public void afterChildMethod() {
		System.out.println("Child After method");
	}

	@Test
	public void testMethod() {
		System.out.println("Test method under TestClass");
	}
}
