package chapter10.programmatically;

import org.testng.annotations.Test;

public class Test04IncludeExcludeGroup {

	@Test(groups = { "group-one" })
	public void testMethodOne() {
		System.out.println("Test method one of group-one");
	}

	@Test(groups = { "group-one", "group-two" })
	public void testMethodTwo() {
		System.out.println("Test method two of group-one and grouptwo");
	}
	
	@Test(groups={"group-one"})
	public void testMethodThree(){
		System.out.println("Test method three of group-one");
	}
}
