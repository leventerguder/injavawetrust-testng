package chapter03._03.testannotation;

import org.testng.annotations.Test;

public class Test05TimeOut {

	/*
	 * The test failed because the test took more time to execute than the time
	 * mentioned in the timeOut attribute of the Test annotation. This helps in
	 * specifying a predefined execution time limit for a specific method.
	 */

	@Test(timeOut = 500)
	public void timeTestOne() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Time test method one");
	}

	@Test(timeOut = 500)
	public void timeTestTwo() throws InterruptedException {
		Thread.sleep(400);
		System.out.println("Time test method two");
	}
}
