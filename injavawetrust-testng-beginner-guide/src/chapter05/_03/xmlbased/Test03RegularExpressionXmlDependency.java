package chapter05._03.xmlbased;

import org.testng.annotations.Test;

public class Test03RegularExpressionXmlDependency {

	@Test(groups = { "test" })
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
}
