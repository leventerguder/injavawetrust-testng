package chapter11.junit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test02SimpleTestNG {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Testng before method");
	}

	@Test
	public void testMethod() {
		System.out.println("Testng test method");
	}

	@AfterMethod

	public void afterMethod() {
		System.out.println("Testng after method");
	}
}
