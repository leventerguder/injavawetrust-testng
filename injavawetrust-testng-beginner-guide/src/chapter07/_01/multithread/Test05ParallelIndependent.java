package chapter07._01.multithread;

import org.testng.annotations.Test;

public class Test05ParallelIndependent {

	/*
	 * The test method is executed multiple times based on the invocationCount
	 * attribute value. Each execution is done in a separate thread that is clearly
	 * visible from the test report output
	 */
	
	@Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
	public void testMethod() {
		Long id = Thread.currentThread().getId();
		System.out.println("Test method executing on thread with id: " + id);
	}
}
