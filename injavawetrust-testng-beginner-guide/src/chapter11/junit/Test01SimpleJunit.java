package chapter11.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test01SimpleJunit {

	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Junit before class method");
	}

	@Before
	public void beforeMethod() {
		System.out.println("Junit before method");
	}

	@Test
	public void testMethod() {
		System.out.println("Junit test method");
	}

	@After
	public void afterMethod() {
		System.out.println("Junit after method");
	}

	@AfterClass
	public static void afterClassMethod() {
		System.out.println("Junit after class method");
	}
}
