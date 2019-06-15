package chapter05._03.xmlbased;

import org.testng.annotations.Test;

public class Test01SimpleXmlDependency {

	@Test(groups = { "dependent-group" })
	public void groupTestOne() {
		System.out.println("Group Test method one");
	}

	@Test(groups = { "test-group" })
	public void groupTestTwo() {
		System.out.println("Group Test method two");
	}

	@Test(groups = { "test-group" })
	public void groupTestThree() {
		System.out.println("Group Test method three");
	}
}
