package chapter07._01.multithread;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test03ParallelClassV1 {

	@BeforeClass
	public void beforeClass() {
		long id = Thread.currentThread().getId();
		System.out.println("Test03ParallelClassV1#beforeClass Thread id is: " + id);
	}

	@Test
	public void testMethodOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Test03ParallelClassV1#testMethodOne Thread id is: " + id);
	}

	@Test
	public void testMethodTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Test03ParallelClassV1#testMethodTwo Thread id is: " + id);
	}

	@AfterClass
	public void afterClass() {
		long id = Thread.currentThread().getId();
		System.out.println("Test03ParallelClassV1#afterClass Thread id is: " + id);
	}
}
